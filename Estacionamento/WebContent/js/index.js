//$(document).ready(function() {
//	
//	$('#btn-salvar').on('click', function(){
//		$.ajax({
//			url: 'InserirEstadoServlet',
//			type: 'post',
//			data: {
//				'nome-estado' : $('#tf_estado').val(),
//				'sigla-estado': $('#tf_sigla').val(),
//				'status-estado': $('#slc_status').val()
//			}, success: function(response){
//				
//				
//			}
//		  });
//	});
//	

$(document).ready(function() {
	
	$.ajax({
		url: 'ListarEstadoServlet',
		type: 'post',	
		success : function(response){
			
			for (var i = 0; i < response.length; i++) {
				
				var idEstado = response[i].idEstado;
				var nomeEstado = response[i].nomeEstado;
				var siglaEstado = response[i].siglaEstado;
				var statusEstado = response[i].statusEstado;
				
				var inp_id = $('<input>')
				inp_id.attr({'type':'hidden','class':'id'})
				inp_id.val(idEstado);
			
				var inp_nome = $('<input>')
				inp_nome.attr({'type':'text','class':'nom'})
				inp_nome.val(nomeEstado);
				
				var li_sigla = $('<input>')
				li_sigla.attr({'type':'text','class':'sig'})
				li_sigla.val(siglaEstado);
				
				var li_status = $('<input>')
				li_status.attr({'type':'text','class':'st'})
				li_status.val(statusEstado);
						
				var btn_update = $('<input>');
				btn_update.attr({'type' : 'button','value' : 'Atualizar', 'id' : 'btn'});
				btn_update.click({id: i}, evt);
	
				var li_btn = $('<li></li>');
				li_btn.append(btn_update);
				
				var ul = $('<ul></ul>');
				ul.attr('class', 'est' + i);
				
				ul.append(inp_id);
				ul.append(inp_nome);
				ul.append(li_sigla);
				ul.append(li_status)
				ul.append(li_btn);
				
				$('#set').append(ul);

			}
			
		} 
	})
	
	function evt(event){
		$.ajax({
			url: 'UpdateEstadoServlet',
			type: 'post',
			data: {
				'estado_nome' : $('.est' + event.data.id + '>.nom').val(),
				'estado_sigla': $('.est' + event.data.id + '>.sig').val(),
				'estado_status' : $('.est' + event.data.id + '>.st').val(),
				'id': $('.est' + event.data.id + '>.id').val()
			}, success: function(response){
				
				
			}
		  });
	}
//	$('#btn').on('click', function(){
//		$.ajax({
//			url: 'UpdateEstadoServlet',
//			type: 'post',
//			data: {
//				'estado_nome' : $('#nom').val(),
//				'estado_sigla': $('#sig').val(),
//				'id': $('#id').val()
//			}, success: function(response){
//				
//				
//			}
//		});
//	});
	
	
	
	
	//metodo post nao deixa as informações visiveis como o get
	//
	
//	$.ajax({
//		url: 'ListarEstadoServlet',
//		type: 'post',
//		
//		success : function(response){
//			//alert(JSON.stringify(response));
//			
//			for (var i = 0; i < response.length; i++) {
//				
//				var idEstado = response[i].idEstado;
//				var nomeEstado = response[i].nomeEstado;
//				var siglaEstado = response[i].siglaEstado;
//				
//				$('#set').append('<li>' + idEstado + '<\li>' + '<li>' + nomeEstado + '</li>' + '<li>' + siglaEstado + '</li>')
//				
//				//$('#set').append('<input type="text" value="' +  idEstado + '">' + '<input type="text" value="' + nomeEstado + '">' + '<input type="text" value="' + siglaEstado + '">')
//				
//				//$('#set').append('<tr><td>' + idEstado + '</td><td>' + nomeEstado + '</td><td>' + siglaEstado + '</td></tr>')
//
//			}
//			
//		} 
//	})
	
});



