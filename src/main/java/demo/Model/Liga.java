package demo.Model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Liga {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;
    @Column
    protected String nombre;


    public Liga() {

    }

    public Liga(String nombre) {

        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Liga{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}