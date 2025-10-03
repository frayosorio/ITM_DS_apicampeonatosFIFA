package campeonatosfifa.api.aplicacion.servicios;

import org.springframework.stereotype.Service;

import java.util.List;
import campeonatosfifa.api.dominio.entidades.*;
import campeonatosfifa.api.core.servicios.*;
import campeonatosfifa.api.infraestructura.repositorios.*;

@Service
public class CampeonatoServicio implements ICampeonatoServicio {

    private ICampeonatoRepositorio repositorio;

    public CampeonatoServicio(ICampeonatoRepositorio repositorio){
        this.repositorio=repositorio;
    }

    @Override
    public List<Campeonato> listar(){
       return repositorio.findAll();
    }

    @Override
    public Campeonato obtener(int id){
        var campeonatoEncontrado=repositorio.findById(id);
        return campeonatoEncontrado.isEmpty() ? null:campeonatoEncontrado.get();
    }

    @Override
    public List<Campeonato> buscar(String nombre){
        return repositorio.buscar(nombre);
    }

    @Override
    public Campeonato agregar(Campeonato campeonato){
        campeonato.setId(0);
        return repositorio.save(campeonato);
    }

    @Override
    public Campeonato modificar(Campeonato campeonato){
        if(repositorio.findById(campeonato.getId()).isEmpty())
            return null;
        return repositorio.save(campeonato);
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

