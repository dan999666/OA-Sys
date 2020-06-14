let route = "/oa_sys_war";
$(function () {
    $('.modify').on("click", function () {
        let obj = $(this);
        window.location.href = route + "/jsp/admin/record.do?method=modify&id=" + obj.attr("employeeId");
    });
    $(".delete").on("click", function () {
        if (confirm("确认删除")) {
            let obj = $(this);
            window.location.href = route + "/jsp/admin/record.do?method=delete&id=" + obj.attr("employeeId");
            return true;
        }
        return false;
    });
})