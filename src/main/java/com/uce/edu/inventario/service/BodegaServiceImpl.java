package com.uce.edu.inventario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.inventario.repo.IBodegaRepo;
import com.uce.edu.inventario.repo.modelo.Bodega;

@Service

public class BodegaServiceImpl implements IBodegaService {
	
	@Autowired
	private IBodegaRepo iBodegaRepo;

	@Override
	public Bodega buscar(String codigo) {
		// TODO Auto-generated method stub
		return this.iBodegaRepo.seleccionar(codigo);
	}

	@Override
	public void ingresar(Bodega bodega) {
		this.iBodegaRepo.insertar(bodega);
	}

	@Override
	public void modificar(Bodega bodega) {
		this.iBodegaRepo.actualizar(bodega);
	}

	@Override
	public void borrar(String codigo) {
		this.iBodegaRepo.eliminar(codigo);
	}

}
