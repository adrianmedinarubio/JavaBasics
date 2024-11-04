package Hilos_Concurrencia;

class Mensaje {
    private String contenido;
    private boolean disponible = false;

    public synchronized String recibir() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        disponible = false;
        notifyAll();
        return contenido;
    }

    public synchronized void enviar(String mensaje) {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        contenido = mensaje;
        disponible = true;
        notifyAll();
    }
}

class Emisor implements Runnable {
    private Mensaje mensaje;

    public Emisor(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        String[] mensajes = {
            "Mensaje 1",
            "Mensaje 2",
            "Mensaje 3",
            "Mensaje 4",
            "Mensaje 5"
        };

        for (String msg : mensajes) {
            System.out.println("Enviando " + msg);
            mensaje.enviar(msg);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Receptor implements Runnable {
    private Mensaje mensaje;

    public Receptor(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String msgRecibido = mensaje.recibir();
            System.out.println("Mensaje recibido: " + msgRecibido);
        }
    }
}

public class EjemploBloqueoNotificacion {
    public static void main(String[] args) {
        Mensaje mensaje = new Mensaje();
        Emisor emisor = new Emisor(mensaje);
        Receptor receptor = new Receptor(mensaje);

        Thread hiloEmisor = new Thread(emisor);
        Thread hiloReceptor = new Thread(receptor);

        hiloEmisor.start();
        hiloReceptor.start();
    }
}