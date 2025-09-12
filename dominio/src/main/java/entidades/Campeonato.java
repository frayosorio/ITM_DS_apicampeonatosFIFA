package campeonatosfifa.api.dominio.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="campeonato")
public class Campeonato {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_campeonato")
    @SequenceGenerator(name="secuencia_campeonato", sequenceName = "secuencia_campeonato", allocationSize = 1)
    private int id;

    @Column(name = "campeonato", length=100, unique=true)
    private String nombre;

    @Column(name = "año")
    private int año;

    @ManyToOne
    @JoinColumn(name="idpais", referencedColumnName = "id")
    private Seleccion paisOrganizador;

    public Campeonato() {
    }

    public Campeonato(int id, String nombre, int año, Seleccion paisOrganizador) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.paisOrganizador = paisOrganizador;
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Seleccion getPaisOrganizador() {
        return paisOrganizador;
    }

    public void setPaisOrganizador(Seleccion paisOrganizador) {
        this.paisOrganizador = paisOrganizador;
    }

    

}
