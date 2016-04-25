<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<title>Employee Database</title>
</head>
<body>
<header class="w3-container w3-teal">
  <h1>Employee Database</h1>
</header>


	<form action="createEmployee.do">
		<br>First Name: <input type="text" name="firstName" >
		<br>Last Name: <input name="lastName">
		<br>Department: <select name="departmentId">
					<option value="1">Research</option>
					<option value="2">Administration</option>
					<option value="3">Software Development</option>
					<option value="4">Hardware Development</option>
					<option value="5">Test And Integration</option>
					<option value="6">Sales</option>
					<option value="7">HR</option>
					<option value="8">Facilities</option>
					<option value="9">Operations</option>
					<option value="10">Documentation</option>
				</select> 
		<br>Department: <select name="jobId">
					<option value="1">President</option>
					<option value="2">Vice President</option>
					<option value="3">Director</option>
					<option value="4">Manager</option>
					<option value="5">Supervisor</option>
					<option value="6">Administrative Assistant</option>
					<option value="7">Secretary</option>
					<option value="8">Lead Engineer</option>
					<option value="9">Engineer</option>
					<option value="10">Junior Engineer</option>
					<option value="11">DataBase Administrator</option>
					<option value="12">DataBase Operator</option>
					<option value="13">Systems Administrator</option>
					<option value="14">Systems Operator</option>
					<option value="15">Data Analyst</option>
					<option value="16">Project Lead</option>
					<option value="17">Senior Developer</option>
					<option value="18">Developer</option>
					<option value="19">Junior Developer</option>
					<option value="20">Product Evangelist</option>
					<option value="21">Senior Sales Rep</option>
					<option value="22">Account Rep</option>
					<option value="23">Sales Rep</option>
					<option value="24">Tester</option>
					<option value="25">Receptionist</option>
					<option value="26">Data Entry Clerk</option>
					<option value="27">Technical Writer</option>
					<option value="28">Train</option>
					<option value="29">COO</option>
					<option value="30">CFO</option>
				</select> 
				<input type="submit" value="Create Employee">
		
	</form>
	<a href="index.html"><button>Home</button></a>
</body>
</html>