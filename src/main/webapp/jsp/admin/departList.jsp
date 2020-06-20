<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>depart info list</title>
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="stylesheet" href="../../css/reset.css">
    <script src="../../js/jquery-1.8.3.min.js"></script>
    <script src="../../js/departList.js"></script>
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
            <a href="${pageContext.request.contextPath }/jsp/admin/departAdd.jsp">新增部门</a>
            <a href="${pageContext.request.contextPath }/jsp/admin/departMerge.jsp">合并部门</a>
        </div>
        <table class="table-view">
            <tbody>
            <tr class="first-row">
                <th width="8%">部门编号</th>
                <th width="8%">部门名称</th>
                <th width="20%">操作</th>
            </tr>
            <c:forEach var="department" items="${departList}">
                <tr>
                    <td><span>${department.deptId}</span></td>
                    <td><span>${department.deptName}</span></td>
                    <td>
                        <span>
                            <a class="modify" href="javascript:;"
                               deptId=${department.deptId}>修改</a>
                        </span>
                        <span>
                            <a class="delete" href="javascript:;"
                               deptId=${department.deptId}>删除</a>
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

