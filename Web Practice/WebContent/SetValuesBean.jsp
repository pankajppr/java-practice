<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="p1.StudentBean" %>
<jsp:useBean id="st" class="p1.StudentBean" scope="session" />


<jsp:setProperty name="st" property="sno" value="101"/>
<jsp:setProperty name="st" property="sname" value="Jaiswal"/>
<jsp:setProperty name="st" property="avg" value="69.7"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Set values bean jsp</title>
</head>
<body>

</body>
</html>