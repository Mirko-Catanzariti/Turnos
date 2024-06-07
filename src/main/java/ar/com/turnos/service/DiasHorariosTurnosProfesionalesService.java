package ar.com.turnos.service;

import ar.com.turnos.dao.IDiasHorariosTurnosProfesionalesDao;
import ar.com.turnos.entities.DiasHorariosTurnosProfesionales;
import ar.com.turnos.iservice.IDiasHorariosTurnosProfesionalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DiasHorariosTurnosProfesionalesService implements IDiasHorariosTurnosProfesionalesService {

    @Autowired
    private IDiasHorariosTurnosProfesionalesDao entityDao;

    public List<DiasHorariosTurnosProfesionales> getAll()
    { return entityDao.findAll(Sort.by(Sort.Direction.ASC,"id"));
    }


    public DiasHorariosTurnosProfesionales get(Long id) {
        return entityDao.findById(id).orElse(null);
    }


    // Generacion del id de forma manual
    // cada vez que pase el mismo id no lo duplica, lo actualiza
    @Transactional
    public void save(DiasHorariosTurnosProfesionales entity) {
        entity.setId(Long.parseLong(entity.getDia().getId().toString()+entity.getHorario().getId().toString()));
        entityDao.save(entity);
    }

    @Transactional
    public String delete(DiasHorariosTurnosProfesionales entity) {
        try {
            entityDao.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
