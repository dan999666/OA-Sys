let route = "/oa_sys_war";
$(function () {
    $(".release").on("click", function () {
        if (confirm("确认发放该员工的工资")) {
            let obj = $(this);
            window.location.href = route + "/jsp/admin/salaryRelease.do?method=release&id=" + obj.attr("employeeId");
            return true;
        }
        return false;
    });
})