package main;
import java.util.*;

public class Estudiantes {

	public static void main(String[] args) {

		ArrayList<String> alumnos = new ArrayList<>();

		alumnos.add("Ana");
		alumnos.add("Luis");
		alumnos.add("Marta");
		alumnos.add("Juan");
		alumnos.add("Pedro");

		ListIterator<String> it = alumnos.listIterator();

        System.out.println("Recorrer y modificar:");

        while(it.hasNext()) {
            String valor = it.next();
            System.out.println(valor);

            if (valor.startsWith("P")) {
            	it.set(valor.toUpperCase());

            }
            
            if (valor.startsWith("M")) {
            	it.add("Marcos");

            }

        }

        System.out.println("Lista después de modificaciones: ");
		for (String nombre: alumnos) {
			System.out.println(nombre);
		}
        
		System.out.println("Lista hacia atras: ");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}

		it = alumnos.listIterator();
		System.out.println("Avanzando hacia el medio de la lista:");
		int steps = alumnos.size() / 2;
		for (int i = 0; i < steps && it.hasNext(); i++) {
			System.out.println("Avanzando: " + it.next());
		}

		System.out.println("Retrocediendo desde el medio:");
		while (it.hasPrevious()) {
			System.out.println("Retrocediendo: " + it.previous());
		}
	}
	
}