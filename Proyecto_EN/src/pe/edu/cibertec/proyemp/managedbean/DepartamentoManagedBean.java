package pe.edu.cibertec.proyemp.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.google.common.collect.Lists;

import pe.edu.cibertec.proyemp.model.Departamento;
import pe.edu.cibertec.proyemp.service.DepartamentoService;


@ManagedBean
@SessionScoped
public class DepartamentoManagedBean {
	
	private Departamento departamento = new Departamento();
	
	private List<Departamento> departamentos = new ArrayList<Departamento>();
	
	public String registrar(){
		departamentoService.getDepartamentoRepository().save(departamento);
		departamento = new Departamento();
		return null;
	}
	
	@ManagedProperty(value = "#{departamentoService}")
	private DepartamentoService departamentoService;

	public DepartamentoService getDepartamentoService() {
		return departamentoService;
	}

	public void setDepartamentoService(DepartamentoService departamentoService) {
		this.departamentoService = departamentoService;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Departamento> getDepartamentos() {
		
		departamentos = 
				Lists.newArrayList(
						departamentoService.
						getDepartamentoRepository().
						findAll());
		
//		departamentos = new ArrayList<Departamento>();
//		
//		Iterable<Departamento> lista = 
//				departamentoService.getDepartamentoRepository().findAll();
//		
//		for (Departamento departamento : lista) {
//			departamentos.add(departamento);
//		}
//		
		return departamentos;
	}

	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	
	

}
