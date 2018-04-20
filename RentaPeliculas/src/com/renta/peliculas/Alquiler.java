package com.renta.peliculas;

public abstract class Alquiler{
    private Disco disco;
    private int diasAlquilado;
	
	public int getDiasAlquilado() {
    	return diasAlquilado;
    }
    public Disco getDisco() {
    	return disco;
    }
    
    public Alquiler(Disco pDisco, int pDiasAlquilado) {
    	disco = pDisco;
    	diasAlquilado = pDiasAlquilado;
    }
    
    public abstract double calcularPrecio();
}
