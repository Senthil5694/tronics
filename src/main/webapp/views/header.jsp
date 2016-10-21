<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>header</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
h1
{
margin:0px;
text-align:center;
}
.carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
}
ul.menu-new {margin: 0px; width: 100%; text-align: center; display: inline-block; padding: 15px;}
ul.menu-new li {text-align: center; display: inline-block; position: relative;}
ul.menu-new li a {color: #ffffff; text-decoration: none; padding: 10px 15px; display:block; text-transform: uppercase;}
ul.menu-new li a:hover {color: #ffffff; text-decoration: none; background: #111111;}
ul.menu-new li ul.drop {display: none; z-index: 999999999; position: absolute; left: 00px; top: 40px;}
ul.menu-new li ul.drop li {width:210px; display:block; text-align:left;}
ul.menu-new li:hover ul.drop {display: block;}

 figure.img img {max-width:500%;margin-top:60px;} 
[class*='col-'] {padding:15px;}

ul
{
margin:0px;
padding:0px;
}
ul li
{ 
margin:0px;
background-color:lightgreen;
border:1px solid white;
display:inline-block;
text-align:center;
list-style:none;
}
ul li a
{
color:white;
text-decoration:none;
dispaly:block;
}
ul li a:hover
{
background-color:red;
}
.icons
{
margin:0px;
float:right;
}
ul.icons li
{
display:inline-block;
}
</style>
</head>
<body bgcolor=lightgreen>
<a href="home"><img src="F:\project\E-commerce project/tronics.png" width="100" height="50"/></a>
<ul class="icons">
<li><a href="https://www.facebook.com" target="blank"><img src="F:\project\E-commerce project/facebook.png" height="30"/></a></li>
<li><a href="https://plus.google.com" target="blank"><img src="F:\project\E-commerce project/googleplus.png" height="30"/></a></li>
<li><a href="https://www.linkedin.com" target="blank"><img src="F:\project\E-commerce project/linkedin.png" height="30"/></a></li>
<li><a href="https://twitter.com" target="blank"><img src="F:\project\E-commerce project/twitter.png" height="30"/></a></li>
</ul>
<h1>Tronicsville</h1>
<hr>
<ul class="menu-new">
<li><a href="aboutus">about us</a></li>
<li><a href="contactus">contact us</a></li>
<li><a href="#"> products</a>
<ul class="drop">
<li><a href="mobiles">mobiles</a></li>
<li><a href="laptops">laptops</a></li>
<li><a href="#">tabs</a></li>
<li><a href="#">home appliances</a></li>
</ul>
</li>
<li><a href="login">Login</a></li>
<li><a href="register">register</a></li>
</ul>
<hr>
</body>
</html>