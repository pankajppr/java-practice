<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.opensymphony.xwork2.ActionContext" %>
 <%@ page import="com.opensymphony.xwork2.util.ValueStack" %>
 <%@ page import="java.util.*" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successful registration </title>
</head>
<body>
<h3>Successful registration !</h3>
<h5>Data Entered:</h5>
<p><s:property value="userId" /></p>
<p><s:property value="password" /></p>
<p><s:property value="email" /></p>
<p><s:property value="gender" /></p>
<p><s:property value="country" /></p>



</body>
</html>