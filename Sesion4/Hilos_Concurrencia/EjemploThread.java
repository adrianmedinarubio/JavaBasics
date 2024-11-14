package Hilos_Concurrencia;

class MiHilo extends Thread {
    private String nombre;

    public MiHilo(String nombre) {
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

public class EjemploThread {
    public static void main(String[] args) {

        MiHilo hilo1 = new MiHilo("Hilo 1");
        MiHilo hilo2 = new MiHilo("Hilo 2");

        hilo1.start();
        hilo2.start();
    }
}