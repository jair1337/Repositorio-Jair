package clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Curso extends Recurso {

	private String nivel;
	private LocalDate fechaInicio, fechaFin;
	private double precioMensual;
	private ArrayList<Persona> personasInscritas = new ArrayList<>();
	
	public Curso(String codigoIdentificacion, String deporte, int aforoMaximo, String nivel, LocalDate fechaInicio,
			LocalDate fechaFin, double precioMensual, ArrayList<Persona> personasInscritas) {
		super(codigoIdentificacion, deporte, aforoMaximo);
		this.nivel = nivel;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.precioMensual = precioMensual;
		this.personasInscritas = personasInscritas;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public double getPrecioMensual() {
		return precioMensual;
	}

	public void setPrecioMensual(double precioMensual) {
		this.precioMensual = precioMensual;
	}

	public ArrayList<Persona> getPersonasInscritas() {
		return personasInscritas;
	}

	public void setPersonasInscritas(ArrayList<Persona> personasInscritas) {
		this.personasInscritas = personasInscritas;
	}
	
	
}
