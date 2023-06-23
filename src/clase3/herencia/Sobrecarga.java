package clase3.herencia;

public class Sobrecarga {

    public int edad;
    public String nombre;
    
    public Sobrecarga(){
        this.edad = 30;
        this.nombre = "Fulano";
    }
    
    public Sobrecarga(int numero){
        this.edad = numero;
        this.nombre = "Fulano";
    }
    
    public Sobrecarga(int numero, String nombre){
        this.edad =numero;
        this.nombre = nombre;
    }
    
    public int getNumero(){
        return 2;
    }
    
    public int getNumero(int numero){
        return numero;
    }
}
