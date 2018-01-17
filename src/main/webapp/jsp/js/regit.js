$(function() {
    $("#btn").on("click", function() {
        var username = $(".userName").val();
        var password = $(".password").val();
        var repeatPassword = $(".verifyPassword").val();
        var email = $(".email").val();

        if (username == "") {
            alert("用户名不能为空");
            return false;
        } else if (password == "") {
            alert("密码不能为空");
            return false;
        } else if (repeatPassword == "") {
            alert("重复密码不能为空");
            return false;
        } else if (email == "") {
            alert("email不能为空");
            return false;
        } else if (username.length < 6 || username.length > 20) {
            alert("用户名长度在6与20之间");
            return false;
        } else if (username == password || username == repeatPassword) {
            alert("用户名与密码不能一致");
            return false;
        } else if (password.length < 6 || password.length > 20 || repeatPassword.length < 6 || repeatPassword.length > 20) {
            alert("密码长度在6与20之间");
            return false;
        } else if (password != repeatPassword) {
            alert("两次密码必须一致");
            return false;
        } else {
            alert("登陆成功");
            return true;
        }

    })
    $(".checkbox0").on("click", function() {
        $("input[name='checkbox']").each(function() {
            //判断状态
            if ($(this).prop("checked")) {
                $(this).removeAttr("checked");
            } else {
                $(this).prop("checked", "true");
            }
        })
    })
    $(".btn1").on("click", function() {
    	if(confirm("确认删除?")){
            $(this).parent().parent().remove();
    	}
       
    })    	
})