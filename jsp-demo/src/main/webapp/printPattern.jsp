<%
	String input = request.getParameter("input");

	for (int i=0; i<input.length(); i++) {
		for (int j=0; j<=i; j++) {
%>
			<span><%= input.charAt(j) %></span>
<%
		}
%>
			<BR>
<%
	}
	
%>