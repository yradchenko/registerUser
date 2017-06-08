<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<html>
<jsp:include page="fragments/headTag.jsp" />
<body>
	<div class="container">
		<h2>Welcome</h2>

		<p class="regtitle">
			<a href="<c:url value="/register"/>">Register</a>
		</p>
		<br />

		<div class="panel-footer">
			<jsp:include page="fragments/footer.jsp" />
		</div>
	</div>
</body>
</html>

