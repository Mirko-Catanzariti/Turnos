package ar.com.turnos.iservice;

import ar.com.turnos.entities.Profesionales;

import java.util.List;

public interface IProfesionalesService {
    List<Profesionales> getAll();
    List<Profesionales> findByApellido (String name);

    Profesionales get(Integer id);
    void save (Profesionales entity);
    String delete(Profesionales entity);


}
