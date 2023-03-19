package menu.Unidades.Volumen;

import javax.swing.JOptionPane;

public class Volumen {

	public void ejecucion() {

		int salir = 0;
		while (salir != 1) {
			
			

			String[] volver = { "SI", "NO" };
			salir = JOptionPane.showOptionDialog(null, "Desea Realizar otra convercion?", null, 0,
					JOptionPane.QUESTION_MESSAGE, null, volver, null);
		}

	}
}
