package menu.Unidades.Volumen;
import javax.swing.JOptionPane;


public class ConversorVolumen {
	
	
	public static void ejecucion() {
		TasaVolumen TMedida = new TasaVolumen();
		int salir = 0;
		while (salir != 1) {		
				String medidaOrigen = JOptionPane.showInputDialog(null, "Selecione Medida a Convertir", "Seleccion",JOptionPane.QUESTION_MESSAGE, null, TMedida.unidades, TMedida.unidades[3]).toString();
				String medidaDestino = JOptionPane.showInputDialog(null, "Selecione Destino", "Seleccion",	JOptionPane.QUESTION_MESSAGE, null, TMedida.unidades, TMedida.unidades[3]).toString();
				String input = JOptionPane.showInputDialog(null,"Ingrese la cantidad de " + medidaOrigen + " que desea convertir: ");
				try {
					double montoAConvertir = Double.parseDouble(input);	
					double TMedidaOrigen = TMedida.Tasa(medidaOrigen);
					double TMedidaDestino = TMedida.Tasa(medidaDestino);			
					double paso1 = montoAConvertir * TMedidaOrigen;
					double paso2 = paso1 / TMedidaDestino;				
					JOptionPane.showMessageDialog(null,	montoAConvertir + " " + medidaOrigen + " equivalen a " + paso2 + " " +  medidaDestino, null,JOptionPane.INFORMATION_MESSAGE);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "El valor ingresado debe contener solo numeros y los decimales separados por un punto", "Error", JOptionPane.ERROR_MESSAGE, null);
				}	
				
				String[] volver = { "SI", "NO" };
				salir = JOptionPane.showOptionDialog(null, "Desea Realizar otra convercion?", null, 0,
						JOptionPane.QUESTION_MESSAGE, null, volver, null);
		}

	}
}
