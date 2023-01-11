package Ejercicio;

//Ejercicio 3
public class Impresora implements Imprimible, Borrable{

    //Ejercicio 3
    private String pagina;

    //Ejercicio 3
    public Impresora(){
        pagina = Imprimible.TEXTO_POR_DEFECTO;
    }

    //Ejercicio 5
    @Override
    public void establecerContenido(String contenido){
        pagina = contenido;
    }

    @Override
    public void imprime(){
        System.out.println(pagina);
    }

    //Ejercicio 6
    @Override
    public void borrar(){
        pagina = " ";
        System.out.println(" ");
    }

}