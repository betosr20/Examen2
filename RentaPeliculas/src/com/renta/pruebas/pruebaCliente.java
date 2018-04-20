package com.renta.pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.renta.enums.TipoPelicula;
import com.renta.peliculas.Alquiler;
import com.renta.peliculas.Cliente;
import com.renta.peliculas.Disco;
import com.renta.peliculas.Pelicula;

import Fabricas.FabricaAlquiler;

class pruebaCliente {

	@Test
	void testPersistencia() {
		Cliente cliente = new Cliente("Shirley");
		cliente.persist();
		assertEquals(cliente, Cliente.get("Shirley"));
	}

	@Test
	void testResultado() {
		Cliente cliente = new Cliente("Shirley");
		Pelicula pelicula = new Pelicula("Ready player one", TipoPelicula.ESTRENO);
		Disco disco = new Disco ("L1", pelicula);
		Alquiler alquiler = FabricaAlquiler.getAlquiler(disco, 2);
		cliente.addRental(alquiler);
		String testString;
		testString ="Alquileres de " + "Shirley" + ":\n";
		testString += "\t" + "Ready player one"+ "\t" + "6.0" + "\n";
		testString +=  "Monto total:  " + "6.0" + "\n";
		testString += "Gano " + "2" + " puntos por alquiler frecuente";
		assertEquals(testString, cliente.statement());
	}
		
}
