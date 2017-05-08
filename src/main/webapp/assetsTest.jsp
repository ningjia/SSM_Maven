
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
<head>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="scripts/jquery-3.2.1.js"></script>
    <script>
        $(document).ready(function(){
            $("#btn1").click(function(){
                $("p").append(" <b>Appended text</b>.");
            });
        });
    </script>
    <title>AssetsTest Page</title>
</head>
<body>
<h1>验证Jquery是否正确加载</h1>
<p>This is a paragraph.</p>
<button id="btn1">追加文本</button>
</body>

</html>