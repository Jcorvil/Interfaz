package Ejercicio;

public class Impresora implements Imprimible, Borrable{
    static String pagina = "Hola";
    @Override
    public void imprime(){
        System.out.println(pagina);
    }
    @Override
    public void borrar(){
        System.out.println("");
    }
}