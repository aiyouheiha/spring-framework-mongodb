<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title></title>
</head>
<body>
<form:form action="login">
    Hello ${firstName}!<br>
    <input type="submit" value="signout"/>
</form:form>
</body>
</html>
