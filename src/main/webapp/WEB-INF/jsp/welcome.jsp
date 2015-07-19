<!DOCTYPE html> 

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html lang="en">

<jsp:include page="fragments/staticFiles.jsp"/>

<body>
<div class="container">
    <jsp:include page="fragments/bodyHeader.jsp"/>
    <h2><fmt:message key="welcome"/></h2>
    <spring:url value="/resources/images/pets.png" htmlEscape="true" var="petsImage"/>
    <jsp:include page="fragments/footer.jsp"/>
	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<a href="${logoutUrl}">Log Out</a>
</div>

</body>

</html>
