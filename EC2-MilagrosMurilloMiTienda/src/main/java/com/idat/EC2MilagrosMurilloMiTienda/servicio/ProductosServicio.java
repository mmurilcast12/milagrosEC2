package com.idat.EC2MilagrosMurilloMiTienda.servicio;

import java.util.List;
import com.idat.EC2MilagrosMurilloMiTienda.dto.ProductoDTORequest;
import com.idat.EC2MilagrosMurilloMiTienda.dto.ProductoDTOResponse;

public interface ProductosServicio {
	
	public void guardarProductos(ProductoDTORequest productos);
	public void editarProductos(ProductoDTORequest productos);
	
	public void eliminarProductos(Integer id);
	
	public List<ProductoDTOResponse> listarProductos();
	public ProductoDTOResponse obtenerproductoId(Integer id);
}
