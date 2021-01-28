package com.servicios.serviciosapi.percistence.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "USUARIOS", schema = "dbo", catalog = "DB_SERVICIOS")
public class Usuario {
    private Integer idUsuario;
    private Integer idCargo;
    private String nombres;
    private String apellidos;
    private String nUsuario;
    private String pass;
    private String salt;
    private Collection<Servicio> serviciosByIdUsuario;
    private Collection<Servicio> serviciosByIdUsuario_0;
    private Cargo cargosByIdCargo;

    @Id
    @Column(name = "idUsuario", nullable = false)
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "idCargo", nullable = true)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
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
    @Column(name = "nUsuario", nullable = true, length = 50)
    public String getnUsuario() {
        return nUsuario;
    }

    public void setnUsuario(String nUsuario) {
        this.nUsuario = nUsuario;
    }

    @Basic
    @Column(name = "pass", nullable = true, length = 100)
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Basic
    @Column(name = "salt", nullable = true, length = 100)
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return idUsuario == usuario.idUsuario && Objects.equals(idCargo, usuario.idCargo) && Objects.equals(nombres, usuario.nombres) && Objects.equals(apellidos, usuario.apellidos) && Objects.equals(nUsuario, usuario.nUsuario) && Objects.equals(pass, usuario.pass) && Objects.equals(salt, usuario.salt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idCargo, nombres, apellidos, nUsuario, pass, salt);
    }

    @OneToMany(mappedBy = "usuariosByIdUsuarioRecibe")
    public Collection<Servicio> getServiciosByIdUsuario() {
        return serviciosByIdUsuario;
    }

    public void setServiciosByIdUsuario(Collection<Servicio> serviciosByIdUsuario) {
        this.serviciosByIdUsuario = serviciosByIdUsuario;
    }

    @OneToMany(mappedBy = "usuariosByIdUsuarioEntrega")
    public Collection<Servicio> getServiciosByIdUsuario_0() {
        return serviciosByIdUsuario_0;
    }

    public void setServiciosByIdUsuario_0(Collection<Servicio> serviciosByIdUsuario_0) {
        this.serviciosByIdUsuario_0 = serviciosByIdUsuario_0;
    }

    @ManyToOne
    @JoinColumn(name = "idCargo", referencedColumnName = "idCargo", insertable = false, updatable = false)
    public Cargo getCargosByIdCargo() {
        return cargosByIdCargo;
    }

    public void setCargosByIdCargo(Cargo cargosByIdCargo) {
        this.cargosByIdCargo = cargosByIdCargo;
    }
}
