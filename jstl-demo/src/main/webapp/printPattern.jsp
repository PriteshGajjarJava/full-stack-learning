<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="str" value="${param.input}"/>

<c:forEach var="i" begin="0" end="${fn:length(str)}">
	<span> ${fn:substring(str, 0, i	)} </span> <BR>
</c:forEach>