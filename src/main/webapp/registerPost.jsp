<%@ page contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${applicationScope.appLang}" />
<fmt:setBundle basename="messages" var="message" />
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="postPage.jsp"><fmt:message key="게시판메뉴페이지" bundle="${message}" /></a>
</body>
</html>
