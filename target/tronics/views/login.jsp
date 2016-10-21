<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style>
body{
margin-top:30px;
}
.align
{
margin-top:50px;
}
.footer
{
margin-top:150px;
}
</style>
</head>
<%@include file="header.jsp" %>
<div class="align">
<body background="F:\project\E-commerce project/tree.jpg">
<center>
<h1>Login Form</h1>
<h style="color:red">${msg}</h>
<br>
<c:url var="addAction" value="/check">
		</c:url>
<form:form action="${addAction}" method="post">		
<h2 style="color:blue">Username</h2><br>
<input type="text" name="username"/><br>
<h2 style="color:blue">Password</h2><br>
<input type="password" name="password"/><br>
<input type="submit" value="Login"/><br>
</form:form>
</center>
</body>
</div>
<div class="footer">
<%@include file="footer.jsp" %>
</div>
</html>