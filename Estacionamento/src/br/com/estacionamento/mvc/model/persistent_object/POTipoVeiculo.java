package br.com.estacionamento.mvc.model.persistent_object;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.estacionamento.mvc.model.persistent_object.enums.EnumStatus;

//+------------------------+-------------------------+------+-----+---------+-------+
//| Field                  | Type                    | Null | Key | Default | Extra |
//+------------------------+-------------------------+------+-----+---------+-------+
//| TB_TIPO_VEICULO_ID     | int(11)                 | NO   | PRI | NULL    |       |
//| TB_TIPO_VEICULO_DESC   | varchar(50)             | NO   |     | NULL    |       |
//| TB_TIPO_VEICULO_STATUS | enum('ativo','inativo') | NO   |     | NULL    |       |
//+------------------------+-------------------------+------+-----+---------+-------+
@Entity
@Table(name = "TB_TIPO_VEICULO")
public class POTipoVeiculo {
	
	@Id
	@GeneratedValue
	@Column(name = "TB_TIPO_VEICULO_ID", nullable = false)
	private int idTipoVeiculo;
	
	@Column(name = "TB_TIPO_VEICULO_DESC", nullable = false, length = 50)
	private String descricao;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "TB_TIPO_VEICULO_STATUS", nullable = false)
	private EnumStatus statusTipoVeiculo;
	
	public int getIdTipoVeiculo() {
		return idTipoVeiculo;
	}
	public void setIdTipoVeiculo(int idTipoVeiculo) {
		this.idTipoVeiculo = idTipoVeiculo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public EnumStatus getStatus_tipo_veiculo() {
		return statusTipoVeiculo;
	}
	public void setStatus_tipo_veiculo(EnumStatus status_tipo_veiculo) {
		this.statusTipoVeiculo = status_tipo_veiculo;
	}
	
	

}
