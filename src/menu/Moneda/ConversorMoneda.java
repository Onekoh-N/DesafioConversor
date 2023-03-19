package menu.Moneda;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConversorMoneda {
	static String[] monedas = { " Dolares Estadounidenses", " Pesos Argentinos", " Euros", " Yen Japonés",
			" Libras Esterlinas", " Won sul-coreano" };

	public static void ejecucion() {
		int salir = 0;
		while (salir != 1) {
			DecimalFormat formato = new DecimalFormat("#.##");			
			String monedaOrigen = JOptionPane.showInputDialog(null, "Selecione Moneda a Convertir", "Seleccion",
					JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[0]).toString();
			String monedaDestino = JOptionPane.showInputDialog(null, "Selecione Destino", "Seleccion",
					JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[0]).toString();
			String input = JOptionPane.showInputDialog(null,
					"Ingrese la cantidad de " + monedaOrigen + " que desea convertir: ");
			double montoAConvertir = Integer.parseInt(input);
			TasaMonedas TMonedaOrigen = new TasaMonedas(monedaOrigen);
			TasaMonedas TMonedaDestino = new TasaMonedas(monedaDestino);			
			double paso1 = montoAConvertir / TMonedaOrigen.getTasa();
			double paso2 = paso1 * TMonedaDestino.getTasa();
			String numeroFormateado = formato.format(paso2);
			JOptionPane.showMessageDialog(null,
					montoAConvertir + monedaOrigen + " equivalen a " + numeroFormateado + monedaDestino, null,
					JOptionPane.INFORMATION_MESSAGE);

			String[] volver = { "SI", "NO" };
			salir = JOptionPane.showOptionDialog(null, "Desea Realizar otra convercion?", null, 0,
					JOptionPane.QUESTION_MESSAGE, null, volver, null);
		}
	}

}
