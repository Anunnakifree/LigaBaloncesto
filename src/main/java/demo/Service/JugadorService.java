package demo.Service;

import demo.Model.Equipo;
import demo.Model.Jugador;
import demo.Repository.EquipoRepository;
import demo.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;
    @Autowired
    private EquipoRepository equipoRepository;

    private Calendar cal = Calendar.getInstance();

    public void testJugador() {

        cal.set(1988, Calendar.JANUARY, 1);

        System.out.println(jugadorRepository.findByNameContaining("Fel"));
        System.out.println(jugadorRepository.findByCanastasGreaterThan(25));
        System.out.println(jugadorRepository.findByAsistenciasBetween(30, 40));
        System.out.println(jugadorRepository.findByPosicionIs("Alero"));
        System.out.println(jugadorRepository.findByNacimientoBefore(cal.getTime()));
        System.out.println(jugadorRepository.findByNacimientoBeforeAndCanastasGreaterThanEqual(cal.getTime(), 45));
    }


    public void createMadrid() {

        Equipo equipo1 = new Equipo();
        cal.set(1900, Calendar.JULY, 24);
        equipo1.setFundado(cal.getTime());
        equipo1.setNombre("R.Madrid");
        equipo1.setLocalidad("Madrid");
        equipoRepository.save(equipo1);


        cal.set(1995, Calendar.JANUARY, 1);
        Date birthDate = cal.getTime();
        Jugador jugador1 = new Jugador();
        jugador1.setName("Llull");
        jugador1.setPosicion("Base");
        jugador1.setNacimiento(birthDate);
        jugador1.setCanastas(65);
        jugador1.setAsistencias(50);
        jugador1.setRebotes(10);
        jugador1.setEquipo(equipoRepository.findByNombre("R.Madrid"));
        jugadorRepository.save(jugador1);


        cal.set(1990, Calendar.JULY, 21);
        Date birthDate2 = cal.getTime();
        Jugador jugador2 = new Jugador();
        jugador2.setName("Rudy");
        jugador2.setPosicion("Alero");
        jugador2.setNacimiento(birthDate2);
        jugador2.setCanastas(75);
        jugador2.setAsistencias(35);
        jugador2.setRebotes(25);
        jugador2.setEquipo(equipoRepository.findByNombre("R.Madrid"));
        jugadorRepository.save(jugador2);


        cal.set(1988, Calendar.MAY, 16);
        Date birthDate3 = cal.getTime();
        Jugador jugador3 = new Jugador();
        jugador3.setName("Maciulis");
        jugador3.setPosicion("Escolta");
        jugador3.setNacimiento(birthDate3);
        jugador3.setCanastas(30);
        jugador3.setAsistencias(15);
        jugador3.setRebotes(35);
        jugador3.setEquipo(equipoRepository.findByNombre("R.Madrid"));
        jugadorRepository.save(jugador3);


        cal.set(1986, Calendar.NOVEMBER, 30);
        Date birthDate4 = cal.getTime();
        Jugador jugador4 = new Jugador();
        jugador4.setName("Nocioni");
        jugador4.setPosicion("Ala-Pivot");
        jugador4.setNacimiento(birthDate4);
        jugador4.setCanastas(80);
        jugador4.setAsistencias(20);
        jugador4.setRebotes(40);
        jugador4.setEquipo(equipoRepository.findByNombre("R.Madrid"));
        jugadorRepository.save(jugador4);


        cal.set(1990, Calendar.JANUARY, 1);
        Date birthDate5 = cal.getTime();
        Jugador jugador5 = new Jugador();
        jugador5.setName("Reyes");
        jugador5.setPosicion("Pivot");
        jugador5.setNacimiento(birthDate5);
        jugador5.setCanastas(50);
        jugador5.setAsistencias(15);
        jugador5.setRebotes(70);
        jugador5.setEquipo(equipoRepository.findByNombre("R.Madrid"));
        jugadorRepository.save(jugador5);

    }

