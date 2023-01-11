package Ejercicio;

public interface Imprimible extends Borrable, Editable {

    //Ejercicio 2
    String TEXTO_POR_DEFECTO = "Página de Prueba";

    //Ejercicio 1
    void imprime();

    void establecerContenido(String contenido);
}