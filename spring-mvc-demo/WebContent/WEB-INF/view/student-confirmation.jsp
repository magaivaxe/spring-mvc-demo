<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>
																	<!-- Call the getters -->
	The student is confirmed: ${student.firstName} ${student.lastName}
	<br><br>
	Country: ${student.country}
	<br></br>
	Favorite Language: ${student.favoriteLanguage}
	<br><br>
	Operating System:
	<ul>
	<!-- Loop to fill the choices from getStudent array from Student object -->
		<c:forEach var="temp" items="${student.systems}">
			<li> ${temp} </li>
		</c:forEach>
	</ul>
</body>

</html>