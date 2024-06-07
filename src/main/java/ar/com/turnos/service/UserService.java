package ar.com.turnos.service;


import ar.com.turnos.iservice.IUserService;
import ar.com.turnos.dao.IUserDao;
import ar.com.turnos.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao entityDao;
    public List<User> getAll() {
        return entityDao.findAll(Sort.by(Sort.Direction.ASC,"usuario"));
    }

    public List<User> findByUsuario(String usuario) {
        return entityDao.findByUsuario("%" + usuario + "%");
    }

    public User get(Integer id) {
        return entityDao.findById(id).orElse(null);
    }

    public void save(User entity) {
        entityDao.save(entity);
    }

    public String delete(User entity) {
        try {
            entityDao.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
