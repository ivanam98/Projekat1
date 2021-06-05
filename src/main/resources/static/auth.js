$(document).ready(function() {

    $("#registration_form").submit(function() {
        console.log('auth')
        let firstName = $('#firstName').val();
        alert(firstName)

        let registerObject = {
            username: "a",
            password: "a",
            firstName: firstName,
            lastName: "",
            contact: "a",
            emailAddress: "a",
            dateOfBirth: "a",
            role: "a",
            active: "a"
        }

        $.ajax({
            type : "post",
            data: JSON.stringify(registerObject),
            url : "api/auth/register",
            contentType : "application/json",
            success : function(response){
                console.log("uspesno", response);
            }
        });
    })
});