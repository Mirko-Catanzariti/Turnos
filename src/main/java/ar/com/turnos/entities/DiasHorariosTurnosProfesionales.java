package ar.com.turnos.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class DiasHorariosTurnosProfesionales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;

    private Boolean estado;

    @JoinColumn(name = "fk_profesional", referencedColumnName = "id")
    @ManyToOne

    private Profesionales profesional;

    @JoinColumn(name = "fk_dia", referencedColumnName = "id")
    @ManyToOne

    private Dias dia;

    @JoinColumn(name = "fk_horario", referencedColumnName = "id")
    @ManyToOne

    private Horarios horario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Profesionales getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesionales profesional) {
        this.profesional = profesional;
    }

    public Dias getDia() {
        return dia;
    }

    public void setDia(Dias dia) {
        this.dia = dia;
    }

    public Horarios getHorario() {
        return horario;
    }

    public void setHorario(Horarios horario) {
        this.horario = horario;
    }
}

