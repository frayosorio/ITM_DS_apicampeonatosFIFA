package campeonatosfifa.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import campeonatosfifa.api.dominio.entidades.*;

import java.util.List;

@Repository
public interface IEncuentroRepositorio extends JpaRepository<Encuentro, Integer> {

    @Query("SELECT e FROM Encuentro e WHERE e.campeonato.id=:idCampeonato ORDER BY f.fecha ASC")
    public List<Encuentro> listarPorCampeonato(int idCampeonato);

    @Query("SELECT e FROM Encuentro e WHERE e.campeonato.id=:idCampeonato AND e.fase.id=:idFase ORDER BY f.fecha ASC")
    public List<Encuentro> listarPorCampeonatoYFase(int idCampeonato, int idFase);

    @Query("SELECT e FROM Encuentro e" +
            " JOIN Grupo g ON e.campeonato.id = g.campeonato.id" +
            " JOIN GrupoPais gp ON g.id = gp.grupo.id" +
            " AND (gp.seleccion.id = e.seleccion1.id OR gp.seleccion.id = e.seleccion2.id)"+
            " WHERE g.id = :idGrupo")
    public List<Encuentro> listarPorGrupo(int idGrupo);

}