package com.uce.edu.transferencia.service;

import com.uce.edu.transferencia.repo.modelo.CtaBancaria;

public interface ICtaBancariaService {
	
	public void crear(CtaBancaria bancaria);

	public CtaBancaria buscar(String num);

	public void actualizar(CtaBancaria bancaria);

	public void eliminar(String num);

}
