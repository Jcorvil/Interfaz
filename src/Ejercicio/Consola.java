package Ejercicio;

public class Consola implements Imprimible{
    static String pagina = "Hola";
    static String color = " verde";
    @Override
    public void imprime(){
        System.out.println(pagina);
    }
    public void color(){
        System.out.println(pagina + color);
    }
}