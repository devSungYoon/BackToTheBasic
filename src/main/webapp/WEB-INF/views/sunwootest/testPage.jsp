<%--
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
    <jsp:include page="includetest.jsp"/>
    <div class="tipBox">
        <b>Tip of the Day:</b> <br /><br />
        <%= request.getAttribute("pageContent")%>
        <br/>
        Method is ${pageContext.request}
    </div>
</body>
</html>