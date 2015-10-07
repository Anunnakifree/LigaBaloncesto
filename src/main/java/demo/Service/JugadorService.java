package demo.Service;

import demo.Model.Jugador;
import demo.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;

    public void testJugador() {

        Calendar cal=Calendar.getInstance();
        cal.set(1995, Calendar.JANUARY, 1);
        Date birthDate=cal.getTime();


        Jugador jugador1 = new Jugador();
        jugador1.setName("Llull");
        jugador1.setPosicion("Base");
        jugador1.setNacimiento(birthDate);
        jugador1.setCanastas(65);
        jugador1.setAsistencias(50);
        jugador1.setRebotes(10);
        jugadorRepository.save(jugador1);

        cal.set(1990, Calendar.JULY, 21);
        Date birthDate2=cal.getTime();

        Jugador jugador2 = new Jugador();
        jugador2.setName("Rudy");
        jugador2.setPosicion("Alero");
        jugador2.setNacimiento(birthDate2);
        jugador2.setCanastas(75);
        jugador2.setAsistencias(35);
        jugador2.setRebotes(25);
        jugadorRepository.save(jugador2);

        cal.set(1988, Calendar.MAY, 16);
        Date birthDate3=cal.getTime();

        Jugador jugador3 = new Jugador();
        jugador3.setName("Maciulis");
        jugador3.setPosicion("Escolta");
        jugador3.setNacimiento(birthDate3);
        jugador3.setCanastas(30);
        jugador3.setAsistencias(15);
        jugador3.setRebotes(35);
        jugadorRepository.save(jugador3);

        cal.set(1986, Calendar.NOVEMBER, 30);
        Date birthDate4=cal.getTime();

        Jugador jugador4 = new Jugador();
        jugador4.setName("Nocioni");
        jugador4.setPosicion("Ala-Pivot");
        jugador4.setNacimiento(birthDate4);
        jugador4.setCanastas(80);
        jugador4.setAsistencias(20);
        jugador4.setRebotes(40);
        jugadorRepository.save(jugador4);

        cal.set(1990, Calendar.JANUARY, 1);
        Date birthDate5=cal.getTime();

        Jugador jugador5 = new Jugador();
        jugador5.setName("Reyes");
        jugador5.setPosicion("Pivot");
        jugador5.setNacimiento(birthDate5);
        jugador5.setCanastas(50);
        jugador5.setAsistencias(15);
        jugador5.setRebotes(70);
        jugadorRepository.save(jugador5);

        cal.set(1988, Calendar.JANUARY, 1);

        System.out.println(jugadorRepository.findByNameContaining("Fel"));
        System.out.println(jugadorRepository.findByCanastasGreaterThan(25));
        System.out.println(jugadorRepository.findByAsistenciasBetween(30,40));
        System.out.println(jugadorRepository.findByPosicionIs("Alero"));
        System.out.println(jugadorRepository.findByNacimientoBefore(cal.getTime()));
        System.out.println(jugadorRepository.findByNacimientoBeforeAndCanastasGreaterThanEqual(cal.getTime(),45));
    }}

