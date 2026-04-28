import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<String, Double> trabajadores = new HashMap<>();

        agregarTrabajador(trabajadores, "Juan", 2000);
        agregarTrabajador(trabajadores, "Ana", 2500);
        agregarTrabajador(trabajadores, "Pedro", 1800);

        mostrarTrabajadores(trabajadores);

        actualizarSalario(trabajadores, "Juan", 3000);

        mostrarTrabajadores(trabajadores);

        calcularPromedio(trabajadores);
    }

    public static void agregarTrabajador(Map<String, Double> map, String nombre, double salario) {
        map.put(nombre, salario);
    }

    public static void mostrarTrabajadores(Map<String, Double> map) {

        System.out.println("\n===== TRABAJADORES =====");

        for (String nombre : map.keySet()) {
            System.out.println(nombre + " -> $" + map.get(nombre));
        }
    }

    public static void actualizarSalario(Map<String, Double> map, String nombre, double nuevoSalario) {

        if (map.containsKey(nombre)) {
            map.put(nombre, nuevoSalario);
            System.out.println("Salario actualizado de " + nombre);
        } else {
            System.out.println("Trabajador no encontrado");
        }
    }

    public static void calcularPromedio(Map<String, Double> map) {

        double suma = 0;

        for (double salario : map.values()) {
            suma += salario;
        }

        double promedio = suma / map.size();

        System.out.println("\nPromedio de salarios: " + promedio);
    }
}