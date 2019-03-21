$(document).ready(function(){
	
	var estados = new Array();
	
	$.ajax({
		url: 'ListarEstadoServlet',
		type: 'post',	
		success : function(response){
			//colocar isso em uma função e chamar la em listar cidade
					for (var i = 0; i < response.length; i++) {
						
						var idEstado = response[i].idEstado;
						var nomeEstado = response[i].nomeEstado;
						
						var op_estado = $('<option>' + nomeEstado + '</option>')
						op_estado.attr({'class':'st' + i })
						op_estado.val(idEstado);
						estados[i] = response[i];
								
						$('#selecionar_estado').append(op_estado);
					}
					
			$('select').formSelect();
		} 
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
				
				var select_estado = $('<select></select>');
				for(var j = 0; j < estados.length; j++){
					var op_estado = $('<option></option>');
					op_estado.val(estados[j].idEstado);
					op_estado.text(estados[j].nomeEstado);
					if(response[i].estadoCidade.idEstado === estados[j].idEstado){
						op_estado.prop('selected', true);
					}
					select_estado.append(op_estado);
					
				}
				
				var li_select = $('<li></li>');
				select_estado.attr('id', 'selecionar_estado' + idCidade);
				li_select.append(select_estado);
				
				var ul = $('<ul class="ul"></ul>');
				ul.attr('class', 'st' + i);
				
				ul.append(inp_id);
				ul.append(inp_nome);
				ul.append(li_status);
				ul.append(li_select);
				ul.append(li_btn);
				ul.append(li_btn_deletar);
				
				
				$('#set').append(ul);
			
			}
			
			$('select').formSelect();
		} 
	})
	
	function evt(event){
		$.ajax({
			url: 'UpdateCidadeServlet',
			type: 'post',
			data: {
				'cidade_nome' : $('.cid' + event.data.id + '>.nom').val(),
				'cidade_status' : $('.cid' + event.data.id + '>.st').val(),
				'id': $('.cid' + event.data.id + '>.id').val(),
				'estado': $('.es' + event.data.id + '>.id').val()
				
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