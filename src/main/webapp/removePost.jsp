<%@ page contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${applicationScope.appLang}" />
<fmt:setBundle basename="messages" var="message" />
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
<div class="container">
    <div class="col-lg-4"></div>
    <div class="col-lg-4">
        <div class="jumbotron" style="padding-top: 20px;">
            <form method="post" action="/removePost.do">
                <h3 style="text-align: center;"><fmt:message key="게시글삭제화면" bundle="${message}" /></h3>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="<fmt:message key="아이디" bundle="${message}" />" name="id" maxlenth="20">
                </div>
                <input type="submit" class="btn btn-primary form-control"<fmt:message key="삭제" bundle="${message}"/>>
            </form>
        </div>
    </div>
    <div class="col-lg-4"></div>
</div>
<a href="postPage.jsp"><fmt:message key="게시판메뉴페이지" bundle="${message}" /></a>
</body>
</html>
