<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search by Vehicle Number </title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Query by Vehicle Number</h3>
	<div id="/addVehicle">
	<form action="/getbyVNumber" method="post">
			<p>
				<label>Enter Vehicle Number</label>
				<input type="text" name="VNumber" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form>
	</div>

</body>
</html>