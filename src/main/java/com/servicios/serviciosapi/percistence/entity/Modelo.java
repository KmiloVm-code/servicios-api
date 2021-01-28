package com.servicios.serviciosapi.percistence.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "MODELOS", schema = "dbo", catalog = "DB_SERVICIOS")
public class Modelo {
    private Integer idModelo;
    private String nModelo;
    private Collection<Equipo> equiposByIdModelo;

    @Id
    @Column(name = "idModelo", nullable = false)
    public Integer getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Integer idModelo) {
        this.idModelo = idModelo;
    }

    @Basic
    @Column(name = "nModelo", nullable = true, length = 50)
    public String getnModelo() {
        return nModelo;
    }

    public void setnModelo(String nModelo) {
        this.nModelo = nModelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Modelo modelo = (Modelo) o;
        return idModelo == modelo.idModelo && Objects.equals(nModelo, modelo.nModelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idModelo, nModelo);
    }

    @OneToMany(mappedBy = "modelosByIdModelo")
    public Collection<Equipo> getEquiposByIdModelo() {
        return equiposByIdModelo;
    }

    public void setEquiposByIdModelo(Collection<Equipo> equiposByIdModelo) {
        this.equiposByIdModelo = equiposByIdModelo;
    }
}
