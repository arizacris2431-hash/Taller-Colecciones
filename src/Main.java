import java.util.*;

public class Main {
    public static void main(String[] args) {


        // Lista de Tareas

        List<String> listaTareas = new ArrayList<>();

        agregarTarea(listaTareas, "Ordenar cuarto");
        agregarTarea(listaTareas, "Estudiar java");
        agregarTarea(listaTareas, "Hacer Informe");
        agregarTarea(listaTareas, "Recoger a mi hija del colegio");
        agregarTarea(listaTareas, "Dar de comer al gato");

        mostrarTareas(listaTareas);

        eliminarTarea(listaTareas, "Ordenar cuarto");

        mostrarTareasPendientes(listaTareas);


        // Sets Libros

        Set<String> libros = new HashSet<>();

        agregarLibro(libros, "Harry Potter");
        agregarLibro(libros, "El Principito");
        agregarLibro(libros, "Clean Code");
        agregarLibro(libros, "Harry Potter"); // duplicado (NO se agrega)

        mostrarLibros(libros);

        verificarLibro(libros, "El Principito");

        contarLibros(libros);

        // Maps

        Map<String, Double> trabajadores = new HashMap<>();

        agregarTrabajador(trabajadores, "Juan", 2000);
        agregarTrabajador(trabajadores, "Ana", 2500);
        agregarTrabajador(trabajadores, "Pedro", 1800);

        mostrarTrabajadores(trabajadores);

        actualizarSalario(trabajadores, "Juan", 3000);

        mostrarTrabajadores(trabajadores);

        calcularPromedio(trabajadores);
    }


    // metodos Listas

    public static void agregarTarea(List<String> lista, String tarea) {
        lista.add(tarea);
    }

    public static void mostrarTareas(List<String> lista) {
        System.out.println("\n ====== Lista de Tareas ====== ");

        for (String l : lista) {
            System.out.println("- " + l);
        }
    }

    public static void eliminarTarea (List<String> lista, String tarea) {
        System.out.println("\n ====== Eliminar Tarea Completada ====== ");

        for (int i = 0; i < lista.size(); i ++) {
            if (lista.get(i).equals(tarea)) {
                System.out.println("Tarea completada y eliminada: " + lista.remove(i));
                break;
            }
        }
    }

    public static void mostrarTareasPendientes (List<String> lista) {

        System.out.println("\n ====== Lista de Tareas Pendientes ====== ");

        for (String l : lista) {
            System.out.println("- " + l);
        }
    }

    // metodos setos

    public static void agregarLibro(Set<String> libros, String libro) {
        libros.add(libro);
    }

    public static void mostrarLibros(Set<String> libros) {
        System.out.println("\n===== Libros disponibles =====");
        for (String l : libros) {
            System.out.println("- " + l);
        }
    }

    public static void verificarLibro(Set<String> libros, String libro) {
        System.out.println("\n===== Verificar Libros =====");
        if (libros.contains(libro)) {
            System.out.println("El libro '" + libro + "' está disponible");
        } else {
            System.out.println("El libro '" + libro + "' NO está disponible");
        }
    }

    public static void contarLibros(Set<String> libros) {
        System.out.println("\nTotal de libros: " + libros.size());
    }


    // metodos maps

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