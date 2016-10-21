<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Product</title>
<style>
.pro{
margin-left:600px;
}
</style>
</head>
<%@include file="admin.jsp" %>
<body>
<div class="pro">
	<h1>Products</h1>
	<h2>${msg}</h2>

	<c:url var="addAction" value="/addproduct"></c:url>

	<form:form action="${addAction}" method="post" enctype="multipart/form-data" commandName="product">
		<table style="width:100%">
			<tr>
				<td><form:label path="pid">
						<spring:message text="Product Id" />
					</form:label></td>
				<c:choose>
					<c:when test="${!empty product.pid}">
						<td><form:input path="pid" disabled="true" readonly="true" />
						</td>
					</c:when>

					<c:otherwise>
						<td><form:input path="pid" required="true"/></td>
					</c:otherwise>
				</c:choose>
			<tr>
			<form:input path="pid" hidden="true"  />
				<td><form:label path="name">
						<spring:message text="Product Name" />
					</form:label></td>
				<td><form:input path="name" required="true" /></td>
			</tr>
			
			
			<tr>
				<td><form:label path="price">
						<spring:message text="Product Price" />
					</form:label></td>
				<td><form:input path="price" required="true" /></td>
			</tr>
			
			<tr>
				<td><form:label path="description">
						<spring:message text="Product Description" />
					</form:label></td>
				<td><form:input path="description" required="true" /></td>
			</tr>
			
			<tr>
				<td><form:label path="supplier">
						<spring:message text="Supplier" />
					</form:label></td>
			
				 <td><form:select path="supplier.name" items="${supplierList}" itemValue="name" itemLabel="name" /></td>
			</tr>
			<tr>
				<td><form:label path="category">
						<spring:message text="Category" />
					</form:label></td>
			
				<td><form:select path="category.cname" items="${categoryList}" itemValue="cname" itemLabel="cname" /></td>
			</tr>
			<tr>
			<td><form:label path="image">
			<spring:message text="Image"/>
			</form:label></td>
			<td><form:input type="file" name="image" path="image"/></td>
			
		<%-- <td><form:label path="image">Image</form:label></td>   
		  
							<td>   <form:input type="file" path="image" /></td> --%>
			</tr>
			<tr>
				<td colspan="2"><c:if test="${!empty product.name}">
						<input type="submit"
							value="<spring:message text="EditProduct"/>" />
					</c:if> <c:if test="${empty product.name}">
						<input type="submit" value="<spring:message text="AddProduct"/>" />
					</c:if></td>
			</tr>
		</table>
	</form:form>
	</div>
	<br>
	<h3>Product List</h3>
	<c:if test="${!empty productList}">
		<table class="tg">
			<tr>
				<th width="80">Product ID</th>
				<th width="120">Product Name</th>
				<th width="80">Price</th>
				<th width="200">Product Description</th>
				<th width="80">Category</th>
				<th width="80">Supplier</th>
				<th width="80">Image</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${productList}" var="product">
				<tr>
					<td>${product.pid}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td>${product.description}</td>
					<td>${product.category.cname}</td>
					<td>${product.supplier.name}</td>
					<td><img src="<c:url value="F:\tronicsville/${product.pid}.jpg"/>"></td>
					<td><a href="<c:url value='editproduct/${product.pid}' />">Edit</a></td>
					<td><a href="<c:url value='removeproduct/${product.pid}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>