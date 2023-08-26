<HTML>
 <body>
  <form action="./showSummary">
 	<Table>
 	   <TR>
 			<TH> Product Name </TH>
 			<TH> Price </TH>
 			<TH> Qty </TH>
 		</TR>
 		<TR>
 			<TD> Pen </TD>
 			<TD> 30 </TD>
 			<TD> <input type='number' name='product1' value="0"></TD>
 			<input type='hidden' value="30" name="product1_price"/>
 			<input type='hidden' value="Pen" name="product1_name"/>
 		</TR>
 		<TR>
 			<TD> NoteBook 200 pages </TD>
 			<TD> 78 </TD>
 			<TD> <input type='number' name='product2' value="0"></TD>
 			<input type='hidden' value="78" name="product2_price"/>
 			<input type='hidden' value="Notebook" name="product2_name"/>
 		</TR>
 		
 		<TR>
 			<TD> Pencil </TD>
 			<TD> 10 </TD>
 			<TD> <input type='number' name='product3' value="0"></TD>
 			<input type='hidden' value="10" name="product3_price"/>
 			<input type='hidden' value="Pencil" name="product3_name"/>
 		</TR>
 		<TR>
 			<TD> Marker </TD>
 			<TD> 25 </TD>
 			<TD> <input type='number' name='product4' value="0"></TD>
 			<input type='hidden' value="25" name="product4_price"/>
 			<input type='hidden' value="Marker" name="product4_name"/>
 		</TR>
 		<TR>
 			<TD> BlackBoard </TD>
 			<TD> 300 </TD>
 			<TD> <input type='number' name='product5' value="0"></TD>
 			<input type='hidden' value="300" name="product5_price"/>
 			<input type='hidden' value="BlackBoard" name="product5_name"/>
 		</TR>
 		
 	</Table>
 	<button type="submit"> Place Order </button>
 	</form>
 </body>
</HTML>