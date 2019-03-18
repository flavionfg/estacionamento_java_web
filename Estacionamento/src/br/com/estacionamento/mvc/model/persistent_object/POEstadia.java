package br.com.estacionamento.mvc.model.persistent_object;


import java.sql.Timestamp;

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

//+--------------------+-------------------------+------+-----+-------------------+-----------------------------------------------+
//| Field              | Type                    | Null | Key | Default           | Extra                                         |
//+--------------------+-------------------------+------+-----+-------------------+-----------------------------------------------+
//| TB_ESTADIA_ID      | int(11)                 | NO   | PRI | NULL              |                                               |
//| TB_ESTADIA_INICIO  | timestamp               | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED on update CURRENT_TIMESTAMP |
//| TB_ESTADIA_TERMINO | timestamp               | YES  |     | NULL              |                                               |
//| TB_ESTADIA_PLACA   | varchar(8)              | NO   |     | NULL              |                                               |
//| TB_ESTADIA_STATUS  | enum('ativo','inativo') | NO   |     | NULL              |                                               |
//| TB_TABELA_PRECO_ID | int(11)                 | NO   | MUL | NULL              |                                               |
//| TB_VAGA_ID         | int(11)                 | NO   | MUL | NULL              |                                               |
//| TB_VEICULO_ID      | int(11)                 | YES  | MUL | NULL              |                                               |
//+--------------------+-------------------------+------+-----+-------------------+-----------------------------------------------+

@Entity
@Table(name ="TB_ESTADIA")
public class POEstadia {
	
	
	@Id
	@GeneratedValue
	@Column(name = "TB_ESTADIA_ID", nullable = false)
	private int IdEstadia;
	
	@Column(name = "TB_ESTADIA_INICIO", nullable = false)
	private Timestamp inicio;
	
	@Column(name = "TB_ESTADIA_TERMINO", nullable = false)
	private Timestamp termino;
	
	@Column(name = "TB_ESTADIA_PLACA", nullable = false, length = 8)
	private String placaEstadia;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "TB_ESTADIA_STATUS", nullable = false)
	private EnumStatus statusEstadia;
	
	@OneToOne
	@JoinColumn(name = "TB_TABELA_PRECO_ID", nullable = false)
	private POTabelaPreco idTabelaPreco;
	
	@OneToOne
	@JoinColumn(name = "TB_VAGA_ID", nullable = false)
	private POVaga idVaga;
	
	@OneToOne
	@JoinColumn(name = "TB_VEICULO_ID",nullable = false)
	private POVeiculo idVeiculo;
	
	
	public int getIdEstadia() {
		return IdEstadia;
	}
	public void setIdEstadia(int idEstadia) {
		IdEstadia = idEstadia;
	}
	public Timestamp getInicio() {
		return inicio;
	}
	public void setInicio(Timestamp inicio) {
		this.inicio = inicio;
	}
	public Timestamp getTermino() {
		return termino;
	}
	public void setTermino(Timestamp termino) {
		this.termino = termino;
	}
	public String getPlacaEstadia() {
		return placaEstadia;
	}
	public void setPlacaEstadia(String placaEstadia) {
		this.placaEstadia = placaEstadia;
	}
	public EnumStatus getStatusEstadia() {
		return statusEstadia;
	}
	public void setStatusEstadia(EnumStatus statusEstadia) {
		this.statusEstadia = statusEstadia;
	}
	public POTabelaPreco getIdTabelaPreco() {
		return idTabelaPreco;
	}
	public void setIdTabelaPreco(POTabelaPreco idTabelaPreco) {
		this.idTabelaPreco = idTabelaPreco;
	}
	public POVaga getIdVaga() {
		return idVaga;
	}
	public void setIdVaga(POVaga idVaga) {
		this.idVaga = idVaga;
	}
	public POVeiculo getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(POVeiculo idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	
	
	
	
	
	
}
