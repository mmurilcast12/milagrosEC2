package com.idat.EC2MilagrosMurilloMiTienda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EC2MilagrosMurilloMiTienda.modelo.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
	
	Usuario findByUsuario(String usuario);

}
