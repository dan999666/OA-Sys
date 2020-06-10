$(function () {
    $('#add').on('click', function () {
        if (confirm("是否确认提交数据")) {
            $('#addForm').submit();
        }
    })
    $('#back').on('click',function () {
        history.back(-1);
    })
})