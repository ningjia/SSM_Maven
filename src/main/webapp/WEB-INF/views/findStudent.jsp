
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>FindStudentPage</title>
</head>
<body>
<h1>FindStudent</h1>
<br>
<h2>不使用resultMap</h2>
<div>${student.studId}</div>
<div>${student.name}</div>
<div>${student.email}</div>
<div>${student.phone}</div>
<br>
<h2>使用resultMap,并增加了address和zip两个字段的查询</h2>
<div>${student2.studId}</div>
<div>${student2.name}</div>
<div>${student2.email}</div>
<div>${student2.phone}</div>
<div>${student2.contactInfo.address}</div>
<div>${student2.contactInfo.zip}</div>
</body>
</html>