package menu.Unidades.Longitud;

import java.util.ArrayList;
import java.util.Arrays;

public class TasaLongitud {
	Double[] tasas = { 1.0, 0.1, 0.01, 0.001, 0.0001, 0.00001, 0.000001, 1.60934, 0.0009144, 0.0003048, 2.54e-5};
	private Double tasa = 1.1;
	ArrayList<String> longitud = new ArrayList<String>(Arrays.asList("Kilometro (km)", 
			"Hectometro (hm)", "Decametro (dam)","Metro (m)","Decimetro (dm)", 
			"Centimetro (cm)", "Milimetro (mm)", "Milla (mi)", "Yarda (yd)",
			"Pie (ft)", "Pulgada (in)"));

	public TasaLongitud(String dato) {
		int indice = longitud.indexOf(dato);
		this.tasa = tasas[indice];
	}

	public Double getTasa() {
		return tasa;
	}
}
