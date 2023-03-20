package menu;

import java.util.ArrayList;
import java.util.Arrays;

public class Tasas {
	Double[] tasas = { 1.0, 0.0049, 1.07, 0.0076, 1.22, 0.00076247 };
	String[] unidades = { " Dolares Estadounidenses", " Pesos Argentinos", " Euros", " Yen Japonés",
			" Libras Esterlinas", " Won surcoreano" };
	ArrayList<String> listaUnidades = new ArrayList<String>(Arrays.asList(unidades));
	
	public Tasas() {
		Double[] tasas = { 1.0, 0.0049, 1.07, 0.0076, 1.22, 0.00076247 };
		String[] unidades = { " Dolares Estadounidenses", " Pesos Argentinos", " Euros", " Yen Japonés",
				" Libras Esterlinas", " Won surcoreano" };
		ArrayList<String> listaUnidades = new ArrayList<String>(Arrays.asList(unidades));
	}

	public Double Tasa (String dato) {
		int indice = listaUnidades.indexOf(dato);
		return tasas[indice];
	}
}
