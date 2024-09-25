import java.util.Stack;

public class Nodo {

    private int dato;
    public Nodo next;

    public Nodo(int dato) {
        this.dato = dato;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Dato: " + dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    
    
}
