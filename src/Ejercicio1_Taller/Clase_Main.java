package Ejercicio1_Taller;

public class Clase_Main {

    public static void main(String[] args) {

        // Creé el objeto Tierra con los valores específicos que representan sus características
        Clase_Planeta tierra = new Clase_Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150, Clase_Planeta.TipoPlaneta.TERRESTRE, true);

        // Creé el objeto Júpiter con los valores específicos que representan sus características
        Clase_Planeta jupiter = new Clase_Planeta("Júpiter", 79, 1.899E27, 1.43128E15, 139820, 750, Clase_Planeta.TipoPlaneta.GASEOSO, true);

        // Llamé al método para mostrar los atributos y cálculos de la Tierra
        tierra.mostrarAtributos(); // Mostré los atributos del planeta Tierra
        System.out.println("Densidad del planeta = " + tierra.obtenerDensidad()); // Calculé e imprimí la densidad de la Tierra
        System.out.println("Es planeta exterior = " + tierra.esPlanetaExterior()); // Determiné e imprimí si la Tierra es un planeta exterior
        System.out.println();

        // Profesor, acá llamé al método para mostrar los atributos y cálculos de Júpiter
        jupiter.mostrarAtributos(); // Mostré los atributos del planeta Júpiter
        System.out.println("Densidad del planeta = " + jupiter.obtenerDensidad()); // Calculé e imprimí la densidad de Júpiter
        System.out.println("Es planeta exterior = " + jupiter.esPlanetaExterior()); // Determiné e imprimí si Júpiter es un planeta exterior
    }

}


