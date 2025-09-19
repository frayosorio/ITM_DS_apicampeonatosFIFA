package campeonatosfifa.api.dominio.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "grupo")
public class Grupo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_grupo")
    @SequenceGenerator(name = "secuencia_grupo", sequenceName = "secuencia_grupo", allocationSize = 1)
    private int id;

    @Column(name = "grupo", length = 10, unique = true)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idcampeonato", referencedColumnName = "id")
    private Campeonato campeonato;

    public Grupo() {
    }

    public Grupo(int id, String nombre, Campeonato campeonato) {
        this.id = id;
        this.nombre = nombre;
        this.campeonato = campeonato;
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

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    

}
