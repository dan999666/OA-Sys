$(function () {
    $('#add').on('click', function () {
        if (confirm("是否确认提交数据")) {
            $('#modifyForm').submit();
        }
    })
    $('#back').on('click',function () {
        history.back(-1);
    })
})