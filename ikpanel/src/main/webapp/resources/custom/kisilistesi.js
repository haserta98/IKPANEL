$(document).ready(function(){
	
	kisiCek();
	
});

function kisiCek(){

	$.ajax({
		type:"POST",
			url:'applicantCek',
			success:function(data){
				
			var list="";
			var list2="";
			
			$(data).each(function(i,val){
				
				list=list 
				  +'<tr>'
                  +'<td>'+val.jobadi+'</td>'
                  +'<td>'+val.ad+'</td>'
                  +'<td>'+val.telefon+'</td>' 
                  +'<td>'+val.email+'</td>'
                  +'<td><button class="btn btn-success" data-toggle="modal" data-target="#myModal'+val.id+'"> Görüntüle</button></td>'
                  +'</tr>';
           
 
			});
			
			$(data).each(function(i,val){
				
				list2 = list2
				  +'<div id="myModal'+val.id+'" class="modal fade" role="dialog">'
				  +'<div class="modal-dialog">'
				    +'<div class="modal-content">'
				     +'<div class="modal-header">'
				        +'<h4 class="modal-title">'+val.ad+'</h4>'
				      +'</div>'
				      +'<div class="modal-body" id="modalici">'
				       +'<p style="font-size: 14px; color:darkmagenta"> <b>İş Hakkında Düşünceler </b></p>'
				       +'<hr>' 
				       +'<p>'+val.dusunce+'</p>'
				        +'<p style="font-size: 14px; color: sienna"> <b>Adres </b></p>'
				        +'<hr>'
				        +' <p>'+val.adres+'</p>'
				      +'</div>'
				      +'<div class="modal-footer">'
				        +'<button type="button" class="btn btn-default" data-dismiss="modal">Kapat</button>'
				      +'</div>'
				    +'</div>'
				  +'</div>'
				+'</div>';
 
			});
			
			$("#bosKisi").html(list2);
			
			$("#liste2").html(list);
				
			},error:function(data){
				alert(data);
			}
		
		
	});
	

}


