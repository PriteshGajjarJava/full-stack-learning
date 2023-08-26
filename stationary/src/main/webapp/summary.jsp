<%@page import="com.pga.Product"%>
<%@page import="java.util.List"%>


<TABLE>
	<TR>
		<TH> Product Name </TH>
		<TH> Price </TH>
		<TH> Qty </TH>
		<TH> Total </TH>
	</TR>
<%
	List<Product> list = (List<Product>)session.getAttribute("ORDER");
	int billAmount = 0;
	for (Product p : list) {
		billAmount = billAmount + (p.getPrice() * p.getQty());
%>
		<TR>
			<TD><%=p.getName() %></TD>
			<TD><%=p.getPrice() %></TD>
			<TD><%=p.getQty() %></TD>
			<TD><%=p.getPrice() * p.getQty() %></TD>
		</TR>
<%
	}
%>
</TABLE>
<h4> Total Bill is <%=billAmount %></h4>