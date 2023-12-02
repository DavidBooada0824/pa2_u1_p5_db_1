package com.uce.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.inventario.repo.modelo.Bodega;
import com.uce.edu.inventario.repo.modelo.Inventario;
import com.uce.edu.inventario.repo.modelo.Producto;
import com.uce.edu.inventario.service.IBodegaService;
import com.uce.edu.inventario.service.IInventarioService;
import com.uce.edu.inventario.service.IProductoService;

@SpringBootApplication
public class Pa2U1P5Db1Application implements CommandLineRunner {

	@Autowired
	private IProductoService iProductoService;

	@Autowired
	private IBodegaService iBodegaService;

	@Autowired
	private IInventarioService iInventarioService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5Db1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Producto p1 = new Producto();

		p1.setCodigoBarras("001");
		p1.setNombre("HP 15 LAP");
		p1.setStock(0);

		this.iProductoService.ingresar(p1);

		Producto p2 = new Producto();

		p1.setCodigoBarras("123457");
		p1.setNombre("Teclado hp");
		p1.setStock(0);

		this.iProductoService.ingresar(p2);

		Bodega bode1 = new Bodega();
		bode1.setCapacidad(300);
		bode1.setCodigo("BA01");
		bode1.setDireccion("Av universitaria");
		bode1.setNombre("Bodega Universitaria");
		this.iBodegaService.ingresar(bode1);
		



		this.iInventarioService.registrar("BA01", "001", 50);



		this.iInventarioService.registrar("BA01", "002", 100);



		this.iInventarioService.registrar("BA01", "001", 20);
		
		
			

	}

}
