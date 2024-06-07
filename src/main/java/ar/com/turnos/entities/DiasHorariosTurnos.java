package ar.com.turnos.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class DiasHorariosTurnos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private Boolean estado;

    @JoinColumn(name = "fk_dia", referencedColumnName = "id", nullable = false)
    @ManyToOne

    private Dias dia;

    @JoinColumn(name = "fk_horario", referencedColumnName = "id", nullable = false)
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
