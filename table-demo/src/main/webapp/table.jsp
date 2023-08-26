<%
	int n = Integer.parseInt(request.getParameter("num"));
%>

<%!
	public void fun() {
	
	}
%>

<HTML>
	<body>
		<table>
			<% for(int i=1; i<=10; i++) {%>
				<TR> <TD> <%= n * i %> </TD> </TR>
			<% } %>
		</table>
	</body>
</HTML>