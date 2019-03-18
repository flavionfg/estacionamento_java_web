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

//+------------------------+-------------------------+------+-----+---------+-------+
//| Field                  | Type                    | Null | Key | Default | Extra |
//+------------------------+-------------------------+------+-----+---------+-------+
//| TB_ENDERECO_ID         | int(11)                 | NO   | PRI | NULL    |       |
//| TB_ENDERECO_CEP        | varchar(8)              | NO   |     | NULL    |       |
//| TB_ENDERECO_LOGRADOURO | varchar(100)            | NO   |     | NULL    |       |
//| TB_ENDERECO_NUM        | varchar(10)             | NO   |     | NULL    |       |
//| TB_ENDERECO_COMP       | varchar(100)            | YES  |     | NULL    |       |
//| TB_ENDERECO_STATUS     | enum('ativo','inativo') | NO   |     | NULL    |       |
//| TB_CIDADE_ID           | int(11)                 | NO   | MUL | NULL    |       |
//| TB_MENSALISTA_ID       | int(11)                 | NO   | MUL | NULL    |       |
//+------------------------+-------------------------+------+-----+---------+-------+

@Entity
@Table(name = "TB_ENDERECO")
public class POEndereco {

	@Id
	@GeneratedValue
	@Column(name = "TB_ENDERECO_ID", nullable = false)
	private int IdEndereco;

	@Column(name = "TB_ENDERECO_CEP", nullable = false, length = 8)
	private String cep;
	
	@Column(name = "TB_ENDERECO_LOGRADOURO", nullable = false,length = 100)
	private String logradouro;
	
	@Column(name = "TB_ENDERECO_NUM", nullable = false, length = 10)
	private String numero;
	
	@Column(name = "TB_ENDERECO_COMP", nullable = false, length = 100)
	private String complemento;

	@Enumerated(EnumType.STRING)
	@Column(name = "TB_ENDERECO_STATUS", nullable = false)
	private EnumStatus statusEndereco;
	@OneToOne
	@JoinColumn(name = "TB_CIDADE_ID", nullable = false)
	private POCidade cidadeEndereco;
	
	@OneToOne
	@JoinColumn(name = "TB_MENSALISTA_ID", nullable = false)
	private POMensalista mensalistaEndereco;
	
	public int getIdEndereco() {
		return IdEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		IdEndereco = idEndereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public EnumStatus getStatusEndereco() {
		return statusEndereco;
	}

	public void setStatusEndereco(EnumStatus statusEndereco) {
		this.statusEndereco = statusEndereco;
	}

	public POCidade getCidadeEndereco() {
		return cidadeEndereco;
	}

	public void setCidadeEndereco(POCidade cidadeEndereco) {
		this.cidadeEndereco = cidadeEndereco;
	}

	public POMensalista getMensalistaEndereco() {
		return mensalistaEndereco;
	}

	public void setMensalistaEndereco(POMensalista mensalistaEndereco) {
		this.mensalistaEndereco = mensalistaEndereco;
	}

}
