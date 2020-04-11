/**
 * 
 */
package com.example.weblogic.weblogic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author ErwinDeLeon
 *
 */
@Entity
@Table(name = "sys_empresa", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"empresa_id", "nit", "razon_social"}),
})
public class Empresa {
	
	@Id
	@Column(name= "empresa_id", length = 32)
	private String id;
	@Column(name= "nit", length = 32)
	private String nit;
	@Column(name= "razon_social", length = 100)
	private String razonSocial;
	//@OneToOne(fetch = FetchType.EAGER)
	//@JoinColumn(name = "tipo_empresa_id", nullable= false)
	@Column(name= "tipo_empresa_id", length = 32)
	private String tipoEmpresaID;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getTipoEmpresaID() {
		return tipoEmpresaID;
	}
	public void setTipoEmpresaID(String tipoEmpresaID) {
		this.tipoEmpresaID = tipoEmpresaID;
	}
	
	
	
}
