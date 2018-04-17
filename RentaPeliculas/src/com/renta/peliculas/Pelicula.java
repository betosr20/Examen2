package com.renta.peliculas;

import com.renta.enums.TipoPelicula;

public class Pelicula {
		
		private TipoPelicula tipoPelicula;
	    private String nombre; 

		public Pelicula(String pNombre, TipoPelicula ptipoPelicula) {
			setNombre(pNombre);
			tipoPelicula = ptipoPelicula;
		}

		public void setTipoPelicula(TipoPelicula ptipo) {
			tipoPelicula=ptipo;
		}
		
		public TipoPelicula getTipoPelicula() {
			return tipoPelicula;
		}

		public void persist() {
			Registrar.add ("Peliculas", this);
		}

		public static Pelicula get(String name) {
			return (Pelicula) Registrar.get ("Peliculas", name);
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
}
