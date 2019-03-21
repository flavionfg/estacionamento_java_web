$(document).ready(function() {
	
	$.ajax({
		url: 'ListarEstadoServlet',
		type: 'post',	
		success : function(response){
			//colocar isso em uma função e chamar la em listar cidade
					for (var i = 0; i < response.length; i++) {
						
						var idEstado = response[i].idEstado;
						var nomeEstado = response[i].nomeEstado;
		
						var op_estado = $('<option>' + nomeEstado + '</option>')
						op_estado.attr({'class':'es' + i  })
						op_estado.val(idEstado);
										
						$('#selecionar_estado').append(op_estado);
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
				'cidade_status': $('#slc_status').val(),
				'estado': $('#selecionar_estado').val()
				
				},success: function(response){
						
				window.location.href = '/Estacionamento/sucesso.jsp';
			}
		 })
	})
});