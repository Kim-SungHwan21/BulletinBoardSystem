<%@ page contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${applicationScope.appLang}" />
<fmt:setBundle basename="messages" var="message" />
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/bootstrap.css">
</head>
<div class="container">
    <div class="col-lg-4"></div>
    <div class="col-lg-4">
        <div class="jumbotron" style="padding-top: 20px;">
            <form method="post" action="/registerPost.do">
                <h3 style="text-align: center;"><fmt:message key="게시글등록화면" bundle="${message}" /></h3>
                <div class="form-group">
                    <fmt:message key="게시글번호" bundle="${message}"/> : ${postDataLoad.getPosts().size() +1}
                </div>
                <div class="form-group">
                    <fmt:message key="작성자" bundle="${message}"/> : ${id}
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="<fmt:message key="제목" bundle="${message}" />" name="title" maxlenth="20">
                </div>
                <div class="form-group">
                    <textarea rows="10" cols="30" name="content"></textarea>
                </div>
                <div class="form-group">
                    <fmt:message key="작성시간" bundle="${message}"/> ${postDataLoad.getWriteTime()}
                </div>
                <input type="submit" class="btn btn-primary form-control"<fmt:message key="게시글등록" bundle="${message}"/>>
            </form>
        </div>
    </div>
    <div class="col-lg-4"></div>
</div><a href="postPage.jsp"><fmt:message key="게시판메뉴페이지" bundle="${message}" /></a>
</body>
</html>
