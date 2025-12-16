package main;

import java.util.HashMap;
import java.util.Scanner;



public class GestionTarjeta {

	private static Scanner panel = new Scanner(System.in);

    private static HashMap<String, Tarjeta> tarjetas = new HashMap<>();

    private static String menu = "\n----- Gestión de tarjetas -----\n"

    							+ "1. Registrar tarjetas RFID\n"

                                + "2. Verificar acceso\n"

                                + "3. Revocar una tarjeta\n"

                                + "4. Mostrar todas las tarjetas registradas\n"

                                + "5. Salir\n";

    public static void main(String[] args) {
        int opcion;
        do {

            System.out.print(menu);
            opcion = panel.nextInt();
            panel.nextLine();  

            switch (opcion) 
            {
                case 1: registrarTarjeta(); break;
                case 2: verificarAcceso(); break;
                case 3: revocarTarjeta(); break;
                case 4: mostrarTarjetasRegistradas(); break;
                case 5: System.out.println("Saliendo del programa..."); break;
                default: System.out.println("Opción no válida."); break;
            }
            
        } while (opcion != 5);
        
    }
    
    // 1. 
    public static void registrarTarjeta() {

        System.out.println("Ingrese el código RFID:");
        String codigoRFID = panel.nextLine();

        // Verificar si el código ya existe para actualizar o crear uno nuevo
        if (tarjetas.containsKey(codigoRFID)) {
            System.out.println("Tarjeta ya registrada, actualizando datos.");
        } 
        else 
        {
            System.out.println("Registrando nueva tarjeta.");
        }

        System.out.println("Ingrese el nombre del empleado:");
        String nombreEmpleado = panel.nextLine();
        
        System.out.println("Ingrese el departamento:");
        String departamento = panel.nextLine();

        System.out.println("Ingrese el nivel de acceso (1-5):");
        int nivelAcceso = panel.nextInt();
        panel.nextLine();

        Tarjeta tarjeta = new Tarjeta(codigoRFID, nombreEmpleado, departamento, nivelAcceso);
        tarjetas.put(codigoRFID, tarjeta);
        
        System.out.println("Tarjeta registrada/actualizada correctamente.");

    }

    // 2
    public static void verificarAcceso() {
        System.out.println("Ingrese el código RFID para verificar acceso:");
        String codigoRFID = panel.nextLine();

        System.out.println("Ingrese el nivel requerido de acceso para la zona:");
        int nivelZona = panel.nextInt();
        panel.nextLine();

        Tarjeta tarjeta = tarjetas.get(codigoRFID);

        if (tarjeta == null) 
        {
            System.out.println("Acceso denegado: Código RFID no encontrado.");
        } 
        else 
        {

            if (tarjeta.getNivelAcceso() >= nivelZona) {
                System.out.println("Acceso permitido.");
            } 
            else 
            {
                System.out.println("Acceso denegado: Nivel de acceso insuficiente.");
            }

        }

    }

    // 3
    public static void revocarTarjeta() {
        System.out.println("Ingrese el código RFID de la tarjeta a revocar:");
        String codigoRFID = panel.nextLine();

        if (tarjetas.containsKey(codigoRFID)) {
            tarjetas.remove(codigoRFID);
            System.out.println("Tarjeta revocada correctamente.");
        } 
        else 
        {
            System.out.println("No se encontró la tarjeta con el código RFID especificado.");
        }

    }

    // 4.
    public static void mostrarTarjetasRegistradas() {
        if (tarjetas.isEmpty()) {
            System.out.println("No hay tarjetas registradas.");
        } 
        else 
        {
            for (Tarjeta tarjeta : tarjetas.values()) {
                System.out.println(tarjeta);
            }

        }

    }

}