<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="query" value="select * from product where"/>
<c:set var="idAttr" value=" name="/>
<c:set var="orAttr" value=" OR "/>

<c:forEach var="p" items="${paramValues}">
	<c:if test="${p.value[0] > 0}">
		<c:set var="query" value="${query}${idAttr}'${p.key}'${orAttr}"/>
	</c:if>
 </c:forEach>
<c:set var="query" value="${fn:substring(query, 0, fn:length(query) -3)}"/>


<sql:query dataSource="${db_connection}"  scope="session" var="result" 
	sql="${query}"/>
	
<TABLE>
	<TR>
		<TH> Product Name </TH>
		<TH> Price </TH>
		<TH> Qty </TH>
		<TH> Total </TH>
	</TR>
	<c:set var="total" value="0"/>
	<c:forEach var="product" items="${result.rows}">
		<c:set var="productIdString" value="${product.name}" />
	        <c:if test="${paramValues[productIdString] != null}">
	            <c:set var="qty" value="${paramValues[productIdString][0]}" />
	        </c:if>
	        
	    <TR>
	        <TD><c:out value="${product.name}" /></TD>
	        <TD><c:out value="${product.price}" /></TD>
	        <TD><c:out value="${qty}" /></TD>
	       	<c:set var="total" value="${total + (product.price * qty) }"/>

	        <TD>${product.price * qty}</TD>
	   </TR>
</c:forEach>
</TABLE>

<h4> Total Bill is <c:out value="${total }"/></h4>







