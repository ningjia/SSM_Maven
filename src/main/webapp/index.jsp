<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>SSM(SpringMVC+Spring+Mybatis整合Demo)</h2>
<table border="1">
    <tr>
        <td><a href="/ssm/user/findUser">FindUser</a></td>
        <td>使用mybatis-generator生成相应文件,并查询User表的所有数据</td>
    </tr>
    <tr>
        <td><a href="/ssm/user/findStudent">FindStudent</a></td>
        <td>手工编写Mapper文件,使用@Select注解来查询Students表的数据</td>
    </tr>
    <tr>
        <td><a href="/ssm/user/findEmployer">findEmployer</a></td>
        <td>手工编写Mapper文件,使用@SqlProvider注解来查询employer表的数据</td>
    </tr>
    <tr>
        <td><a href="assetsTest.jsp">assetsTest</a></td>
        <td>资源测试(访问静态资源等)</td>
    </tr>
</table>

</body>
</html>
