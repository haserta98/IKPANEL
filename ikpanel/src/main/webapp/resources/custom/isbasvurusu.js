function addApplicant(){
	
	
	var param={
			ad:$("#adi").val(),
			email:$("#epostasi").val(),
			telefon:$("#telefonu").val(),
			adres:$("#adresi").val(),
			dusunce:$("#dusunceleri").val(),
			jobadi:$("#esas").val(),
	}

	var ser_data= JSON.stringify(param); 
	
	$.ajax({
		
		type:"POST",
			contentType:"application/json; charset=UTF-8",
			url:"./../addApplicant",
			data: ser_data,
			success:function(data){
		
				alert("İş Başvurunuz Gönderildi.");
				
				},error:function(data){
				alert(data);
				}
		
	});
	
}



