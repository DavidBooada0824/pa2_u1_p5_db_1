package com.uce.edu.inventario.service;

import com.uce.edu.inventario.repo.modelo.Bodega;

public interface IBodegaService {
	
	public Bodega buscar(String codigo);

	public void ingresar(Bodega bodega);

	public void modificar(Bodega bodega);

	public void borrar(String codigo);


}
