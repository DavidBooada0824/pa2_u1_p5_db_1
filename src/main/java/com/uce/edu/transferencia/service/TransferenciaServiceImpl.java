package com.uce.edu.transferencia.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.transferencia.repo.ICtaBancariaRepo;
import com.uce.edu.transferencia.repo.ITransferenciaRepo;
import com.uce.edu.transferencia.repo.modelo.CtaBancaria;
import com.uce.edu.transferencia.repo.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	@Autowired
	private ITransferenciaRepo iTransferenciaRepo;

	@Autowired
	private ICtaBancariaRepo iCtaBancariaRepo;

	@Override
	public void guardar(Transferencia transferencia) {
		this.iTransferenciaRepo.insertar(transferencia);
	}

	@Override
	public Transferencia buscar(String num) {
		return this.iTransferenciaRepo.selecionar(num);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		this.iTransferenciaRepo.actualizar(transferencia);
	}

	@Override
	public void eliminar(String num) {
		this.iTransferenciaRepo.eliminar(num);
	}

	@Override
	public void realizar(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		
		//1.-Buscar CtaOrigen
		CtaBancaria ctaOri= this.iCtaBancariaRepo.selecionar(ctaDestino);
		//2.-Consultar el saldo
		
		//3.-validar saldo
		//4.-restar el monto
		//5.-Actualizar ctaOringen
		
		
		//6.-Buscar CtaDestino
		//7.-Consultar el saldo
		//8.-sumar el monto
		//9.-Actualizar CtaDestino
		
		//10.-Crear la transferencia
		
	}

}
