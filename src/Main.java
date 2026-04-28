import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaTareas = new ArrayList<>();

        agregarTarea(listaTareas, "Ordenar cuarto");
        agregarTarea(listaTareas, "Estudiar java");
        agregarTarea(listaTareas, "Hacer Informe");
        agregarTarea(listaTareas, "Recoger a mi hija del colegio");
        agregarTarea(listaTareas, "Dar de comer al gato");

        mostrarTareas(listaTareas);

        eliminarTarea(listaTareas, "Ordenar cuarto");

        mostrarTareasPendientes(listaTareas);

    }

    public static void agregarTarea(List<String> lista, String tarea) {
        lista.add(tarea);
    }

    public static void mostrarTareas(List<String> lista) {
        System.out.println("\n ====== Lista de Tareas ====== ");

        for (int i = 0; i < lista.size(); i ++) {
            System.out.println((i + 1) + "." + lista.get(i));
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

        for (int i = 0; i < lista.size(); i ++) {
            System.out.println((i + 1) + "." + lista.get(i));
        }
    }
}