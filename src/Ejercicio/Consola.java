package Ejercicio;

public class Consola implements Imprimible, Borrable{
    static String contenido = "contenido";

    //Ejercicio 4
    private String pantalla = "$ texto de pantalla";

    @Override
    public void imprime(){
        System.out.printf("'%S'" , pantalla);
    }

    //Ejercicio 5
    @Override
    public void establecerContenido(String contenido) {
        System.out.println("$ " + contenido);
    }

    //Ejercicio 6
    @Override
    public void borrar(){
        System.out.println("*****");
    }

}