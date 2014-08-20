<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
    <title></title>
</head>
<body>
<form:form action="login">
    Hello ${firstName}!<br>
    <input type="submit" value="signout"/>
</form:form>
</body>
</html>
