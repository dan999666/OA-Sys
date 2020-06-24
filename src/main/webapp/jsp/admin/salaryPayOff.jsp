<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>salary list show</title>
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="stylesheet" href="../../css/reset.css">
    <script src="../../js/jquery-1.8.3.min.js"></script>
    <script src="../../js/salaryRelease.js"></script>
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
                <li><a href="/oa_sys_war/jsp/admin/salaryRelease.do?method=query" target="_blank">薪资发放</a></li>
                <li><a href="/oa_sys_war/jsp/admin/salary.do?method=queryInfo" target="_blank">薪资查看</a></li>
                <li><a href="/oa_sys_war/jsp/admin/statistics.do?method=query" target="_blank">薪资统计</a></li>
            </ul>
        </nav>
    </div>
    <div class="right-content">
        <table class="table-view">
            <tbody>
            <tr class="first-row">
                <th width="8%">员工编号</th>
                <th width="8%">员工姓名</th>
                <th width="8%">部门名字</th>
                <th width="8%">发放状态</th>
                <th width="10%">操作</th>
            </tr>
            <c:forEach var="payOffVO" items="${PayOffVO}">
                <tr>
                    <td><span>${payOffVO.employeeId}</span></td>
                    <td><span>${payOffVO.name}</span></td>
                    <td><span>${payOffVO.deptName}</span></td>
                    <td><span>
                        <c:if test="${payOffVO.releaseStatus == 0}">未发放状态</c:if>
                        <c:if test="${payOffVO.releaseStatus == 1}">已发放状态</c:if>
                    </span></td>
                    <td>
                        <span>
                            <a class="release" href="javascript:;"
                               employeeId=${payOffVO.employeeId}>发放</a>
                        </span>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<footer class="footer">
    后台管理系统
</footer>

</body>
</html>

