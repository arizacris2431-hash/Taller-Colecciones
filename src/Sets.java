import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set<String> libros = new HashSet<>();

        agregarLibro(libros, "Harry Potter");
        agregarLibro(libros, "El Principito");
        agregarLibro(libros, "Clean Code");
        agregarLibro(libros, "Harry Potter"); // duplicado (NO se agrega)

        mostrarLibros(libros);

        verificarLibro(libros, "El Principito");

        contarLibros(libros);
    }

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
}