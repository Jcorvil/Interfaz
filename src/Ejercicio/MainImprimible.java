package Ejercicio;

public class MainImprimible {
    public static void main(String[] args) {
        Imprimible primero = new Impresora();
        primero.imprime();

        Consola segundo = new Consola();
        segundo.color();
    }
}