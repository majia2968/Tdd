<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html lang="en">

<jsp:include page="fragments/staticFiles.jsp" />

<body>
	<div class="container">
		<jsp:include page="fragments/bodyHeader.jsp" />
		<h2>
			<fmt:message key="welcome" />
		</h2>
		<h1>Hello, Welcome to Login Page!!!</h1>
		<spring:url value="/resources/images/pets.png" htmlEscape="true"
			var="petsImage" />
		<img src="${petsImage}" />

		<h1>Login</h1>
		<div id="login-error">${error}</div>
<h1>Spring Security Custom Login Form (XML)</h1>
 
	<div id="login-box">
 
		<h2>Login with Username and Password</h2>
 
		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
 
		<form name='loginForm'
		  action="<c:url value='j_spring_security_check' />" method='POST'>
 
		  <table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="submit" /></td>
			</tr>
		  </table>
 
		  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
 
		</form>
	</div>


		<jsp:include page="fragments/footer.jsp" />

	</div>

</body>

</html>
