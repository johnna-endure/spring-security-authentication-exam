document.addEventListener("DOMContentLoaded", function (){


    $("#submit").click(function (e){
        // let _csrf = document.cookie.split("=")[1]
        // e.preventDefault();
        let formData = {
            username: $("username").val(),
            password: $("password").val()
            // _csrf: _csrf
        }


        $.ajax({
            url: "/login",
            method: "post",
            dataType: "application/json",
            data: JSON.stringify(formData),
        }).done(function (){
            alert("done")
        }).fail(function (){
            alert("fail")
        })
    });
})