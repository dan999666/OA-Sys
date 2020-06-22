<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>login page</title>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body class="body-color">
<div class="login-box">
    <header class="login-header">
        <h1>后台管理系统</h1>
    </header>
    <div class="login-content">
        <form class="login-form" action="${pageContext.request.contextPath}/login.do" name="actionForm" id="actionForm"
              method="post">
            <div class="input-box">
                <label>用户名</label>
                <input type="text" class="input-text" placeholder="请输入用户名" name="userName">
            </div>
            <div class="input-box">
                <label>密码</label>
                <input type="password" class="input-text" placeholder="请输入密码" name="password">
            </div>
            <div class="sub-btn">
                <input type="submit" value="登录">
                <input type="reset" value="重置">
            </div>
        </form>
    </div>
</div>
</body>
</html>
