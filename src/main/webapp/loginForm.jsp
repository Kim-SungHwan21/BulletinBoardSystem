<%@ page contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${applicationScope.appLang}" />
<fmt:setBundle basename="messages" var="message" />
<html>
<head>
    <meta charset='UTF-8' />
    <title></title>
    <link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
    <%--<form method='post' action='/login.do'>--%>
    <%--    <fmt:message key="아이디" bundle="${message}" />: <input type='text' name='id' /><br />--%>
    <%--    <fmt:message key="비밀번호" bundle="${message}" />: <input type='password' name='pwd' /><br />--%>
    <%--    <input type='submit' value='<fmt:message key="로그인" bundle="${message}" />' />--%>
    <%--</form>--%>
<div class="container">
    <div class="col-lg-4"></div>
    <div class="col-lg-4">
        <div class="jumbotron" style="padding-top: 20px;">
            <form method="post" action="/login.do">
                <h3 style="text-align: center;"><fmt:message key="로그인화면" bundle="${message}" /></h3>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="<fmt:message key="아이디" bundle="${message}" />" name="id" maxlenth="20">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="<fmt:message key="비밀번호" bundle="${message}" />" name="pwd" maxlenth="20">
                </div>
                <input type="submit" class="btn btn-primary form-control"<fmt:message key="로그인" bundle="${message}"/>>
            </form>
        </div>
    </div>
    <div class="col-lg-4"></div>
</div>
</body>
</html>