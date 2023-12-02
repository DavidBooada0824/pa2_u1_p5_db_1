package com.uce.edu.inventario.service;

import com.uce.edu.inventario.repo.modelo.Producto;

public interface IProductoService {
	
	public Producto buscar(String codigoBarras);

	public void ingresar(Producto producto);

	public void modificar(Producto producto);

	public void borrar(String codigoBarras);


}
