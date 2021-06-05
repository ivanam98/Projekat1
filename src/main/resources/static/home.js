$(document).ready(function(){
	
	$("#login").click(function() {
		console.log("click na dugme");
		
		$.ajax({
	        type : "get",
	        url : "api/users",
	        contentType : "application/json",
	        success : function(response){
	            console.log("uspesno", response);
	        }
	    });
	})

	$("#register_user_form").click(function(){
		console.log("registration");
		window.location.replace("SignIn.html");
	})
})