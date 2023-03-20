package menu;
import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		int salir = 0;
		while (salir != 1) {
			String[] conversores = { "Moneda", "Extras" };
			int conversor = JOptionPane.showOptionDialog(null, "Seleccione el Tipo de convercion:", "Conversor", 0,
					JOptionPane.QUESTION_MESSAGE, null, conversores, null);
			switch (conversor) {
				case 0: // Conversor Moneda
					Conversor.ejecucion(conversores[conversor]);
					break;
				case 1: // Conversores Extras
					String[] Extras = { "Longitud", "Temperatura", "Tiempo", "Volumen" }; 
					int opcion = JOptionPane.showOptionDialog(null, "Seleccione el Tipo de convercion:", "Conversor", 0,
							JOptionPane.QUESTION_MESSAGE, null, Extras, null);
					
					Conversor.ejecucion(Extras[opcion]);
					break;
			}

			String[] volver = { "Volver al Menu Principal", "Salir del Programa" };
			salir = JOptionPane.showOptionDialog(null, "Seleccione una opcion:", "Salir?", 0,
					JOptionPane.QUESTION_MESSAGE, null, volver, null);
		}
	}
}
