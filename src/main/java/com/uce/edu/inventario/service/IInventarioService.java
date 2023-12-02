package com.uce.edu.inventario.service;

import com.uce.edu.inventario.repo.modelo.Inventario;

public interface IInventarioService {
	
	public Inventario buscar(String codigo);

	public void ingresar(Inventario inventario);

	public void modificar(Inventario inventario);

	public void borrar(String codigo);
	
	public void registrar(String codigoBodega, String codigoBarras, Integer Stock);

}
