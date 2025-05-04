package Ejercicio3;


import static Ejercicios.GsonUtilEjemplo.guardarObjetoEnArchivo;




public class ListaSimplementeEnlazada<T> implements Lista<T> {
    protected ElementoSE<T> cabeza;

    //Constructors
    public ListaSimplementeEnlazada() {
        this.cabeza = null;
    }

    public ListaSimplementeEnlazada(ElementoSE<T> cabeza) {
        this.cabeza = cabeza;
    }

    @Override
    public boolean add(T dato) {
        ElementoSE<T> temporal = new ElementoSE<T>(dato);
        if (this.getCabeza() == null) {
            setCabeza(temporal);
            return true;
        } else {
            temporal.setSiguiente(this.cabeza);
            this.cabeza = temporal;
            return true;
        }
    }

    @Override
    public boolean delete(T dato) {
        if (this.getCabeza() == null) {
            return false;
        }
        if (this.getCabeza().getDato().equals(dato)) {
            this.cabeza = cabeza.getSiguiente();
            return true;
        }
        ElementoSE<T> actual = this.cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getDato().equals(dato)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    @Override
    public int getNumElementos() {
        int contador = 0;
        ElementoSE<T> actual = this.cabeza;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    @Override
    public IIterador<T> getIterador() {
        return new IteradorSE<>(this);
    }

    public ElementoSE<T> getCabeza() {
        if (this.cabeza == null) {
            return null;
        }
        return this.cabeza;
    }

    public void setCabeza(ElementoSE<T> cabeza) {
        this.cabeza = cabeza;
    }

    public boolean isEmpty() {
        return this.cabeza == null;
    }

    public ElementoSE<T> getUltimo() {
        if (this.cabeza == null) {
            return null;
        }
        ElementoSE<T> actual = this.cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        return actual;
    }

@Override
public String toString(){
    StringBuilder resultado = new StringBuilder("Lista de Estudiantes:\n");
    ElementoSE<T> actual = this.cabeza;

    while (actual != null && actual != getUltimo()) {
        resultado.append(actual.getDato().toString()).append("\n");
        actual = actual.getSiguiente();
    }
        if(actual == getUltimo()){
            resultado.append(actual.getDato().toString());
        }else{
            resultado= null;
        }

    return resultado.toString();
}



    public static void main(String[] args) {

        ElementoSE<String> listase = new ElementoSE<>("0");
        ListaSimplementeEnlazada<String> l1 = new ListaSimplementeEnlazada<>(listase);
        l1.add("1");
        l1.add("1");
        l1.add("2");
        l1.add("3");
        l1.add("5");
        l1.add("8");
        String rutaArchivo = "src/Ejercicio3/JSON/ListaSimplementeEnlazada.json";
        guardarObjetoEnArchivo(rutaArchivo, l1);
    }
}

