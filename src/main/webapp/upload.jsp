<%@ page contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${applicationScope.appLang}" />
<fmt:setBundle basename="messages" var="message" />
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/upload.do" enctype="multipart/form-data">
    <input type="file" name="f1" />
    <input type="submit" />
</form>
</body>
</html>
