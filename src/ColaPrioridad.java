public class ColaPrioridad<T> {
    private T[] cola;
    private int[] prioridades;
    private int capacidad;
    private int elementos;

    public ColaPrioridad() {
        cola = (T[]) (new Object[5]);
        this.prioridades = new int[5];
        this.capacidad = 5;
        this.elementos = 0;
    }

    public ColaPrioridad(int capacidad) {
        cola = (T[]) (new Object[capacidad]);
        this.prioridades = new int[capacidad];
        this.capacidad = capacidad;
        this.elementos = 0;
    }

    public void insertarDato(T dato, int prioridad) {
        if (elementos == capacidad) {
            System.out.println("Desbordamiento");
            return;
        }

        int i;
        for (i = elementos - 1; i >= 0; i--) {
            if (prioridad > prioridades[i]) {
                prioridades[i + 1] = prioridades[i];
                cola[i + 1] = cola[i];
            } else {
                break;
            }
        }
        cola[i + 1] = dato;
        prioridades[i + 1] = prioridad;
        elementos++;
    }

}
