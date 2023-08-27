<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="n1" value="${param.num1}"/> 
<c:set var="n2" value="${param.num2}"/>

<h3><c:out value="${n1} + ${n2} = ${n1+n2}"/></h3>