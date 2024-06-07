package ar.com.turnos.dao;

import ar.com.turnos.entities.Turnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnosDao extends JpaRepository<Turnos, String> {

}
