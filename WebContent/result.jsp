<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
	<!--  This is the action to make an update to an employee  -->
	<form action="updateEmployee.do">
		<c:choose>
			<c:when test="${empty employee.id}"> No Employee with this ID.</c:when>
			<c:otherwise>
				Employee ID: ${employee.id}
				<input type="hidden" name="id" value="${employee.id}">
				<br>
				First name: <input name="firstName" value="${employee.firstname}">
				<br>
				Last name: <input name="lastName" value="${employee.lastname}">
				<br>
			Department: <select name="departmentId">
					<c:forEach items="${departments}" var="dept">
						<option value="${dept.id}" label="${dept.name}"
							<c:if test="${employee.departmentId == dept.id}">selected</c:if>>${dept.name}</option>
					</c:forEach>
				</select>
				<br>
		Position: <select name="jobId">
					<c:forEach items="${jobs}" var="job">
						<option value="${job.id}" label="${job.name}"
							<c:if test="${employee.jobId == job.id}">selected</c:if>>${job.name}</option>
					</c:forEach>
				</select>
		<br> <input type="submit" value="Submit Changes">
		<br> <a href="deleteEmployee.do?id=${employee.id}"><button type="button" name="${employee.id}">Remove Employee</button></a>
			</c:otherwise>
		</c:choose>

	</form>


	<br>
	<form action="getEmployeeById.do" method="GET">
		Search for Employee: <input type="text" name="id"> <input
			type="submit" value="Get Employee">
	</form>
	<a href="index.html"><button>Home</button></a>
</body>
</html>