package Ejercicio1_Taller;

public class Clase_Planeta {

    private String nombrePlaneta; // Creé esta variable para almacenar el nombre del planeta
    private int numeroSatelites; // Creé esta variable para almacenar el número de satélites que tiene el planeta
    private double masaPlaneta; // Creé esta variable para almacenar la masa del planeta en kilogramos
    private double volumenPlaneta; // Creé esta variable para almacenar el volumen del planeta en kilómetros cúbicos
    private int diametroPlaneta; // Creé esta variable para almacenar el diámetro del planeta en kilómetros
    private int distanciaSol; // Creé esta variable para almacenar la distancia del planeta al sol en millones de kilómetros
    private TipoPlaneta tipoPlaneta; // Creé esta variable para almacenar el tipo de planeta (GASEOSO o TERRESTRE)
    private boolean esObservable; // Creé esta variable para indicar si el planeta es observable desde la Tierra

    // Constructor que inicializó los atributos del planeta
    public Clase_Planeta(String nombrePlaneta, int numeroSatelites, double masaPlaneta, double volumenPlaneta, int diametroPlaneta, int distanciaSol, TipoPlaneta tipoPlaneta, boolean esObservable) {
        this.nombrePlaneta = nombrePlaneta; // Asigné el nombre del planeta
        this.numeroSatelites = numeroSatelites; // Asigné el número de satélites
        this.masaPlaneta = masaPlaneta; // Asigné la masa del planeta
        this.volumenPlaneta = volumenPlaneta; // Asigné el volumen del planeta
        this.diametroPlaneta = diametroPlaneta; // Asigné el diámetro del planeta
        this.distanciaSol = distanciaSol; // Asigné la distancia al sol en millones de kilómetros
        this.tipoPlaneta = tipoPlaneta; // Asigné el tipo de planeta
        this.esObservable = esObservable; // Indiqué si el planeta es observable o no
    }

    // En este apartado hice un método que muestra todos los atributos del planeta en pantalla
    public void mostrarAtributos() {
        /*
           Profesor, en este método mostré cada atributo del planeta, incluyendo el nombre,
           cantidad de satélites, masa, volumen, diámetro, distancia al sol, tipo de planeta, 
           y si es observable desde la Tierra. Lo hice para proporcionar una descripción completa 
           de cada planeta.
         */
        System.out.println("Nombre del planeta = " + nombrePlaneta); // Imprimí el nombre del planeta
        System.out.println("Cantidad de satélites = " + numeroSatelites); // Imprimí la cantidad de satélites
        System.out.println("Masa del planeta = " + masaPlaneta); // Imprimí la masa del planeta
        System.out.println("Volumen del planeta = " + volumenPlaneta); // Imprimí el volumen del planeta
        System.out.println("Diámetro del planeta = " + diametroPlaneta); // Imprimí el diámetro del planeta
        System.out.println("Distancia al sol = " + (distanciaSol * 1000000)); // Convertí la distancia a kilómetros e imprimí
        System.out.println("Tipo de planeta = " + tipoPlaneta); // Imprimí el tipo de planeta
        System.out.println("Es observable = " + esObservable); // Indiqué si el planeta es observable o no
    }

    // Método que calculó y retornó la densidad del planeta
    public double obtenerDensidad() {
        /*
           Profesor, aquí calculé la densidad del planeta dividiendo su masa por su volumen. 
           Este valor es útil para entender las características físicas del planeta. 
           Al final, retorné el valor de densidad como un double.
         */
        return masaPlaneta / volumenPlaneta; // Calculé la densidad dividiendo masa entre volumen
    }

    // Creamos un método que determina si el planeta es exterior en el sistema solar
    public boolean esPlanetaExterior() {
        /*
           Profesor, en este método convertí la distancia del planeta al sol de millones de kilómetros a 
           Unidades Astronómicas (UA). Utilicé una constante para esta conversión. Luego verifiqué si 
           la distancia es mayor a 3.4 UA para definir si el planeta es exterior en el sistema solar.
         */
        double distanciaAU = distanciaSol / 149.597870; // Convertí la distancia a Unidades Astronómicas
        return distanciaAU > 3.4; // Verifiqué si el planeta está a más de 3.4 UA del sol
    }

    // Aquí creamos una enumeración que definió los tipos de planeta
    public enum TipoPlaneta {
        GASEOSO, TERRESTRE; // Definí los tipos de planeta: GASEOSO y TERRESTRE
    }

}
