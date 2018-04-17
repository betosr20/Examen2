package com.renta.pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.renta.enums.TipoPelicula;
import com.renta.peliculas.Pelicula;

class pruebaPelicula {

	@Test
	void test1() {
		Pelicula peli = new Pelicula("Star Wars: The empire strikes back", TipoPelicula.NORMAL);
		peli.persist();
		assertEquals(peli, Pelicula.get("Star Wars: The empire strikes back"));
		
	}

}
