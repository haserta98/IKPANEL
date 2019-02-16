function addAnno(){
	
	var param={
			
			icerik:$("#duyuruekleme").val(),
		
	}

	
	var ser_data= JSON.stringify(param); 
	
	$.ajax({
		
		type:"POST",
			contentType:"application/json; charset=UTF-8",
			url:"duyuruEklemek",
			data: ser_data,
			success:function(data){
		
				alert("Duyurunuz Kaydedildi.");
				
				},error:function(data){
				alert(data);
				}
		
	});
	
}
