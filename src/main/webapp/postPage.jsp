<%@ page contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${applicationScope.appLang}" />
<fmt:setBundle basename="messages" var="message" />
<html>
<head>
    <title>Title</title>
</head>
<body>
<table method="post" action="/postPage.do">
    <h1>게시판 페이지</h1>
    <hr>
    <input type="button" value="로그아웃" onclick="location.href='/logout.do'"><br>

    <a href="infoPost.jsp">게시글정보조회</a><br>
    <a href="modifyPost.jsp">게시글수정</a><br>
    <a href="removePost.jsp">게시글삭제</a><br>
    <a href="registerPost.jsp">게시글추가</a><br>
</table>
<a href="index.jsp">NHN게시판웹사이트</a>
</body>
</html>
