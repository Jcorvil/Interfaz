package Ejercicio;

public class TestImpresiones {

    //Ejercicio 8 --
    public static void main(String[] args) {
        Consola primero = new Consola();
        primero.imprime();
        primero.borrar();
        primero.establecerContenido("Buenas");

        Imprimible segundo = new Impresora();
        segundo.imprime();
        segundo.borrar();
        segundo.establecerContenido("Adios");
        segundo.imprime();
    }
}