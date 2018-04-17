package com.renta.pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.renta.peliculas.Pelicula;

class pruebaPelicula {

	@Test
	void test1() {
		Pelicula peli = new Pelicula("Lord of the Rings", 0);
		peli.persist();
		assertEquals(peli, Pelicula.get("Lord of the Rings"));
		
	}

}
