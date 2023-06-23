package clase3.herencia;

public class Padre extends Abuelo {
    
    protected String herenciaProtegidaPadre = "Herencia Protegida: Ahorros";
    String herenciaPadre = "Herencia Padre: Auto";
    int valorPadre;
    
    public Padre(int numero){
        valorPadre = numero;
    }

}
