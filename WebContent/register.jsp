<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
  <h1>Employee Register Form</h1>
  <form action="RegServlet" method="post">
   <table style="with: 80%">
    <tr>
     <td>Full Name</td>
     <td><input type="text" name="fullName" /></td>
    </tr>
    <tr>
     <td>User Name</td>
     <td><input type="text" name="userName" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
    <tr>
     <td>Email</td>
     <td><input type="text" name="email" /></td>
    </tr>
    <tr>
     <td>Contact Number</td>
     <td><input type="text" name="contactNumber" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
  </div>

</body>
</html>