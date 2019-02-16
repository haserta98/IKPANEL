function addJob(){
	
	// girilen şeyleri param dizisine aktarıyor. bu bir javascript entitysi.
	var param={
			isUnvani:$("#is_unvan").val(),
			isTanimi:$("#is_tanim").val(),
			kisiSayisi:$("#is_kisi").val(),
			sonBasvuruT:$("#is_tarih").val(),
		
	}

	var ser_data= JSON.stringify(param); //param dizisini gidiyp json datası haline getiriyo.
	
	$.ajax({
		
		type:"POST",
			contentType:"application/json; charset=UTF-8",
			url:"addJob",
			data: ser_data,
			success:function(data){
		
				alert("İŞ İLANI KAYDEDİLDİ.")
				
				},error:function(data){
				alert(data);
				}
		
	});
	
}



