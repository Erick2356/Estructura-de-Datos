import java.util.Stack;

public class AplMain {
    public static void main(String[] args) {

        Lista lst = new Lista();
        lst.pop();
        Nodo n1 = new Nodo(0);
        Nodo n2 = new Nodo(1);
        Nodo n3 = new Nodo(2);
        Nodo n4 = new Nodo(3);
        Nodo n5 = new Nodo(4);
        lst.insertPila(n1);
        lst.insertPila(n2);
        lst.insertPila(n3);
        lst.insertPila(n4);
        lst.insertPila(n5);
        lst.MostarPila();
        System.out.println(lst.pop());//lst.pop();
        System.out.println("----------");
        lst.MostarPila();
        System.out.println(lst.isPila());


    
}
}