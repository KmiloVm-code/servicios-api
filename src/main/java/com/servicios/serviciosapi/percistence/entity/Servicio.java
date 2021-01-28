package com.servicios.serviciosapi.percistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "SERVICIOS", schema = "dbo", catalog = "DB_SERVICIOS")
public class Servicio {
    private Integer idServicio;
    private Integer idCliente;
    private Integer idEquipo;
    private Integer idUsuarioRecibe;
    private Timestamp fRecibido;
    private Integer idUsuarioEntrega;
    private Timestamp fEntregado;
    private Boolean entregado;
    private String observacion;
    private String reporteTecnico;
    private Cliente clientesByIdCliente;
    private Equipo equiposByIdEquipo;
    private Usuario usuariosByIdUsuarioRecibe;
    private Usuario usuariosByIdUsuarioEntrega;

    @Id
    @Column(name = "idServicio", nullable = false)
    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    @Basic
    @Column(name = "idCliente", nullable = true)
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Basic
    @Column(name = "idEquipo", nullable = true)
    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Basic
    @Column(name = "idUsuarioRecibe", nullable = true)
    public Integer getIdUsuarioRecibe() {
        return idUsuarioRecibe;
    }

    public void setIdUsuarioRecibe(Integer idUsuarioRecibe) {
        this.idUsuarioRecibe = idUsuarioRecibe;
    }

    @Basic
    @Column(name = "fRecibido", nullable = true)
    public Timestamp getfRecibido() {
        return fRecibido;
    }

    public void setfRecibido(Timestamp fRecibido) {
        this.fRecibido = fRecibido;
    }

    @Basic
    @Column(name = "idUsuarioEntrega", nullable = true)
    public Integer getIdUsuarioEntrega() {
        return idUsuarioEntrega;
    }

    public void setIdUsuarioEntrega(Integer idUsuarioEntrega) {
        this.idUsuarioEntrega = idUsuarioEntrega;
    }

    @Basic
    @Column(name = "fEntregado", nullable = true)
    public Timestamp getfEntregado() {
        return fEntregado;
    }

    public void setfEntregado(Timestamp fEntregado) {
        this.fEntregado = fEntregado;
    }

    @Basic
    @Column(name = "entregado", nullable = true)
    public Boolean getEntregado() {
        return entregado;
    }

    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }

    @Basic
    @Column(name = "observacion", nullable = true, length = -1)
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Basic
    @Column(name = "reporteTecnico", nullable = true, length = -1)
    public String getReporteTecnico() {
        return reporteTecnico;
    }

    public void setReporteTecnico(String reporteTecnico) {
        this.reporteTecnico = reporteTecnico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servicio servicio = (Servicio) o;
        return idServicio == servicio.idServicio && Objects.equals(idCliente, servicio.idCliente) && Objects.equals(idEquipo, servicio.idEquipo) && Objects.equals(idUsuarioRecibe, servicio.idUsuarioRecibe) && Objects.equals(fRecibido, servicio.fRecibido) && Objects.equals(idUsuarioEntrega, servicio.idUsuarioEntrega) && Objects.equals(fEntregado, servicio.fEntregado) && Objects.equals(entregado, servicio.entregado) && Objects.equals(observacion, servicio.observacion) && Objects.equals(reporteTecnico, servicio.reporteTecnico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idServicio, idCliente, idEquipo, idUsuarioRecibe, fRecibido, idUsuarioEntrega, fEntregado, entregado, observacion, reporteTecnico);
    }

    @ManyToOne
    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente", insertable = false, updatable = false)
    public Cliente getClientesByIdCliente() {
        return clientesByIdCliente;
    }

    public void setClientesByIdCliente(Cliente clientesByIdCliente) {
        this.clientesByIdCliente = clientesByIdCliente;
    }

    @ManyToOne
    @JoinColumn(name = "idEquipo", referencedColumnName = "idEquipo", insertable = false, updatable = false)
    public Equipo getEquiposByIdEquipo() {
        return equiposByIdEquipo;
    }

    public void setEquiposByIdEquipo(Equipo equiposByIdEquipo) {
        this.equiposByIdEquipo = equiposByIdEquipo;
    }

    @ManyToOne
    @JoinColumn(name = "idUsuarioRecibe", referencedColumnName = "idUsuario", insertable = false, updatable = false)
    public Usuario getUsuariosByIdUsuarioRecibe() {
        return usuariosByIdUsuarioRecibe;
    }

    public void setUsuariosByIdUsuarioRecibe(Usuario usuariosByIdUsuarioRecibe) {
        this.usuariosByIdUsuarioRecibe = usuariosByIdUsuarioRecibe;
    }

    @ManyToOne
    @JoinColumn(name = "idUsuarioEntrega", referencedColumnName = "idUsuario", insertable = false, updatable = false)
    public Usuario getUsuariosByIdUsuarioEntrega() {
        return usuariosByIdUsuarioEntrega;
    }

    public void setUsuariosByIdUsuarioEntrega(Usuario usuariosByIdUsuarioEntrega) {
        this.usuariosByIdUsuarioEntrega = usuariosByIdUsuarioEntrega;
    }
}
