package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad = 0;
		for (int posicion = 0; posicion<asientos.length ; posicion ++) {
			if(asientos[posicion] != null) {
				cantidad ++;
			}
		}
		return cantidad; 
	}
	
	String verificarIntegridad() {
		if (this.registro == this.motor.registro) {
			for (int posicion = 0; posicion<asientos.length ; posicion ++) {
				if(asientos[posicion] != null) {
					if(asientos[posicion].registro != this.registro) {
						return("Las piezas no son originales");
					
					} else {
							return("Auto original");
					}
				}
			}
		}
		return ("Las piezas no son originales");
	}
}



