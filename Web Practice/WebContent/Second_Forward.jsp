
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Second Forward Page</title>
</head>
<body>
<p>Second Forward page</p>
<%  //Form data received
	String iname = request.getParameter("tname");
	int price = Integer.parseInt(request.getParameter("tprice"));
	int qty = Integer.parseInt(request.getParameter("tqty"));
	
	int bill_amount = qty*price;
	float discount = bill_amount*0.20f;
	
	
		out.println("Item Name: "+ iname);
		out.println("Item Price: "+ price);
		out.println("Item Quantity: "+ qty);
		out.println("Discount: "+ discount);
	%>
</body>
</html>