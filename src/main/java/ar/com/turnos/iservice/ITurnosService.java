package ar.com.turnos.iservice;

import ar.com.turnos.entities.Turnos;

import java.util.List;

public interface ITurnosService {
        List<Turnos> getAll();
        Turnos get(String id);
        void save(Turnos entity);
        String delete(Turnos entity);

}
