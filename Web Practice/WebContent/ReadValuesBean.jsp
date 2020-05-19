<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="p1.StudentBean" %>
<!-- Create or locate javabean class object -->
<jsp:useBean id="st" class="p1.StudentBean" scope="session"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Sno: <jsp:getProperty name="st" property="sno" /></p>
<p>Sno: <jsp:getProperty name="st" property="sname" /></p>
<p>Sno: <jsp:getProperty name="st" property="avg" /></p>
</body> 
</html>