<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>list show</title>
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="stylesheet" href="../../css/reset.css">
    <%--
        <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    --%>
    <script src="../../js/jquery-1.8.3.min.js"></script>
    <script src="../../js/adminList.js"></script>
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
                <li><a href="#" target="_blank">薪资统计</a></li>
            </ul>
        </nav>
    </div>
    <div class="right-content">
        <div class="search">
            <form action="" method="get">
                <span>xx名称：</span>
                <input type="text" name="" value="">
                <span>xx</span>
                <input type="text" name="" value="">
                <input value="查询" type="submit" id="search-button">
                <a href="${pageContext.request.contextPath }/jsp/admin/employeeAdd.jsp">创建账号</a>
            </form>
        </div>
        <table class="table-view">
            <tbody>
            <tr class="first-row">
                <th width="8%">员工编号</th>
                <th width="8%">账号名字</th>
                <th width="8%">员工姓名</th>
                <th width="8%">员工角色</th>
                <th width="8%">性别</th>
                <th width="8%">员工年龄</th>
                <th width="8%">部门名称</th>
                <th width="8%">禁用</th>
                <th width="8%">电子邮件</th>
                <th width="10%">电话号码</th>
                <th width="20%">操作</th>
            </tr>
            <c:forEach var="employee" items="${employeeList}">
                <tr>
                    <td><span>${employee.employeeId}</span></td>
                    <td><span>${employee.acountName}</span></td>
                    <td><span>${employee.name}</span></td>
                    <td><span>${employee.role}</span></td>
                    <td><span>${employee.sex}</span></td>
                    <td><span>${employee.age}</span></td>
                    <td><span>${employee.deptName}</span></td>
                    <td>
                        <span>
                        <c:if test="${employee.ban == 1}">禁用状态</c:if>
                        <c:if test="${employee.ban == 0}">可用状态</c:if>
                        </span>
                    </td>
                    <td><span>${employee.email}</span></td>
                    <td><span>${employee.phone}</span></td>
                    <td>
                    <span><a class="view-detail" href="javascript:;"
                             employeeId=${employee.employeeId}>查看</a>
                    </span>
                        <span><a class="ban" href="javascript:;"
                                 employeeId=${employee.employeeId}>禁用</a>
                    </span>
                        <span><a class="delete" href="javascript:;"
                                 employeeId=${employee.employeeId}>删除</a>
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

