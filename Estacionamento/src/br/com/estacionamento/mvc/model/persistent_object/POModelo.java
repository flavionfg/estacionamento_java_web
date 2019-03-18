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

import br.com.estacionamento.mvc.model.persistent_object.enums.EnumStatus;

//+--------------------+-------------------------+------+-----+---------+-------+
//| Field              | Type                    | Null | Key | Default | Extra |
//+--------------------+-------------------------+------+-----+---------+-------+
//| TB_MODELO_ID       | int(11)                 | NO   | PRI | NULL    |       |
//| TB_MODELO_DESC     | varchar(50)             | NO   |     | NULL    |       |
//| TB_MODELO_STATUS   | enum('ativo','inativo') | NO   |     | NULL    |       |
//| TB_TIPO_VEICULO_ID | int(11)                 | NO   | MUL | NULL    |       |
//| TB_MARCA_ID        | int(11)                 | NO   | MUL | NULL    |       |
//+--------------------+-------------------------+------+-----+---------+-------+

@Entity
@Table(name = "TB_MODELO")
public class POModelo {
	
	@Id
	@GeneratedValue
	@Column(name = "TB_MODELO_ID", nullable = false)
	private int IdModelo;
	
	@Column(name = "TB_MODELO_DESC", nullable = false, length = 50)
	private String descrica;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "TB_MODELO_STATUS", nullable = false)
	private EnumStatus statusModelo;
	
	@OneToOne
	@JoinColumn(name = "TB_TIPO_VEICULO_ID", nullable = false)
	private POTipoVeiculo tipoVeiculoModelo;
	
	@OneToOne
	@JoinColumn(name = "TB_MARCA_ID", nullable = false)
	private POMarca marcaModelo;
	
	
	public int getIdModelo() {
		return IdModelo;
	}
	public void setIdModelo(int idModelo) {
		IdModelo = idModelo;
	}
	public String getDescrica() {
		return descrica;
	}
	public void setDescrica(String descrica) {
		this.descrica = descrica;
	}
	public EnumStatus getStatus_modelo() {
		return statusModelo;
	}
	public void setStatus_modelo(EnumStatus status_modelo) {
		this.statusModelo = status_modelo;
	}
	public POTipoVeiculo getTipoVeiculoModelo() {
		return tipoVeiculoModelo;
	}
	public void setTipoVeiculoModelo(POTipoVeiculo tipoVeiculoModelo) {
		this.tipoVeiculoModelo = tipoVeiculoModelo;
	}
	public POMarca getMarcaModelo() {
		return marcaModelo;
	}
	public void setMarcaModelo(POMarca marcaModelo) {
		this.marcaModelo = marcaModelo;
	}
	
	
	

}
