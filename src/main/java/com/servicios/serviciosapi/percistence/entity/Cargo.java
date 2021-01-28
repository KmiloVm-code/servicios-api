package com.servicios.serviciosapi.percistence.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "CARGOS", schema = "dbo", catalog = "DB_SERVICIOS")
public class Cargo {
    private Integer idCargo;
    private String nCargo;
    private Collection<Usuario> usuariosByIdCargo;

    @Id
    @Column(name = "idCargo", nullable = false)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "nCargo", nullable = true, length = 50)
    public String getnCargo() {
        return nCargo;
    }

    public void setnCargo(String nCargo) {
        this.nCargo = nCargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cargo cargo = (Cargo) o;
        return idCargo == cargo.idCargo && Objects.equals(nCargo, cargo.nCargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCargo, nCargo);
    }

    @OneToMany(mappedBy = "cargosByIdCargo")
    public Collection<Usuario> getUsuariosByIdCargo() {
        return usuariosByIdCargo;
    }

    public void setUsuariosByIdCargo(Collection<Usuario> usuariosByIdCargo) {
        this.usuariosByIdCargo = usuariosByIdCargo;
    }
}
