package ar.com.turnos.service;


import ar.com.turnos.dao.IPacientesDao;
import ar.com.turnos.entities.Pacientes;
import ar.com.turnos.iservice.IPacientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacientesService implements IPacientesService {

    @Autowired
    private IPacientesDao entityDao;
    public List<Pacientes> getAll() {
        return entityDao.findAll(Sort.by(Sort.Direction.ASC,"name"));
    }

    public List<Pacientes> findByApellido(String name) {
        return entityDao.findByApellido("%" + name + "%");
    }

    public Pacientes get(Integer id) {
        return entityDao.findById(id).orElse(null);
    }

    public void save(Pacientes entity) {
        entityDao.save(entity);
    }

    public String delete(Pacientes entity) {
        try {
            entityDao.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
