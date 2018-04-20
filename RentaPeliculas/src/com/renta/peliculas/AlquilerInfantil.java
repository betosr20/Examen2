package com.renta.peliculas;

public class AlquilerInfantil extends Alquiler{

	public AlquilerInfantil(Disco pDisco, int pDiasAlquilado) {
		super(pDisco, pDiasAlquilado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio() {
    	double montoAlquiler = 1.5;
    	if (getDiasAlquilado() > 3)
    		montoAlquiler += (getDiasAlquilado() - 3) * 1.5;
		return montoAlquiler;
	}
}
