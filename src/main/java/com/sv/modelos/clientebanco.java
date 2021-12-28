package com.sv.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userss",  schema= "")
public class clientebanco {

	@Id
	@Column
	private Integer idusers;
	
	
	@Column
	private String TipoCC;
	
	@Column
	private Integer NumCC ;
	
	@Column
	private String  Apellidos;
	
	@Column
	private String Nombres ;
	
	
	@Column
	private String correo;
	
	@Column
	private String  fechaNac ;
	
	@Column
	private String  fechaCre;
	
	@Column
	private String cuenta ;
	
	
	@Column
	private Integer saldo;


	public Integer getIdusers() {
		return idusers;
	}


	public void setIdusers(Integer idusers) {
		this.idusers = idusers;
	}


	public String getTipoCC() {
		return TipoCC;
	}


	public void setTipoCC(String tipoCC) {
		TipoCC = tipoCC;
	}


	public Integer getNumCC() {
		return NumCC;
	}


	public void setNumCC(Integer numCC) {
		NumCC = numCC;
	}


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}


	public String getNombres() {
		return Nombres;
	}


	public void setNombres(String nombres) {
		Nombres = nombres;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}


	public String getFechaCre() {
		return fechaCre;
	}


	public void setFechaCre(String fechaCre) {
		this.fechaCre = fechaCre;
	}


	public String getCuenta() {
		return cuenta;
	}


	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}


	public Integer getSaldo() {
		return saldo;
	}


	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
	

	
	
}
