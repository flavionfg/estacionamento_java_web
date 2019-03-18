package br.com.estacionamento.mvc.model.persistent_object.enums;

public enum EnumCor {

	PRETO("preto"),
	BRANCO("branco"),
	PRATA("prata"),
	VERMELHO("vermelho");
	
	private String statusCor;

	//Construtor
	EnumCor(String statusCor){
		this.statusCor = statusCor;
	}

	public String getStatusCor() {
		return statusCor;
	}
	
}
