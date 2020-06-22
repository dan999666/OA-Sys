let route = "/oa_sys_war";
$(function () {
    $('.modify').on("click", function () {
        let obj = $(this);
        window.location.href = route + "/jsp/hr/salary.do?method=modify&id=" + obj.attr("employeeId");
    });
    $(".delete").on("click", function () {
        if (confirm("Delete this record?")) {
            let obj = $(this);
            window.location.href = route +"/jsp/hr/salary.do?method=delete&id="+obj.attr("employeeId");
            return true;
        }
        return false;
    });
})