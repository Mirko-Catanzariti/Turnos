package ar.com.turnos.controller;


import ar.com.turnos.entities.DiasHorariosTurnosProfesionales;
import ar.com.turnos.iservice.IDiasHorariosTurnosProfesionalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class DiasHorariosTurnosProfesionalesController {

    @Autowired
    IDiasHorariosTurnosProfesionalesService entityService;

    @GetMapping(path = "/diashorariosturnosprofesionales")
    public List<DiasHorariosTurnosProfesionales> getAll() {return entityService.getAll();}

    @GetMapping(path = "/diashorariosturnosprofesionales/{id}")
    public DiasHorariosTurnosProfesionales get(@PathVariable Long id)
    {return entityService.get(id);}


    @PostMapping(value = "/diashorariosturnosprofesionales", consumes = "application/json", produces = "application/json")
    public DiasHorariosTurnosProfesionales save(@RequestBody DiasHorariosTurnosProfesionales entity) {
        entityService.save(entity);
        return entity;
    }

    @GetMapping(path = "diashorariosturnosprofesionales/delete/{id}")
    public String delete(@PathVariable Long id) {
        DiasHorariosTurnosProfesionales entity = null;
        try {
            entity = entityService.get(id);
            entityService.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }


}
