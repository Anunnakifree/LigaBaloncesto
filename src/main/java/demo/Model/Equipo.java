package demo.Model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
   protected Long id;
    @Column
    protected String nombre;
    @Column
    private String localidad;
    @Column
    private Date fundado;

    @ManyToMany(mappedBy = "equipos")
    private Set<Temporada> temporadas = new HashSet<>();

    @OneToMany (mappedBy = "equipo")
    private Set<Jugador> jugadores = new HashSet<>();

    public Equipo (){

    }

    public Equipo (String nombre, String localidad,Date fundado) {

        this.nombre = nombre;
        this.localidad = localidad;
        this.fundado = fundado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Date getFundado() {
        return fundado;
    }

    public void setFundado(Date fundado) {
        this.fundado = fundado;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fundado=" + fundado +
                '}';
    }
}

