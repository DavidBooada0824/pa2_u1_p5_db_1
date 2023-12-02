package com.uce.edu.inventario.repo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.inventario.repo.modelo.Inventario;

@Repository
public class InventarioRepoImpl implements IInventarioRepo {
	
	private List<Inventario> base = new ArrayList<>();


	@Override
	public Inventario seleccionar(String codigo) {
		for (Inventario bode : base) {

			if (bode.getCodigo().equals(codigo)) {
				
				Inventario inve1 = new Inventario();
				inve1.setBodega(inve1.getBodega());
				inve1.setCodigo(inve1.getCodigo());
				inve1.setFechaIngreso(LocalDateTime.now());
				inve1.setProducto(inve1.getProducto());
				
				return inve1;
				
			}
		}
		System.out.println("No existe la bodega con codigo :" + codigo);
		return null;
	}

	@Override
	public void insertar(Inventario inventario) {
		base.add(inventario);
	}

	@Override
	public void actualizar(Inventario inventario) {
		this.eliminar(inventario.getCodigo());
		this.insertar(inventario);
	}

	@Override
	public void eliminar(String codigo) {
		Inventario inve1 = this.seleccionar(codigo);
		base.remove(codigo);
	}

}
