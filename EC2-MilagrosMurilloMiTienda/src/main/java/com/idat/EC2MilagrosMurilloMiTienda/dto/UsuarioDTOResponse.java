package com.idat.EC2MilagrosMurilloMiTienda.dto;

public class UsuarioDTOResponse {
	
	private Integer idUsuario;
	private String usuario;
	private String password;
	private String rol;
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public UsuarioDTOResponse(String token) {
		super();
		this.token = token;
	}
	

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

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

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public UsuarioDTOResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
