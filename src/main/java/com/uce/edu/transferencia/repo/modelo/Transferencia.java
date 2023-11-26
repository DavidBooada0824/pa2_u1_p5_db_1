package com.uce.edu.transferencia.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;


@Component
public class Transferencia {
	
	private Integer num;
	private LocalDateTime fecha;
	private BigDecimal monto;
	private CtaBancaria ctaOrigen;
	private CtaBancaria ctaDestino;
	
	
	//set y get
	public LocalDateTime getFecha() {
		return fecha;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public CtaBancaria getCtaOrigen() {
		return ctaOrigen;
	}
	public void setCtaOrigen(CtaBancaria ctaOrigen) {
		this.ctaOrigen = ctaOrigen;
	}
	public CtaBancaria getCtaDestino() {
		return ctaDestino;
	}
	public void setCtaDestino(CtaBancaria ctaDestino) {
		this.ctaDestino = ctaDestino;
	}
	
	@Override
	public String toString() {
		return "Transferencia [num=" + num + ", fecha=" + fecha + ", monto=" + monto + ", ctaOrigen=" + ctaOrigen
				+ ", ctaDestino=" + ctaDestino + "]";
	}
	
	
	
	
	

}
