<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="user" items="${users}">
    <h1>Name: ${user.name}, ID: ${user.id}</h1>
</c:forEach>