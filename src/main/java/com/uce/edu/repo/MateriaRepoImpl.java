package com.uce.edu.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.repo.modelo.Materia;

@Repository
public class MateriaRepoImpl implements IMateriaRepo {
	
	private List<Materia> base = new ArrayList<>();
	

	@Override
	public Materia selecionar(String codigo) {
	
		return null;
	}

	@Override
	public void insertar(Materia materia) {
	
		
	}

	@Override
	public void actualizar(Materia materia) {
	
		
	}

	@Override
	public void borrar(String codigo) {
		
		
	}

}
