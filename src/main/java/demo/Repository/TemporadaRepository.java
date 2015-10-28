package demo.Repository;

import demo.Model.Temporada;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

public interface TemporadaRepository extends PagingAndSortingRepository<Temporada,Long> {

}
