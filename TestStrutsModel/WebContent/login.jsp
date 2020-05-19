<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
.errorDiv{
    background-color:gray;
    border:1px solid black;
    width:400px;
    margin-bottom:8px;
}
</style>
</head>
<body>
<h3>Enter your Credentials</h3>
<s:if test="hasActionErrors()">
   <div class="errorDiv">
      <s:actionerror/>
   </div>
</s:if>
<br><br>

<s:form action="login">
	<s:textfield label="Enter Your User ID" key="userId" />
	<s:password label="Enter Your Password" key="password" />
	<s:submit />
</s:form>

</body>
</html>