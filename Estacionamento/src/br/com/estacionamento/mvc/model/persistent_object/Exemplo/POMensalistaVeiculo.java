//package br.com.estacionamento.mvc.persistent_object.Exemplo;
//
//import javax.persistence.Column;
//import javax.persistence.EmbeddedId;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//
//import br.com.estacionamento.mvc.persistent_object.enums.EnumStatus;
//
////Faça isso caso a tabela associativa nao tenha primary key, apenas estrangeira
//
//public class POMensalistaVeiculo {
//	
//	@EmbeddedId
//	private EmbeddedMensalistaVeiculoPK idMensalistaVeiculo;
//	
//	@Column(name = "TB_MENSALISTA_VEICULO_PROPRIETARIO", nullable = false)
//	private boolean propriedadeMensalistaVeiculo;
//	
//	@Enumerated(EnumType.STRING)
//	@Column(name = "TB_MENSALISTA_VEICULO_STATUS", nullable = false)
//	private EnumStatus statusMensalistaVeiculo;
//
//	public EmbeddedMensalistaVeiculoPK getIdMensalistaVeiculo() {
//		return idMensalistaVeiculo;
//	}
//
//	public void setIdMensalistaVeiculo(EmbeddedMensalistaVeiculoPK idMensalistaVeiculo) {
//		this.idMensalistaVeiculo = idMensalistaVeiculo;
//	}
//
//	public boolean isPropriedadeMensalistaVeiculo() {
//		return propriedadeMensalistaVeiculo;
//	}
//
//	public void setPropriedadeMensalistaVeiculo(boolean propriedadeMensalistaVeiculo) {
//		this.propriedadeMensalistaVeiculo = propriedadeMensalistaVeiculo;
//	}
//
//	public EnumStatus getStatusMensalistaVeiculo() {
//		return statusMensalistaVeiculo;
//	}
//
//	public void setStatusMensalistaVeiculo(EnumStatus statusMensalistaVeiculo) {
//		this.statusMensalistaVeiculo = statusMensalistaVeiculo;
//	}
//	
//
//}
