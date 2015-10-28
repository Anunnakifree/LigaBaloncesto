package demo.Repository;

import demo.Model.Jugador;
import demo.Model.Liga;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LigaRepository extends PagingAndSortingRepository<Liga,Long> {
}
