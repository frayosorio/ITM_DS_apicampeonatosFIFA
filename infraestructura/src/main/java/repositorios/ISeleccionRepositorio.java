package campeonatosfifa.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import campeonatosfifa.api.dominio.entidades.*;

import java.util.List;

@Repository
public interface ISeleccionRepositorio extends JpaRepository<Seleccion, Integer> {

    @Query("SELECT s FROM Seleccion s WHERE s.nombre LIKE '%' || :nombre || '%' ORDER BY s.nombre ASC")
    public List<Seleccion> buscar(String nombre);

}
