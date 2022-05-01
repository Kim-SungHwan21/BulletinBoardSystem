<%@ page contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%--<fmt:setLocale value="${applicationScope.appLang}" />--%>
<%--<fmt:setBundle basename="messages" var="message" />--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>목록</title>
</head>
<body>
<br>
<table>
    <th>
    <td>아이디</td>
    <td>비밀번호</td>
    <td>이름</td>
    <td>프로필사진</td>
    </th>
    <c:forEach var="list" items="${userDataLoad.getUsers()}">
        <tr>
            <td>${list.getId()}</td>
            <td>${list.getPassword()}</td>
            <td>${list.getName()}</td>
            <td>${list.getProfileFileName()} </td>
        </tr>
    </c:forEach>
</table>
<br />

<a href="adminPage.jsp">메인화면</a>
</body>
</html>
