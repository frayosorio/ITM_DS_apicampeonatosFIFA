package campeonatosfifa.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import campeonatosfifa.api.dominio.entidades.*;

import java.util.List;

@Repository
public interface IFaseRepositorio extends JpaRepository<Fase, Integer> {

    @Query("SELECT f FROM Fase f WHERE f.nombre LIKE '%' || ?1|| '%' ORDER BY f.nombre ASC")
    public List<Fase> buscar(String nombre);

}