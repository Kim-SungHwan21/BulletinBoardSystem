<%@ page contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true" language="java" %>
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
    <td>게시글번호</td>
    <td>작성자</td>
    <td>제목</td>
    <td>내용</td>
    <td>작성시간</td>
    </th>
    <c:forEach var="list" items="${postDataLoad.getPosts()}">
        <tr>
            <td>${list.getId()}</td>
            <td>${list.getWriterUserId()}</td>
            <td>${list.getTitle()}</td>
            <td>${list.getContent()}</td>
            <td>${list.getWriteTime()} </td>
        </tr>
    </c:forEach>
</table>
<br />

<a href="postPage.jsp"><fmt:message key="게시판메뉴페이지" bundle="${message}" /></a>
</body>
</html>
