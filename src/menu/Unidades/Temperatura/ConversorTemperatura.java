package menu.Unidades.Temperatura;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public static void ejecucion() {
		int salir = 0;
		while (salir != 1) {
			DecimalFormat formato = new DecimalFormat("#.##");
			String[] temperaturas = { " Kelvin", " Celsius", " Fahrenheit " };
			String tempturaOrigen = JOptionPane.showInputDialog(null, "Selecione Temperatura a Convertir", "Seleccion",
					JOptionPane.QUESTION_MESSAGE, null, temperaturas, temperaturas[0]).toString();
			String tempDestino = JOptionPane.showInputDialog(null, "Selecione Destino", "Seleccion",
					JOptionPane.QUESTION_MESSAGE, null, temperaturas, temperaturas[0]).toString();
			String input = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Grados " + tempturaOrigen
					+ " que desea convertir a grados " + tempDestino + ":");
			double AConvertir = Integer.parseInt(input);
			TasasTemp Convercion = new TasasTemp(tempturaOrigen, tempDestino, AConvertir);
			String numeroFormateado = formato.format(Convercion.TempDestino);
			JOptionPane.showMessageDialog(null, AConvertir + " Grados " + tempturaOrigen + " equivalen a "
					+ numeroFormateado + " Grados " + tempDestino);
			String[] volver = { "SI", "NO" };
			salir = JOptionPane.showOptionDialog(null, "Desea Realizar otra convercion?", null, 0,
					JOptionPane.QUESTION_MESSAGE, null, volver, null);
		}
	}
}
