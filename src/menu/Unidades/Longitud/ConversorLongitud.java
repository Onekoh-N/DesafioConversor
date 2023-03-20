package menu.Unidades.Longitud;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;



public class ConversorLongitud {
	
	public static void ejecucion() {
		int salir = 0;
		while (salir != 1) {
			TasaLongitud TMedida = new TasaLongitud();
			DecimalFormat formato = new DecimalFormat("#.######");		
			String medidaOrigen = JOptionPane.showInputDialog(null, "Selecione Medida a Convertir", "Seleccion",JOptionPane.QUESTION_MESSAGE, null, TasaLongitud.unidades, TasaLongitud.unidades[3]).toString();
			String medidaDestino = JOptionPane.showInputDialog(null, "Selecione Destino", "Seleccion",	JOptionPane.QUESTION_MESSAGE, null, TasaLongitud.unidades, TasaLongitud.unidades[3]).toString();
			String input = JOptionPane.showInputDialog(null,"Ingrese la cantidad de " + medidaOrigen + " que desea convertir: ");
			try {
				double montoAConvertir = Double.parseDouble(input);			
				double TMedidaOrigen = TMedida.Tasa(medidaOrigen);
				double TMedidaDestino = TMedida.Tasa(medidaOrigen);			
				double paso1 = montoAConvertir * TMedidaOrigen;
				double paso2 = paso1 / TMedidaDestino;
				String resultado = formato.format(paso2);
				JOptionPane.showMessageDialog(null,	montoAConvertir + " " + medidaOrigen + " equivalen a " + resultado + " " +  medidaDestino, null,JOptionPane.INFORMATION_MESSAGE);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "El valor ingresado debe contener solo numeros y los decimales separados por un punto", "Error", JOptionPane.ERROR_MESSAGE, null);
			}
			String[] volver = { "SI", "NO" };
			salir = JOptionPane.showOptionDialog(null, "Desea Realizar otra convercion?", null, 0,
					JOptionPane.QUESTION_MESSAGE, null, volver, null);
		}

	}
}
