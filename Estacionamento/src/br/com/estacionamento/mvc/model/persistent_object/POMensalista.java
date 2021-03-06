package br.com.estacionamento.mvc.model.persistent_object;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.estacionamento.mvc.model.persistent_object.enums.EnumStatus;

//+----------------------+-------------------------+------+-----+---------+----------------+
//| Field                | Type                    | Null | Key | Default | Extra          |
//+----------------------+-------------------------+------+-----+---------+----------------+
//| TB_MENSALISTA_ID     | int(11)                 | NO   | PRI | NULL    | auto_increment |
//| TB_MENSALISTA_NOME   | varchar(100)            | NO   |     | NULL    |                |
//| TB_MENSALISTA_CPF    | varchar(11)             | NO   |     | NULL    |                |
//| TB_MENSALISTA_STATUS | enum('ativo','inativo') | NO   |     | NULL    |                |
//+----------------------+-------------------------+------+-----+---------+----------------+

@Entity
@Table(name = "TB_MENSALISTA")
public class POMensalista {
	
	@Id
	@GeneratedValue
	@Column(name = "TB_MENSALISTA_ID", nullable = false)
	private int IdMensalista;
	
	@Column(name = "TB_MENSALISTA_NOME", nullable = false, length = 100)
	private String nomeMensalista;
	
	@Column(name = "TB_MENSALISTA_CPF", nullable = false, length = 11)
	private String cpf;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "TB_MENSALISTA_STATUS", nullable = false)
	private EnumStatus statusMensalista;
	
	public int getIdMensalista() {
		return IdMensalista;
	}
	public void setIdMensalista(int idMensalista) {
		IdMensalista = idMensalista;
	}
	public String getNomeMensalista() {
		return nomeMensalista;
	}
	public void setNomeMensalista(String nomeMensalista) {
		this.nomeMensalista = nomeMensalista;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public EnumStatus getStatusMensalista() {
		return statusMensalista;
	}
	public void setStatusMensalista(EnumStatus statusMensalista) {
		this.statusMensalista = statusMensalista;
	}
	
	

}
