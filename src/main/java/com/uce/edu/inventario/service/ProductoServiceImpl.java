package com.uce.edu.inventario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.inventario.repo.IProductoRepo;
import com.uce.edu.inventario.repo.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private IProductoRepo iProductoRepo;

	@Override
	public Producto buscar(String codigoBarras) {
		// TODO Auto-generated method stub
		return this.iProductoRepo.seleccionar(codigoBarras);
	}

	@Override
	public void ingresar(Producto producto) {
	this.iProductoRepo.insertar(producto);
		
	}

	@Override
	public void modificar(Producto producto) {
		this.iProductoRepo.actualizar(producto);
		
	}

	@Override
	public void borrar(String codigoBarras) {
		this.iProductoRepo.eliminar(codigoBarras);
	}

}
