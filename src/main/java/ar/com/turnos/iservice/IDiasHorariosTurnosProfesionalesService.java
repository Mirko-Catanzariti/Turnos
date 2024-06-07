package ar.com.turnos.iservice;

import ar.com.turnos.entities.DiasHorariosTurnosProfesionales;

import java.util.List;

public interface IDiasHorariosTurnosProfesionalesService {
        List<DiasHorariosTurnosProfesionales> getAll();
        DiasHorariosTurnosProfesionales get(Long id);
        void save(DiasHorariosTurnosProfesionales entity);
        String delete(DiasHorariosTurnosProfesionales entity);

}
