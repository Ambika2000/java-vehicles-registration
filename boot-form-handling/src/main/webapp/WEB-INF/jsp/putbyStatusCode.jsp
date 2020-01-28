<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show by Status Code</title>
</head>
<body>
<jsp:include page="menu.jsp" />

	      

	<h3 style="color: red;">The requested vehicles are :</h3>

	<ul>

		<c:forEach var="listValue" items="${vehicles}">

			<li>${listValue}</li>

		</c:forEach>
</body>
</html>