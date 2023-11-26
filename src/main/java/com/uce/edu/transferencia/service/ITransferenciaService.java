package com.uce.edu.transferencia.service;

import java.math.BigDecimal;

import com.uce.edu.transferencia.repo.modelo.Transferencia;

public interface ITransferenciaService {

	public void guardar(Transferencia transferencia);

	public Transferencia buscar(Integer num);

	public void actualizar(Transferencia transferencia);

	public void eliminar(Integer num);

	public void realizar(String ctaOrigen, String ctaDestino, BigDecimal monto);
}
