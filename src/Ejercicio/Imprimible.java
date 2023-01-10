package Ejercicio;

public interface Imprimible extends Borrable{
    final String TEXTO_POR_DEFECTO = "Página de Prueba";
    void imprime();
    void establecerContenido();
}