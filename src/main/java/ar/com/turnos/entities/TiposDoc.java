package ar.com.turnos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class TiposDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descrip;
    private Boolean defecto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Boolean getDefecto() {
        return defecto;
    }

    public void setDefecto(Boolean defecto) {
        this.defecto = defecto;
    }

//    public void setDefecto(boolean defecto) {
//        this.defecto = defecto;
//    }
}
