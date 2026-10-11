// Definición de la clase Empleado (El "molde")
class Empleado {
    // 1. Atributos (Las características de los objetos)
    String nombre;
    String puesto;
    double salario;

    // 2. Constructor (Método especial para inicializar los datos)
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    // 3. Métodos (Las acciones que puede realizar el objeto)
    public void mostrarDetalles() {
        System.out.println("--- Información del Empleado ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: $" + salario);
    }

    // Método para calcular un bono anual (ejemplo de lógica)
    public void calcularBono() {
        double bono = salario * 0.10;
        System.out.println("Bono anual (10%): $" + bono);
        System.out.println("--------------------------------");
    }
}

// Clase Principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Instanciación de objetos (Crear objetos reales a partir de la clase)
        Empleado empleado1 = new Empleado("Carlos Pérez", "Desarrollador Junior", 18000.0);
        Empleado empleado2 = new Empleado("Ana Gómez", "Diseñadora UX", 20000.0);

        // Uso de los métodos en los objetos creados
        empleado1.mostrarDetalles();
        empleado1.calcularBono();

        empleado2.mostrarDetalles();
        empleado2.calcularBono();
    }
}