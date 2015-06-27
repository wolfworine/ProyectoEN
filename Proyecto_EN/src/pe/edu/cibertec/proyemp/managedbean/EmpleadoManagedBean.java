package pe.edu.cibertec.proyemp.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import pe.edu.cibertec.proyemp.model.Departamento;
import pe.edu.cibertec.proyemp.model.Empleado;
import pe.edu.cibertec.proyemp.service.EmpleadoService;

import com.google.common.collect.Lists;



@ManagedBean
@SessionScoped
public class EmpleadoManagedBean {
	
	private Empleado empleado = new Empleado();
	
	private List<Empleado> empleados = new ArrayList<Empleado>();
	
	public String registrar(){
		empleadoService.getEmpleadoRepository().save(empleado);
		empleado = new Empleado();
		return null;
	}
	
//	private ArrayList<SelectItem> departamentolista;
//	
//	public ArrayList<SelectItem> getDepartamentolista() {
//		departamentolista=new ArrayList<SelectItem>();
//		for(Departamento obj:niveli.listadonivel()){
//			departamentolista.add(new SelectItem(obj.getNivelid(), obj.getNiveldes()));
//		}
//		return departamentolista;
//	}
//	
//		
//		
//
//	public void setDepartamentolista(ArrayList<SelectItem> departamentolista) {
//		this.departamentolista = departamentolista;
//	}
	
	

	@ManagedProperty(value = "#{empleadoService}")
	private EmpleadoService empleadoService;
	
	

//	public EmpleadoService getDepartamentoService() {
//		return departamentoService;
//	}
//
//	public void setDepartamentoService(DepartamentoService departamentoService) {
//		this.departamentoService = departamentoService;
//	}

	public EmpleadoService getEmpleadoService() {
		return empleadoService;
	}

	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}

//	public Departamento getDepartamento() {
//		return departamento;
//	}
//
//	public void setDepartamento(Departamento departamento) {
//		this.departamento = departamento;
//	}
	
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	

//	public List<Departamento> getDepartamentos() {
//		
//		departamentos = 
//				Lists.newArrayList(
//						departamentoService.
//						getDepartamentoRepository().
//						findAll());
		
//		departamentos = new ArrayList<Departamento>();
//		
//		Iterable<Departamento> lista = 
//				departamentoService.getDepartamentoRepository().findAll();
//		
//		for (Departamento departamento : lista) {
//			departamentos.add(departamento);
//		}
	
//		return departamentos;
//	}

	

//	public void setDepartamentos(List<Departamento> departamentos) {
//		this.departamentos = departamentos;
//	}

	public List<Empleado> getEmpleados() {
		
		empleados = 
				Lists.newArrayList(
						empleadoService.
						getEmpleadoRepository().
						findAll());
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
	
	
	

}
