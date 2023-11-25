package com.uce.edu.transferencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.transferencia.repo.ICtaBancariaRepo;
import com.uce.edu.transferencia.repo.modelo.CtaBancaria;

@Service
public class CtaBancariaServiceImpl implements ICtaBancariaService {

	@Autowired
	private ICtaBancariaRepo iCtaBancariaRepo;

	@Override
	public void crear(CtaBancaria bancaria) {
		this.iCtaBancariaRepo.insertar(bancaria);

	}

	@Override
	public CtaBancaria buscar(String num) {
		// TODO Auto-generated method stub
		return this.iCtaBancariaRepo.selecionar(num);
	}

	@Override
	public void actualizar(CtaBancaria bancaria) {
		this.iCtaBancariaRepo.actualizar(bancaria);
	}

	@Override
	public void eliminar(String num) {
		this.iCtaBancariaRepo.eliminar(num);

	}

}
