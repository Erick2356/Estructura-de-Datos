package listaslink3;

public class Estudiante {
    private String nombre;
    private int cantidadLibros;
    private char sexo;
    
   
    
    public Estudiante(String nombre, int cantidadLibros, char sexo) {
        this.nombre = nombre;
        this.cantidadLibros = cantidadLibros;
        this.sexo = sexo;
    }



    public Estudiante() {
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getCantidadLibros() {
        return cantidadLibros;
    }



    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }



    public char getSexo() {
        return sexo;
    }



    public void setSexo(char sexo) {
        this.sexo = sexo;
    }



    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", cantidadLibros=" + cantidadLibros + ", sexo=" + sexo + "]";
    }
    

    
}
