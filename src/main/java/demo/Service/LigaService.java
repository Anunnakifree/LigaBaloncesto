package demo.Service;

import demo.Model.Equipo;
import demo.Model.Jugador;
import demo.Model.Liga;
import demo.Model.Temporada;
import demo.Repository.EquipoRepository;
import demo.Repository.JugadorRepository;
import demo.Repository.LigaRepository;
import demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class LigaService {
    @Autowired
    private LigaRepository ligaRepository;
    @Autowired
    private  TemporadaRepository temporadaRepository;
    @Autowired
    private EquipoRepository equipoRepository;

    public void enlaceLiga(){
        Liga l1 = new Liga ("Liga ACB");

        ligaRepository.save(l1);

        Temporada t1= new Temporada("ACB 2015/16");
        Temporada t2= new Temporada("ACB 2014/15");

        t1.getEquipos().add(equipoRepository.findByNombre("R.Madrid"));
        t1.getEquipos().add(equipoRepository.findByNombre("F.C.Barcelona"));
        t1.getEquipos().add(equipoRepository.findByNombre("Juventud"));
        t1.getEquipos().add(equipoRepository.findByNombre("CAI Zaragoza"));
        t1.getEquipos().add(equipoRepository.findByNombre("Basket Valencia"));

        t2.getEquipos().add(equipoRepository.findByNombre("R.Madrid"));
        t2.getEquipos().add(equipoRepository.findByNombre("F.C.Barcelona"));
        t2.getEquipos().add(equipoRepository.findByNombre("Juventud"));
        t2.getEquipos().add(equipoRepository.findByNombre("CAI Zaragoza"));
        t2.getEquipos().add(equipoRepository.findByNombre("Basket Valencia"));

        temporadaRepository.save(t1);
        temporadaRepository.save(t2);



    }

}
