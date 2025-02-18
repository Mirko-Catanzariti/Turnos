package ar.com.turnos.service;

import ar.com.turnos.dao.IHorariosDao;
import ar.com.turnos.entities.Horarios;
import ar.com.turnos.iservice.IHorariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HorariosService implements IHorariosService {

    @Autowired
    private IHorariosDao entityDao;

    public List<Horarios> getAll()
    { return entityDao.findAll(Sort.by(Sort.Direction.ASC,"descrip"));
    }

    public List<Horarios> findByDescrip(String descrip)
    { return entityDao.findByDescrip("%" + descrip + "%");
    }

    public Horarios get(Integer id) {
        return entityDao.findById(id).orElse(null);
    }

    @Transactional
    public void save(Horarios entity) {
        entityDao.save(entity);
    }

    @Transactional
    public String delete(Horarios entity) {
        try {
            entityDao.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
