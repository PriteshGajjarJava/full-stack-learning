<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<sql:setDataSource
	var="db_connection"
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost/stationary"
	user="root"
	password="root"
	scope="session"/>
	
<sql:update dataSource="${db_connection}"
	sql="insert into product(name, price) values(?,?)">
	<sql:param value="${param.name}"/>
	<sql:param value="${param.price}"/>
</sql:update>
<h4> Product added successfully...</h4>