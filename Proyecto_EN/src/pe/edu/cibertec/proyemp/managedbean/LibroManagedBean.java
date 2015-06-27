package pe.edu.cibertec.proyemp.managedbean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
//import javax.faces.model.SelectItem;

//import pe.edu.cibertec.proyemp.model.Departamento;
//import pe.edu.cibertec.proyemp.model.Empleado;
//import pe.edu.cibertec.proyemp.service.EmpleadoService;



import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import pe.edu.cibertec.proyemp.model.Libro;
import pe.edu.cibertec.proyemp.service.LibroService;

import com.google.common.collect.Lists;



@ManagedBean
@SessionScoped
public class LibroManagedBean {
	
	private Libro libro = new Libro();
	
	private List<Libro> libros = new ArrayList<Libro>();
	
	public String registrar(){
		libroService.getLibroRepository().save(libro);
		libro = new Libro();
		
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext(); 
		try {
			context.redirect("listado_libro.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Double conversion(Double soles){
		Double nuevosol;
		nuevosol=soles/3.10;
		return nuevosol;
	}
	
	public String regresar() {
	    return "/registro_libro.xhtml?faces-redirect=true";
	}

	@ManagedProperty(value = "#{libroService}")
	private LibroService libroService;
	
	
	public LibroService getLibroService() {
		return libroService;
	}

	public void setLibroService(LibroService libroService) {
		this.libroService = libroService;
	}
	
	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	

	public List<Libro> getLibros() {
		
		libros = 
				Lists.newArrayList(
						libroService.
						getLibroRepository().
						findAll());
		
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
	
	

}
