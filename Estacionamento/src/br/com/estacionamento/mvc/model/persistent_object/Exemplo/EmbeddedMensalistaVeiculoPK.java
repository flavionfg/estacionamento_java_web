package br.com.estacionamento.mvc.model.persistent_object.Exemplo;

import java.io.Serializable;

import javax.persistence.Column;

public class EmbeddedMensalistaVeiculoPK implements Serializable {
	
	@Column(name = "TB_MENSALISTA_ID", unique = false)
	private int IdMensalista;
	
	@Column(name = "TB_VEICULO_ID", unique = false)
	private int idVeiculo;

	public int getIdMensalista() {
		return IdMensalista;
	}

	public void setIdMensalista(int idMensalista) {
		IdMensalista = idMensalista;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	
	
	
	

}
