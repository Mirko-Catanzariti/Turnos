package ar.com.turnos.iservice;

import ar.com.turnos.entities.Pacientes;

import java.util.List;

public interface IPacientesService {
    List<Pacientes> getAll();
    List<Pacientes> findByApellido (String name);

    Pacientes get(Integer id);
    void save (Pacientes entity);
    String delete(Pacientes entity);


}
