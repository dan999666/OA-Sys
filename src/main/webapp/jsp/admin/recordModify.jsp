<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>record modfiy</title>
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="stylesheet" href="../../css/reset.css">
    <script src="../../js/jquery-1.8.3.min.js"></script>
    <script src="../../js/adminRecordModify.js"></script>
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
        <div class="add-table">
            <form action="${pageContext.request.contextPath}/jsp/admin/record.do" id="modifyForm" name="modifyForm"
                  method="post">
                <input type="hidden" name="method" value="modifySave">
                <div>
                    <label>奖惩编号</label>
                    <input type="text" name="recordId" id="recordId" value="${record.recordId}">
                </div>
                <div>
                    <label>员工编号</label>
                    <input type="text" name="employeeId" id="employeeId" value="${record.employeeId}">
                </div>
                <div>
                    <label>迟到次数</label>
                    <input type="text" name="lateRecord" id="lateRecord" value="${record.lateRecord}">
                </div>
                <div>
                    <label>销售提成</label>
                    <input type="text" name="saleBonus" id="saleBonus" value="${record.saleBonus}">
                </div>
                <div>
                    <label>加班次数</label>
                    <input type="text" name="overtimeRecord" id="overtimeRecord" value="${record.overtimeRecord}">
                </div>
                <div>
                    <label>节日加班奖金</label>
                    <input type="text" name="festivalBenifit" id="festivalBenifit" value="${record.festivalBenifit}">
                </div>
                <div>
                    <label>年终奖</label>
                    <input type="text" name="yearBonus" id="yearBonus" value="${record.yearBonus}">
                </div>
                <div>
                    <label>旷工次数</label>
                    <input type="text" name="absentRecord" id="absentRecord" value="${record.absentRecord}">
                </div>
                <div>
                    <label>福利奖金</label>
                    <input type="text" name="benifit" id="benifit" value="${record.benifit}">
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
