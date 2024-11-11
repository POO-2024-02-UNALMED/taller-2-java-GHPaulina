package test;

public class Asiento {
	String color;
    int precio;
    int registro;
    
    void cambiarColor(String color) {
        // Usamos equals() para comparar cadenas
        if (color.equals("rojo") || color.equals("verde") || color.equals("amarillo") || color.equals("negro") || color.equals("blanco")) {
            this.color = color;  // Cambia el color del objeto actual
        }        
    }
}
