$(document).ready(function() {
	
	// Buscar o estado a ser selecionado para cadastrar a cidade.
	
	$.ajax({
		url: 'ListarEstadoServlet',
		type: 'post',	
		success : function(response){
			
			for (var i = 0; i < response.length; i++) {
				
				var idEstado = response[i].idEstado;
				var nomeEstado = response[i].nomeEstado;
			
				var inp_id = $('<option>')
				inp_id.attr({'value': idEstado})
				inp_id.val(idEstado);
				//como pegar o valor do option
				
				$('#selecionar_estado').append(inp_id);

			}
			
			$('select').formSelect();
		} 
	})
	

	
	$('#btn-salvar').on('click', function(){
	$.ajax({
		url: 'InserirCidadeServlet', 
		type: 'post',
		data: {
			'cidade_nome' : $('#tf_cidade').val(),
			'cidade_status': $('#slc_status').val()
			

			},success: function(response){
				
			

		}
	 })
	})
	
	$.ajax({
		url: 'ListarCidadeServlet',
		type: 'post',	
		success : function(response){
			
			for (var i = 0; i < response.length; i++) {
				
				var idCidade = response[i].idCidade;
				var nomeCidade = response[i].nomeCidade;
				var statusCidade = response[i].statusCidade;
				
				var inp_id = $('<input>')
				inp_id.attr({'type':'hidden','class':'id'})
				inp_id.val(idCidade);
			
				var inp_nome = $('<input>')
				inp_nome.attr({'type':'text','class':'nom'})
				inp_nome.val(nomeCidade);
				
				var li_status = $('<input>')
				li_status.attr({'type':'text','class':'st'})
				li_status.val(statusCidade);
						
				var btn_update = $('<input  class="button">');
				btn_update.attr({'type' : 'button','value' : 'Atualizar', 'id' : 'btn'});
				btn_update.click({id: i}, evt);
	
				var li_btn = $('<li></li>');
				li_btn.append(btn_update);
				
				//Botão Deletar
				
				var btn_delete = $('<input  class="button">');
				btn_delete.attr({'type' : 'button','value' : 'Deletar', 'id' : 'btn-deletar'});
				btn_delete.click({id: i}, evt_deletar);
	
				var li_btn_deletar = $('<li></li>');
				li_btn_deletar.append(btn_delete);
				
				var ul = $('<ul class="ul"></ul>');
				ul.attr('class', 'cid' + i);
				
				ul.append(inp_id);
				ul.append(inp_nome);
				ul.append(li_status)
				ul.append(li_btn);
				ul.append(li_btn_deletar);
				
				$('#set').append(ul);

			}
		} 
	})
	
	function evt(event){
		$.ajax({
			url: 'UpdateCidadeServlet',
			type: 'post',
			data: {
				'cidade_nome' : $('.cid' + event.data.id + '>.nom').val(),
				'cidade_status' : $('.cid' + event.data.id + '>.st').val(),
				'id': $('.cid' + event.data.id + '>.id').val()
			}, success: function(response){
				
				window.location.href = '/cidacionamento/sucesso.jsp';
			}
		  });
	}
	
	function evt_deletar(event){
		$.ajax({
			url: 'DeletarCidadoServlet',
			type: 'post',
			data: {
				'cidade_nome' : $('.cid' + event.data.id + '>.nom').val(),
				'cidade_status' : $('.cid' + event.data.id + '>.st').val(),
				'id': $('.cid' + event.data.id + '>.id').val()
			},success: function(response){
				
				window.location.href = '/Estacionamento/sucesso.jsp';
			}
		})
	}

	
});

