<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Supplier</title>
<style>
.sup{
margin-left:600px;
}
</style>
</head>
<%@include file="admin.jsp" %>
<body>
<div class="sup">
	<h1>Suppliers</h1>

	<c:url var="addAction" value="/addsupplier"></c:url>

	<form:form action="${addAction}" commandName="supplier">
		<table>
			<tr>
				<td><form:label path="sid">
						<spring:message text="Supplier ID" />
					</form:label></td>
				<c:choose>
					<c:when test="${!empty supplier.sid}">
						<td><form:input path="sid" disabled="true" readonly="true" />
						</td>
					</c:when>

					<c:otherwise>
						<td><form:input path="sid" required="true"/></td>
					</c:otherwise>
				</c:choose>
			<tr>
			<form:input path="sid" hidden="true"  />
				<td><form:label path="name">
						<spring:message text="Supplier Name" />
					</form:label></td>
				<td><form:input path="name" required="true" /></td>
			</tr>
			<tr>
				<td><form:label path="address">
						<spring:message text="Supplier Address" />
					</form:label></td>
				<td><form:input path="address" required="true" /></td>
			</tr>
			<tr>
				<td colspan="2"><c:if test="${!empty supplier.name}">
						<input type="submit"
							value="<spring:message text="Edit Supplier"/>" />
					</c:if> <c:if test="${empty supplier.name}">
						<input type="submit" value="<spring:message text="Add Supplier"/>" />
					</c:if></td>
			</tr>
		</table>
	</form:form>
	</div>
	<br>
	<h3>Supplier List</h3>
	<c:if test="${!empty supplierList}">
		<table class="tg">
			<tr>
				<th width="80">Supplier Id</th>
				<th width="120">Supplier Name</th>
				<th width="120">Supplier Address</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${supplierList}" var="supplier">
				<tr>
					<td>${supplier.sid}</td>
					<td>${supplier.name}</td>
					<td>${supplier.address}</td>
					<td><a href="<c:url value='editsupplier/${supplier.sid}' />">Edit</a></td>
					<td><a href="<c:url value='removesupplier/${supplier.sid}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>