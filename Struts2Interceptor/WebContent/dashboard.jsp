<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DashBorard Page</title>
</head>
<body>
<h3>Welcome <s:property value="%{#session.User.username}" ></s:property> to the DashBoard</h3>
<a href="Logout">Logout</a>
<h4>List of Users in the Database:</h4>
  <table border="1" style="width:50%" align="center">
  	<tr>
  		<th>Sl. No.</th>
  		<th>Name</th>
  		<th>Password</th>
  		<th>Email</th>
  		<th>Gender</th>
  		<th>Country</th>
  	</tr>
	<s:iterator value="map">
 	<tr>
 	<td><s:property value="key" /></td> 
 	<s:iterator value="value">
    	<td><s:property /></td>
  	</s:iterator>
  	</tr>

</s:iterator>
 </table>

</body>
</html>