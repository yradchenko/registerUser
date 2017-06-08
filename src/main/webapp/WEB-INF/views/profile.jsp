<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
  <jsp:include page="fragments/headTag.jsp" />
  <body>
  <div class="container">
    <h3>Your Profile</h3>
    <dl class="dl-horizontal">
    <dt>Username: <c:out value="${registerForm.username}" /></dt>
    <dt>Firstname: <c:out value="${registerForm.firstName}" /></dt> 
    <dt>Lastname: <c:out value="${registerForm.lastName}" /></dt>
    <dt>email: <c:out value="${registerForm.email}" /></dt>
    </dl>
    </div>
  </body>
</html>

