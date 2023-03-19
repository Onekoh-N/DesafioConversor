package menu.Unidades.Longitud;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class ConversorLongitud {
	static String[] unidades = {"Kilometro (km)", 
			"Hectometro (hm)", "Decametro (dam)","Metro (m)","Decimetro (dm)", 
			"Centimetro (cm)", "Milimetro (mm)", "Milla (mi)", "Yarda (yd)",
			"Pie (ft)", "Pulgada (in)"};

	public static void ejecucion() {
				
		int salir = 0;
		while (salir != 1) {
			DecimalFormat formato = new DecimalFormat("#.######");		
			String medidaOrigen = JOptionPane.showInputDialog(null, "Selecione Medida a Convertir", "Seleccion",JOptionPane.QUESTION_MESSAGE, null, unidades, unidades[3]).toString();
			String medidaDestino = JOptionPane.showInputDialog(null, "Selecione Destino", "Seleccion",	JOptionPane.QUESTION_MESSAGE, null, unidades, unidades[3]).toString();
			String input = JOptionPane.showInputDialog(null,"Ingrese la cantidad de " + medidaOrigen + " que desea convertir: ");
			double montoAConvertir = Integer.parseInt(input);			
			TasaLongitud TMedidaOrigen = new TasaLongitud(medidaOrigen);
			TasaLongitud TMedidaDestino = new TasaLongitud(medidaDestino);			
			double paso1 = montoAConvertir * TMedidaOrigen.getTasa();
			double paso2 = paso1 / TMedidaDestino.getTasa();
			String resultado = formato.format(paso2);
			JOptionPane.showMessageDialog(null,	montoAConvertir + " " + medidaOrigen + " equivalen a " + resultado + " " +  medidaDestino, null,JOptionPane.INFORMATION_MESSAGE);
			String[] volver = { "SI", "NO" };
			salir = JOptionPane.showOptionDialog(null, "Desea Realizar otra convercion?", null, 0,
					JOptionPane.QUESTION_MESSAGE, null, volver, null);
		}

	}
}
