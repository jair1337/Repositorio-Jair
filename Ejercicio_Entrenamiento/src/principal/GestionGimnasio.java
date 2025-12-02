package principal;
import java.util.*;
import java.time.LocalDate;
import java.util.Iterator;
import clases.Cliente;
import clases.Cliente.Entrenamiento;



public class GestionGimnasio {

	public static void main(String[] args) {

		//						DNI(STRING)		Nomre(STRING)	Fecha(localdate)
		Cliente c1 = new Cliente("12345678A", "Brayan Soto", LocalDate.now());
		
		//							Fecha		Ejercico	Repeticiones
		c1.agregarEntrenamiento(LocalDate.now(), "Press banca", 40);
		c1.agregarEntrenamiento(LocalDate.now(), "Jalon al pecho", 30);
		c1.agregarEntrenamiento(LocalDate.now(), "Flexiones", 50);
		
		System.out.println("Informacion del entrenamiento: ");
		c1.visualizar();
		
		// Aniadir 1 dia al hashmap (especificamente el valor, no la clave) mediante un iterator
		
		Iterator<Map.Entry<String, Cliente.Entrenamiento>> it = c1.getEntrenamientos().entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Cliente.Entrenamiento> entry = it.next();
			
		    Entrenamiento aniadirUno = entry.getValue();

		    aniadirUno.setFecha(aniadirUno.getFecha().plusDays(1));
			
		
		}
		
		System.out.println("Informacion del entrenamiento TRAS un dia: ");
		c1.visualizar();
	}

}
