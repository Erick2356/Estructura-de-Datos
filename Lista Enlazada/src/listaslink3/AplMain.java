/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaslink3;

import java.util.Scanner;

/**
 * Lista simplemente enlzada:
 * - Inserta el nodo al inicio.
 * - inserta el nodo al final
 * - Cuenta la cantidad de nodos
 * - Muestra la lista
 * - método para saber si la lista está vacia
 * - Borrar elementos de la lista
 */
public class AplMain {
    
    static Scanner e = new Scanner(System.in);
    
    public static void main(String[] args) {
      Lista lst = new Lista();
      for(int i =0; i< 4; i++){
        System.out.println("Ingrese los datos del estudiante " + (i + 1) + ":");
        System.out.println("Nombre: ");
        String nombre = e.nextLine();
        System.out.println("Cantidad libros: ");
        int cantidadL = e.nextInt();
        System.out.print("Sexo (F o M): ");
        char sexo;
        while (true) {
          System.out.print("Sexo (F o M): ");
          String sexoInput = e.nextLine();
          if (sexoInput.length() == 1 && (sexoInput.charAt(0) == 'F' || sexoInput.charAt(0) == 'M')) {
              sexo = sexoInput.charAt(0);
              break;
          } else {
              System.out.println("Entrada inválida. Por favor, ingrese 'F' o 'M'.");
          }
      }
        
        Estudiante estudiante = new Estudiante(nombre,cantidadL,sexo);
        lst.insertInicio(estudiante);
      }
      System.out.println("Total libros consultados por estudiantes: ");
      int totallibros = lst.TotalLibrosConsultados();
      System.out.println(totallibros);
      System.out.println("Promedio libros consultados por estudiantes: ");
      double promedio = lst.CalcularPromedio();
      System.out.println(promedio);
      System.out.println("Mayor cantidad libros consultados: ");
      int mCantidad = lst.MayorCantidadLibrosConsultados();
      System.out.println(mCantidad);
      System.out.println("De que sexo quiere calcular la cantidad de libros (F o M): ");
      char sexoS = e.nextLine().charAt(0);
      int cantidad = lst.ContadorSexo(sexoS);
      System.out.println("La cantidad de libros consultados es: " + cantidad);
      System.out.println(" Nombre de los estudiantes que consultaron una cantidad de libros superior al promedio: ");
      String n = lst.NombreMayorPromedioLibros();
      System.out.println(n);
      e.close();
      

    }
    
}
