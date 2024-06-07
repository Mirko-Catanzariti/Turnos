package ar.com.turnos.service;

import ar.com.turnos.dao.IDiasHorariosTurnosDao;
import ar.com.turnos.entities.DiasHorariosTurnos;
import ar.com.turnos.iservice.IDiasHorariosTurnosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DiasHorariosTurnosService implements IDiasHorariosTurnosService {

    @Autowired
    private IDiasHorariosTurnosDao entityDao;

    public List<DiasHorariosTurnos> getAll()
    { return entityDao.findAll(Sort.by(Sort.Direction.ASC,"id"));
    }


    public DiasHorariosTurnos get(Long id) {
        return entityDao.findById(id).orElse(null);
    }


    // Generacion del id de forma manual
    // cada vez que pase el mismo id no lo duplica, lo actualiza
    @Transactional
    public void save(DiasHorariosTurnos entity) {
        entity.setId(Long.parseLong(entity.getDia().getId().toString()+entity.getHorario().getId().toString()));
        entityDao.save(entity);
    }

    @Transactional
    public String delete(DiasHorariosTurnos entity) {
        try {
            entityDao.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
