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
