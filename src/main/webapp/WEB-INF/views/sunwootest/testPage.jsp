<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
+<%--
  Created by IntelliJ IDEA.
  User: kimsunwoo
  Date: 2016-06-24
  Time: 오전 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>디스패처서블릿 테스트 페이지입니당</title>
</head>
<body>
    <%--<jsp:include page="includetest.jsp"/>--%>
    <%@include file="includetest.jsp"%>
    <div class="tipBox">
        <c:set var="hello" value="hello"/>
        ${hello}
    </div>
</body>
</html>