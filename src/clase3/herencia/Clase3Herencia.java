package clase3.herencia;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import otroPaquete.Hermano;

public class Clase3Herencia {

    public static void main(String[] args) {

        // Arrays Dinamicos
        
        ArrayList arreglo = new ArrayList();
        arreglo.add(0);
        arreglo.add(0.23);
        arreglo.add("A");
        arreglo.add("oración");
        arreglo.add(true);
        arreglo.add(false);
        arreglo.add('\uFFFF');
        
        System.out.println(arreglo);
        
        for(int i = 0; i < arreglo.size(); i++)
            System.out.println("For i: " + arreglo.get(i));
        
        
        arreglo.remove(true);
        
        for(Object item : arreglo)
            System.out.println("For (:) : " + item + "     " + item.getClass());
        
        arreglo.remove(4);
        arreglo.remove(1);
        
        arreglo.forEach((item) -> {
            System.out.printf("forEach: %s %s %n",item, item.getClass().getName());
        });
        
        
        
        
        // JOPTIONPANE
        
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro número"));
        char letra = JOptionPane.showInputDialog("Ingrese una letra").charAt(0);
        
        System.out.printf("Los números ingresados son %d %.2f y la letra es %c %n", numero1, numero2, letra);
        
        
        
        
        // SOBRECARGA DE CONSTRUCTORES
        
        Sobrecarga primeraClase = new Sobrecarga();
        System.out.println("Edad primera Clase: " + primeraClase.edad);
        System.out.println("Nombre primera Clase: " + primeraClase.nombre);
        
        Sobrecarga segundaClase = new Sobrecarga(5);
        System.out.println("Edad segunda Clase: " + segundaClase.edad);
        System.out.println("Nombre segunda Clase: " + segundaClase.nombre);

        Sobrecarga terceraClase = new Sobrecarga(10, "Pepe");
        System.out.println("Edad tercera Clase: " + terceraClase.edad);
        System.out.println("Nombre tercera Clase: " + terceraClase.nombre);
        
        System.out.println(terceraClase.getNumero());
        System.out.println(terceraClase.getNumero(7));
        

        
        
        
        // Herencia
        
        Hijo hijo = new Hijo(8);
        System.out.println(hijo.pertenencia);
        System.out.println(hijo.herenciaPadre);
        System.out.println(hijo.herenciaAbuelo);
        
        Hermano hermano = new Hermano(9);
        System.out.println(hermano.herenciaProtegidaPadre);
    }

}
