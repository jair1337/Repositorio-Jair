package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class LigaEsports {

    private ArrayList<String> competidores;
    private HashMap<String, Integer> partidasGanadas;

    public LigaEsports() {
        competidores = new ArrayList<>();
        partidasGanadas = new HashMap<>();
    }
    
    // 1. CRUD de competidores (ArrayList)
    
    public void añadirCompetidor(String nombre) {
        if (!competidores.contains(nombre)) {
            competidores.add(nombre);
            System.out.println("Competidor añadido: " + nombre);
        } 
        else 
        {
            System.out.println("El competidor con ese nombre ya existe.");
        }
    }

    public void listarCompetidores() {
        System.out.println("\nCompetidores inscritos: ");
        for (String listado1 : competidores) {
            System.out.println(listado1);
        }
    }

    public void actualizarCompetidor(String antiguo, String nuevo) {
        Iterator<String> it = competidores.iterator();
        int pos = 0;

        while (it.hasNext()) {
            String actual = it.next();
            if (actual.equals(antiguo)) {
                competidores.set(pos, nuevo);
                System.out.println("Competidor antiguo: " + antiguo + " | Competidor nuevo (actualizado): " + nuevo);
                return;
            }
        pos++;
        }

        System.out.println("No se encontró el competidor a actualizar");
    }


    public void eliminarCompetidor(String nombre) {
        if (competidores.remove(nombre)) {
            System.out.println("Eliminado: " + nombre);
        } 
        else 
        {
            System.out.println("El competidor no existe");
        }
    }
    
    public void eliminarCompetidores(ArrayList<String> nombres) {
        for (String listado2 : nombres) {
            competidores.remove(listado2); 
        }
        System.out.println("Competidores eliminados: " + nombres);
    }
    
    // 2. CRUD de partidas ganadas (HashMap)
   
    public void registrarPartidas(String competidor, int cantidad) {
        partidasGanadas.put(competidor, partidasGanadas.getOrDefault(competidor, 0) + cantidad);
        System.out.println("\nLas partidas registradas para " + competidor + " son: " + cantidad);
    }

    public void listarPartidas() {
        System.out.println("\nPartidas ganadas: ");
        for (String mapa1 : partidasGanadas.keySet()) {
            System.out.println(mapa1 + " cuenta con " + partidasGanadas.get(mapa1) + " victorias.");
        }
    }

    public void actualizarPartidas(String competidor, int nuevasPartidas) {
        if (partidasGanadas.containsKey(competidor)) {
            partidasGanadas.put(competidor, nuevasPartidas);
            System.out.println("Partidas actualizadas: " + competidor + " a " + nuevasPartidas + " partidas.");
        } 
        else 
        {
            System.out.println("No existe registro para " + competidor);
        }
    }

    public void eliminarRegistro(String competidor) {
        partidasGanadas.remove(competidor);
        System.out.println("Registro de partidas eliminado para " + competidor);
    }
    
    // 3. Método especial con dos Iterator
    
    public boolean compararRegistros() {

        Iterator<String> listaComparar = competidores.iterator();
        Iterator<String> mapaComparar = partidasGanadas.keySet().iterator();

        
        while (listaComparar.hasNext()) {
            String competidor = listaComparar.next();
            boolean encontrado = false;
            
            mapaComparar = partidasGanadas.keySet().iterator();

            while (mapaComparar.hasNext()) {
                String competidorMapa = mapaComparar.next();
                if (competidor.equals(competidorMapa)) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                return false;  
            }
        }

        return true; 
    }
}
