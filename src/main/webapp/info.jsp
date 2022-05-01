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
            <form method="post" action="/resultInfo.do">
                <h3 style="text-align: center;"><fmt:message key="회원정보조회화면" bundle="${message}" /></h3>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="<fmt:message key="아이디" bundle="${message}" />" name="id" maxlenth="20">
                </div>
                <input type="submit" class="btn btn-primary form-control"<fmt:message key="조회" bundle="${message}"/>>
            </form>
        </div>
    </div>
    <div class="col-lg-4"></div>
</div>
<a href="adminPage.jsp"><fmt:message key="메인화면" bundle="${message}" /></a>
</body>
</html>
