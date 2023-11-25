package com.uce.edu.transferencia.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.transferencia.repo.modelo.Transferencia;

@Repository
public class TransferenciaRepoImpl implements ITransferenciaRepo {

	private List<Transferencia> base = new ArrayList<>();

	@Override
	public void insertar(Transferencia transferencia) {
		base.add(transferencia);

	}

	@Override
	public Transferencia selecionar(String num) {
		for (Transferencia cta : base) {

			if (cta.getNum().equals(num)) {

				return cta;
			}
		}

		return null;
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		this.eliminar(transferencia.getNum());
		this.insertar(transferencia);

	}

	@Override
	public void eliminar(String num) {
		Transferencia trans = this.selecionar(num);
		base.remove(num);

	}

}
