package methods;
import main.*;

public class Metodos {

    public static void main(String[] args) {

    Productos[] Inventario = new Productos[4];

	Productos productMaxMas = null;
	Productos productMaxMenos = null;

	//										Stock/Precio
    Inventario[0] = new Productos("Teclados", 1, 4);
    Inventario[1] = new Productos("Ratones", 4, 8);
    Inventario[2] = new Productos("Pantallas", 6, 2);
    Inventario[3] = new Productos("Alfombrillas", 10, 4);

     for (int i = 0; i < Inventario.length; i++) { 
    	 Productos productoMasCaro = Inventario[i];
			
			if (productMaxMas == null || productoMasCaro.getPrecio() > productMaxMas.getPrecio()) {
					productMaxMas = productoMasCaro;
				}
     }
     
     for (int i = 0; i < Inventario.length; i++) { 
    	 Productos productoMenosCaro = Inventario[i];
			
			if (productMaxMenos == null || productoMenosCaro.getPrecio() < productMaxMenos.getPrecio()) {
					productMaxMenos = productoMenosCaro;
				}
			
				System.out.println("Producto con mayor precio: " + productMaxMas.getNombre() + " | Precio: " + productMaxMas.getPrecio());
				System.out.println("Producto con mayor precio: " + productMaxMenos.getNombre() + " | Precio: " + productMaxMenos.getPrecio());	
		
			
     }
     
     for (int i = 0; i < Inventario.length; i++) {
    	    if (Inventario[i] == productMaxMas) {
    	        Inventario[i] = productMaxMenos;
    	    } else if (Inventario[i] == productMaxMenos) {
    	        Inventario[i] = productMaxMas;
    	    }
    }
     
     System.out.println("Inventario despues del cambio:");
     for (int i = 0; i < Inventario.length; i++) {
         System.out.println(i + ": " + Inventario[i].getNombre() + 
                            " | Precio: " + Inventario[i].getPrecio());
     } 
     
    

    } 		
   
}
    
    
