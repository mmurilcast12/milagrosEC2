package com.idat.EC2MilagrosMurilloMiTienda.dto;

public class UsuarioDTORequest {
	
	private String usuario;
	private String password;
	
	
	
	
	
	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public UsuarioDTORequest(String usuario, String clave) {
		super();
		this.usuario = usuario;
		this.password = clave;
	}
	
	
	public UsuarioDTORequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
