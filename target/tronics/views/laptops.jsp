<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.dell-brand img
{
max-height: 250px;
margin:0px 0px;
}
a
{
color:blue;
}
</style>
</head>
<body>
<%@include file="header.jsp" %>
<center>
<h1>Dell brand laptops</h1>
</center>
<div class="dell-brand">
<div class="container">
  <div class="row">
     <div class="col-sm-4">
      <h3 style="color:red;">Dell XPS 12</h3>
      <img src="F:\project\E-commerce project/dell xps 12.jpg">
<h3>price=Rs.45000.</h3>
<h3><a href="#">Buy</a></h3>

    </div>
    <div class="col-sm-4">
      <h3 style="color:red;">Dell INSPIRON 2 IN 1</h3>
      <img src="F:\project\E-commerce project/dell inspiron 2 in 1.jpg">
<h3>price=Rs.48000.</h3>
<h3><a href="#">Buy</a></h3>
    </div>

    <div class="col-sm-4">
      <h3 style="color:red;">Dell INSPIRON 15</h3> 
      <img src="F:\project\E-commerce project/dell inspiron 15.jpg">
<h3>price=Rs.50000.</h3>
<h3><a href="#">Buy</a></h3>
</div>
  </div>
</div>
<hr>
<div class="container">
  <div class="row">
     <div class="col-sm-4">
      <h3 style="color:red;">Dell INSPIRON NETBOOK</h3>
      <img src="F:\project\E-commerce project/dell inspiron netbook.jpg">
<h3>price=Rs.55000.</h3>
<h3><a href="#">Buy</a></h3>

    </div>
    <div class="col-sm-4">
      <h3 style="color:red;">Dell INSPIRON NOTE</h3>
      <img src="F:\project\E-commerce project/dell inspiron note.jpg">
<h3>price=Rs.53000.</h3>
<h3><a href="#">Buy</a></h3>
    </div>
    <div class="col-sm-4">
      <h3 style="color:red;">Dell VOSTRO 14</h3> 
      <img src="F:\project\E-commerce project/dell vostro 14.jpg">
<h3>price=Rs.56000.</h3>
<h3><a href="#">Buy</a></h3>
    </div>
  </div>
</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>