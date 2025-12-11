package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionFirstDates {
	
	private static Scanner panel = new Scanner(System.in);
	private static ArrayList<Empleado> empleados = new ArrayList<>();
	private static ArrayList<Pretendiente> pretendientes = new ArrayList<>();

    private static String menu = "-=-=-=-=-=Encuentra tu alma gemela!=-=-=-=-=- \n"
    		+ "\n 1. Introducir un nuevo empleado o pretendiente"
    		+ "\n 2. Gestionar cita a un pretendiente"
    		+ "\n 3. Listado de citas exitosas"
    		+ "\n 4. Salir\n";
    
    public static void main(String[] args) {
        int opcion;
        do {
        	System.out.print(menu);
            opcion = panel.nextInt();
            panel.nextLine();  
            switch (opcion) {
            case 1 -> introducirEmpleadoOPretendiente();
            case 2 -> gestionarCita();
            case 3 -> listadoCitasExitosas();
            case 4 -> System.out.println("Despidete de tu alma gemela...");
            default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }
    // (1)
    private static void introducirEmpleadoOPretendiente() {
    	String tipoPersona;
        do {
        	System.out.print("¿Desea introducir un Empleado/a o un Pretendiente? (E/P): ");
        	tipoPersona = panel.nextLine().trim().toUpperCase();
        	if (!tipoPersona.equals("E") && !tipoPersona.equals("P")) {
        		System.out.println("Opcion no valida.");
        	}
        } while (!tipoPersona.equals("E") && !tipoPersona.equals("P"));

        System.out.print("Introduce el DNI: ");
        String dniIntroducido = panel.nextLine().trim();
        if (dniRepetido(dniIntroducido)) {
        	System.out.println("El DNI ya existe. No se puede introducir.");
        	return;
        }
        System.out.print("Nombre: ");
        String nombre = panel.nextLine();

        LocalDate fechaNacimiento = leerFecha("Fecha nacimiento (dd/MM/yyyy): ");

        System.out.print("Género (HOMBRE/MUJER/NO_BINARIO): ");
        Genero genero = Genero.valueOf(panel.nextLine().trim().toUpperCase());

        System.out.print("Localidad: ");
        String localidad = panel.nextLine();

        if (tipoPersona.equals("E")) 
        {
            System.out.print("Cargo que ocupa: ");
            String cargo = panel.nextLine();
            LocalDate fechaAlta = LocalDate.now();
            empleados.add(new Empleado(dniIntroducido, nombre, genero, fechaNacimiento, localidad, cargo, fechaAlta));
            System.out.println("Empleado registrado correctamente.");
            
        } 
        else if (tipoPersona.equals("P")) 
        {
            System.out.print("Género que busca (HOMBRE/MUJER/NO_BINARIO): ");
            Genero generoBuscado = Genero.valueOf(panel.nextLine().trim().toUpperCase());
            pretendientes.add(new Pretendiente(dniIntroducido, nombre, genero, fechaNacimiento, localidad, generoBuscado));
            System.out.println("Pretendiente registrado correctamente.");
        }
    }

    // (2)
    private static void gestionarCita() {
        System.out.print("Introduce DNI del pretendiente: ");
        Pretendiente pretendiente = buscarPretendientePorDNI(panel.nextLine().trim());

        if (pretendiente == null) {
            System.out.println("No existe pretendiente con ese DNI.");
            return;
        }

        System.out.println("Pretendiente: " + pretendiente.getNombre() + ", Edad: " + (LocalDate.now().getYear() - pretendiente.getFechaNacimiento().getYear()) + ", Localidad: " + pretendiente.getLocalidad());
        
        int opcionMenuCita;
        do {
            System.out.println("\n1. Establecer nueva cita");
            System.out.println("2. Evaluar cita");
            System.out.println("3. Volver");

            opcionMenuCita = pedirEntero("Elige opción: ");

            switch (opcionMenuCita) {
                case 1 -> establecerNuevaCita(pretendiente);
                case 2 -> evaluarCita(pretendiente);
            }

        } while (opcionMenuCita != 3);
    }
    // (3)
    private static void listadoCitasExitosas() {
        System.out.println("\nCitas exitosas: ");
        boolean encontrado = false;

        for (Pretendiente pretendiente : pretendientes) {
            for (Cita cita : pretendiente.getCitas()) {

                if (cita.esExito()) {
                    System.out.println("Pretendiente: " + pretendiente.getNombre() + " | Fecha: " + cita.getFecha() + " | Con: " + cita.getDni());
                    encontrado = true;
                }
            }
        }

        if (!encontrado)
            System.out.println("No hay citas registradas.");
    }
    // Metodos auxiliares
    private static void establecerNuevaCita(Pretendiente pretendiente) {

        System.out.print("Introduce DNI de la persona con la que tuvo la cita: ");
        String dniPareja = panel.nextLine().trim();

        LocalDate fechaCita = leerFecha("Fecha de la cita (dd/MM/yyyy): ");

        pretendiente.getCitas().add(new Cita(fechaCita, dniPareja, false));

        System.out.println("Cita registrada correctamente.");
    }

    private static void evaluarCita(Pretendiente pretendiente) {

        if (pretendiente.getCitas().isEmpty()) {
            System.out.println("Este pretendiente no tiene citas registradas.");
            return;
        }

        System.out.println("Citas del pretendiente:");
        for (int i = 0; i < pretendiente.getCitas().size(); i++) {
            System.out.println((i + 1) + ". " + pretendiente.getCitas().get(i));
        }
        int seleccion = pedirEntero("Elige número de la cita a evaluar: ") - 1;
        if (seleccion < 0 || seleccion >= pretendiente.getCitas().size()) {
            System.out.println("Indice invalidog.");
            return;
        }

        System.out.print("¿La cita fue un éxito? (S/N): ");
        boolean exito = panel.nextLine().trim().equalsIgnoreCase("S");

        pretendiente.getCitas().get(seleccion).setResultado(exito);

        System.out.println("Cita evaluada correctamente.");
    }

    private static boolean dniRepetido(String dni) {
        for (Empleado e : empleados)
            if (e.getDni().equalsIgnoreCase(dni)) return true;

        for (Pretendiente p : pretendientes)
            if (p.getDni().equalsIgnoreCase(dni)) return true;

        return false;
    }

    private static Pretendiente buscarPretendientePorDNI(String dni) {
        for (Pretendiente p : pretendientes)
            if (p.getDni().equalsIgnoreCase(dni))
                return p;
        return null;
    }

    private static LocalDate leerFecha(String mensaje) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = null;

        boolean valida = false;

        while (!valida) {
            try {
                System.out.print(mensaje);
                fecha = LocalDate.parse(panel.nextLine(), formato);
                valida = true;

            } catch (DateTimeParseException e) {
                System.out.println("Formato incorrecto. Usa dd/MM/yyyy");
            }
        }
        return fecha;
    }
    private static int pedirEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(panel.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número válido.");
            }
        }
    }
}