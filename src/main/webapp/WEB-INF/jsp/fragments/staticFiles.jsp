<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!--
PetClinic :: a Spring Framework demonstration
http://www.tutorialrepublic.com/codelab.php?topic=bootstrap&file=responsive-layout
-->

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>PetClinic :: a Spring Framework demonstration</title>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	<spring:url value="/webjars/jquery-ui/1.10.3/ui/jquery.ui.datepicker.js" var="jQueryUiDatePicker"/>
    <script src="${jQueryUiDatePicker}"></script>
    
    <!-- jquery-ui.css file is not that big so we can afford to load it -->
    <spring:url value="/webjars/jquery-ui/1.10.3/themes/base/jquery-ui.css" var="jQueryUiCss"/>
    <link href="${jQueryUiCss}" rel="stylesheet"></link>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
</head>


