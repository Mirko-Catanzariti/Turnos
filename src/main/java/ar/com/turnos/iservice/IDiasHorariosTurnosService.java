package ar.com.turnos.iservice;

import ar.com.turnos.entities.DiasHorariosTurnos;

import java.util.List;

public interface IDiasHorariosTurnosService {
        List<DiasHorariosTurnos> getAll();
        DiasHorariosTurnos get(Long id);
        void save(DiasHorariosTurnos entity);
        String delete(DiasHorariosTurnos entity);

}
