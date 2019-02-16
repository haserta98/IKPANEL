$(document).ready(function(){
	
	ilanCek();
	
	
});

function ilanCek(){

	$.ajax({
		type:"POST",
			url:'duyuruCek',
			success:function(data){
				
			var list="";
			var list2="";
			
			$(data).each(function(i,val){
				
				list = list
			      +'<br>'
		            +'<div>'
		              +'<h5 style="float: left;">'+new Date(val.create_date).toLocaleDateString()+'</h5>'
		              +'<input type="text" hidden style="display: none;" value="'+val.id+'" id="id'+val.id+'"/>'
		               +'<p style="float: left;width: 70%;padding-left: 30px">'+val.icerik+'</p>'
		               +'<button type="button" class="btn btn-warning" style="margin-left: 5px" onclick="duyuruSil('+val.id+')">Sil</button>'
		               +'<hr>'
		              +'</div>';
 
			});
			
			
	
			$("#duyur").html(list);
				
			},error:function(data){
				alert(data);
			}
		
		
	});
	

}

function duyuruSil(id){
		
	var r = confirm("Duyuruyu Kaldırmak İstiyor Musunuz ?");
	 
	if (r == true) {
	 
		$.ajax({
			type:"POST",
				contentType:"text/plain; charset=UTF-8",
				url:"duyuruSil",
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
	
	



