<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Page</title>
</head>
<body>
	<h1>Admission Form</h1>
	<h2>${headerMessage}</h2>
	<form action="submitAdmissionForm.html" method="post">
		<table border="1">
			<tr>
				<td>Patient name: </td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Disease:</td>
				<td><input type="text" name="disease" /></td>
			</tr>
			<tr>
				<td>Mobile No:</td>
				<td><input type="text" name="mobile" /></td>
			</tr>
			<tr>
				<td>Date Of Birth(mm/dd/yyyy): </td>
				<td><input type="text" name="dob" /></td>
			</tr>
			<tr>
				<td>Symptoms: </td>
				<td><select name="symptoms" multiple>
						<option value="Body Pain">Body Pain</option>	
						<option value="Cold">Cold</option>
						<option value="Headache">Headache</option>
						<option value="Itching">Itching</option>
						<option value="Loose Motion">Loose Motion</option>
					</select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>