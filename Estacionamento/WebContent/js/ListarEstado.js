$(document).ready(function() {
	var f = function(){
		
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
					
					var ul = $('<ul class="ul"></ul>');
					ul.attr('class', 'est' + i);
					
					ul.append(inp_id);
					ul.append(inp_nome);
					ul.append(li_sigla);
					ul.append(li_status)
				
					$('#set').append(ul);
	
				}
			} 
		})
	}
});