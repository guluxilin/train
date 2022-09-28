<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
<body>
<form action="regist" method="POST">//向后端传值注册用户
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

//前端返回用户的注册信息<br/>
userid:<s:property value="userId"/><br/>
username:<s:property value="userName"/><br/>
password:<s:property value="userPsw"/><br/>
level:<s:property value="userLevel"/><br/>
<s:debug/>
</body>
</html>
