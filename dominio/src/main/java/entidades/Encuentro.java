package campeonatosfifa.api.dominio.entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "encuentro")
public class Encuentro {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_encuentro")
    @SequenceGenerator(name = "secuencia_encuentro", sequenceName = "secuencia_encuentro", allocationSize = 1)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idpais1", referencedColumnName = "id")
    private Seleccion seleccion1;

    @ManyToOne
    @JoinColumn(name = "idpais2", referencedColumnName = "id")
    private Seleccion seleccion2;

    @ManyToOne
    @JoinColumn(name = "idfase", referencedColumnName = "id")
    private Fase fase;

    @ManyToOne
    @JoinColumn(name = "idcampeonato", referencedColumnName = "id")
    private Campeonato campeonato;

    @ManyToOne
    @JoinColumn(name = "idestadio", referencedColumnName = "id", nullable = false)
    private Estadio estadio;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "goles1")
    private Integer goles1;

    @Column(name = "goles2")
    private Integer goles2;

    @Column(name = "penales1")
    private Integer penales1;

    @Column(name = "penales2")
    private Integer penales2;

    public Encuentro() {
    }

    

    public Encuentro(int id, Seleccion seleccion1, Seleccion seleccion2, Fase fase, Campeonato campeonato,
            Estadio estadio, Date fecha, Integer goles1, Integer goles2, Integer penales1, Integer penales2) {
        this.id = id;
        this.seleccion1 = seleccion1;
        this.seleccion2 = seleccion2;
        this.fase = fase;
        this.campeonato = campeonato;
        this.estadio = estadio;
        this.fecha = fecha;
        this.goles1 = goles1;
        this.goles2 = goles2;
        this.penales1 = penales1;
        this.penales2 = penales2;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Seleccion getSeleccion1() {
        return seleccion1;
    }



    public void setSeleccion1(Seleccion seleccion1) {
        this.seleccion1 = seleccion1;
    }



    public Seleccion getSeleccion2() {
        return seleccion2;
    }



    public void setSeleccion2(Seleccion seleccion2) {
        this.seleccion2 = seleccion2;
    }



    public Fase getFase() {
        return fase;
    }



    public void setFase(Fase fase) {
        this.fase = fase;
    }



    public Campeonato getCampeonato() {
        return campeonato;
    }



    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }



    public Estadio getEstadio() {
        return estadio;
    }



    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }



    public Date getFecha() {
        return fecha;
    }



    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }



    public Integer getGoles1() {
        return goles1;
    }



    public void setGoles1(Integer goles1) {
        this.goles1 = goles1;
    }



    public Integer getGoles2() {
        return goles2;
    }



    public void setGoles2(Integer goles2) {
        this.goles2 = goles2;
    }



    public Integer getPenales1() {
        return penales1;
    }



    public void setPenales1(Integer penales1) {
        this.penales1 = penales1;
    }



    public Integer getPenales2() {
        return penales2;
    }



    public void setPenales2(Integer penales2) {
        this.penales2 = penales2;
    }

    
}
