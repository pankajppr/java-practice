<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h2>Registration Page:</h2>
<s:form action="register">
	<s:textfield label="Enter Your User ID:" name="userId" />
	<s:password label="Enter Your Password:" name="password" />
	<s:textfield label="Enter Your Email:" name="email" />
	<s:radio list="{'male','female','none'}" name="gender" label="Select Your Gender"></s:radio>
	<s:select list="{'india','pakistan','other'}"  name="country" label="Country"></s:select>
	<s:submit value="register" />
</s:form>

</body>
</html>