package demo.Service;

import demo.Model.Equipo;
import demo.Model.Jugador;
import demo.Model.Temporada;
import demo.Repository.EquipoRepository;
import demo.Repository.JugadorRepository;
import demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;

@Service
@Transactional
public class EquipoService {

    @Autowired
    private JugadorService jugadorService;
    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private TemporadaRepository temporadaRepository;
    @Autowired
    private JugadorRepository jugadorRepository;

    public void createEquipos(){
    jugadorService.createMadrid();
    jugadorService.createBarcelona();
    //jugadorService.pruebaCache();
    jugadorService.createBadalona();
    jugadorService.createZaragoza();
    jugadorService.createValencia();
    }

    public void consLiga()
    {
        System.out.println("Busca equipo");
        System.out.println(jugadorRepository.findByEquipoNombre("R.Madrid"));
        System.out.println("");

        System.out.println("Busca por posicion");
        System.out.println(jugadorRepository.findByPosicion("Base"));
        System.out.println("");

        System.out.println("Busca canastas");
        System.out.println(jugadorRepository.findFirstByOrderByCanastasDesc());
        System.out.println("");

        System.out.println("Busca asistencias");
        System.out.println(jugadorRepository.findFirst5ByOrderByAsistenciasDesc());
        System.out.println("");


        System.out.println("jugadorRepository.findJugadoresOrderByCanastasFromEquipo(\"Juventud\")");
        System.out.println(jugadorRepository.findJugadoresOrderByCanastasFromEquipo("Juventud").get(0));
    }
}
