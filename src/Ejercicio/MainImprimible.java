package Ejercicio;

import static Ejercicio.Imprimible.pagina;

public class MainImprimible {
    public static void main(String[] args) {
        Imprimible primero = new Impresora();
        primero.imprime();
        System.out.println(pagina);
    }
}