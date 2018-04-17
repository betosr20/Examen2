package com.renta.pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.renta.peliculas.Pelicula;

class pruebaPelicula {

	@Test
	void test1() {
		Pelicula peli = new Pelicula("Star Wars: The empire strikes back", 0);
		peli.persist();
		assertEquals(peli, Pelicula.get("Star Wars: The empire strikes back"));
		
	}

}
