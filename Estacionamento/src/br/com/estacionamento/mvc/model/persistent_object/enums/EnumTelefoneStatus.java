package br.com.estacionamento.mvc.model.persistent_object.enums;

public enum EnumTelefoneStatus {
	
	//enum('residencial','comercial','celular')
	
	RESIDENCIAL("residencial"),
	COMERCIAL("comercial"),
	CELULAR("celular");
	
	private String Telefone_Status;
	
	EnumTelefoneStatus(String Telefone_Status){
		this.Telefone_Status =  Telefone_Status;
		
	}

	public String getTelefone_Status() {
		return Telefone_Status;
	}
}
