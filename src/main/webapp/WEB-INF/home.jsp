<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<h1>Student List</h1>
<table border="1">
    <thead>
    <tr>
        <th>ID:</th>
        <th>Name:</th>
        <th>Sex:</th>
        <th>Phone:</th>
        <th>Image:</th>
        <th>Birthday:</th>
        <th>Address:</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${student}" var="std">
        <tr>
            <td>${std.id}</td>
            <td>${std.name}</td>
            <td>${std.sex == true? "Nam":"Nữ"}</td>
            <td>${std.phoneNumber}</td>
            <td>${std.imageUrl}</td>
            <td><fmt:formatDate value="${std.birthday}" pattern="dd/MM/yyyy"/></td>
            <td>${std.address}</td>
            <td>
                <a href="/update/${std.id}" class="settings">Update</a>
                <a href="/delete/${std.id}" class="delete" onclick="return confirm('Are U sure to delete this ?')">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
