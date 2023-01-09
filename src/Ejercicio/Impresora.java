package Ejercicio;

public class Impresora implements Imprimible{
    static String pagina = "Hola";
    @Override
    public void imprime(){
        System.out.println(pagina);
    }
}