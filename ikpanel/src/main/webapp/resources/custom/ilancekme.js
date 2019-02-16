$(document).ready(function(){
	
	ilanCek();
	
	
});

function ilanCek(){

	$.ajax({
		type:"POST",
			url:'ilanCek',
			success:function(data){
				
			var list="";
			var list2="";
			
			$(data).each(function(i,val){
				
				list = list
				  +'<tr>'
                  +'<td>'+val.isUnvani+'</td>'
                  +'<td><button class="btn btn-info" data-toggle="modal" data-target="#myModal'+val.id+'"> Görüntüle</button></td>'
                  +'<td><button class="btn btn-danger" onclick="ilanSil('+val.id+')" >Kaldır</button></td>'
                  +'</tr>';
 
			});
			
			$(data).each(function(i,val){
				
				list2 = list2
				  +'<div id="myModal'+val.id+'" class="modal fade" role="dialog">'
				  +'<input type="text" hidden style="display: none;" value="'+val.id+'" id="id'+val.id+'"/>'
				  +'<div class="modal-dialog">'
				    +'<div class="modal-content">'
				     +'<div class="modal-header">'
				        +'<h4 class="modal-title">'+val.isUnvani+'</h4>'
				      +'</div>'
				      +'<div class="modal-body" id="modalici">'
				       +'<p>'+val.isTanimi+'</p>'
				        +'<p>Alınacak kişi sayısı :'+val.kisiSayisi+'</p>'
				        +'<p>Son başvuru tarihi :'+val.sonBasvuruT+'</p>'
				        +'<p>Başvuru Formuna : <a href="basvuru/'+val.id+'"> Git </a></p>'
				      +'</div>'
				      +'<div class="modal-footer">'
				        +'<button type="button" class="btn btn-default" data-dismiss="modal">Kapat</button>'
				      +'</div>'
				    +'</div>'
				  +'</div>'
				+'</div>';
 
			});
			
			$("#bos").html(list2);
			$("#liste").html(list);
				
			},error:function(data){
				alert(data);
			}
		
		
	});
	

}

function ilanSil(id){
		
	var r = confirm("İlanı Kaldırmak İstiyor Musunuz ?");
	 
	if (r == true) {
	 
		$.ajax({
			type:"POST",
				contentType:"text/plain; charset=UTF-8",
				url:"deleteJob",
				data:$("#id"+id+"").val()+"",
				success:function(data){
					alert("İş İlanı Silindi.");
					
				},error:function(data){
					alert("Hata Meydana Geldi.");
				}
			
		});
		
		window.location.reload(false);
	
	  } else {
		   
		  }
	
	
	
}
	
	



