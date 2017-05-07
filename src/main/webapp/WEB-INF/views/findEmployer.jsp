
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>FindEmployerPage</title>
</head>
<body>
<h1>FindEmployer</h1>
<br>
<h2>通过SqlProvider方式查询一行记录</h2>
<div><b>编号:&nbsp;</b>${employer.employerId}</div>
<div><b>姓名:&nbsp;</b>${employer.name}</div>
<div><b>性别:&nbsp;</b>${employer.sex}</div>
<div><b>公司ID:&nbsp;</b>${employer.companyId}</div>
<br>
<h2>通过SqlProvider方式查询多行记录,并使用了多个检索参数</h2>
<div>
    <table border="1">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>公司ID</th>
        </tr>
        <c:forEach items="${employerList}" var="e">
            <tr>
                <td>${e.employerId}</td>
                <td>${e.name}</td>
                <td>${e.sex}</td>
                <td>${e.companyId}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>