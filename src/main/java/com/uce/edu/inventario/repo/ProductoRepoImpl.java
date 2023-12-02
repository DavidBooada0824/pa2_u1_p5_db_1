package com.uce.edu.inventario.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.inventario.repo.modelo.Producto;

@Repository
public class ProductoRepoImpl implements IProductoRepo {
	
	private List<Producto> base = new ArrayList<>();

	@Override
	public Producto seleccionar(String codigoBarras) {
		for (Producto pro1 : base) {

			if (pro1.getCodigoBarras().equals(codigoBarras)) {
				
				Producto pro = new Producto();
				pro.setCodigoBarras(pro.getCodigoBarras());
				pro.setNombre(pro.getNombre());
				pro.setStock(pro.getStock());
				
				
				return pro;
				
			}
		}
		
		return null;
	}

	@Override
	public void insertar(Producto producto) {
		base.add(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		this.eliminar(producto.getCodigoBarras());
		this.insertar(producto);
	}

	@Override
	public void eliminar(String codigoBarras) {
		Producto pro1 = this.seleccionar(codigoBarras);
		base.remove(codigoBarras);
	}

}
