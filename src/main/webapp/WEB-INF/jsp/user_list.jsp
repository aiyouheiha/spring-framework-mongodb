<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<html>
<head>
    <title></title>
</head>
<body>
Test!
<table>
    <c:forEach var="u" items="${userList}">
        <tr>
            <td>${u.firstName}</td>
            <td>${u.lastName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
