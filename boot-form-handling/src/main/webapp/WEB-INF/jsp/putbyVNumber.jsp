<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show by Vehicle Number</title>
</head>
<body>
<jsp:include page="menu.jsp" />
	<h3 style="color: red;">The Vehicle with specified Vehicle Number is</h3>

	<ul>
		<c:forEach var="listValue" items="${vehicles}">
			<li>${listValue}</li>

		</c:forEach>

	</ul>

</body>
</html>