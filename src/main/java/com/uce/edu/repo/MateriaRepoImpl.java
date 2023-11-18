package com.uce.edu.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.FileSystemUtils;

import com.uce.edu.repo.modelo.Materia;

@Repository

public class MateriaRepoImpl implements IMateriaRepo {

	private static List<Materia> base = new ArrayList<>();

	@Override
	public Materia selecionar(String codigo) {
		System.out.println("Seleccionamos." + codigo);
		for (Materia mate : base) {
			if (mate.getCodigo().equals(codigo)) {
				return mate;
			}
		}
		return null;

	}

	@Override
	public void insertar(Materia materia) {

		base.add(materia);
		System.out.println("Se inserto: " + materia);
	}

	@Override
	public void actualizar(Materia materia) {
		this.borrar(materia.getCodigo());
		this.insertar(materia);

		System.out.println("Se actualiza: " + materia);

	}

	@Override
	public void borrar(String codigo) {
	

		Materia mate = this.selecionar(codigo);
		base.remove(codigo);
		System.out.println("Se borra: " + codigo);

	}

	@Override
	public List<Materia> selecionarTodos() {
		// TODO Auto-generated method stub
		return base;
	}

}
