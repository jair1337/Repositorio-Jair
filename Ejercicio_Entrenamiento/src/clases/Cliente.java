package clases;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Cliente extends Persona {

    private LocalDate fechaAlta;
    private Map<String, Entrenamiento> entrenamientos;
    private int contador = 100;

    public Cliente(String dni, String nombre, LocalDate fechaAlta) {
        super(dni, nombre);
        this.fechaAlta = fechaAlta;
        this.entrenamientos = new HashMap<>();
    }

    public void agregarEntrenamiento(LocalDate fecha, String ejercicio, int numRepes) {
        String codigo = "WOD-" + contador++;
        entrenamientos.put(codigo, new Entrenamiento(fecha, ejercicio, numRepes));
    }

    public Map<String, Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }

    public class Entrenamiento {
        private LocalDate fecha;
        private String ejercicio;
        private int numRepes;

        public Entrenamiento(LocalDate fecha, String ejercicio, int numRepes) {
            this.fecha = fecha;
            this.ejercicio = ejercicio;
            this.numRepes = numRepes;
        }

		public LocalDate getFecha() {
			return fecha;
		}

		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}

		public String getEjercicio() {
			return ejercicio;
		}

		public void setEjercicio(String ejercicio) {
			this.ejercicio = ejercicio;
		}

		public int getNumRepes() {
			return numRepes;
		}

		public void setNumRepes(int numRepes) {
			this.numRepes = numRepes;
		}
		
		@Override
		public String toString() {
		    return "Fecha: " + fecha + " | Ejercicio: " + ejercicio + " | Repeticiones: " + numRepes;
		}

    
    }
    
    public void visualizar() {
        System.out.println("----Cliente----");
        System.out.println("DNI: " + dni + "| Nombre: " + nombre + "| Fecha alta: " + fechaAlta);
        System.out.println("----Entrenamientos----");
        for (Map.Entry<String, Entrenamiento> entry : entrenamientos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
