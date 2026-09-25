package cola;

public class ColaCircular<T> {
    private int frente, fin, tamano, capacidad;
    private T[] datos;

    public ColaCircular() {
        this.capacidad = 10;
    }

    public ColaCircular(int capacidad) {
        this.frente = -1;
        this.fin = -1;
        this.tamano = 0;
        this.capacidad = capacidad;
        this.datos = (T[]) new Object[capacidad];
    }

    public boolean estaVacia() {
        return tamano == 0;
    }

    public boolean estaLlena() {
        return tamano == capacidad;
    }

    public int tamanio() {
        return tamano;
    }

    public void insertarDato(T dato) {
        if (estaLlena()) {
            System.out.println("Desbordamiento");
            return;
        }
        if (frente == -1) {
            frente = 0;
        }
        fin = (fin + 1) % capacidad;
        datos[fin] = dato;
        tamano++;
    }

    public T eliminarCircular() {
        if (estaVacia()) {
            System.out.println("Subdesbordamiento");
            return null;
        }
        T dato = datos[frente];
        datos[frente] = null;
        tamano--;

        if (tamano == 0) {
            frente = -1;
            fin = -1;
        } else {
            frente = (frente + 1) % capacidad;
        }
        return dato;
    }

    public String toString() {
        if (estaVacia()) {
            return "Cola vacía";
        }

        String resultado = "";
        int i = frente;
        int contados = 0;

        while (contados < tamano) {
            resultado += datos[i] + " ";
            i = (i + 1) % capacidad;
            contados++;
        }

        return resultado.trim();
    }
}