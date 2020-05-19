<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Page</title>
</head>
<body>
	<h1>Admission Form Values Entered</h1>
	<h2>${headerMessage}</h2>
		<table border="1">
			<tr>
				<td>Patient name: </td>
				<td>${patient1.name }</td>
			</tr>
			<tr>
				<td>Disease:</td>
				<td>${patient1.disease }</td>
			</tr>
			<tr>
				<td>Mobile No:</td>
				<td>${patient1.mobile }</td>
			</tr>
			<tr>
				<td>Date Of Birth: </td>
				<td>${patient1.dob }</td>
			</tr>
			<tr>
				<td>Symptoms: </td>
				<td>${patient1.symptoms }</td>
			</tr>

		</table>
	</body>
</html>