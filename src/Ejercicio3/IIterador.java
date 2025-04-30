package Ejercicio3;

public interface IIterador<T> {
    boolean hasNext();
    T next();
    void delete();
}
