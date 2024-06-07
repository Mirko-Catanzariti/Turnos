package ar.com.turnos.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Turnos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private LocalDate fecha;
    private Boolean estado;

    @JoinColumn(name = "fk_diashorariosturnos", referencedColumnName = "id", nullable = false)
    @ManyToOne

    private DiasHorariosTurnos diahorarioturnos;

    @JoinColumn(name = "fk_profesionales", referencedColumnName = "id", nullable = false)
    @ManyToOne

    private Profesionales profesionales;

    @JoinColumn(name = "fk_pacientes", referencedColumnName = "id", nullable = false)
    @ManyToOne

    private Pacientes pacientes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public DiasHorariosTurnos getDiahorarioturnos() {
        return diahorarioturnos;
    }

    public void setDiahorarioturnos(DiasHorariosTurnos diahorarioturnos) {
        this.diahorarioturnos = diahorarioturnos;
    }

    public Profesionales getProfesionales() {
        return profesionales;
    }

    public void setProfesionales(Profesionales profesionales) {
        this.profesionales = profesionales;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }
}
