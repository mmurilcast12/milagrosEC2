package com.idat.EC2MilagrosMurilloMiTienda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EC2MilagrosMurilloMiTienda.modelo.Productos;
import com.idat.EC2MilagrosMurilloMiTienda.modelo.Usuario;

public interface ProductosRepositorio extends JpaRepository <Productos,Integer>{
	
	Usuario findByUsuario(String usuario);

}
