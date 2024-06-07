package ar.com.turnos.service;

import ar.com.turnos.dao.IEspecialidadesDao;
import ar.com.turnos.entities.Especialidades;
import ar.com.turnos.iservice.IEspecialidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EspecialidadesService implements IEspecialidadesService {

    @Autowired
    private IEspecialidadesDao entityDao;

    public List<Especialidades> getAll()
    { return entityDao.findAll(Sort.by(Sort.Direction.ASC,"descrip"));
    }

    public List<Especialidades> findByDescrip(String descrip)
    { return entityDao.findByDescrip("%" + descrip + "%");
    }

    public Especialidades get(Integer id) {
        return entityDao.findById(id).orElse(null);
    }

    @Transactional
    public void save(Especialidades entity) {
        entityDao.save(entity);
    }

    @Transactional
    public String delete(Especialidades entity) {
        try {
            entityDao.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
