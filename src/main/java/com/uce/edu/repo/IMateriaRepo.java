package com.uce.edu.repo;

import java.util.List;

import com.uce.edu.repo.modelo.Materia;

public interface IMateriaRepo {
	
	public Materia selecionar(String codigo);
	public void insertar(Materia materia);
	public void actualizar(Materia materia);
	public void borrar(String codigo);
	
	public List<Materia> selecionarTodos();
	

}
