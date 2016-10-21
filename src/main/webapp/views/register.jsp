<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<style>
body{
margin-top:160px;
}
.footer{
margin-top:235px;
}
</style>
</head>
<%@include file="header.jsp" %>
<body>
<form:form action="Success" method="post" commandName="registerModel">

		<center>
			<h1>Registration Form</h1>
		</center>
		<table cellspacing="38" cellpadding="2" width="45%" bgcolor="" align="center">

			<tr>
				<td><form:label path="firstname">
						<spring-message text="firstname" />
					</form:label> First Name:<td>
				
				<td><form:input path="firstname" required="true" title="field shold not be empty" /></td>
			</tr>

            <tr>
				<td><form:label path="lastname">
						<spring-message text="lastname" />
					</form:label> Last Name:<td>
				
				<td><form:input path="lastname"  required="true" title="field shold not be empty" /></td>
			</tr>

			<tr>
				<td><form:label path="username">
						<spring-message text="username" />
					</form:label> User Name:<td>
				
				<td><form:input path="username" required="true" title="field shold not be empty" /></td>
			</tr>
			

			<tr>
				<td><form:label path="password">
						<spring-message text="password" type="password" />
					</form:label> Password:<td>
				
				<td><form:input path="password" required="true" type="password" pattern=".{5,20}" title="Password should contain minimum 5 letters" /></td>
			</tr>
			
                  <tr>
				<td><form:label path="emailid">
						<spring-message text="emailid" />
					</form:label> E-mailId:<td>
				
				<td><form:input type="email"  path="emailid" required="true" 
				title="field shold not be empty" /></td>
			</tr>

			

			<tr>
				<td><form:label path="mobilenumber">
						<spring-message text="mobilenumber" />
					</form:label> MobileNumber:<td>
				
				<td><form:input type="number" path="mobilenumber" required="true" pattern=".{10,10}" title="Enter a valid mobile number" /></td>
			</tr>
			
			<tr>
				<td><form:label path="address">
						<spring-message text="address" />
					</form:label> Address:<td>
				
				<td><form:input path="address" required="true" title="field shold not be empty" /></td>
			</tr>
			
			
			<tr>
			<td></td>
			<centre>
				<td><input type="submit" value="Register" ></td>
				</centre>
				</tr>
				
		</table>
	</form:form>
</body>
<div class="footer">
<%@include file="footer.jsp" %>
</div>
</html>

