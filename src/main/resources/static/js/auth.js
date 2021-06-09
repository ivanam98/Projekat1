$(document).ready(function() {

    $("#registration_form").submit(function() {
        console.log('auth')
        let firstName = $('#firstName').val();
        alert(firstName)
        
        console.log('auth')
        let username = $('#username').val();
        alert(username)
        
        console.log('auth')
        let password = $('#password').val();
        alert(password)
        
        console.log('auth')
        let lastName = $('#lastName').val();
        alert(lastName)
        
        console.log('auth')
        let phoneNumber = $('#phoneNumber').val();
        alert(phoneNumber)
        
        console.log('auth')
        let emailAddress = $('#emailAddress').val();
        alert(emailAddress)
        
        console.log('auth')
        let dateOfBirth = $('#dateOfBirth').val();
        alert(dateOfBirth)

        let registerObject = {
            username: username,
            password: password,
            firstName: firstName,
            lastName: lastName,
            contact: phoneNumber,
            emailAddress: emailAddress,
            dateOfBirth: dateOfBirth,
            role: "a",
            active: "a"
        }
        $.ajax({
            type : "post",
            data: JSON.stringify(registerObject),
            url : "api/auth/register",
            contentType : "application/json",
            success : function(response){
                console.log("successful", response);
            }
        });
    })
    
var existUsername;
$('input[name="username_reg"]').on('input',function(){
    var username = $(this).val();
    $.ajax({
        type: "get",
        url : "rest/existuser/"+username,
        contentType : "applicatoin/json",
        success : function(response){
            if(response == "true"){
                existUsername = false;
            }
            else{
                existUsername = true;
            }
        }
    }); 
});
});