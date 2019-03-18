package br.com.estacionamento.mvc.model.persistent_object;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import br.com.estacionamento.mvc.model.persistent_object.enums.EnumStatus;

//+------------------------------------+-------------------------+------+-----+---------+-------+
//| Field                              | Type                    | Null | Key | Default | Extra |
//+------------------------------------+-------------------------+------+-----+---------+-------+
//| TB_MENSALISTA_VEICULO_ID           | int(11)                 | NO   | PRI | NULL    |       |
//| TB_MENSALISTA_VEICULO_PROPRIETARIO | tinyint(1)              | NO   |     | NULL    |       |
//| TB_MENSALISTA_ID                   | int(11)                 | NO   | MUL | NULL    |       |
//| TB_VEICULO_ID                      | int(11)                 | NO   | MUL | NULL    |       |
//| TB_MENSALISTA_VEICULO_STATUS       | enum('ativo','inativo') | NO   |     | NULL    |       |
//+------------------------------------+-------------------------+------+-----+---------+-------+

@Entity
@Table(name = "TB_MENSALISTA_VEICULO")
public class POMensalistaVeiculo {
	
	
	@Id
	@GeneratedValue
	@Column(name = "TB_MENSALISTA_VEICULO_ID", nullable = false)
	private int IdMensalistaVeiculo;
	
	@Column(name = "TB_MENSALISTA_VEICULO_PROPRIETARIO", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean proprietarioMensalistaVeiculo;
	
	@OneToOne
	@JoinColumn(name = "TB_MENSALISTA_ID", nullable = false)
	private POMensalista mensalista;
	
	@OneToOne
	@JoinColumn(name = "TB_VEICULO_ID", nullable = false)
	private POVeiculo veiculo;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "TB_MENSALISTA_VEICULO_STATUS", nullable = false)
	private EnumStatus statusMnesalistaVeiculo;
	
	public int getIdMensalistaVeiculo() {
		return IdMensalistaVeiculo;
	}
	public void setIdMensalistaVeiculo(int idMensalistaVeiculo) {
		IdMensalistaVeiculo = idMensalistaVeiculo;
	}
	public boolean isProprietarioMensalistaVeiculo() {
		return proprietarioMensalistaVeiculo;
	}
	public void setProprietarioMensalistaVeiculo(boolean proprietarioMensalistaVeiculo) {
		this.proprietarioMensalistaVeiculo = proprietarioMensalistaVeiculo;
	}
	public POMensalista getMensalista() {
		return mensalista;
	}
	public void setMensalista(POMensalista mensalista) {
		this.mensalista = mensalista;
	}
	public POVeiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(POVeiculo veiculo) {
		this.veiculo = veiculo;
	}
	public EnumStatus getStatusMnesalistaVeiculo() {
		return statusMnesalistaVeiculo;
	}
	public void setStatusMnesalistaVeiculo(EnumStatus statusMnesalistaVeiculo) {
		this.statusMnesalistaVeiculo = statusMnesalistaVeiculo;
	}
	
	
	
	

}

