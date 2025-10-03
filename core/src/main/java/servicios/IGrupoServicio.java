package campeonatosfifa.api.core.servicios;

import java.util.List;
import campeonatosfifa.api.dominio.entidades.*;
import campeonatosfifa.api.dominio.dtos.*;

public interface IGrupoServicio {

    public List<Grupo> listarCampeonato(int idCampeonato);

    public Grupo obtener(int id);

    public List<Grupo> buscar(int idCampeonato, String nombre);

    public Grupo agregar(Grupo Grupo);

    public Grupo modificion(Grupo Grupo);

    public boolean eliminar(int id);

    /***** Países del Grupo *****/

     public List<GrupoPais> listarPaises(int idGrupo);

    public GrupoPais obtenerPais(int idGrupo, int idPais);

    public GrupoPais agregarPais(GrupoPais grupoPais);

    public GrupoPais modificarPais(GrupoPais grupoPais);

    public boolean eliminarPais(int idGrupo, int idPais);

    /***** Tabla Posiciones *****/

    public List<TablaPosicionDto> listarTablaPosiciones(int idGrupo);

}
