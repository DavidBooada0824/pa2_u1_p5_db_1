package com.uce.edu.inventario.repo;

import com.uce.edu.inventario.repo.modelo.Producto;

public interface IProductoRepo {
	
	public Producto seleccionar(String codigoBarras);


	public void insertar(Producto producto);

	public void actualizar(Producto producto);

	public void eliminar(Producto codigoBarras);

}
