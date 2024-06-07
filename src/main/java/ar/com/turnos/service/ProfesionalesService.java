package ar.com.turnos.service;


import ar.com.turnos.dao.IProfesionalesDao;
import ar.com.turnos.entities.Profesionales;
import ar.com.turnos.iservice.IProfesionalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesionalesService implements IProfesionalesService {

    @Autowired
    private IProfesionalesDao entityDao;
    public List<Profesionales> getAll() {
        return entityDao.findAll(Sort.by(Sort.Direction.ASC,"name"));
    }

    public List<Profesionales> findByApellido(String name) {
        return entityDao.findByApellido("%" + name + "%");
    }

    public Profesionales get(Integer id) {
        return entityDao.findById(id).orElse(null);
    }

    public void save(Profesionales entity) {
        entityDao.save(entity);
    }

    public String delete(Profesionales entity) {
        try {
            entityDao.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
