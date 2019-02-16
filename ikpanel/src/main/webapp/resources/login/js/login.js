function controlHRM(){
	
	// girilen şeyleri param dizisine aktarıyor. bu bir javascript entitysi.
	var param={
			ePosta:$("#email").val(),
			parola:$("#pass").val(),
	}

	var ser_data= JSON.stringify(param); //param dizisini gidiyp json datası haline getiriyo.
	
	$.ajax({
		
		type:"POST",
			contentType:"application/json; charset=UTF-8",
			url:"loginControl",
			data: ser_data,
			success:function(data){
		
				if(data=="OK"){
					$(location).attr('href' ,'index');
				}else {
					alert("Hatalı Giriş Denemesi.");
				}
				
				
				
				},error:function(data){
				alert(data);
				}
		
	});
	
}



