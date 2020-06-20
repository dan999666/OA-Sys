<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>add</title>
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="stylesheet" href="../../css/reset.css">
    <%--
        <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    --%>
    <script src="../../js/jquery-1.8.3.min.js"></script>
    <script src="../../js/adminAdd.js"></script>
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
                <li><a href="/oa_sys_war/jsp/hr/employee.do?method=query" target="_blank">账号管理</a></li>
                <li><a href="/oa_sys_war/jsp/hr/salary.do?method=query" target="_blank">薪资基本参数</a></li>
                <li><a href="/oa_sys_war/jsp/hr/statistics.do?method=query" target="_blank">薪资统计</a></li>
            </ul>
        </nav>
    </div>
    <div class="right-content">
        <div class="add-table">
            <form action="${pageContext.request.contextPath }/jsp/hr/employee.do" name="addForm" id="addForm"
                  method="post">
                <input type="hidden" name="method" value="add">
                <div>
                    <label>员工编号</label>
                    <input type="text" name="employeeId" id="employeeId" value="">
                </div>
                <div>
                    <label>账号名称</label>
                    <input type="text" name="acountName" id="acountName" value="">
                </div>
                <div>
                    <label>员工姓名</label>
                    <input type="text" name="name" id="name" value="">
                </div>
                <div>
                    <label>密码</label>
                    <input type="text" name="password" id="password" value="">
                </div>
                <div>
                    <label>员工角色</label>
                    <input type="text" name="role" id="role" value="">
                </div>
                <div>
                    <label>员工性别</label>
                    <input type="text" name="sex" id="sex" value="">
                </div>
                <div>
                    <label>员工年龄</label>
                    <input type="text" name="age" id="age" value="">
                </div>
                <div>
                    <label>可用状态</label>
                    <input type="text" name="ban" id="ban" value="">
                </div>
                <div>
                    <label>部门名字</label>
                    <input type="text" name="depart" id="depart" value="">
                </div>
                <div>
                    <label>员工电子邮件</label>
                    <input type="text" name="email" id="email" value="">
                </div>
                <div>
                    <label>员工电话</label>
                    <input type="text" name="phone" id="phone" value="">
                </div>
                <div class="add-btn">
                    <input type="button" name="add" id="add" value="保存">
                    <input type="button" name="back" id="back" value="返回">
                </div>
            </form>
        </div>
    </div>
</div>
<footer class="footer">
    后台管理系统
</footer>
</body>
</html>
