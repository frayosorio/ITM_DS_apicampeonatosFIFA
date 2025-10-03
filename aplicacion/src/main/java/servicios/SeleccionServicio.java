package campeonatosfifa.api.aplicacion.servicios;

import org.springframework.stereotype.Service;

import java.util.List;
import campeonatosfifa.api.dominio.entidades.*;
import campeonatosfifa.api.core.servicios.*;
import campeonatosfifa.api.infraestructura.repositorios.*;

@Service
public class SeleccionServicio implements ISeleccionServicio {

    private ISeleccionRepositorio repositorio;

    public SeleccionServicio(ISeleccionRepositorio repositorio){
        this.repositorio=repositorio;
    }

    @Override
    public List<Seleccion> listar(){
       return repositorio.findAll();
    }

    @Override
    public Seleccion obtener(int id){
        var seleccionEncontrada=repositorio.findById(id);
        return seleccionEncontrada.isEmpty() ? null:seleccionEncontrada.get();
    }

    @Override
    public List<Seleccion> buscar(String nombre){
        return repositorio.buscar(nombre);
    }

    @Override
    public Seleccion agregar(Seleccion seleccion){
        seleccion.setId(0);
        return repositorio.save(seleccion);
    }

    @Override
    public Seleccion modificar(Seleccion seleccion){
        if(repositorio.findById(seleccion.getId()).isEmpty())
            return null;
        return repositorio.save(seleccion);
    }

    @Override
    public boolean eliminar(int id){
        try{
            repositorio.deleteById(id);
            return true;
        }
        catch(Exception ex){
            System.out.println(ex);
            return false;
        }
    }

}
