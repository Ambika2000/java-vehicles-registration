<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Show Number Plates</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	      
	<h3 style="color: red;">Show All Number Plates : </h3>
	<ul>
		<c:forEach var="listValue" items="${vehicle}">
			<li>${listValue}</li>
		</c:forEach>
	</ul>
</body>
</html>