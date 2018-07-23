<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Create New Account</h2>
<form action="savePilot" method="post">
<div>
<table>
<tr>
<td><b>Account Type:</b></td>
</tr>

<tr>
<td>
<input type="radio" name="accType" value="savings"/>Savings&nbsp;
<input type="radio" name="accType" value="current"/>Current&nbsp;
<input type="radio" name="accType" value="rd"/>RD&nbsp;
<input type="radio" name="accType" value="fd"/>FD<br>
</td>
</tr>

<tr>
<td>
Amount: <input type="text" name="amount"/><br>
</td>
</tr>

<tr>
<td>
&nbsp;&nbsp;<input type="submit" value="Create Account">
</td>
</tr>
</table>

</div>
</form>
</body>
</html>