package demo.Model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;
    @Column
    protected String nombre;


    @ManyToMany
    private Set<Equipo> equipos=new HashSet<>();

    public Temporada (){
    }

    public Temporada (String nombre) {
    this.nombre =nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }


    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", equipos=" + equipos +
                '}';
    }
}
