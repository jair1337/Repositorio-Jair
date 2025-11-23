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

		Iterator<String> it = alumnos.iterator();

		// Imprimir los nombres

        System.out.println("Nombres alumnos:");

        while(it.hasNext()) {
            String valor = it.next();
            System.out.println(valor);


         // Eliminar nombre con menos de 4 letras

            if(valor.length() > 4) {
                it.remove();      
            }

        }

        System.out.println("Lista después de eliminar nombres con menos de 4 letras: " + alumnos);

    }
}