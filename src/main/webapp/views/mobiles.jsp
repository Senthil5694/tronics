<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>mobiles</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.mobiles img
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
<h1>Mobiles</h1>
</center>
<div class="mobiles">
<div class="container">
  <div class="row">
     <div class="col-sm-4">
      <h3 style="color:red;">LYF FLAME 8</h3>
      <img src="F:\project\E-commerce project/lyf flame 8.jpg">
<h3>price=Rs.8500.</h3>
<h3><a href="#">Buy</a></h3>

    </div>
    <div class="col-sm-4">
      <h3 style="color:red;">MI MI MAX</h3>
      <img src="F:\project\E-commerce project/mi mi max.jpg">
<h3>price=Rs.10000.</h3>
<h3><a href="#">Buy</a></h3>
    </div>

    <div class="col-sm-4">
      <h3 style="color:red;">SAMSUNG GALAXY 5</h3> 
      <img src="F:\project\E-commerce project/samsung galaxy- 5.jpg">
<h3>price=Rs.9000.</h3>
<h3><a href="#">Buy</a></h3>
</div>
  </div>
</div>
<hr>
<div class="container">
  <div class="row">
     <div class="col-sm-4">
      <h3 style="color:red;">LEECO LE 2</h3>
      <img src="F:\project\E-commerce project/leeco le 2.jpg">
<h3>price=Rs.11500.</h3>
<h3><a href="#">Buy</a></h3>

    </div>
    <div class="col-sm-4">
      <h3 style="color:red;">LENOVO K5</h3>
      <img src="F:\project\E-commerce project/lenovo k5.jpg">
<h3>price=Rs.12000.</h3>
<h3><a href="#">Buy</a></h3>
    </div>
    <div class="col-sm-4">
      <h3 style="color:red;">ASUS ZENFONE</h3> 
      <img src="F:\project\E-commerce project/asus zenfone.jpg">
<h3>price=Rs.13000.</h3>
<h3><a href="#">Buy</a></h3>
    </div>
  </div>
</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>