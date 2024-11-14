package Hilos_Concurrencia;

class MiTarea implements Runnable {
    private String nombre;

    public MiTarea(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(nombre + " - Contador: " + i);
            try {
                // Pausamos el hilo por 500 milisegundos
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Error en la pausa del hilo: " + e.getMessage());
            }
        }
    }
}

public class EjemploRunnable {
    public static void main(String[] args) {
        // Creamos instancias de la clase MiTarea
        MiTarea tarea1 = new MiTarea("Tarea 1");
        MiTarea tarea2 = new MiTarea("Tarea 2");

        // Creamos instancias de la clase Thread y le pasamos las tareas como argumento
        Thread hilo1 = new Thread(tarea1);
        Thread hilo2 = new Thread(tarea2);

        // Iniciamos la ejecución de los hilos con el método start()
        hilo1.start();
        hilo2.start();
    }
}