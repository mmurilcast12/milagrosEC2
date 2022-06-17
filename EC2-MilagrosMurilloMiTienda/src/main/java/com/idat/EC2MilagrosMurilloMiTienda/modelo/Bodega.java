package com.idat.EC2MilagrosMurilloMiTienda.modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "bodega")
@Entity
public class Bodega implements Serializable{
	
	private Integer idBodega;
	private String nombre;
	private String direccion;
	
	@JoinColumn(name="idProducto",nullable = false, unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_producto) references Producto (id_producto)"))
	
	@ManyToOne
	private Productos productos;
		

	public Bodega() {
		super();
	}

	public Integer getIdBodega() {
		return idBodega;
	}

	public void setIdBodega(Integer idBodega) {
		this.idBodega = idBodega;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}
	
	
}
