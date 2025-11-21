package methods;
import main.*;
public class Metodos {

	public static void main(String[] args) {

		Productos[] Inventario = new Productos[4];
		
		double total= 0;

		
		Inventario[0] = new Productos("Teclados", 5, 50.99);
		Inventario[1] = new Productos("Ratones", 15, 40.99);
		Inventario[2] = new Productos("Pantallas", 5, 110.99);
		Inventario[3] = new Productos("Alfombrillas", 2, 15.99);
				
		for (int i = 0; i < Inventario.length; i++){ 
			
			if (Inventario[i] !=null && Inventario[i].getStock() % 2 !=0) {
				
				total = total + Inventario[i].getPrecio();
			}
			System.out.println(total);
		}

	}
	
}