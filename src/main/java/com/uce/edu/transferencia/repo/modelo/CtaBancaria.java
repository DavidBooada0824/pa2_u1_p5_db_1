package com.uce.edu.transferencia.repo.modelo;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

//@Component
public class CtaBancaria {
	
	private String num;
	private String cedulaPropietario;
	private BigDecimal saldo;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getCedulaPropietario() {
		return cedulaPropietario;
	}
	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "CtaBancaria [num=" + num + ", cedulaPropietario=" + cedulaPropietario + ", saldo=" + saldo + "]";
	}


}
