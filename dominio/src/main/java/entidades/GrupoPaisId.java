package campeonatosfifa.api.dominio.entidades;

public class GrupoPaisId {

    private int seleccion;
    private int grupo;

    public GrupoPaisId() {
    }

    public GrupoPaisId(int seleccion, int grupo) {
        this.seleccion = seleccion;
        this.grupo = grupo;
    }

    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }



}
