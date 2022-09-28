<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
<body>
<form action="login" method="POST">//输入用户名密码
    <table border="1">
        <tr>
            <td>userName:</td>
            <td><input type="text" name="userName"/></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="text" name="userPsw"/></td>
        </tr>

        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="提交"/>
            </td>
        </tr>
    </table>
</form>
<br/>

</body>
</html>
