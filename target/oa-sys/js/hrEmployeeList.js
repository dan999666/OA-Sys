let route = "/oa_sys_war";
$(function () {
    $(".view-detail").on("click", function () {
        let obj = $(this);
        window.location.href = route + "/jsp/hr/employee.do?method=view&id=" + obj.attr("employeeId");
    });
    $(".ban").on("click", function () {
        if (confirm("确认禁用该员工")){
            var obj = $(this);
            window.location.href = route + "/jsp/hr/employee.do?method=ban&id=" + obj.attr("employeeId");
            return true;
        }
        return false;
    });
    $(".delete").on("click", function () {
        if (confirm("确认删除")){
            let obj = $(this);
            window.location.href = route + "/jsp/hr/employee.do?method=delete&id=" + obj.attr("employeeId");
            // alert("删除成功");
            return true;
        }
        return false;
    });
})