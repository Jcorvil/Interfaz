package Ejercicio;

public class Impresora implements Imprimible, Borrable{
    static String pagina = "Hola";
    static String TEXTO_POR_DEFECTO = "Página de prueba";
    static String contenido = "contenido";

    public void establecerContenido(){
        System.out.println(contenido);
    }

    @Override
    public void imprime(){
        System.out.println(pagina);
    }
    @Override
    public void borrar(){
        System.out.println(" ");
    }
}