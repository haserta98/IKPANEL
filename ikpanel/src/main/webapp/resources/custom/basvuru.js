$(document).ready(function(){
	
	ilanCek();
	
});

function ilanCek(){

	$.ajax({
		type:"POST",
			url:'./../birilanCek',
			contentType:"text/plain",
			data:$("#id").val(),

			success:function(data){
				$('#esas').val(data.isUnvani);
				$("#isBaslik").html(data.isUnvani);
				$("#isAciklama").html(data.isTanimi);
				$("#isKisi").html(data.kisiSayisi);
				$("#isTarih").html(data.sonBasvuruT);
				
			},error:function(data){
				alert(data);
			}
		
		
	});
	

}





