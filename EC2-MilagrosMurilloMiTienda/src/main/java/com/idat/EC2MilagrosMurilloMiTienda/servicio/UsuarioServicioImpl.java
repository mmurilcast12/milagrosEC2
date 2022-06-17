package com.idat.EC2MilagrosMurilloMiTienda.servicio;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idat.EC2MilagrosMurilloMiTienda.dto.UsuarioDTORequest;
import com.idat.EC2MilagrosMurilloMiTienda.dto.UsuarioDTOResponse;
import com.idat.EC2MilagrosMurilloMiTienda.modelo.Usuario;
import com.idat.EC2MilagrosMurilloMiTienda.repositorio.UsuarioRepositorio;


@Service
public class UsuarioServicioImpl implements UsuarioServicio{
	
	@Autowired
	public UsuarioRepositorio repositorio;
	
	@Override
	public void guardarUsuario(UsuarioDTORequest usuario) {
		
		Usuario u = new Usuario();
		u.setUsuario(usuario.getUsuario());
		u.setPassword(usuario.getPassword());
		
		
		repositorio.save(u);
	}
	
	@Override
	public void editarUsuario(UsuarioDTORequest usuario) {
		Usuario u = new Usuario();
		u.setUsuario(usuario.getUsuario());
		u.setPassword(usuario.getPassword());
		
		repositorio.saveAndFlush(u);
	}
	
	@Override
	public void eliminarUsuario(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}
	
	@Override
	public List<UsuarioDTOResponse> listarUsuarios() {
		
		List<UsuarioDTOResponse> lista = new ArrayList<UsuarioDTOResponse>();
		UsuarioDTOResponse u = null; 
		

		for (Usuario usuario :repositorio.findAll()) {
			u = new UsuarioDTOResponse();
			
			u.setUsuario(usuario.getUsuario());
			u.setPassword(usuario.getPassword());
			u.setRol(usuario.getRol());
			
			lista.add(u);
			
		}
		

		return lista;
	}
	
		@Override
		public UsuarioDTOResponse obtenerusuarioId(Integer id) {
		
			Usuario usuario = repositorio.findById(id).orElse(null);
			UsuarioDTOResponse u = new UsuarioDTOResponse();
			u.setUsuario(usuario.getUsuario());
			u.setPassword(usuario.getPassword());
			u.setRol(usuario.getRol());
			return u;
	}

}
