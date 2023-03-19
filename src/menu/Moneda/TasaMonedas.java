package menu.Moneda;

import java.util.ArrayList;
import java.util.Arrays;

public class TasaMonedas {
	Double[] tasas = { 1.0, 203.5, 0.94, 131.84, 0.82, 1308.75 };
	private Double tasa;
	ArrayList<String> monedas = new ArrayList<String>(Arrays.asList(" Dolares Estadounidenses",
			" Pesos Argentinos"," Euros"," Yen Japonés"," Libras Esterlinas"," Won sul-coreano"));
	
	public TasaMonedas(String dato) {
		int indice = monedas.indexOf(dato);
		this.tasa = tasas[indice];
	}

	public Double getTasa() {
		return tasa;
	}
}
