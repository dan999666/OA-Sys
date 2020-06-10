<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>list show</title>
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/reset.css">
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
                <li><a href="#" target="_blank">账户管理</a></li>
                <li><a href="#" target="_blank">部门管理</a></li>
                <li><a href="#" target="_blank">薪资基本参数</a></li>
                <li><a href="#" target="_blank">奖惩录入</a></li>
                <li><a href="#" target="_blank">薪资发放</a></li>
                <li><a href="#" target="_blank">薪资查看</a></li>
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
                <a href="add.html">添加订单</a>
            </form>
        </div>
        <table class="table-view">
            <tbody>
            <tr class="first-row">
                <th width="10%">订单编码</th>
                <th width="10%">商品名称</th>
                <th width="20%">供应商</th>
                <th width="10%">订单金额</th>
                <th width="10%">是否付款</th>
                <th width="10%">创建时间</th>
                <th width="30%">操作</th>
            </tr>
            <tr>
                <td><span><input type="checkbox">BILL2016_004</span></td>
                <td><span>橄榄油</span></td>
                <td><span>北京国粮食用油有限公司</span></td>
                <td><span>9800.00</span></td>
                <td><span>已付款</span></td>
                <td><span>2013-10-10</span></td>
                <td>
                    <span><a id="view" class="view-operation" href="#">查看</a></span>
                    <span><a id="modify" class="modify-operation" href="#">修改</a></span>
                    <span><a id="delete" class="delete-operation" bookid="1" href="#">删除</a></span>
                </td>
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

