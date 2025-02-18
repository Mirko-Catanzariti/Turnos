package ar.com.turnos.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Profesionales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String apellido;

    private String nombre;

    private String telefono;

    private String matricula;

    private String numdoc;

    public String getNumdoc() {
        return numdoc;
    }

    public void setNumdoc(String numdoc) {
        this.numdoc = numdoc;
    }

    @JoinColumn(name = "fk_tipodoc", referencedColumnName = "id", nullable = false)
    @ManyToOne

    private TiposDoc tipodoc;

    @JoinColumn(name = "fk_especialidad", referencedColumnName = "id", nullable = false)
    @ManyToOne

    private Especialidades especialidad;

    @JoinColumn(name = "fk_usuario", referencedColumnName = "id")
    @OneToOne

    private User usuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TiposDoc getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(TiposDoc tipodoc) {
        this.tipodoc = tipodoc;
    }

    public Especialidades getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidades especialidad) {
        this.especialidad = especialidad;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
}
