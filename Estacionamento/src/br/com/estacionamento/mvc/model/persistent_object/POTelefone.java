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

import br.com.estacionamento.mvc.model.persistent_object.enums.EnumTelefoneStatus;

//+----------------------+-------------------------------------------+------+-----+---------+----------------+
//| Field                | Type                                      | Null | Key | Default | Extra          |
//+----------------------+-------------------------------------------+------+-----+---------+----------------+
//| TB_TELEFONE_ID       | int(11)                                   | NO   | PRI | NULL    | auto_increment |
//| TB_TELEFONE_NUM      | varchar(11)                               | NO   |     | NULL    |                |
//| TB_TELEFONE_TIPO_TEL | enum('residencial','comercial','celular') | NO   |     | NULL    |                |
//| TB_TELEFONE_STATUS   | enum('ativo','inativo')                   | NO   |     | NULL    |                |
//| TB_MENSALISTA_ID     | int(11)                                   | NO   | MUL | NULL    |                |
//+----------------------+-------------------------------------------+------+-----+---------+----------------+

@Entity
@Table(name = "TB_TELEFONE")
public class POTelefone {
	
	@Id
	@GeneratedValue
	@Column(name = "TB_TELEFONE_ID ", nullable = false)
	private int IdTelefone;
	
	@Column(name = "TB_TELEFONE_NUM", nullable = false, length = 11)
	private String numero;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "TB_TELEFONE_STATUS", nullable = false)
	private EnumTelefoneStatus telefoneStatus;
//	
	//ver banco
	@OneToOne
	@JoinColumn(name = "TB_MENSALISTA_ID", nullable = false)
	private POMensalista mensalistaTelefone;
	
	
	public int getIdTelefone() {
		return IdTelefone;
	}
	public void setIdTelefone(int idTelefone) {
		IdTelefone = idTelefone;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public EnumTelefoneStatus getTelefone_status() {
		return telefoneStatus;
	}
	public void setTelefone_status(EnumTelefoneStatus telefone_status) {
		this.telefoneStatus = telefone_status;
	}
	public POMensalista getMensalistaTelefone() {
		return mensalistaTelefone;
	}
	public void setMensalistaTelefone(POMensalista mensalistaTelefone) {
		this.mensalistaTelefone = mensalistaTelefone;
	}
	
	

}
