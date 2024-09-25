public class Lista {
   
    private Nodo primero;
   
     public Lista(){ 
        primero = null;
    }
    
     
    public void insertPila (Nodo nodo){
        if (primero == null) {
            primero = nodo;

        } else {
            nodo.next=primero;
            primero = nodo;

        }

    } 

    public Nodo valorTope(){
        if (primero == null) {
            System.out.println("Pila vacia");
            return null;
        }else{
            Nodo aux = primero;
            aux.next = null;
            return aux;
        }

    }

    public Nodo pop(){
        if (primero != null) {


        Nodo aux = primero;
        primero = primero.next;
        aux.next = null;
        return aux;
        }else{
            System.out.println("No se puede eliminar debido a que la pila esta vacia");
            return null;
        }

    }

    public boolean isPila(){
        if (primero == null) {
            return false;
        }else{
            return true;
        }
    }
    
    public void MostarPila(){

        Nodo actual = primero;
        while (actual!= null){
            System.out.println(actual.toString());
            actual = actual.next;
        }
     }
     
     
}
