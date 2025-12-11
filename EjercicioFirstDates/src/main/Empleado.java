package main;
import java.time.LocalDate;

public class Empleado extends Persona {

	private String cargo;
	private LocalDate fechaAltaRestaurante;
	
	public Empleado(String dni, String nombre, Genero generoPersona, LocalDate fechaNacimiento, String localidad, String cargo, LocalDate fechaAltaRestaurante) {
		super(dni, nombre, generoPersona, fechaNacimiento, localidad);
		this.cargo = cargo;
		this.fechaAltaRestaurante = fechaAltaRestaurante;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public LocalDate getFechaAltaRestaurante() {
		return fechaAltaRestaurante;
	}

	public void setFechaAltaRestaurante(LocalDate fechaAltaRestaurante) {
		this.fechaAltaRestaurante = fechaAltaRestaurante;
	}
	
	
	
}
