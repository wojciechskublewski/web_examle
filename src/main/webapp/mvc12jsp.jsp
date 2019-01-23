<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 18.01.19
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${start} i ${end}<br>
    <c:forEach var="item" begin="${start}" end="${end}" step="1">
        ${item}<br>
    </c:forEach>
</body>

</html>
