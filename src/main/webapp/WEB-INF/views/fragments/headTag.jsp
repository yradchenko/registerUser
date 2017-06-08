<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>

  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
   <title>Register :: sample</title>


<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapminCss"/>
<link href="${bootstrapminCss}" rel="stylesheet"/>

<spring:url value="/resources/css/bootstrap.css" var="bootstrapCss"/>
<link href="${bootstrapCss}" rel="stylesheet"/>

<spring:url value="/resources/css/style.css" var="styleCss"/>
    <link href="${styleCss}" rel="stylesheet"/>

<spring:url value="/resources/js/bootstrap.js" var="bootstrapJs"/>
<script src="${bootstrapJs}"></script>

<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapminJs"/>
<script src="${bootstrapminJs}"></script>

</head>