<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<!-- Path is to set values in Student Object and items is to show the options
		to choice -->

<body>
	<form:form action="processForm" modelAttribute="student">
	
	First name: <form:input path="firstName"/> <!-- Student property name, the same of set name-->
	<br><br>
	Last name: <form:input path="lastName"/>
	<br><br>
	Country:
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select>
	<br><br>
	
	Favorite language:
	<form:radiobuttons path="favoriteLanguage" items="${student.languageOptions}"/>
	
	<br><br>
	
	<form:checkboxes path="systems" items="${student.systemOptions}"/>
	
	<br><br>
	
	<input type="submit" value="Submit"/>
	
	</form:form>


</body>


</html>