<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<nav class="navbar navbar-expand-sm bg-light">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="logout">LOGOUT</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="showEmployees">Show Employees </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="register">Employee Registration</a>
    </li>
  </ul>
</nav>
<br>

</div>
<div class="container">
		<h1> Employee Data.............</h1><br><br>
		
		 <table class="table">
    <thead>
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Password</th>
        <th>Salary</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${employeeDTOlist}" var="employee">
      <tr>
        <td>${employee.employeeId}</td>
        <td>${employee.employeeName}</td>
        <td>${employee.emailId}</td>
        <td>${employee.password}</td>
        <td>${employee.salary}</td>
        
        <td >
            <a href="showEditEmployee?employeeId=${employee.employeeId}">
            <button type="button" class="btn btn-primary">E</button>
            </a>
               <a href="deleteEmployee?employeeId=${employee.employeeId}">
           <button type="button" class="btn btn-danger">D</button>
            </a>
        </td>
        
        
      </tr>
      </c:forEach>
     
    </tbody>
  </table>
 
</div>


</body>
</html>
</html>