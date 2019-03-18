package br.com.estacionamento.mvc.model.persistent_object;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.estacionamento.mvc.model.persistent_object.enums.EnumStatus;

//+----------------+-------------------------+------+-----+---------+-------+
//| Field          | Type                    | Null | Key | Default | Extra |
//+----------------+-------------------------+------+-----+---------+-------+
//| TB_VAGA_ID     | int(11)                 | NO   | PRI | NULL    |       |
//| TB_VAGA_DESC   | varchar(45)             | NO   |     | NULL    |       |
//| TB_VAGA_STATUS | enum('ativo','inativo') | NO   |     | NULL    |       |
//+----------------+-------------------------+------+-----+---------+-------+
@Entity
@Table(name = "TB_VAGA")
public class POVaga {
	
	@Id
	@GeneratedValue
	@Column(name = "TB_VAGA_ID", nullable = false)
	private int IdVaga;
	
	@Column(name = "TB_VAGA_DESC", nullable = false, length = 45)
	private String descricao;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "TB_VAGA_STATUS", nullable = false)
	private EnumStatus statusVaga;
	
	public int getIdVaga() {
		return IdVaga;
	}
	public void setIdVaga(int idVaga) {
		IdVaga = idVaga;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public EnumStatus getStatusVaga() {
		return statusVaga;
	}
	public void setStatusVaga(EnumStatus statusVaga) {
		this.statusVaga = statusVaga;
	}
	
	

}
