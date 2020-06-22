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
        <div class="add-table">
            <form action="" id="" name="addForm" method="post">
                <input type="hidden" name="method" value="add">
                <div>
                    <label>薪资参数编号</label>
                    <input type="text" name="id" id="id" value="">
                </div>
                <div>
                    <label>迟到扣薪标准</label>
                    <input type="text" name="lateStandard" id="lateStandard" value="">
                </div>
                <div>
                    <label>旷工扣薪标准</label>
                    <input type="text" name="absentStandard" id="absentStandard" value="">
                </div>
                <div>
                    <label>加班薪资标准</label>
                    <input type="text" name="overTimeStandard" id="overTimeStandard" value="">
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
