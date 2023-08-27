<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<Table>
	<c:forEach var="i" begin="1" end="10">
		<TR>
			<TD> <c:out value="${param.num * i}"/> </TD>
		</TR>
	</c:forEach>
</Table>