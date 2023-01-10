package Ejercicio;

public class Consola implements Imprimible, Borrable{
    static String pagina = "Hola";
    static String color = " verde";
    static String pantalla = "$";
    static String borrar = "*";
    
    public void pantalla(){
        System.out.printf(pantalla);
    }

    @Override
    public void borrar(){
        System.out.println(borrar);
    }


    @Override
    public void imprime(){
        System.out.println(pagina);
    }
    public void color(){
        System.out.println(pagina + color);
    }

    @Override
    public void TEXTO_POR_DEFECTO() {

    }
}