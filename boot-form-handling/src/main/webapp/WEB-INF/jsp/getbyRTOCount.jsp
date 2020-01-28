<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search By RTO Count</title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">RTO Count Query</h3>
	<div id="addVehicle">

		<form action="/getbyRTOCount" method="post">
			<p>
     			<label>Enter RTO Count</label>

				<input type="text" name="RTOCount" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form>
	</div>
</body>

</html>