package campeonatosfifa.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import campeonatosfifa.api.dominio.entidades.*;

import java.util.List;

@Repository
public interface IGrupoRepositorio extends JpaRepository<Grupo, Integer> {

    @Query("SELECT g FROM Grupo g WHERE g.nombre LIKE '%' || :nombre || '%' AND g.campeonato.id=:idCampeonato") // JPQL
    public List<Grupo> buscar(int idCampeonato, String nombre);

    @Query("SELECT g FROM Grupo g WHERE g.campeonato.id=:idCampeonato") // JPQL
    public List<Grupo> listarCampeonato(int idCampeonato);

}