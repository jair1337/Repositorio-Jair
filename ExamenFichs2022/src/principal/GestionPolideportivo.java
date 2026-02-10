package principal;

import java.io.File;

public class GestionPolideportivo {

	public static void main(String[] args) {
		File fichero = new File("recursos.dat");

		
		int opcion;
        do {
            System.out.println("1. Introducir un nuevo recurso");
            System.out.println("2. Inscribir una persona en un curso concreto");
            System.out.println("3. Mostrar los cursos disponibles ");
            System.out.println("4. Mostrar una lista con los diferentes deportes");
            System.out.println("5. Salir");
            opcion = Util.leerInt();

            switch (opcion) {

                case 1: introducirNuevoRecurso(); break;
                case 2: inscribirPersonaACurso(); break;
                case 3: /* mostrarCursos(); */ break; 
                case 4:/* mostrarDeportes(); */ break;
           
            }

        } while (opcion != 5);

	}

	private static void introducirNuevoRecurso() {
	
	}
	
	private static void inscribirPersonaACurso() {
		
	}
/*
	private static void mostrarCursos() {
		
	}

	private static void mostrarDeportes() {
		
	}
*/
	
}
