<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Elearntez.COM</title>
</head>
<body>
 <center>
  <h1>User profile Page</h1> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a  href="./logout">Logout</a>
  <table>
    <tr>
      <td>First Name</td>
      <td>${user.fname}</td>
    </tr>
    <tr>
      <td>Middle Name</td>
      <td>${user.mname}</td>
    </tr>
    <tr>
      <td>Last Name</td>
      <td>${user.lname}</td>
    </tr>
  </table>
  </center>
</body>
</html>