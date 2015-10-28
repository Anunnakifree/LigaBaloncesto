package demo;

import demo.Service.EquipoService;
import demo.Service.JugadorService;
import demo.Service.LigaService;
import demo.Service.TemporadaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LigaBaloncestoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LigaBaloncestoApplication.class, args);

        JugadorService jugadorService = context.getBean(JugadorService.class);
        jugadorService.testJugador();
        EquipoService equipoService = context.getBean (EquipoService.class);
        equipoService.createEquipos();
        LigaService ligaService = context.getBean (LigaService.class);
        ligaService.enlaceLiga();
        TemporadaService temporadaService = context.getBean (TemporadaService.class);
        equipoService.consLiga();

    }
}
