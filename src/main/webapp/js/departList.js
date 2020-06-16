let route = "/oa_sys_war";
$(function () {
    $('.modify').on("click", function () {
        let obj = $(this);
        window.location.href = route + "/jsp/admin/depart.do?method=modify&id=" + obj.attr("deptId");
    });
    $(".delete").on("click", function () {
        if (confirm("确认删除")) {
            let obj = $(this);
            window.location.href = route +"/jsp/admin/depart.do?method=delete&id="+obj.attr("deptId");
            return true;
        }
        return false;
    });
})