<%@ page contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${applicationScope.appLang}" />
<fmt:setBundle basename="messages" var="message" />
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <th>
    <td>아이디</td>
    <td>비밀번호</td>
    <td>이름</td>
    <td>프로필사진</td>
    </th>
        <tr>
            <td>${userInfo.getId()}</td>
            <td>${userInfo.getPassword()}</td>
            <td>${userInfo.getName()}</td>
            <td>${userInfo.getProfileFileName()}</td>
        </tr>
</table>
<br />
<a href="adminPage.jsp"><fmt:message key="메인화면" bundle="${message}" /></a>
</body>
</html>
