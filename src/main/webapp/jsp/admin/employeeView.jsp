<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>view</title>
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="stylesheet" href="../../css/reset.css">
    <script src="../../js/jquery-1.8.3.min.js"></script>
    <script src="../../js/adminView.js"></script>
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
                <li><a href="/oa_sys_war/jsp/admin/employee.do?method=query" target="_blank">账户管理</a></li>
                <li><a href="/oa_sys_war/jsp/admin/depart.do?method=query" target="_blank">部门管理</a></li>
                <li><a href="/oa_sys_war/jsp/admin/salary.do?method=query" target="_blank">薪资基本参数</a></li>
                <li><a href="/oa_sys_war/jsp/admin/record.do?method=query" target="_blank">奖惩录入</a></li>
                <li><a href="#" target="_blank">薪资发放</a></li>
                <li><a href="/oa_sys_war/jsp/admin/salary.do?method=queryInfo" target="_blank">薪资查看</a></li>
                <li><a href="/oa_sys_war/jsp/admin/statistics.do?method=query" target="_blank">薪资统计</a></li>
            </ul>
        </nav>
    </div>
    <div class="right-content">
        <div class="view">
            <p><strong>员工编号:</strong><span>${employee.employeeId}</span></p>
            <p><strong>账号名称:</strong><span>${employee.acountName}</span></p>
            <p><strong>员工姓名:</strong><span>${employee.name}</span></p>
            <p><strong>密码:</strong><span>${employee.password}</span></p>
            <p><strong>员工角色:</strong><span>${employee.role}</span></p>
            <p><strong>性别:</strong><span>${employee.sex}</span></p>
            <p><strong>年龄:</strong><span>${employee.age}</span></p>
            <p><strong>是否被禁用:</strong><span>${employee.ban}</span></p>
            <p><strong>所处部门:</strong><span>${employee.deptName}</span></p>
            <p><strong>电子邮件:</strong><span>${employee.email}</span></p>
            <p><strong>电话:</strong><span>${employee.phone}</span></p>
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
