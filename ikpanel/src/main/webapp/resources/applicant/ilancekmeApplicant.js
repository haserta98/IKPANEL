$(document).ready(function(){
	
	ilanAl();
	
	
});

function ilanAl(){

	$.ajax({
		type:"POST",
			url:'ilanCek',
			success:function(data){
				
			var listem="";
		
			$(data).each(function(i,val){
				
				listem = listem
				 +'<p><a href="basvuru/'+val.id+'"><h4>'+val.isUnvani+'</h4></a></p>';
 
			});
			
			$("#iceri").html(listem);
		
				
			},error:function(data){
				alert(data);
			}
		
		
	});
	

}



