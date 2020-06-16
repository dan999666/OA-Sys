$(function () {
    $('#add').on('click', function () {
        $('#addForm').submit();
    })
    $('#back').on('click',function () {
        history.back(-1);
    })
})