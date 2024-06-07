package ar.com.turnos.dao;

import ar.com.turnos.entities.Dias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDiasDao extends JpaRepository<Dias, Integer> {
    @Query("select c from Dias c where c.descrip like ?1")
    public List<Dias> findByDescrip(String name);
}
