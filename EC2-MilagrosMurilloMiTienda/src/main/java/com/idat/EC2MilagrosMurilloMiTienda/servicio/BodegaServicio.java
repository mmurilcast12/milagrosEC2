package com.idat.EC2MilagrosMurilloMiTienda.servicio;

import java.util.List;
import com.idat.EC2MilagrosMurilloMiTienda.dto.BodegaDTORequest;
import com.idat.EC2MilagrosMurilloMiTienda.dto.BodegaDTOResponse;


public interface BodegaServicio {
	
	public void guardarBodega(BodegaDTORequest bodega);
	public void editarBodega(BodegaDTORequest bodega);
	
	public void eliminarBodega(Integer id);
	
	public List<BodegaDTOResponse> listarBodegas();
	public BodegaDTOResponse obtenerbodegaId(Integer id);
}
