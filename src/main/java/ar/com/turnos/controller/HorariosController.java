package ar.com.turnos.controller;


import ar.com.turnos.entities.Horarios;
import ar.com.turnos.iservice.IHorariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class HorariosController {

    @Autowired
    IHorariosService entityService;

    @GetMapping(path = "/Horarios")
    public List<Horarios> getAll() {return entityService.getAll();}

    @GetMapping(path = "/Horarios/{id}")
    public Horarios get(@PathVariable Integer id)
    {return entityService.get(id);}

    @GetMapping(path = "/Horarios/search/{expresion}")
    public List<Horarios> getListHorarios(@PathVariable String expresion)
    {return entityService.findByDescrip(expresion);}

    @PostMapping(value = "/Horarios", consumes = "application/json", produces = "application/json")
    public Horarios save(@RequestBody Horarios entity) {
        entityService.save(entity);
        return entity;
    }

    @GetMapping(path = "Horarios/delete/{id}")
    public String delete(@PathVariable Integer id) {
        Horarios entity = null;
        try {
            entity = entityService.get(id);
            entityService.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }


}
