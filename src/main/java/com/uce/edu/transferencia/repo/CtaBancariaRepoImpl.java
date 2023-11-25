package com.uce.edu.transferencia.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.transferencia.repo.modelo.CtaBancaria;

@Repository
public class CtaBancariaRepoImpl implements ICtaBancariaRepo {

	private List<CtaBancaria> base = new ArrayList<>();

	@Override
	public void insertar(CtaBancaria bancaria) {
		base.add(bancaria);

	}

	@Override
	public CtaBancaria selecionar(String num) {
		for (CtaBancaria cta : base) {

			if (cta.getNum().equals(num)) {
				
				CtaBancaria cta1 = new CtaBancaria();
				cta1.setCedulaPropietario(cta.getCedulaPropietario());
				cta1.setNum(cta.getNum());
				cta1.setSaldo(cta.getSaldo());
				
				return cta;
				
			}
		}
		System.out.println("No existe la cuenta ." + num);
		return null;
	}

	@Override
	public void actualizar(CtaBancaria bancaria) {
		this.eliminar(bancaria.getNum());
		this.insertar(bancaria);

	}

	@Override
	public void eliminar(String num) {
		CtaBancaria cta = this.selecionar(num);
		base.remove(num);

	}

}
