package pe.edu.cibertec.proyemp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.proyemp.model.Libro;




@Repository
public interface LibroRepository
	extends CrudRepository<Libro, Long>{

}
