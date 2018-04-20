package com.renta.peliculas;

public class AlquilerEstreno extends Alquiler{

	public AlquilerEstreno(Disco pDisco, int pDiasAlquilado) {
		super(pDisco, pDiasAlquilado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio() {
		return getDiasAlquilado() * 3;
	}
}
