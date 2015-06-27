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
@Table(name="tb_empleado")
public class Empleado {

	@Id
	@GeneratedValue
	@Column(name="EMP_ID", unique = true, nullable=false)
	private Long id;
	
	@Column(name = "EMP_NOMBRE", nullable=false, length=200)
	private String nombre;

	@ManyToOne
	@JoinColumn(name="DEP_ID")
	private Departamento departamento;

	@Column(name="EMP_SALARIO", precision=10, scale=2)
	private BigDecimal salario;
	
	@Column(name="EMP_FEC_ING")
	@Temporal(value=TemporalType.DATE)
	private Date fechaIngreso;

	@Column(columnDefinition="CHAR(1)")
	private String estado;
	
	@Column(columnDefinition="CHAR(8)")
	private String DNI;
	
	@Column(name="EMP_FEC_NAC")
	@Temporal(value = TemporalType.DATE)
	private Date fechaNacimiento;
	
	public Empleado() {

	}
	

	public Empleado(String nombre, Departamento departamento,
			BigDecimal salario, Date fechaIngreso, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
		this.fechaIngreso = fechaIngreso;
		this.fechaNacimiento = fechaNacimiento;
	}




	public Empleado(String nombre, Departamento departamento) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
	}

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	
	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", departamento=" + departamento
				+ ", salario=" + salario + ", fechaIngreso=" + fechaIngreso
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	
}
