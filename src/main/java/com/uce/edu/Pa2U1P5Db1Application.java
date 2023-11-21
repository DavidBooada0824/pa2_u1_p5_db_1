package com.uce.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repo.modelo.Materia;
import com.uce.edu.service.IMateriaService;

@SpringBootApplication
public class Pa2U1P5Db1Application implements CommandLineRunner {

	@Autowired
	private IMateriaService iMateriaService;

	@Autowired
	private Materia materia;

	@Autowired
	private Materia materia1;

	@Autowired
	private Materia materia2;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5Db1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		this.materia.setNombre("Avanzada II");
		System.out.println(this.materia);

		this.materia1.setNombre("Nuevo Nmbre");
		System.out.println(this.materia1);
		System.out.println(this.materia);
		
		
		this.materia2.setNombre("Nombre FInal");
		System.out.println(this.materia2);
		System.out.println(this.materia1);
		System.out.println(this.materia);

	}

}
