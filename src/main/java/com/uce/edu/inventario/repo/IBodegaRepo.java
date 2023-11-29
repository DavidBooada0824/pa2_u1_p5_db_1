package com.uce.edu.inventario.repo;

import com.uce.edu.inventario.repo.modelo.Bodega;

public interface IBodegaRepo {
	
	
	public Bodega seleccionar(String codigo);
	

	public void insertar(Bodega bodega);

	public void actualizar(Bodega bodega);

	public void eliminar(String codigo);
	

}
