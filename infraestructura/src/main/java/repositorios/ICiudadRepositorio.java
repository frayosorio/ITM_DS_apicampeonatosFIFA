package campeonatosfifa.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import campeonatosfifa.api.dominio.entidades.*;

import java.util.List;

@Repository
public interface ICiudadRepositorio extends JpaRepository<Ciudad, Integer> {

    @Query("SELECT c FROM Ciudad c WHERE c.nombre LIKE '%' || ?1|| '%' ORDER BY c.nombre ASC")
    public List<Ciudad> buscar(String nombre);

}
