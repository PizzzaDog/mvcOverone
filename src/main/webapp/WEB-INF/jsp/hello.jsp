<jsp:useBean id="user" class="by.overone.entity.MyUser" />
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<html>
<body>
<H1>${user.name}</H1>
<h1>${user.id}</h1>
</body>
</html>