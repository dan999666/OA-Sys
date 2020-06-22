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
    <script src="../../js/salaryList.js"></script>
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
        <div class="search">
            <%--<form action="" method="get">
                <span>xx名称：</span>
                <input type="text" name="" value="">
                <span>xx</span>
                <input type="text" name="" value="">
                <input value="查询" type="submit" id="search-button">
            </form>--%>
            <a href="${pageContext.request.contextPath }/jsp/admin/salaryAdd.jsp">添加员工工资记录</a>
            <a href="${pageContext.request.contextPath }/jsp/admin/salaryParamsAdd.jsp">设置基本参数</a>
        </div>
        <table class="table-view">
            <tbody>
            <tr class="first-row">
                <th width="8%">员工编号</th>
                <th width="8%">员工姓名</th>
                <th width="8%">基础工资</th>
                <th width="8%">周末加班工资</th>
                <th width="10%">节假日加班工资</th>
                <th width="8%">缺勤惩罚</th>
                <th width="8%">迟到惩罚</th>
                <th width="20%">操作</th>
            </tr>
            <c:forEach var="salaryDTO" items="${salaryList}">
                <tr>
                    <td><span>${salaryDTO.employeeId}</span></td>
                    <td><span>${salaryDTO.name}</span></td>
                    <td><span>${salaryDTO.basicSalary}</span></td>
                    <td><span>${salaryDTO.weekendSalary}</span></td>
                    <td><span>${salaryDTO.festivalSalary}</span></td>
                    <td><span>${salaryDTO.absentPunish}</span></td>
                    <td><span>${salaryDTO.latePunish}</span></td>
                    <td>
                            <%--<span><a class="view-detail" href="javascript:;"
                                     employeeId=${salaryDTO.employeeId}>查看</a>
                            </span>--%>
                        <span><a class="modify" href="javascript:;"
                                 employeeId=${salaryDTO.employeeId}>修改</a>
                    </span>
                        <span><a class="delete" href="javascript:;"
                                 employeeId=${salaryDTO.employeeId}>删除</a>
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

