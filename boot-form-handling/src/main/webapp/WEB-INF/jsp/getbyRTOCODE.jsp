<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search By RTOCODE+</title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">RTOCODE Query</h3>
	<div id="addVehicle">

		<form action="/getbyRTOCODE" method="post">
			<p>
     			<label>Display Vehicles by RTO CODE :</label>

				<input type="text" name="RTOCODE" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form>
	</div>
</body>

</html>