package com.uce.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repo.IMateriaRepo;
import com.uce.edu.repo.modelo.Materia;

@Service
public class MateriaServiceImpl implements IMateriaService {
	
	@Autowired
	private IMateriaRepo iMateriaRepo;

	@Override
	public Materia buscar(String codigo) {
		// TODO Auto-generated method stub
		return this.iMateriaRepo.selecionar(codigo);
	}

	@Override
	public void registar(Materia materia) {
		this.iMateriaRepo.insertar(materia);
		
	}

	@Override
	public void actualizar(Materia materia) {
		this.iMateriaRepo.actualizar(materia);
		
	}

	@Override
	public void eliminar(String codigo) {
		this.iMateriaRepo.borrar(codigo);
		
	}

	@Override
	public List<Materia> buscarTodo() {
		// TODO Auto-generated method stub
		return this.iMateriaRepo.selecionarTodos();
	}
	
	

}
