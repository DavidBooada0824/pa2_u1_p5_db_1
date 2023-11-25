package com.uce.edu.transferencia.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
		CtaBancaria ctaOri= this.iCtaBancariaRepo.selecionar(ctaOrigen);
		//2.-Consultar el saldo
		BigDecimal saldoOrigen = ctaOri.getSaldo();
		//3.-validar saldo
		if (saldoOrigen.compareTo(monto)>=0) {
			
			//4.-restar el monto
			BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
			
			//5.-Actualizar ctaOringen
			ctaOri.setSaldo(nuevoSaldoOrigen);
			this.iCtaBancariaRepo.actualizar(ctaOri);
			
			//6.-Buscar CtaDestino
			CtaBancaria ctaDes = this.iCtaBancariaRepo.selecionar(ctaDestino);
			//7.-Consultar el saldo
			BigDecimal saldoDestino = ctaDes.getSaldo();
			//8.-sumar el monto
			BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
			//9.-Actualizar CtaDestino
			ctaDes.setSaldo(nuevoSaldoDestino);
			this.iCtaBancariaRepo.actualizar(ctaDes);
			
			//10.-Crear la transferencia
			Transferencia transfer = new Transferencia();
			transfer.setCtaOrigen(ctaOri);
			transfer.setCtaDestino(ctaDes);
			transfer.setFecha(LocalDateTime.now());
			transfer.setNum("12312313");
			this.iTransferenciaRepo.insertar(transfer);
			System.err.println("Transferencia Realizada con Exito");
			
		}else {
			System.out.println("saldo no disponible");
		}
		
	
		
	}

}
