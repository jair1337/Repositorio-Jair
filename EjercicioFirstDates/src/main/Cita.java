package main;
import java.time.LocalDate;

public class Cita {

	private LocalDate fecha;
	private String dni;
	private boolean resultado;
	
	public Cita(LocalDate fecha, String dni, boolean resultado) {
		super();
		this.fecha = fecha;
		this.dni = dni;
		this.resultado = resultado;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean isResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
	
	public boolean esExito() {
        return resultado;
	}
	
	public boolean esFracaso() {
		return !resultado;
	}

	@Override
    public String toString() {
        return "Fecha: " + fecha + ", DNI pareja: " + dni + ", Resultado: " + (resultado ? "Éxito" : "Fracaso");
    }

}
