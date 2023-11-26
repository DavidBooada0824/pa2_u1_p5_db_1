package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.transferencia.repo.modelo.CtaBancaria;
import com.uce.edu.transferencia.service.ICtaBancariaService;
import com.uce.edu.transferencia.service.ITransferenciaService;

@SpringBootApplication
public class Pa2U1P5Db1Application implements CommandLineRunner {

	@Autowired
	private ICtaBancariaService iCtaBancariaService;
	
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5Db1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		CtaBancaria ctaOri = new CtaBancaria();
		
		ctaOri.setCedulaPropietario("1720030723");
		ctaOri.setNum("001");
		ctaOri.setSaldo(new BigDecimal(100));
		this.iCtaBancariaService.crear(ctaOri);
		
		CtaBancaria ctaDes = new CtaBancaria();
		
		ctaDes.setCedulaPropietario("1720030715");
		ctaDes.setNum("002");
		ctaDes.setSaldo(new BigDecimal(20));
		this.iCtaBancariaService.crear(ctaDes);
		
		this.iTransferenciaService.realizar("001", "002", new BigDecimal(50));
		System.err.println("Su nuevo saldo es "+ctaOri.getSaldo());
		
		System.err.println("La cuenta Destino cuenta con $"+ctaDes.getSaldo());
		
		
		this.iTransferenciaService.realizar("001", "002", new BigDecimal(50));
		System.err.println("Su nuevo saldo es "+ctaOri.getSaldo());
		
		System.err.println("La cuenta Destino cuenta con $"+ctaDes.getSaldo());
		
		
		
	

	}

}
