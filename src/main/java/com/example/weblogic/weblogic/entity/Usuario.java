/**
 * 
 */
package com.example.weblogic.weblogic.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author 15-cd006
 *
 */
@Entity
@Table(name = "sys_usuario",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = {"usuario"}),}
)
public class Usuario {

	@Id
    @Column(name = "usuario_id", length = 40)
    private String id;
    @Column(name = "usuario", nullable = false, length = 70, unique = true)
    private String usuario;
    @Column(name = "clave", nullable = true, length = 100)
    private String clave;
    @Column(name = "movil", nullable = true, length = 20)
    private String movil;
    @Column(name = "lenguaje", nullable = false, length = 30)
    private String lenguaje;
    @Column(name = "timezone", nullable = false, length = 50)
    private String timezone;
    @Column(name = "estado", nullable = false, length = 15)
    private String estado;
    @Column(name = "correo_valido", nullable = false)
    private Boolean correoValido;
    /**
     * Indica si se debe cambiar clave al iniciar sesion.
     */
    @Column(name = "cambiar_clave", nullable = false)
    private Boolean cambiarClave = false;
    /**
     * Fecha del ultimo ingreso correcto al sistema.
     */
    @Column(name = "ultimo_ingreso", nullable = true)
    private LocalDateTime ultimoIngreso;
    /**
     * Fecha del ultimo intento de ingreso incorrecto al sistema.
     */
    @Column(name = "ultimo_intento", nullable = true)
    private LocalDateTime ultimoIntento;
    /**
     * Numero de intentos seguidos fallidos de ingreso al sistema. Cada vez que
     * el usuario ingresa correctamente al sistema este dato se reinicia a 0.
     */
    @Column(name = "intentos_ingreso", nullable = false)
    private int intentosIngreso;

    @Column(name = "ultimo_cambio_clave", nullable = true)
    private LocalDateTime ultimoCambioClave;

    //@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    //private List<UsuarioClave> usuarioClaves = new ArrayList<>();

	
    
	private String user;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	public String getLenguaje() {
		return lenguaje;
	}
	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Boolean getCorreoValido() {
		return correoValido;
	}
	public void setCorreoValido(Boolean correoValido) {
		this.correoValido = correoValido;
	}
	public Boolean getCambiarClave() {
		return cambiarClave;
	}
	public void setCambiarClave(Boolean cambiarClave) {
		this.cambiarClave = cambiarClave;
	}
	public LocalDateTime getUltimoIngreso() {
		return ultimoIngreso;
	}
	public void setUltimoIngreso(LocalDateTime ultimoIngreso) {
		this.ultimoIngreso = ultimoIngreso;
	}
	public LocalDateTime getUltimoIntento() {
		return ultimoIntento;
	}
	public void setUltimoIntento(LocalDateTime ultimoIntento) {
		this.ultimoIntento = ultimoIntento;
	}
	public int getIntentosIngreso() {
		return intentosIngreso;
	}
	public void setIntentosIngreso(int intentosIngreso) {
		this.intentosIngreso = intentosIngreso;
	}
	public LocalDateTime getUltimoCambioClave() {
		return ultimoCambioClave;
	}
	public void setUltimoCambioClave(LocalDateTime ultimoCambioClave) {
		this.ultimoCambioClave = ultimoCambioClave;
	}
	private String password;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
