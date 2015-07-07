<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<html lang="en">

<jsp:include page="../fragments/staticFiles.jsp" />

<body>
	<div class="container">
		<jsp:include page="../fragments/bodyHeader.jsp" />
		<h2>
			<fmt:message key="welcome" />
		</h2>
		<h1>Hello, Welcome to Login Page!!!</h1>
		<spring:url value="/resources/images/pets.png" htmlEscape="true"
			var="petsImage" />
		<img src="${petsImage}" />

		<h1>Login</h1>
		<div id="login-error">${error}</div>
		<form action="../../j_spring_security_check" method="post">
			<p>


				<label for="j_username">Username</label> <input id="j_username"
					name="j_username" type="text" />
			</p>
			<p>
				<label for="j_password">Password</label> <input id="j_password"
					name="j_password" type="password" />
			</p>
			<input type="submit" value="Login" />

		</form>


		<jsp:include page="../fragments/footer.jsp" />

	</div>

</body>

</html>
