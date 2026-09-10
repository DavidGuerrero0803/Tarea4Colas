public class ColaDoble<T> {
    private T[] cola;
    private int inicio;
    private int fin;

    public ColaDoble() {
        cola = (T[]) (new Object[6]);
        this.inicio = -1;
        this.fin = -1;
    }

    public ColaDoble(int capacidad) {
        cola = (T[]) (new Object[capacidad]);
        this.inicio = -1;
        this.fin = -1;
    }

    public void insertarInicio(T dato) {
        if ((inicio == 0 && fin == cola.length - 1) || (inicio == 0 && fin != -1)) {
            if (fin < cola.length - 1) {
                for (int i = fin; i >= inicio; i--) {
                    cola[i + 1] = cola[i];
                }
                fin++;
            } else {
                System.out.println("Desbordamiento");
                return;
            }
        } else if (inicio == -1) {
            inicio = 0;
            fin = 0;
        } else {
            inicio--;
        }

        cola[inicio] = dato;
    }

    public void insertarFin(T dato) {
        if (fin == cola.length - 1) {
            System.out.println("Desbordamiento");
            return;
        }

        if (inicio == -1) {
            inicio = 0;
            fin = 0;
        } else {
            fin++;
        }

        cola[fin] = dato;
    }

}
