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
    <script src="../../js/adminRecordList.js"></script>
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
                <li><a href="#" target="_blank">部门管理</a></li>
                <li><a href="/oa_sys_war/jsp/admin/salary.do?method=query" target="_blank">薪资基本参数</a></li>
                <li><a href="#" target="_blank">奖惩录入</a></li>
                <li><a href="#" target="_blank">薪资发放</a></li>
                <li><a href="#" target="_blank">薪资查看</a></li>
                <li><a href="#" target="_blank">薪资统计</a></li>
            </ul>
        </nav>
    </div>
    <div class="right-content">
        <div class="search">
            <%--            &lt;%&ndash;&ndash;%&gt;<a href="${pageContext.request.contextPath }/jsp/admin/salaryAdd.jsp">添加员工工资记录</a>--%>
            <a href="${pageContext.request.contextPath }/jsp/admin/recordAdd.jsp" target="_blank">添加奖惩记录</a>
        </div>
        <table class="table-view">
            <tbody>
            <tr class="first-row">
                <th width="12%">奖惩记录编号</th>
                <th width="8%">员工编号</th>
                <th width="8%">员工姓名</th>
                <th width="8%">迟到次数</th>
                <th width="8%">销售提成</th>
                <th width="8%">加班次数</th>
                <th width="10%">节日加班奖金</th>
                <th width="8%">年终奖</th>
                <th width="8%">旷工次数</th>
                <th width="8%">福利奖金</th>
                <th width="20%">操作</th>
            </tr>
            <c:forEach var="recordDTO" items="${recordList}">
                <tr>
                    <td><span>${recordDTO.recordId}</span></td>
                    <td><span>${recordDTO.employeeId}</span></td>
                    <td><span>${recordDTO.name}</span></td>
                    <td><span>${recordDTO.lateRecord}</span></td>
                    <td><span>${recordDTO.saleBonus}</span></td>
                    <td><span>${recordDTO.overtimeRecord}</span></td>
                    <td><span>${recordDTO.festivalBenifit}</span></td>
                    <td><span>${recordDTO.yearBonus}</span></td>
                    <td><span>${recordDTO.absentRecord}</span></td>
                    <td><span>${recordDTO.benifit}</span></td>
                    <td>
                        <span>
                            <a class="modify" href="javascript:;" employeeId=${recordDTO.employeeId}>修改</a>
                    </span>
                        <span>
                            <a class="delete" href="javascript:;" employeeId=${recordDTO.employeeId}>删除</a>
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

