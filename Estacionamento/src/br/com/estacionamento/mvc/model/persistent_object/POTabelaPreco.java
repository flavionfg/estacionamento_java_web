package br.com.estacionamento.mvc.model.persistent_object;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.estacionamento.mvc.model.persistent_object.enums.EnumStatus;

//+---------------------------+-------------------------+------+-----+---------+-------+
//| Field                     | Type                    | Null | Key | Default | Extra |
//+---------------------------+-------------------------+------+-----+---------+-------+
//| TB_TABELA_PRECO_ID        | int(11)                 | NO   | PRI | NULL    |       |
//| TB_TABELA_PRECO_VALOR     | double                  | NO   |     | NULL    |       |
//| TB_TABELA_PRECO_STATUS    | enum('ativo','inativo') | NO   |     | NULL    |       |
//| TB_TABELA_PRECO_TEMPO_MIN | int(11)                 | NO   |     | NULL    |       |
//| TB_TABELA_PRECO_TEMPO_MAX | int(11)                 | NO   |     | NULL    |       |
//+---------------------------+-------------------------+------+-----+---------+-------+

@Entity
@Table(name = "TB_TABELA_PRECO")
public class POTabelaPreco {
	

	@Id
	@GeneratedValue
	@Column(name = "TB_TABELA_PRECO_ID", nullable = false)
	private int IdTabelaPreco;
	
	@Column(name = "TB_TABELA_PRECO_VALOR", nullable = false)
	private double precoValor;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "TB_TABELA_PRECO_STATUS", nullable = false)
	private EnumStatus statusTabelaPreco;
	
	@Column(name = "TB_TABELA_PRECO_TEMPO_MIN", nullable = false, length = 11)
	private int tempoMin;
	
	@Column(name = "TB_TABELA_PRECO_TEMPO_MAX", nullable = false, length = 11)
	private int tempoMax;

	public int getIdTabelaPreco() {
		return IdTabelaPreco;
	}

	public void setIdTabelaPreco(int idTabelaPreco) {
		IdTabelaPreco = idTabelaPreco;
	}

	public double getPrecoValor() {
		return precoValor;
	}

	public void setPrecoValor(double precoValor) {
		this.precoValor = precoValor;
	}

	public EnumStatus getStatusTabelaPreco() {
		return statusTabelaPreco;
	}

	public void setStatusTabelaPreco(EnumStatus statusTabelaPreco) {
		this.statusTabelaPreco = statusTabelaPreco;
	}

	public int getTempoMin() {
		return tempoMin;
	}

	public void setTempoMin(int tempoMin) {
		this.tempoMin = tempoMin;
	}

	public int getTempoMax() {
		return tempoMax;
	}

	public void setTempoMax(int tempoMax) {
		this.tempoMax = tempoMax;
	}
	
	

}
