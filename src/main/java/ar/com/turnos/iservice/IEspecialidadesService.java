package ar.com.turnos.iservice;

import ar.com.turnos.entities.Especialidades;

import java.util.List;

public interface IEspecialidadesService {
        List<Especialidades> getAll();
        List<Especialidades> findByDescrip(String descrip);
        Especialidades get(Integer id);
        void save(Especialidades entity);
        String delete(Especialidades entity);

}
