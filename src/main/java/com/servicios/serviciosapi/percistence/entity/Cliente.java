package com.servicios.serviciosapi.percistence.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "CLIENTES", schema = "dbo", catalog = "DB_SERVICIOS")
public class Cliente {
    private Integer idCliente;
    private String nombres;
    private String apellidos;
    private String telefono;
    private Collection<Servicio> serviciosByIdCliente;

    @Id
    @Column(name = "idCliente", nullable = false)
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Basic
    @Column(name = "nombres", nullable = true, length = 50)
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Basic
    @Column(name = "apellidos", nullable = true, length = 50)
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Basic
    @Column(name = "telefono", nullable = true, length = 50)
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idCliente == cliente.idCliente && Objects.equals(nombres, cliente.nombres) && Objects.equals(apellidos, cliente.apellidos) && Objects.equals(telefono, cliente.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nombres, apellidos, telefono);
    }

    @OneToMany(mappedBy = "clientesByIdCliente")
    public Collection<Servicio> getServiciosByIdCliente() {
        return serviciosByIdCliente;
    }

    public void setServiciosByIdCliente(Collection<Servicio> serviciosByIdCliente) {
        this.serviciosByIdCliente = serviciosByIdCliente;
    }
}
