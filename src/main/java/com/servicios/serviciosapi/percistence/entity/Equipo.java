package com.servicios.serviciosapi.percistence.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "EQUIPOS", schema = "dbo", catalog = "DB_SERVICIOS")
public class Equipo {
    private Integer idEquipo;
    private Integer idMarca;
    private Integer idModelo;
    private String nEquipo;
    private String serial;
    private Marca marcasByIdMarca;
    private Modelo modelosByIdModelo;
    private Collection<Servicio> serviciosByIdEquipo;

    @Id
    @Column(name = "idEquipo", nullable = false)
    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Basic
    @Column(name = "idMarca", nullable = true)
    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    @Basic
    @Column(name = "idModelo", nullable = true)
    public Integer getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Integer idModelo) {
        this.idModelo = idModelo;
    }

    @Basic
    @Column(name = "nEquipo", nullable = true, length = 50)
    public String getnEquipo() {
        return nEquipo;
    }

    public void setnEquipo(String nEquipo) {
        this.nEquipo = nEquipo;
    }

    @Basic
    @Column(name = "serial", nullable = true, length = 100)
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return idEquipo == equipo.idEquipo && Objects.equals(idMarca, equipo.idMarca) && Objects.equals(idModelo, equipo.idModelo) && Objects.equals(nEquipo, equipo.nEquipo) && Objects.equals(serial, equipo.serial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEquipo, idMarca, idModelo, nEquipo, serial);
    }

    @ManyToOne
    @JoinColumn(name = "idMarca", referencedColumnName = "idMarca", insertable = false, updatable = false)
    public Marca getMarcasByIdMarca() {
        return marcasByIdMarca;
    }

    public void setMarcasByIdMarca(Marca marcasByIdMarca) {
        this.marcasByIdMarca = marcasByIdMarca;
    }

    @ManyToOne
    @JoinColumn(name = "idModelo", referencedColumnName = "idModelo", insertable = false, updatable = false)
    public Modelo getModelosByIdModelo() {
        return modelosByIdModelo;
    }

    public void setModelosByIdModelo(Modelo modelosByIdModelo) {
        this.modelosByIdModelo = modelosByIdModelo;
    }

    @OneToMany(mappedBy = "equiposByIdEquipo")
    public Collection<Servicio> getServiciosByIdEquipo() {
        return serviciosByIdEquipo;
    }

    public void setServiciosByIdEquipo(Collection<Servicio> serviciosByIdEquipo) {
        this.serviciosByIdEquipo = serviciosByIdEquipo;
    }
}
