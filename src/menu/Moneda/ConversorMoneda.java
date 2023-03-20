package menu.Moneda;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class ConversorMoneda {

	public static void ejecucion() {
		int salir = 0;
		while (salir != 1) {
			TasaMonedas TMedida = new TasaMonedas();
			DecimalFormat formato = new DecimalFormat("#.##");			
			String medidaOrigen = JOptionPane.showInputDialog(null, "Selecione Moneda a Convertir", "Seleccion",
					JOptionPane.QUESTION_MESSAGE, null, TMedida.unidades, TMedida.unidades[0]).toString();
			String medidaDestino = JOptionPane.showInputDialog(null, "Selecione Destino", "Seleccion",
					JOptionPane.QUESTION_MESSAGE, null, TMedida.unidades, TMedida.unidades[0]).toString();
			String input = JOptionPane.showInputDialog(null,
					"Ingrese la cantidad de " + medidaOrigen + " que desea convertir: ");
			try {
			double montoAConvertir = Integer.parseInt(input);
			double TMonedaOrigen = TMedida.Tasa(medidaOrigen);
			double TMonedaDestino = TMedida.Tasa(medidaDestino);			
			double paso1 = montoAConvertir * TMonedaOrigen;
			double paso2 = paso1 / TMonedaDestino;
			String numeroFormateado = formato.format(paso2);
			JOptionPane.showMessageDialog(null,
					montoAConvertir + medidaOrigen + " equivalen a " + numeroFormateado + medidaDestino, null,
					JOptionPane.INFORMATION_MESSAGE);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "El valor ingresado debe contener solo numeros y los decimales separados por un punto", "Error", JOptionPane.ERROR_MESSAGE, null);
			}	
			String[] volver = { "SI", "NO" };
			salir = JOptionPane.showOptionDialog(null, "Desea Realizar otra convercion?", null, 0,
					JOptionPane.QUESTION_MESSAGE, null, volver, null);
		}
	}

}
