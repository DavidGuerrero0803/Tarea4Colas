public class Main {
    public static void main(String[] args) {
//        ColaDoble<String> cola = new ColaDoble<>(5);
//
//        cola.insertarFin("Bob");
//        cola.insertarFin("Cesar");
//        System.out.println("Insertados 2 elementos por el final.");
//        cola.insertarInicio("Alice");
//        System.out.println("Insertado 1 elemento al inicio.");
//
//        System.out.println(" ");
//        String eliminadoInicio = cola.eliminarInicio();
//        System.out.println("Elemento eliminado del inicio: " + eliminadoInicio);
//        String eliminadoFin = cola.eliminarFin();
//        System.out.println("Elemento eliminado del final: " + eliminadoFin);
//
//        System.out.println("Eliminando elemento restante por el inicio: " + cola.eliminarInicio());
//
//        System.out.println(" ");
//        System.out.println("Tratando de eliminar más elementos");
//        cola.eliminarInicio();
//        cola.eliminarFin();
//
//        System.out.println(" ");
//        System.out.println("Llenando la cola con 5 elementos nuevos...");
//        cola.insertarFin("1");
//        cola.insertarFin("2");
//        cola.insertarFin("3");
//        cola.insertarFin("4");
//        cola.insertarFin("5");
//
//        System.out.print("Intentando insertarDato dato extra por el final: ");
//        cola.insertarFin("6");
//
//        System.out.print("Intentando insertarDato dato extra por el inicio: ");
//        cola.insertarInicio("0");

        ColaPrioridad<String> cola = new ColaPrioridad<>(3);

        System.out.println("Insertando 3 tareas de diferentes prioridades..");
        cola.insertarDato("Tarea Baja", 1);
        cola.insertarDato("Tarea Alta", 10);
        cola.insertarDato("Tarea Media", 5);

        System.out.println(" ");
        System.out.println("Prueba de eliminación de elementos por prioridad");
        System.out.println("Eliminado un elemento: " + cola.eliminarDato());
        System.out.println("Eliminado un 2do elemento: " + cola.eliminarDato());
        System.out.println("Eliminado un 3er elemento:" + cola.eliminarDato());

        System.out.println(" ");
        System.out.println("Tratando de eliminar otro elemento..");
        cola.eliminarDato();
    }
}