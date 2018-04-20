package Fabricas;
import com.renta.peliculas.Alquiler;
import com.renta.peliculas.AlquilerEstreno;
import com.renta.peliculas.AlquilerInfantil;
import com.renta.peliculas.AlquilerNormal;
import com.renta.peliculas.Disco;

public class FabricaAlquiler {

	public FabricaAlquiler() {
		
	}
	
	public static Alquiler getAlquiler(Disco pDisco, int pDiasAlquilado) {
	    switch (pDisco.getPelicula().getTipoPelicula()){
        
	    case NORMAL:
	    	return new AlquilerNormal(pDisco, pDiasAlquilado);

	    case ESTRENO:
	    	return new AlquilerEstreno(pDisco, pDiasAlquilado);

	    case INFANTIL:
	    	return new AlquilerInfantil(pDisco, pDiasAlquilado);

	    default: return null;
	  	}
	}

}
