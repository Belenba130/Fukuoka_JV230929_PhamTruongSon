<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
<h1> Add Student</h1>
<form:form method="post" enctype="multipart/form-data" modelAttribute="student">
    <table border="1">
        <tr>
            <td>ID:</td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Phone:</td>
            <td><form:input path="phoneNumber" type="number"/></td>
        </tr>
        <tr>
            <td>Img:</td>
            <td><form:input path="img" type="file"/></td>
        </tr>
        <tr>
            <td>BirthDay:</td>
            <td><form:input path="birthday" type="date"/></td>
        </tr>
        <tr>
            <td>Sex:</td>
            <td><form:input path="sex"/></td>
        </tr>
        <tr>
            <td>Address:</td>
            <td><form:input path="address"/></td>
        </tr>
    </table>
    <button>ADD</button>
</form:form>
</body>
</html>
