package main;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LigaEsports liga = new LigaEsports();
        
        // 1
        
        liga.añadirCompetidor("Luis");
        liga.añadirCompetidor("Brayan");
        liga.añadirCompetidor("Carlos");

        liga.listarCompetidores();

        liga.actualizarCompetidor("Carlos", "Juan");
        liga.listarCompetidores();

        ArrayList<String> listaEliminar = new ArrayList<>();
        listaEliminar.add("Brayan");
        liga.eliminarCompetidores(listaEliminar);

        liga.listarCompetidores();

        // 2
        
        liga.registrarPartidas("Luis", 5);
        liga.registrarPartidas("Juan", 3);

        liga.listarPartidas();

        liga.actualizarPartidas("Luis", 10);
        liga.listarPartidas();

 
        // 3
        

        boolean resultado1 = liga.compararRegistros();
        System.out.println("\nComparación 1: " + resultado1);

        liga.eliminarRegistro("Luis");
        boolean resultado2 = liga.compararRegistros();
        System.out.println("Comparación 2: " + resultado2);
    }
}