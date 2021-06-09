$(document).ready(function() {
	
	$('#forma').submit(function(event) {
    console.log("Entered login");
    event.preventDefault();

    var username = $('input[name="username"]').val();
    var password = $('input[name="password"]').val();
    //console.log(username + ' ' + password);

    if(!username || !password){
        alert("You need to input username and password.");
        event.preventDefault();
    }
    else{
        var object = {
            "username" : username,
            "password" : password,
        }
        $.ajax({
            type : "post",
            data: JSON.stringify(registerObject),
            url : "api/auth/register",
            contentType : "application/json",
            success : function(response){
                console.log("successful", response);
            }
       })
     }
   })
 });