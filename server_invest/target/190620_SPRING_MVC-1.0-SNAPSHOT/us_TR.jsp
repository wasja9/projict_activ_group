
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  <%-- Подключение к библиотеке taglib --%>

<style>
    <%@include file="style.css" %>
</style>


<html>
<head>
    <title>Books Store Application</title>    <%-- Заголовок --%>

    <link type= "text/css" rel="stylesheet" media="screen" href="style.css" />

</head>

<body>

<div class="STILE_div_1">
<center>
    <h1>Список пользователей</h1>

    <p>TRABLE!!!!!!!!!</p>

    <table border="1" cellpadding="5"> <%-- Открываем тег для таблицы --%>

        <tr> <%-- Строка для заголовков --%>
            <th> id_US</th> <%-- Столбкц для ID --%>
            <th>login</th> <%-- Столбкц для логин --%>
            <th>password</th> <%-- Столбкц для пароль --%>
            <th>firstname</th> <%-- Столбкц для имя --%>
            <th>lastname</th> <%-- Столбкц для фамилия --%>
            <th>middlename</th> <%-- Столбкц для отчество --%>
            <th>status</th> <%-- Столбкц для отчество --%>
        </tr>
        <c:forEach var="US" items="${userFromServer}"> <tr> <%-- Контейнер с данными из сервлета --%>
        <tr> <tr> <%-- Строка с данными --%>
                <td><c:out value = "${US.getId_US()}" /></td> <%-- Строка данных для из экземпляра сервлета --%>
                <td><c:out value = "${US.getLogin()}" /></td>
                <td><c:out value = "${US.getPassword()}" /></td>
                <td><c:out value = "${US.getFirstname()}" /></td>
                <td><c:out value = "${US.getLastname()}" /></td>
                <td><c:out value = "${US.getMiddlename()}" /></td>
                <td><c:out value = "${US.getStatus()}" /></td>

                <td> <%-- Строка с ссылками --%>
                   </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
<%-- --%>
<%-- --%>
<%-- --%>