package br.com.estacionamento.mvc.persistent_object.enums;

//crtl 1 no erro

public enum EnumStatus {
	
	ATIVO("ativo"),
	INATIVO("inativo");
	
	private String status;
	
	EnumStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	

}
