package com.servicios.serviciosapi.percistence.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "MARCAS", schema = "dbo", catalog = "DB_SERVICIOS")
public class Marca {
    private Integer idMarca;
    private String nMarca;
    private Collection<Equipo> equiposByIdMarca;

    @Id
    @Column(name = "idMarca", nullable = false)
    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    @Basic
    @Column(name = "nMarca", nullable = true, length = 50)
    public String getnMarca() {
        return nMarca;
    }

    public void setnMarca(String nMarca) {
        this.nMarca = nMarca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marca marca = (Marca) o;
        return idMarca == marca.idMarca && Objects.equals(nMarca, marca.nMarca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMarca, nMarca);
    }

    @OneToMany(mappedBy = "marcasByIdMarca")
    public Collection<Equipo> getEquiposByIdMarca() {
        return equiposByIdMarca;
    }

    public void setEquiposByIdMarca(Collection<Equipo> equiposByIdMarca) {
        this.equiposByIdMarca = equiposByIdMarca;
    }
}
