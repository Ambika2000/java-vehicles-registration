<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="menu.jsp" />
<body>
<h3 style="color: red;">Query by Status Code</h3>
	<div id="addTheatre">

		<form action="/getbyStatusCode" method="post">
			<p>
     			<label>Enter Status Code</label>

				<input type="text" name="StatusCode" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form>
	</div>
</body>
</html>