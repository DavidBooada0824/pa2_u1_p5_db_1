package com.uce.edu.inventario.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.inventario.repo.modelo.Bodega;

@Repository
public class BodegaRepoImpl implements IBodegaRepo{
	
	private List<Bodega> base = new ArrayList<>();

	@Override
	public Bodega seleccionar(String codigo) {
		for (Bodega bode : base) {

			if (bode.getCodigo().equals(codigo)) {
				
				Bodega bode1 = new Bodega();
				bode1.setNombre(bode1.getNombre());
				bode1.setCodigo(bode1.getCodigo());
				bode1.setDireccion(bode1.getDireccion());
				bode1.setCapacidad(bode1.getCapacidad());
				
				return bode1;
				
			}
		}
		System.out.println("No existe la bodega con codigo :" + codigo);
		return null;
	}

	@Override
	public void insertar(Bodega bodega) {
		base.add(bodega);
		
	}

	@Override
	public void actualizar(Bodega bodega) {
		this.eliminar(bodega.getCodigo());
		this.insertar(bodega);
		
	}

	@Override
	public void eliminar(String codigo) {
		Bodega bode1 = this.seleccionar(codigo);
		base.remove(codigo);
		
	}

}
