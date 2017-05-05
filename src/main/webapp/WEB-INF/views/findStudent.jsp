
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>FindStudentPage</title>
</head>
<body>
<h1>FindStudent</h1>
<br>
<h2>不设置resultMap</h2>
<div><b>编号:&nbsp;</b>${student.studId}</div>
<div><b>姓名:&nbsp;</b>${student.name}</div>
<div><b>邮箱:&nbsp;</b>${student.email}</div>
<div><b>电话:&nbsp;</b>${student.phone}</div>
<br>
<h2>设置resultMap,并增加了address和zip两个字段的查询</h2>
<div><b>编号:&nbsp;</b>${student2.studId}</div>
<div><b>姓名:&nbsp;</b>${student2.name}</div>
<div><b>邮箱:&nbsp;</b>${student2.email}</div>
<div><b>电话:&nbsp;</b>${student2.phone}</div>
<div><b>地址:&nbsp;</b>${student2.contactInfo.address}</div>
<div><b>邮编:&nbsp;</b>${student2.contactInfo.zip}</div>
<br>
<h2>设置resultMap,并增加了一对一映射(contactInfo表)</h2>
<div><b>编号:&nbsp;</b>${student3.studId}</div>
<div><b>姓名:&nbsp;</b>${student3.name}</div>
<div><b>邮箱:&nbsp;</b>${student3.email}</div>
<div><b>电话:&nbsp;</b>${student3.phone}</div>
<div><b>地址:&nbsp;</b>${student3.contactInfo.address}</div>
<div><b>邮编:&nbsp;</b>${student3.contactInfo.zip}</div>
<br>
<h2>设置resultMap,并增加了一对一映射(与contactInfo表),一对多映射(与course表)</h2>
<div><b>编号:&nbsp;</b>${student4.studId}</div>
<div><b>姓名:&nbsp;</b>${student4.name}</div>
<div><b>邮箱:&nbsp;</b>${student4.email}</div>
<div><b>电话:&nbsp;</b>${student4.phone}</div>
<div><b>地址:&nbsp;</b>${student4.contactInfo.address}</div>
<div><b>邮编:&nbsp;</b>${student4.contactInfo.zip}</div>
<div>
    <table border="1">
        <tr>
            <th>课程编号</th>
            <th>课程名称</th>
            <th>课程描述</th>
        </tr>
        <c:forEach items="${student4.courses}" var="c">
            <tr>
                <td>${c.courseId}</td>
                <td>${c.name}</td>
                <td>${c.desc}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>