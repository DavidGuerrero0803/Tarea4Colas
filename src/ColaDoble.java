public class ColaDoble<T> {
    private T[] cola;
    private int inicio;
    private int fin;
    private int tamaño;

    public ColaDoble() {
        cola = (T[])(new Object[6]);
        this.inicio = -1;
        this.fin = -1;
        this.tamaño = 0;
    }

    public ColaDoble(int capacidad) {
        cola = (T[])(new Object[capacidad]);
        this.inicio = -1;
        this.fin = -1;
        this.tamaño = 0;
    }

    public void insertarInicio(T dato) {
        if (tamaño == cola.length) {
            System.out.println("Desbordamiento");
            return;
        }

        if (tamaño == 0) {
            inicio = 0;
            fin = 0;
        } else {
            inicio = (inicio - 1 + cola.length) % cola.length;
        }

        cola[inicio] = dato;
        tamaño++;
    }

    public void insertarFin(T dato) {
        if (tamaño == cola.length) {
            System.out.println("Desbordamiento");
            return;
        }

        if (tamaño == 0) {
            inicio = 0;
            fin = 0;
        } else {
            fin = (fin + 1) % cola.length;
        }

        cola[fin] = dato;
        tamaño++;
    }
}
