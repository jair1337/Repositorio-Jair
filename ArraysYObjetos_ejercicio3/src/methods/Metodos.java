package methods;
import main.*;

public class Metodos {

    public static void main(String[] args) {

    Productos[] Inventario = new Productos[6];

    int posicion = 0;

    Inventario[0] = new Productos("Teclados", 1, 4);
    Inventario[3] = new Productos("Ratones", 4, 8);
    Inventario[4] = new Productos("Pantallas", 6, 4);
    Inventario[5] = new Productos("Alfombrillas", 10, 4);

     for (int i = 0; i < Inventario.length; i++) { 
            if (Inventario[i] != null) {
                Inventario[posicion] = Inventario[i];
                posicion++;
            }
        }

        	while (posicion < Inventario.length) {
            Inventario[posicion] = null;
            posicion++;  
        	} 

        		System.out.println("Inventario reorganizado:");
        			for (int i = 0; i < Inventario.length; i++) {
        				if (Inventario[i] != null) {
        					System.out.println(i + ": " + Inventario[i].getNombre());
        				} 
        				else 
        				{
        					System.out.println(i + ": null");
        				}
       
        }
   
    }
    
    
}