
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
<div>${student.STUDID}</div>
<div>${student.NAME}</div>
<div>${student.EMAIL}</div>
<div>${student.PHONE}</div>
<br>
<h2>使用resultMap</h2>
<div>${student2.STUDID}</div>
<div>${student2.NAME}</div>
<div>${student2.EMAIL}</div>
<div>${student2.PHONE}</div>
<div>${student2.contactInfo.ADDRESS}</div>
</body>
</html>