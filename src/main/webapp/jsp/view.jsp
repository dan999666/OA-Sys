<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>view</title>
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/reset.css">
</head>
<body>
<header class="top-header">
    <h1>后台管理系统</h1>
    <div class="header-right">
        <p>
            <span>你好</span>
            <span>系统管理员</span>
            <a href="#" target="_blank">退出</a>
        </p>
    </div>
</header>
<div class="container">
    <div class="left-content">
        <div class="left-title">
            <h2>功能列表</h2>
        </div>
        <nav>
            <ul class="list">
                <li><a href="#" target="_blank">账户管理</a></li>
                <li><a href="#" target="_blank">部门管理</a></li>
                <li><a href="#" target="_blank">薪资基本参数</a></li>
                <li><a href="#" target="_blank">奖惩录入</a></li>
                <li><a href="#" target="_blank">薪资发放</a></li>
                <li><a href="#" target="_blank">薪资查看</a></li>
                <li><a href="#" target="_blank">薪资统计</a></li>
            </ul>
        </nav>
    </div>
    <div class="right-content">
        <div class="view">
            <p>
                <strong>订单编号</strong>
                <span>001</span>
            </p>
            <p>
                <strong>订单编号</strong>
                <span>001</span>
            </p>
            <p>
                <strong>订单编号</strong>
                <span>001</span>
            </p>
            <p>
                <strong>订单编号</strong>
                <span>001</span>
            </p>
            <p>
                <strong>订单编号</strong>
                <span>001</span>
            </p>
            <div class="view-btn">
                <input type="button" id="back" name="back" value="返回">
            </div>
        </div>
    </div>
</div>
<footer class="footer">
    后台管理系统
</footer>
</body>
</html>

