package Ejercicio;

public interface Editable {
    public default void establecerContenido(){
        System.out.println();
    }
}