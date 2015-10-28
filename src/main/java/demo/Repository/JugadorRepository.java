package demo.Repository;

import demo.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface JugadorRepository extends PagingAndSortingRepository<Jugador,Long>{

        //Ejercicio 1
        public List<Jugador> findByNameContaining(String name);
        public List<Jugador> findByCanastasGreaterThan(int canastas);
        public List<Jugador> findByAsistenciasBetween(int minAsistencias, int maxAsistencias);
        public List<Jugador> findByPosicionIs(String posicion);
        public List<Jugador> findByNacimientoBefore (Date nacimiento);
        public List<Jugador> findByNacimientoBeforeAndCanastasGreaterThanEqual (Date nacimiento, int canastas);

        //Ejercicio 2
        List<Jugador> findByEquipoNombre(String nombre);
        List<Jugador> findByPosicion(String posicion);
        Jugador findFirstByOrderByCanastasDesc();
        List<Jugador> findFirst5ByOrderByAsistenciasDesc();

        @Query("SELECT j FROM Jugador j WHERE j.equipo.nombre = :equipoNombre ORDER BY j.canastas DESC")
        List<Jugador> findJugadoresOrderByCanastasFromEquipo(@Param("equipoNombre") String equipoNombre);
}
