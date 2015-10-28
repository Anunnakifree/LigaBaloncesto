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
public class TemporadaService {

    @Autowired
    private JugadorService jugadorService;
    @Autowired
    private EquipoRepository equipoRepository;



}
