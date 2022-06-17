package com.idat.EC2MilagrosMurilloMiTienda.servicio;

import java.util.List;

import com.idat.EC2MilagrosMurilloMiTienda.dto.ClienteDTORequest;
import com.idat.EC2MilagrosMurilloMiTienda.dto.ClienteDTOResponse;

public interface ClienteServicio {
	
	public void guardarCliente(ClienteDTORequest cliente);
	public void editarCliente(ClienteDTORequest cliente);
	
	public void eliminarCliente(Integer id);
	
	public List<ClienteDTOResponse> listarClientes();
	public ClienteDTOResponse obtenerclienteId(Integer id);
}
