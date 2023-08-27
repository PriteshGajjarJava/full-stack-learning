<%@page import="com.pga.jdbc.Student"%>
<HTML>
 <Table border="1">
 	<TR>
 		<TH> ID </TH>
 		<TH> Name </TH>
 		<TH> Marks </TH>
 	</TR>
 	
 	<%
 		Student s = (Student)session.getAttribute("STUDENT");
 	%>
 	
 	<TR>
 		<TD> <%= s.getId() %></TD>
 		<TD> <%= s.getName() %></TD>
 		<TD> <%= s.getMarks() %></TD>
 	</TR>
 	
 </Table>
</HTML>