package com.uce.edu.inventario.repo;

import com.uce.edu.inventario.repo.modelo.Inventario;

public interface IInventarioRepo {

	public Inventario seleccionar(String codigo);


	public void insertar(Inventario inventario);

	public void actualizar(Inventario inventario);

	public void eliminar(String codigo);

}
