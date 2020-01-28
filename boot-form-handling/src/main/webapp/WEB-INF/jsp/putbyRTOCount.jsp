<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Show by RTO Count</title>
</head>

<body>

	<jsp:include page="menu.jsp" />

	      

	<h3 style="color: red;">The requested vehicles are :</h3>

	<ul>

		<c:forEach var="listValue" items="${vehicless}">

			<li>${listValue}</li>

		</c:forEach>

	</ul>

</body>

</html>