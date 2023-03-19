package menu.Unidades;

import javax.swing.JOptionPane;

import menu.Unidades.Longitud.ConversorLongitud;
import menu.Unidades.Temperatura.ConversorTemperatura;

public class Unidades {
	static String[] opciones = { "Longitud", "Temperatura", "Tiempo", "Volumen" };

	public static void ejecucion() {

		int opcion1 = JOptionPane.showOptionDialog(null, "Seleccione el Tipo de convercion:", "Conversor", 0,
				JOptionPane.QUESTION_MESSAGE, null, opciones, "Opcion 1");
		switch (opcion1) {
		case 0: // Conversor Longitud
			ConversorLongitud.ejecucion();
			break;
		case 1: // Conversor Temperatura
			ConversorTemperatura.ejecucion();
			break;
		case 2: // Conversor Tiempo
			JOptionPane.showMessageDialog(null, opcion1);
			break;
		case 3: // Conversor Volumen
			JOptionPane.showMessageDialog(null, opcion1);
			break;
		}
	}
}
