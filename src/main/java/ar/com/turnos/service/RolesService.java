package ar.com.turnos.service;

import ar.com.turnos.iservice.IRolesService;
import ar.com.turnos.dao.IRolesDao;
import ar.com.turnos.entities.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RolesService implements IRolesService {

    @Autowired
    private IRolesDao entityDao;

    public List<Roles> getAll()
    { return entityDao.findAll(Sort.by(Sort.Direction.ASC,"descrip"));
    }

    public List<Roles> findByDescrip(String descrip)
    { return entityDao.findByDescrip("%" + descrip + "%");
    }

    public Roles get(Integer id) {
        return entityDao.findById(id).orElse(null);
    }

    @Transactional
    public void save(Roles entity) {
        entityDao.save(entity);
    }

    @Transactional
    public String delete(Roles entity) {
        try {
            entityDao.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
