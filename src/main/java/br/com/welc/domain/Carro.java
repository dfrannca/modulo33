package br.com.welc.domain;



//import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CARRO")
public class Carro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="car_seq")
	@SequenceGenerator(name="car_seq", sequenceName="sq_carro", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "CODIGO", length = 10, nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "DATA_COMPRA", nullable = false)
	private String dataCompra;
	
	@Column(name = "valor", nullable = false)
	private Double valor;
	
	
	@Column(name = "valorReal", nullable = false)
	private long valorReal;
	
	
	
	@Column(name = "status", nullable = false)
	private String status;


	@ManyToOne
	@JoinColumn(name = "id_curso_fk",
		foreignKey = @ForeignKey(name = "fk_curso_matricula"),
		referencedColumnName = "id", nullable = false
	)
	private Marca curso;
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	


	public String getDataCompra() {
		return dataCompra;
	}


	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Marca getCurso() {
		return curso;
	}


	public void setCurso(Marca curso) {
		this.curso = curso;
	}


	public long getValorReal() {
		return valorReal;
	}


	public void setValorReal(long valorReal) {
		this.valorReal = valorReal;
	}


	//
	
	
	
}
