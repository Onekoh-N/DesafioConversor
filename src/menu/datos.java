package menu;

import java.util.ArrayList;
import java.util.Arrays;

public class datos {	
	ArrayList <Double> tasas;
	ArrayList <String> unidades;
	String formato = "#.###";
	datos(String convercion) {
		
		switch (convercion) {
			case "Moneda":
				tasas = new ArrayList<Double>(Arrays.asList(1.0, 0.0076 , 1.07, 0.0049, 1.22, 0.00076247));
				unidades = new ArrayList<String>( Arrays.asList(" Dolares Estadounidenses"," Yen Japonés" , " Euros", " Pesos Argentinos", 
																" Libras Esterlinas", " Won surcoreano"));
				break;
			case "Longitud":
				tasas = new ArrayList<Double>(Arrays.asList( 1.0, 0.1, 0.01, 0.001, 0.0001, 0.00001, 0.000001, 1.60934, 0.0009144, 0.0003048, 2.54e-5));
				unidades = new ArrayList<String>( Arrays.asList("Kilometro (km)", "Hectometro (hm)", "Decametro (dam)","Metro (m)",
																"Decimetro (dm)","Centimetro (cm)", "Milimetro (mm)", "Milla (mi)", 
																"Yarda (yd)", "Pie (ft)", "Pulgada (in)"));
				break;
			case "Temperatura":
				unidades = new ArrayList<String>( Arrays.asList(" Kelvin", " Celsius", " Fahrenheit "));
				break;
			case "Volumen":
				tasas = new ArrayList<Double>(Arrays.asList(1e+6, 1e+5, 1e+4, 1e+3, 1e+2, 1e+1, 1.0,
						1e+15,	1e+12,	1e+9,	1e+6,	1e+3,	1.0,	1e-3));
				unidades = new ArrayList<String>( Arrays.asList("KiloLitro (kl)", "HectoLitro (hl)", "DecaLitro (dal)",
						"Litro (l)","DeciLitro (dl)", "CentiLitro (cl)", "MiliLitro (ml)",
						"Kilometro Cubico (km3)", "Hectometro Cubico (hm3)", "Decametro Cubico (dam3)",
						 "Metro Cubico (m3)","Decimetro Cubico (dm3)", 	"Centimetro Cubico (cm3)", 
						 "Milimetro Cubico (mm3)"));	
				break;
			case "Tiempo":
				tasas = new ArrayList<Double>(Arrays.asList(1.0, 60.0, 3600.0, 86400.0 , 604800.0, 31536000.0));
				unidades = new ArrayList<String>( Arrays.asList("Segundos", "Minutos", "Horas", "Dias", "Semanas", "Años"));
				break;	
			default:
				break;
		}
	}
	
	public Double Tasa (String dato) {
		int indice = unidades.indexOf(dato);
		return tasas.get(indice);
	}
	
	public String[] Lista () {
		String[] listaunidades = new String[unidades.size()];
		listaunidades = unidades.toArray(listaunidades);
		return listaunidades;
	}
	
}
