package menu;

import javax.swing.JOptionPane;
import menu.Moneda.ConversorMoneda;
import menu.Unidades.Unidades;

public class Menu {

	public static void main(String[] args) {

		int salir = 0;
		while (salir != 1) {
			String[] conversores = { "Moneda", "Unidades" };
			int conversor = JOptionPane.showOptionDialog(null, "Seleccione el Tipo de convercion:", "Conversor", 0,
					JOptionPane.QUESTION_MESSAGE, null, conversores, null);
			switch (conversor) {
			case 0: // Conversor Moneda
				ConversorMoneda.ejecucion();
				break;
			case 1: // Conversor Unidades
				Unidades.ejecucion();
				break;
			}

			String[] volver = { "Volver al Menu Principal", "Salir del Programa" };
			salir = JOptionPane.showOptionDialog(null, "Seleccione una opcion:", "Salir?", 0,
					JOptionPane.QUESTION_MESSAGE, null, volver, null);
		}
	}
}
