package Ejercicio;

public class Consola implements Imprimible, Borrable{
    static String pagina = "Hola";
    static String color = " verde";

    public void pantalla(){
        System.out.printf("$");
    }

    @Override
    public void borrar(){
        System.out.println("*");
    }

    @Override
    public void imprime(){
        System.out.println(pagina);
    }

    @Override
    public void establecerContenido() {

    }

    public void color(){
        System.out.println(pagina + color);
    }
}