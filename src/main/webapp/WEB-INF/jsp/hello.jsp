<!DOCTYPE html> 

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<html lang="en">

<jsp:include page="fragments/staticFiles.jsp"/>

<body>
<div class="container">
    <jsp:include page="fragments/bodyHeader.jsp"/>
    <h2><fmt:message key="welcome"/></h2>
    <h1>My home</h1>
    <spring:url value="/resources/images/pets.png" htmlEscape="true" var="petsImage"/>
	<h1>Title : ${title}</h1>	
	<h1>Message : ${message}</h1>	
    <jsp:include page="fragments/footer.jsp"/>

</div>

</body>

</html>
