package demo.Repository;

import demo.Model.Equipo;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

public interface EquipoRepository extends PagingAndSortingRepository<Equipo,Long> {

    Equipo findByNombre(String Nombre);
    Equipo findByLocalidad (String localidad);
}