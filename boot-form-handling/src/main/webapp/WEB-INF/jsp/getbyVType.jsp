<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search By Vehicle Type</title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Vehicle Type Query</h3>
	<div id="addVehicle">

		<form action="/getbyVType" method="post">
			<p>
     			<label>Enter Vehicle Type</label>

				<input type="text" name="VType" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form>
	</div>
</body>

</html>