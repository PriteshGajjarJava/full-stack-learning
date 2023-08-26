<%
	int n1 = Integer.parseInt(request.getParameter("num1"));
	int n2 = Integer.parseInt(request.getParameter("num2"));
	int ans = n1 + n2;
%>

<h3> <%=n1%> + <%=n2%> = <%=ans%> </h3>
<h3> Addition is <%=ans%></h3>