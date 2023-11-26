package com.uce.edu.transferencia.repo;

import com.uce.edu.transferencia.repo.modelo.Transferencia;

public interface ITransferenciaRepo {
	
	
	public void insertar(Transferencia transferencia);

	public Transferencia selecionar(Integer num);

	public void actualizar(Transferencia transferencia);

	public void eliminar(Integer num);


}
