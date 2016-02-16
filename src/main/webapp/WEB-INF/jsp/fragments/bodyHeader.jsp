<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>




<nav id="myNavbar"
	class="navbar navbar-default navbar-inverse navbar-fixed-top"
	role="navigation">
	<!-- Brand and toggle get grouped for better mobile display -->
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#navbarCollapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Tutorial Republic</a>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="navbarCollapse">
			<ul class="nav navbar-nav">
				<li><a href="<spring:url value="/" htmlEscape="true" />"><i
						class="icon-home"></i> Home</a></li>
				<li><a
					href="<spring:url value="/owners/find.html" htmlEscape="true" />"><i
						class="icon-search"></i> Find owners</a></li>
				<li><a
					href="<spring:url value="/vets.html" htmlEscape="true" />"><i
						class="icon-th-list"></i> Veterinarians</a></li>
				<li><a
					href="<spring:url value="/oups.html" htmlEscape="true" />"
					title="trigger a RuntimeException to see how it is handled"><i
						class="icon-warning-sign"></i> Error</a></li>
			</ul>
		</div>
	</div>
</nav>
<div class="container">
	<h3>Navbar With Dropdown</h3>
	<p>This example adds a dropdown menu for the "Page 1" button in the
		navigation bar.</p>
	<div class="row">
		<div class="col-md-8">
			<spring:url value="/resources/images/banner-graphic.png" var="banner" />
			<img class="img-responsive" src="${banner}" />
		</div>

	</div>

