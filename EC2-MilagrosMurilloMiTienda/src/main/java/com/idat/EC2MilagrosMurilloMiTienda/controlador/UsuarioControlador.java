package com.idat.EC2MilagrosMurilloMiTienda.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.EC2MilagrosMurilloMiTienda.modelo.Usuario;
import com.idat.EC2MilagrosMurilloMiTienda.servicio.UsuarioServicio;

@RestController
@RequestMapping("/usuario/v1")
public class UsuarioControlador {
	
	@Autowired
	private UsuarioServicio servicio;
	
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> listarUsuarios(){
		return new ResponseEntity<List<Usuario>>(servicio.listarUsuarios(), HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Usuario usuario){
		servicio.guardarUsuario(usuario);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	
	@RequestMapping(path = "/listar/{id}")
	public ResponseEntity<Usuario> listarporId(@PathVariable Integer id){
		Usuario u = servicio.obtenerusuarioId(id);
		if(u != null) {
			return new ResponseEntity<Usuario>(u, HttpStatus.OK);
		}			
		return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/editar")
	public ResponseEntity<Void> editar(@RequestBody Usuario usuario){
		
		Usuario u = servicio.obtenerusuarioId(usuario.getIdUsuario());
		
		if(u != null) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Usuario u = servicio.obtenerusuarioId(id);
		if(u != null) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

}
