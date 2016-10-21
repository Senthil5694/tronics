<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
<style>
ul li{
display:inline;
padding-left:50px;
margin-left:120px;
color:white;
}
h2
{
color:green;
}
.container{
background-color:lightgreen;
}
ul li a:hover{
color:red;
text-transform:uppercase;
}
</style>
</head>
<body>
<center>
<h2>Welcome Admin</h2>
</center>
<div class="container">
<ul>
<li><a href="categories">Manage Categories</a></li>
<li><a href="suppliers">Manage Suppliers</a></li>
<li><a href="products">Manage Products</a></li>
<li><a href="logout">Log out</a></li>
</ul>
</div>
</body>
</html>