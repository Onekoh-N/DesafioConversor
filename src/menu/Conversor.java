package menu;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Conversor {

	public static void ejecucion(String TipoConversor) {
		datos medida = new datos(TipoConversor);
		double resultado;
		int salir = 0;
		while (salir != 1) {
			DecimalFormat formato = new DecimalFormat(medida.formato);
			String medidaOrigen = JOptionPane.showInputDialog(null, "Selecione Medida a Convertir", "Seleccion", JOptionPane.QUESTION_MESSAGE, null, medida.Lista(), null).toString();
			String medidaDestino = JOptionPane.showInputDialog(null, "Selecione Destino", "Seleccion",JOptionPane.QUESTION_MESSAGE, null, medida.Lista(), null).toString();
			String input = JOptionPane.showInputDialog(null,"Ingrese la cantidad de " + medidaOrigen + " que desea convertir: ");
			try {
				double montoAConvertir = Double.parseDouble(input);
				if (TipoConversor == "Temperatura") {
					Temperatura temp = new Temperatura(medidaOrigen, medidaDestino, montoAConvertir);
					resultado = temp.TempDestino;
				} else {
					double paso1 = montoAConvertir * medida.Tasa(medidaOrigen);
					resultado = paso1 / medida.Tasa(medidaDestino);

				}
				String resultFormat = formato.format(resultado);
				if (resultado < 0.001 && TipoConversor != "Temperatura") {
					JOptionPane.showMessageDialog(null, "El resultado es demasiado pequeño para mostrarse ", "Error", JOptionPane.ERROR_MESSAGE, null);
				} else {
					JOptionPane.showMessageDialog(null,	montoAConvertir + " " + medidaOrigen + " equivalen a " + resultFormat + " " + medidaDestino, null, JOptionPane.INFORMATION_MESSAGE);
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,	"El valor ingresado debe contener solo numeros y los decimales separados por un punto", "Error", JOptionPane.ERROR_MESSAGE, null);
			}
			String[] volver = { "SI", "NO" };
			salir = JOptionPane.showOptionDialog(null, "Desea Realizar otra convercion de " + TipoConversor + "?", null, 0, JOptionPane.QUESTION_MESSAGE, null, volver, null);
		}
	}
}
