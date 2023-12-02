package com.uce.edu.inventario.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.inventario.repo.IBodegaRepo;
import com.uce.edu.inventario.repo.IInventarioRepo;
import com.uce.edu.inventario.repo.IProductoRepo;
import com.uce.edu.inventario.repo.modelo.Bodega;
import com.uce.edu.inventario.repo.modelo.Inventario;
import com.uce.edu.inventario.repo.modelo.Producto;




@Service
public class InventarioServiceImpl implements IInventarioService{
	
	@Autowired
	private IInventarioRepo iInventarioRepo;
	
	@Autowired
	private IProductoRepo iProductoRepo;
	
	@Autowired
	private  IBodegaRepo iBodegaRepo;

	@Override
	public Inventario buscar(String codigo) {
		// TODO Auto-generated method stub
		return this.iInventarioRepo.seleccionar(codigo);
	}

	@Override
	public void ingresar(Inventario inventario) {
		this.iInventarioRepo.insertar(inventario);
	}

	@Override
	public void modificar(Inventario inventario) {
	this.iInventarioRepo.actualizar(inventario);
	}

	@Override
	public void borrar(String codigo) {
		this.iInventarioRepo.eliminar(codigo);
	}

	@Override
	public void registrar(String codigoBodega, String codigoBarras, Integer stock) {
		// TODO Auto-generated method stub
		
		Bodega bode1 = this.iBodegaRepo.seleccionar(codigoBodega);
		
		Producto pro1 = this.iProductoRepo.seleccionar(codigoBarras);
		
		//aumento de stock
		Integer stockActual = pro1.getStock();
		Integer stockFinal = stockActual+ stock;
		
		
		pro1.setStock(stockFinal);
		this.iProductoRepo.actualizar(pro1);
		
		Inventario inve1 = new Inventario();
		inve1.setCodigo("1234");
		inve1.setFechaIngreso(LocalDateTime.now());
		inve1.setBodega(bode1);
		inve1.setProducto(pro1);
		
		this.iInventarioRepo.insertar(inve1);
		
		
		
	}

}
