package demo.Model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;
    @Column
    protected String name;
    @Column
    private Date nacimiento;
    @Column
    private int canastas;
    @Column
    private int asistencias;
    @Column
    private int rebotes;
    @Column
    private String posicion;

    @ManyToOne
    private Equipo equipo;

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Jugador() {
    }

    public Jugador(String name, Date nacimiento, String posicion, int canastas, int asistencias, int rebotes) {


        this.name = name;
        this.nacimiento = nacimiento;
        this.posicion = posicion;
        this.canastas = canastas;
        this.asistencias = asistencias;
        this.rebotes = rebotes;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getCanastas() {
        return canastas;
    }

    public void setCanastas(int canastas) {
        this.canastas = canastas;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }



    @Override
    public String toString() { //Solo atributos simples, NO los asociados o provocas bucle infinito
        return "Jugador{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nacimiento=" + nacimiento +
                ", canastas=" + canastas +
                ", asistencias=" + asistencias +
                ", rebotes=" + rebotes +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}

