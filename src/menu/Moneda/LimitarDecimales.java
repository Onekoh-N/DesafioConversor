package menu.Moneda;

import java.text.DecimalFormat;

public class LimitarDecimales {

	public static void main(String[] args) {
		double numero = 3.14159265359;

		DecimalFormat formato = new DecimalFormat("#.##");
		String numeroFormateado = formato.format(numero);

		System.out.println(numeroFormateado);
	}
}
