	function evt_deletar(event){
		$.ajax({
			url: 'DeletarEstadoServlet',
			type: 'post',
			data: {
				'estado_nome' : $('.est' + event.data.id + '>.nom').val(),
				'estado_sigla': $('.est' + event.data.id + '>.sig').val(),
				'estado_status' : $('.est' + event.data.id + '>.st').val(),
				'id': $('.est' + event.data.id + '>.id').val()
			},success: function(response){
				
				window.location.href = '/Estacionamento/sucesso.jsp';
			}
		})
	}