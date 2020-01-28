<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Number Plate</title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Add New Number Plate</h3>

	<div id="addVehicle">
		<form:form action="/addNewVehicle" method="post"
			modelAttribute="v">
			<p>
				<label>Enter Vehicle Number</label>
				<form:input path="Number" />
			</p>
			<p>
				<label>Enter State Code</label>
				<form:input path="State_Code" />
			</p>
			<p>
				<label>Enter RTO Code</label>
				<form:input path="RTO_Code" />
			</p>
			<p>
				<label>Enter RTO Count</label>
				<form:input path="RTO_Code" />
			</p>
			<p>
				<label>Enter Vehicle Type</label>
				<form:input path="Vehicle_Type" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>
