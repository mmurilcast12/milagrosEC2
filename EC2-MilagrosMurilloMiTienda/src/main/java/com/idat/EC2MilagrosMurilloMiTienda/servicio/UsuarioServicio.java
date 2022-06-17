package com.idat.EC2MilagrosMurilloMiTienda.servicio;

import java.util.List;
import com.idat.EC2MilagrosMurilloMiTienda.dto.UsuarioDTORequest;
import com.idat.EC2MilagrosMurilloMiTienda.dto.UsuarioDTOResponse;



public interface UsuarioServicio {
	
	public void guardarUsuario(UsuarioDTORequest usuario);
	public void editarUsuario(UsuarioDTORequest usuario);
	
	public void eliminarUsuario(Integer id);
	
	public List<UsuarioDTOResponse> listarUsuarios();
	public UsuarioDTOResponse obtenerusuarioId(Integer id);
}

