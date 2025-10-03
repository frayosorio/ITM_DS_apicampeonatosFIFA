package campeonatosfifa.api.dominio.entidades;

public class GrupoPaisId {

    private int seleccion;
    private int pais;

    public GrupoPaisId() {
    }

    public GrupoPaisId(int seleccion, int pais) {
        this.seleccion = seleccion;
        this.pais = pais;
    }

    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

}
