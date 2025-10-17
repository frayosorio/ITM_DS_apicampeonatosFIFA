package campeonatosfifa.api.core.servicios;

import java.util.List;
import campeonatosfifa.api.dominio.entidades.*;

public interface ISeleccionServicio {

    public List<Seleccion> listar();

    public Seleccion obtener(int id);

    public List<Seleccion> buscar(String nombre);

    public Seleccion agregar(Seleccion seleccion);

    public Seleccion modificar(Seleccion seleccion);

    public boolean eliminar(int id);

}
