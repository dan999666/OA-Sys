<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Wage Analisis </title>
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="stylesheet" href="../../css/reset.css">
    <script src="../../js/jquery-1.8.3.min.js"></script>
    <%--    <script src="../../js/salaryList.js"></script>--%>
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
        <ul class="list">
            <li><a href="/oa_sys_war/jsp/hr/employee.do?method=query" target="_blank">账号管理</a></li>
            <li><a href="/oa_sys_war/jsp/hr/salary.do?method=query" target="_blank">薪资基本参数</a></li>
            <li><a href="/oa_sys_war/jsp/hr/statistics.do?method=query" target="_blank">薪资统计</a></li>
        </ul>
    </div>
    <div class="right-content">
        <table class="table-view">
            <tbody>
            <tr class="first-row">
                <th width="15%">基础工资总和</th>
                <th width="15%">周末加班工资总和</th>
                <th width="15%">假日加班工资总和</th>
                <th width="15%">旷工惩罚总和</th>
                <th width="15%">迟到惩罚总和</th>
                <th width="20%">累计发放薪资</th>
            </tr>
            <tr>
                <td><span>${statistics.sumOfBasicSalary}</span></td>
                <td><span>${statistics.sumOfweekendSalary}</span></td>
                <td><span>${statistics.sumOfAbsentPunish}</span></td>
                <td><span>${statistics.sumOfAbsentPunish}</span></td>
                <td><span>${statistics.sumOfLatePunish}</span></td>
                <td><span>${statistics.sumOfAll}</span></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<footer class="footer">
    后台管理系统
</footer>

</body>
</html>

