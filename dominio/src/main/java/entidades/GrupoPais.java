package campeonatosfifa.api.dominio.entidades;

import jakarta.persistence.*;

@Entity
@IdClass(GrupoPaisId.class)
@Table(name = "grupopais")
public class GrupoPais {

    @Id
    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Seleccion seleccion;

    @Id
    @ManyToOne
    @JoinColumn(name = "idgrupo", referencedColumnName = "id")
    private Grupo grupo;

    public GrupoPais() {
    }

    public GrupoPais(Seleccion seleccion, Grupo grupo) {
        this.seleccion = seleccion;
        this.grupo = grupo;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    

}
