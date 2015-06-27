package pe.edu.cibertec.proyemp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.cibertec.proyemp.repository.EmpleadoRepository;

//import pe.edu.cibertec.proyemp.repository.DepartamentoRepository;


@Component
public class EmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;

	public EmpleadoRepository getEmpleadoRepository() {
		return empleadoRepository;
	}

	public void setEmpleadoRepository(EmpleadoRepository empleadoRepository) {
		this.empleadoRepository = empleadoRepository;
	}


	
	

//	public DepartamentoRepository getDepartamentoRepository() {
//		return departamentoRepository;
//	}
//
//	public void setDepartamentoRepository(
//			DepartamentoRepository departamentoRepository) {
//		this.departamentoRepository = departamentoRepository;
//	}
	
	
	
}
