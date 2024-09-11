/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaslink3;

/**
 *
 * @author ASUS
 */
public class Lista {
   
    private Nodo primero;
   
     public Lista(){ 
        primero = null;
    }
    
     
    public void insertInicio (Estudiante estudiante){
        Nodo nuevo = new Nodo (estudiante);
        nuevo.next = primero;
        primero = nuevo;
    } 
    
     public void insertFinal (Estudiante estudiante){ 
        Nodo nuevo = new Nodo(estudiante);
        if (primero == null){
        primero = nuevo;
        }
        else {
            Nodo actual = primero;
            while (actual.next!= null){
                actual = actual.next;

            }
            actual.next = nuevo;
        }
    }
    
    
    
    public void borrar(String nombre) {
        if (primero== null) return;

        if (primero.estudiante.getNombre().equals(nombre)) {
            primero = primero.next;
            return;
        }

        Nodo actual = primero;
        while (actual.next != null && !actual.next.estudiante.getNombre().equals(nombre)) {
            actual = actual.next;
        }

        if (actual.next != null) {
            actual.next = actual.next.next;
        }
    }
    
     public boolean ListaVacia(){
       
        if (primero==null)
              return true;
         else
              return false;   
    } 
     
    public void MostarLista(){

        Nodo actual = primero;
        while (actual!= null){
            System.out.println(actual.estudiante);
            actual = actual.next;
        }
     }
     
    

     public double CalcularPromedio(){
        if (primero==null) return 0.0;
        int sumaLibros = 0;
        int contador = 0;
        Nodo actual = primero;
        while (actual!= null){
            sumaLibros += actual.estudiante.getCantidadLibros();
            contador++;
            actual = actual.next;

        }
        return (double) sumaLibros/contador;
          
     }

     public int ContadorSexo(char sexo){
        int totalLibros = 0;
        Nodo actual = primero;
        while (actual != null) {
            if (actual.estudiante.getSexo()== sexo) {
                totalLibros+= actual.estudiante.getCantidadLibros();
                }
                actual = actual.next;


     }
     return totalLibros;

}

public int TotalLibrosConsultados() {
    int totalLibros = 0;
    Nodo actual = primero;
    while (actual != null) {
        totalLibros += actual.estudiante.getCantidadLibros();
        actual = actual.next;
    }
    return totalLibros;
}

public int MayorCantidadLibrosConsultados() {
    int maxLibros = 0;
    Nodo actual = primero;
    while (actual != null) {
        int librosEstudiante = actual.estudiante.getCantidadLibros();
        if (librosEstudiante > maxLibros) {
            maxLibros = librosEstudiante;
        }
        actual = actual.next;
    }
    return maxLibros;
}

public String NombreMayorPromedioLibros(){
    String nombre = "";
    Nodo actual = primero;
    while(actual!= null){
        if (actual.estudiante.getCantidadLibros()> CalcularPromedio()) {
            nombre += actual.estudiante.getNombre();
        

            
        }
        actual = actual.next;
    }
    return nombre;
}

}



