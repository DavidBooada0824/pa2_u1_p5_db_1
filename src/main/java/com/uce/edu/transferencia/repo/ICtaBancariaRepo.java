package com.uce.edu.transferencia.repo;

import com.uce.edu.transferencia.repo.modelo.CtaBancaria;

public interface ICtaBancariaRepo {

	public void insertar(CtaBancaria bancaria);

	public CtaBancaria selecionar(String num);

	public void actualizar(CtaBancaria bancaria);

	public void eliminar(String num);
}
