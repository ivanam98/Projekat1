$(document).ready(function(){
	
	$("#login").click(function() {
		console.log("click na dugme");
		
		$.ajax({
	        type : "get",
	        url : "http://localhost:8080/api/Users/1",
	        contentType : "application/json",
	        success : function(response){
	            console.log("uspesno", response);
	        }
	    });
	})
})