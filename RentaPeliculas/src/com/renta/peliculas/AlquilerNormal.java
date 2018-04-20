package com.renta.peliculas;

import Interfaces.Calcular;

public class AlquilerNormal extends Alquiler{

	public AlquilerNormal(Disco pDisco, int pDiasAlquilado) {
		super(pDisco, pDiasAlquilado);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calcularPrecio() {
    	double montoAlquiler =2;
        if (getDiasAlquilado() > 2)
        	montoAlquiler += (getDiasAlquilado() - 2) * 1.5;
		return montoAlquiler;
	}
}