/*public void pruebaCache (){
        System.out.println("Devuelve correctamente");
        System.out.println(equipoRepository.findOne(2L));
    }*/

    public void createBarcelona() {

        Equipo equipo2 = new Equipo();
        cal.set(1923, Calendar.MAY, 11);
        equipo2.setNombre("F.C.Barcelona");
        equipo2.setLocalidad("Barcelona");
        equipo2.setFundado(cal.getTime());
        equipoRepository.save(equipo2);


        cal.set(1990, Calendar.JANUARY, 1);
        Date birthDate = cal.getTime();
        Jugador jugador1 = new Jugador();
        jugador1.setName("Ribas");
        jugador1.setPosicion("Base");
        jugador1.setNacimiento(birthDate);
        jugador1.setCanastas(55);
        jugador1.setAsistencias(40);
        jugador1.setRebotes(10);
        jugador1.setEquipo(equipoRepository.findByNombre("F.C.Barcelona"));
        jugadorRepository.save(jugador1);

        System.out.println(equipo2.getNombre());
        System.out.println(equipo2.getJugadores());

        System.out.println("conjunto jugadores vacio");
        System.out.println(equipoRepository.findOne(2L).getJugadores());

        cal.set(1978, Calendar.JULY, 11);
        Date birthDate2 = cal.getTime();
        Jugador jugador2 = new Jugador();
        jugador2.setName("Navarro");
        jugador2.setPosicion("Alero");
        jugador2.setNacimiento(birthDate2);
        jugador2.setCanastas(95);
        jugador2.setAsistencias(55);
        jugador2.setRebotes(15);
        jugador2.setEquipo(equipoRepository.findByNombre("F.C.Barcelona"));
        jugadorRepository.save(jugador2);


        cal.set(1988, Calendar.MARCH, 16);
        Date birthDate3 = cal.getTime();
        Jugador jugador3 = new Jugador();
        jugador3.setName("Abrines");
        jugador3.setPosicion("Escolta");
        jugador3.setNacimiento(birthDate3);
        jugador3.setCanastas(50);
        jugador3.setAsistencias(45);
        jugador3.setRebotes(18);
        jugador3.setEquipo(equipoRepository.findByNombre("F.C.Barcelona"));
        jugadorRepository.save(jugador3);


        cal.set(1986, Calendar.NOVEMBER, 7);
        Date birthDate4 = cal.getTime();
        Jugador jugador4 = new Jugador();
        jugador4.setName("Satoransky");
        jugador4.setPosicion("Ala-Pivot");
        jugador4.setNacimiento(birthDate4);
        jugador4.setCanastas(50);
        jugador4.setAsistencias(29);
        jugador4.setRebotes(55);
        jugador4.setEquipo(equipoRepository.findByNombre("F.C.Barcelona"));
        jugadorRepository.save(jugador4);


        cal.set(1976, Calendar.JUNE, 15);
        Date birthDate5 = cal.getTime();
        Jugador jugador5 = new Jugador();
        jugador5.setName("Tomic");
        jugador5.setPosicion("Pivot");
        jugador5.setNacimiento(birthDate5);
        jugador5.setCanastas(70);
        jugador5.setAsistencias(15);
        jugador5.setRebotes(84);
        jugador5.setEquipo(equipoRepository.findByNombre("F.C.Barcelona"));
        jugadorRepository.save(jugador5);

    }


    public void createBadalona() {

        Equipo equipo3 = new Equipo();
        cal.set(1940, Calendar.APRIL, 30);
        equipo3.setNombre("Juventud");
        equipo3.setLocalidad("Badalona");
        equipo3.setFundado(cal.getTime());
        equipoRepository.save(equipo3);


        cal.set(1985, Calendar.JANUARY, 15);
        Date birthDate = cal.getTime();
        Jugador jugador1 = new Jugador();
        jugador1.setName("Mallet");
        jugador1.setPosicion("Base");
        jugador1.setNacimiento(birthDate);
        jugador1.setCanastas(62);
        jugador1.setAsistencias(54);
        jugador1.setRebotes(16);
        jugador1.setEquipo(equipoRepository.findByNombre("Juventud"));
        jugadorRepository.save(jugador1);


        cal.set(1990, Calendar.JULY, 1);
        Date birthDate2 = cal.getTime();
        Jugador jugador2 = new Jugador();
        jugador2.setName("Sergi");
        jugador2.setPosicion("Alero");
        jugador2.setNacimiento(birthDate2);
        jugador2.setCanastas(65);
        jugador2.setAsistencias(25);
        jugador2.setRebotes(12);
        jugador2.setEquipo(equipoRepository.findByNombre("Juventud"));
        jugadorRepository.save(jugador2);


        cal.set(1983, Calendar.MAY, 16);
        Date birthDate3 = cal.getTime();
        Jugador jugador3 = new Jugador();
        jugador3.setName("Goran");
        jugador3.setPosicion("Escolta");
        jugador3.setNacimiento(birthDate3);
        jugador3.setCanastas(30);
        jugador3.setAsistencias(15);
        jugador3.setRebotes(35);
        jugador3.setEquipo(equipoRepository.findByNombre("Juventud"));
        jugadorRepository.save(jugador3);


        cal.set(1986, Calendar.NOVEMBER, 20);
        Date birthDate4 = cal.getTime();
        Jugador jugador4 = new Jugador();
        jugador4.setName("Alberto");
        jugador4.setPosicion("Ala-Pivot");
        jugador4.setNacimiento(birthDate4);
        jugador4.setCanastas(50);
        jugador4.setAsistencias(20);
        jugador4.setRebotes(20);
        jugador4.setEquipo(equipoRepository.findByNombre("Juventud"));
        jugadorRepository.save(jugador4);


        cal.set(1990, Calendar.JANUARY, 1);
        Date birthDate5 = cal.getTime();
        Jugador jugador5 = new Jugador();
        jugador5.setName("Ousmane");
        jugador5.setPosicion("Pivot");
        jugador5.setNacimiento(birthDate5);
        jugador5.setCanastas(55);
        jugador5.setAsistencias(15);
        jugador5.setRebotes(48);
        jugador5.setEquipo(equipoRepository.findByNombre("Juventud"));
        jugadorRepository.save(jugador5);


    }

    public void createZaragoza() {

        Equipo equipo4 = new Equipo();
        cal.set(1890, Calendar.SEPTEMBER, 26);
        equipo4.setNombre("CAI Zaragoza");
        equipo4.setLocalidad("Zaragoza");
        equipo4.setFundado(cal.getTime());
        equipoRepository.save(equipo4);


        Calendar cal = Calendar.getInstance();
        cal.set(1995, Calendar.JANUARY, 1);
        Date birthDate = cal.getTime();
        Jugador jugador1 = new Jugador();
        jugador1.setName("Nate");
        jugador1.setPosicion("Base");
        jugador1.setNacimiento(birthDate);
        jugador1.setCanastas(65);
        jugador1.setAsistencias(50);
        jugador1.setRebotes(10);
        jugador1.setEquipo(equipoRepository.findByNombre("CAI Zaragoza"));
        jugadorRepository.save(jugador1);


        cal.set(1990, Calendar.JULY, 21);
        Date birthDate2 = cal.getTime();
        Jugador jugador2 = new Jugador();
        jugador2.setName("Pedro");
        jugador2.setPosicion("Alero");
        jugador2.setNacimiento(birthDate2);
        jugador2.setCanastas(75);
        jugador2.setAsistencias(35);
        jugador2.setRebotes(25);
        jugador2.setEquipo(equipoRepository.findByNombre("CAI Zaragoza"));
        jugadorRepository.save(jugador2);


        cal.set(1988, Calendar.MAY, 16);
        Date birthDate3 = cal.getTime();
        Jugador jugador3 = new Jugador();
        jugador3.setName("Drake");
        jugador3.setPosicion("Escolta");
        jugador3.setNacimiento(birthDate3);
        jugador3.setCanastas(30);
        jugador3.setAsistencias(15);
        jugador3.setRebotes(35);
        jugador3.setEquipo(equipoRepository.findByNombre("CAI Zaragoza"));
        jugadorRepository.save(jugador3);


        cal.set(1986, Calendar.NOVEMBER, 30);
        Date birthDate4 = cal.getTime();
        Jugador jugador4 = new Jugador();
        jugador4.setName("Kanacevic");
        jugador4.setPosicion("Ala-Pivot");
        jugador4.setNacimiento(birthDate4);
        jugador4.setCanastas(80);
        jugador4.setAsistencias(20);
        jugador4.setRebotes(40);
        jugador4.setEquipo(equipoRepository.findByNombre("CAI Zaragoza"));
        jugadorRepository.save(jugador4);


        cal.set(1990, Calendar.JANUARY, 1);
        Date birthDate5 = cal.getTime();
        Jugador jugador5 = new Jugador();
        jugador5.setName("Fotu");
        jugador5.setPosicion("Pivot");
        jugador5.setNacimiento(birthDate5);
        jugador5.setCanastas(50);
        jugador5.setAsistencias(15);
        jugador5.setRebotes(70);
        jugador5.setEquipo(equipoRepository.findByNombre("CAI Zaragoza"));
        jugadorRepository.save(jugador5);

    }


    public void createValencia() {

        Equipo equipo5 = new Equipo();
        cal.set(1966, Calendar.NOVEMBER, 9);
        equipo5.setNombre("Basket Valencia");
        equipo5.setLocalidad("Valencia");
        equipo5.setFundado(cal.getTime());
        equipoRepository.save(equipo5);


        Calendar cal = Calendar.getInstance();
        cal.set(1995, Calendar.JANUARY, 1);
        Date birthDate = cal.getTime();
        Jugador jugador1 = new Jugador();
        jugador1.setName("Stefansson");
        jugador1.setPosicion("Base");
        jugador1.setNacimiento(birthDate);
        jugador1.setCanastas(65);
        jugador1.setAsistencias(50);
        jugador1.setRebotes(10);
        jugador1.setEquipo(equipoRepository.findByNombre("Basket Valencia"));
        jugadorRepository.save(jugador1);


        cal.set(1990, Calendar.JULY, 21);
        Date birthDate2 = cal.getTime();
        Jugador jugador2 = new Jugador();
        jugador2.setName("Sato");
        jugador2.setPosicion("Alero");
        jugador2.setNacimiento(birthDate2);
        jugador2.setCanastas(75);
        jugador2.setAsistencias(35);
        jugador2.setRebotes(25);
        jugador2.setEquipo(equipoRepository.findByNombre("Basket Valencia"));
        jugadorRepository.save(jugador2);


        cal.set(1988, Calendar.MAY, 16);
        Date birthDate3 = cal.getTime();
        Jugador jugador3 = new Jugador();
        jugador3.setName("Raúl");
        jugador3.setPosicion("Escolta");
        jugador3.setNacimiento(birthDate3);
        jugador3.setCanastas(30);
        jugador3.setAsistencias(15);
        jugador3.setRebotes(35);
        jugador3.setEquipo(equipoRepository.findByNombre("Basket Valencia"));
        jugadorRepository.save(jugador3);


        cal.set(1986, Calendar.NOVEMBER, 30);
        Date birthDate4 = cal.getTime();
        Jugador jugador4 = new Jugador();
        jugador4.setName("San Emeterio");
        jugador4.setPosicion("Ala-Pivot");
        jugador4.setNacimiento(birthDate4);
        jugador4.setCanastas(80);
        jugador4.setAsistencias(20);
        jugador4.setRebotes(40);
        jugador4.setEquipo(equipoRepository.findByNombre("Basket Valencia"));
        jugadorRepository.save(jugador4);


        cal.set(1990, Calendar.JANUARY, 1);
        Date birthDate5 = cal.getTime();
        Jugador jugador5 = new Jugador();
        jugador5.setName("Hamilton");
        jugador5.setPosicion("Pivot");
        jugador5.setNacimiento(birthDate5);
        jugador5.setCanastas(50);
        jugador5.setAsistencias(15);
        jugador5.setRebotes(70);
        jugador5.setEquipo(equipoRepository.findByNombre("Basket Valencia"));
        jugadorRepository.save(jugador5);

    }
}

