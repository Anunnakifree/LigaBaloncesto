package demo.Repository;

import demo.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

public interface JugadorRepository extends PagingAndSortingRepository<Jugador,Long>{

    public List<Jugador> findByNameContaining(String name);
    public List<Jugador> findByCanastasGreaterThan(int canastas);
    public List<Jugador> findByAsistenciasBetween(int minAsistencias, int maxAsistencias);
    public List<Jugador> findByPosicionIs(String posicion);
    public List<Jugador> findByNacimientoBefore (Date nacimiento);
    public List<Jugador> findByNacimientoBeforeAndCanastasGreaterThanEqual (Date nacimiento, int canastas);

}
