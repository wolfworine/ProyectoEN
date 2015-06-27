package pe.edu.cibertec.proyemp.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="tb_libro")
public class Libro {

	@Id
	@GeneratedValue
	@Column(name="LIB_ID", unique = true, nullable=false)
	private Long id;
	
	@Column(name = "LIB_TITULO", nullable=false, length=200)
	private String titulo;
	
	@Column(name = "LIB_AUTOR", nullable=false, length=200)
	private String autor;
	
	@Column(name = "LIB_NROPAG")
	private int nroPagina;
	
	@Column(name="LIB_FEC_PUB")
	@Temporal(value=TemporalType.DATE)
	private Date fechaPublicacion;
	
	@Column(name="LIB_PRECIO", precision=10, scale=2)
	private BigDecimal precio;
	
	private BigDecimal precioDolar;
	
	
	
	public BigDecimal getPrecioDolar() {
		return precioDolar;
	}

	public void setPrecioDolar(BigDecimal precioDolar) {
		this.precioDolar = precioDolar;
	}

	public Libro() {

	}

	public Libro(String titulo, String autor, int nroPagina,
			Date fechaPublicacion, BigDecimal precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nroPagina = nroPagina;
		this.fechaPublicacion = fechaPublicacion;
		this.precio = precio;
	}
	
	



	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor
				+ ", nroPagina=" + nroPagina + ", fechaPublicacion=" + fechaPublicacion
				+ ", precio=" + precio + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNroPagina() {
		return nroPagina;
	}

	public void setNroPagina(int nroPagina) {
		this.nroPagina = nroPagina;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	
	
	
	

	
}
