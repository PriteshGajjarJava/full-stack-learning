<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<sql:setDataSource
	var="db_connection"
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost/stationary"
	user="root"
	password="root"
	scope="session"/>

<sql:query dataSource="${db_connection}" sql="select * from product" var="result"/>
<form action="./showSummary.jsp">
	<Table>
	<TR>
		<TH> Product Name </TH>
		<TH> Price </TH>
		<TH> Qty </TH>
	</TR>
	
	<c:forEach var="product" items="${result.rows}">
	 		<TR>
	 			<TD> <c:out value="${product.name}"/> </TD>
	 			<TD> <c:out value="${product.price}"/> </TD>
	 			<TD> <input type='number' name='${product.name}' value="0"></TD>
	 		</TR>
	</c:forEach>
	</Table>
	<button type="submit"> Place Order </button>
</form>