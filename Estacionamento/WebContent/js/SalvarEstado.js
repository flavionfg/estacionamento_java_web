$(document).ready(function() {
	$('#btn-salvar').on('click', function(){
	$.ajax({
		url: 'InserirEstadoServlet', 
		type: 'post',
		data: {
			
			'estado_nome' : $('#tf_estado').val(),
			'estado_sigla': $('#tf_sigla').val(),
			'estado_status': $('#slc_status').val()
			
			},success: function(response){
				window.location.href = '/Estacionamento/sucesso.jsp';
		}
	 })
	})
});