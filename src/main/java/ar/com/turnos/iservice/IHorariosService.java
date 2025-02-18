package ar.com.turnos.iservice;

import ar.com.turnos.entities.Horarios;

import java.util.List;

public interface IHorariosService {
        List<Horarios> getAll();
        List<Horarios> findByDescrip(String descrip);
        Horarios get(Integer id);
        void save(Horarios entity);
        String delete(Horarios entity);

}
