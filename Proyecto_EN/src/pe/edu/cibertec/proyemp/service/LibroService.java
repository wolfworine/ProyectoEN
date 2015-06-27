package pe.edu.cibertec.proyemp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.cibertec.proyemp.repository.LibroRepository;


//import pe.edu.cibertec.proyemp.repository.DepartamentoRepository;


@Component
public class LibroService {

	@Autowired
	private LibroRepository libroRepository;

	public LibroRepository getLibroRepository() {
		return libroRepository;
	}

	public void setLibroRepository(LibroRepository libroRepository) {
		this.libroRepository = libroRepository;
	}
	
	
	

//	public EmpleadoRepository getEmpleadoRepository() {
//		return empleadoRepository;
//	}
//
//	public void setEmpleadoRepository(EmpleadoRepository empleadoRepository) {
//		this.empleadoRepository = empleadoRepository;
//	}


	
	

//	public DepartamentoRepository getDepartamentoRepository() {
//		return departamentoRepository;
//	}
//
//	public void setDepartamentoRepository(
//			DepartamentoRepository departamentoRepository) {
//		this.departamentoRepository = departamentoRepository;
//	}
	
	
	
}
