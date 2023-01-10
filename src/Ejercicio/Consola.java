package Ejercicio;

public class Consola implements Imprimible, Borrable{
    static String contenido = "contenido";

    public void pantalla(){
        System.out.printf("$");
    }

    @Override
    public void borrar(){
        System.out.println("*");
    }

    @Override
    public void establecerContenido() {
        System.out.println("$" + contenido);
    }

    @Override
    public void imprime() {
    }

}