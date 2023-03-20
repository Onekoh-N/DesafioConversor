package menu.Unidades.Volumen;

import java.util.ArrayList;
import java.util.Arrays;

public class TasaVolumen {
	Double[] tasas = { 1e+6, 1e+5, 1e+4, 1e+3, 1e+2, 1e+1, 1.0,
			1e+15,	1e+12,	1e+9,	1e+6,	1e+3,	1.0,	1e-3};
	String[] unidades = {"KiloLitro (kl)", "HectoLitro (hl)", "DecaLitro (dal)",
			"Litro (l)","DeciLitro (dl)", "CentiLitro (cl)", "MiliLitro (ml)",
			"Kilometro Cubico (km3)", "Hectometro Cubico (hm3)", "Decametro Cubico (dam3)",
			 "Metro Cubico (m3)","Decimetro Cubico (dm3)", 	"Centimetro Cubico (cm3)", 
			 "Milimetro Cubico (mm3)"};
	ArrayList<String> listaUnidades = new ArrayList<String>(Arrays.asList(unidades));

	public Double Tasa (String dato) {
		int indice = listaUnidades.indexOf(dato);
		Double tasa = tasas[indice];
		return tasa;
	}	
}
