package menu;

public class Temperatura {
	Double TempDestino;

	public Temperatura(String origen, String destino, double temp) {

		if (origen == destino) {
			TempDestino = temp;
		}
		// ºC a ºF:
		if (origen == " Celsius" && destino == " Fahrenheit ") {
			TempDestino = temp * 1.8 + 32;
		}
		// ºF a ºC:
		if (origen == " Fahrenheit " && destino == " Celsius") {
			TempDestino = (temp - 32) / 1.8;
		}
		// K a ºC:
		if (origen == " Kelvin" && destino == " Celsius") {
			TempDestino = temp - 273.15;
		}
		// ºC a K:
		if (origen == " Celsius" && destino == " Kelvin") {
			TempDestino = temp + 273.15;
		}
		// ºF a K:
		if (origen == " Fahrenheit " && destino == " Kelvin") {
			TempDestino = ((0.5555) * (temp - 32)) + 273.15;
		}
		// K a ºF:
		if (origen == " Kelvin" && destino == " Fahrenheit ") {
			TempDestino = 1.8 * (temp - 273.15) + 32;
		}
	}
}
