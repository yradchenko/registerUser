<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!-- https://github.com/habuma/SpringInActionExamples/blob/master/Chapter_06/Spittr/src/main/webapp/WEB-INF/views/registerForm.jsp -->

<!DOCTYPE html>
<html>
<jsp:include page="fragments/headTag.jsp" />

<body>
	<div class="container">
		<div class="row"><h2>Register Form</h2></div>
		<sf:form class="form-horizontal" method="POST" action="/sample/register"
			commandName="registerForm">
			<div class="form-group">
			<sf:label path="lastName" class="col-sm-2 control-label">Last name:</sf:label>
			 <div class="col-sm-6">
			<sf:input class="form-control" path="lastName" />
			</div>
			<sf:errors class="col-sm-4" path="lastName" />
			</div>
			
			<div class="form-group">
			<sf:label path="firstName" class="col-sm-2 control-label">First name:</sf:label>
			<div class="col-sm-6">
			<sf:input class="form-control" path="firstName" />
			</div>
			<sf:errors class="col-sm-4" path="firstName"></sf:errors>
			</div>
			
			<div class="form-group">
			<sf:label path="email" class="col-sm-2 control-label">Email:</sf:label>
			<div class="col-sm-6">
			<sf:input class="form-control" path="email" />
			</div>
			<sf:errors class="col-sm-4" path="email"></sf:errors>
			</div>
			
			<div class="form-group">
			<sf:label path="username" class="col-sm-2 control-label">Username:</sf:label>
			<div class="col-sm-6">
			<sf:input class="form-control" path="username" />
			</div>
			<sf:errors class="col-sm-4" path="username"></sf:errors>
			</div>
			
			<div class="form-group">
			<sf:label path="password" class="col-sm-2 control-label">Password:</sf:label>
			<div class="col-sm-6">
			<sf:input class="form-control" path="password" />
			</div>
			<sf:errors class="col-sm-4" path="password"></sf:errors>
			</div><br/>

			<input type="submit" value="Register" />
		</sf:form>
		<br/>
		<jsp:include page="fragments/footer.jsp" />
	</div>
</body>
</html>
