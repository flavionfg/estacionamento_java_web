package br.com.estacionamento.mvc.model.persistent_object;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.estacionamento.mvc.model.persistent_object.enums.EnumStatus;

//+-------------------+-------------------------+------+-----+---------+-------+
//| Field             | Type                    | Null | Key | Default | Extra |
//+-------------------+-------------------------+------+-----+---------+-------+
//| TB_USUARIO_ID     | int(11)                 | NO   | PRI | NULL    |       |
//| TB_USUARIO_NOME   | varchar(10)             | NO   |     | NULL    |       |
//| TB_USUARIO_SENHA  | varchar(10)             | NO   |     | NULL    |       |
//| TB_USUARIO_STATUS | enum('ativo','inativo') | NO   |     | NULL    |       |
//+-------------------+-------------------------+------+-----+---------+-------+

@Entity
@Table(name ="TB_USUARIO")
public class POUsuario {
	
	
	@Id
	@GeneratedValue
	@Column(name = "TB_USUARIO_ID", nullable = false)
	private int IdUsuario;
	
	@Column(name = "TB_USUARIO_NOME", nullable = false, length = 10)
	private String nomeUsuario;
	
	@Column(name = "TB_USUARIO_SENHA", nullable = false, length = 10)
	private String senhaUsuario;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "TB_USUARIO_STATUS", nullable = false)
	private EnumStatus statusUsuario;

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public EnumStatus getStatusUsuario() {
		return statusUsuario;
	}

	public void setStatusUsuario(EnumStatus statusUsuario) {
		this.statusUsuario = statusUsuario;
	}
	
	

}
