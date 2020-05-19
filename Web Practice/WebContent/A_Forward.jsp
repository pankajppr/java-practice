<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>A Page to test JSP:Forward</title>
</head>
<body>
<b>Start of  A_Forward.jsp page</b>

<jsp:forward page="B_Forward.jsp">
	<jsp:param value="Computer" name="bookname"/>
	<jsp:param value="80" name="price"/>
</jsp:forward>

<b>End of A_Forward.jsp file</b>
</body>
</html>