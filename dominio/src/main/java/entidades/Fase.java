package campeonatosfifa.api.dominio.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "fase")
public class Fase {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_fase")
    @SequenceGenerator(name="secuencia_fase", sequenceName = "secuencia_fase", allocationSize = 1)
    private int id;

    @Column(name = "fase", unique=true)
    private String nombre;

    public Fase() {
    }


    public Fase(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
