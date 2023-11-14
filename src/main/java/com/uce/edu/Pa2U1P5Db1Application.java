package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ioc.di.Estudiante;

@SpringBootApplication
public class Pa2U1P5Db1Application implements CommandLineRunner {
	
	@Autowired
	private Estudiante estudiante;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5Db1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		this.estudiante.setApellido("Boada");
		this.estudiante.setNombre("David");
		this.estudiante.setCedula("1720030723");
		this.estudiante.setSalario(new BigDecimal(100));
		System.out.println(estudiante);
		
	
	}

}
