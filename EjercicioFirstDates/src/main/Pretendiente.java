package main;
import java.time.LocalDate;
import java.util.ArrayList;

public class Pretendiente extends Persona {

	private Genero generoBuscado;
	private ArrayList<Cita> citas;
	
	public Pretendiente(String dni, String nombre, Genero generoPersona, LocalDate fechaNacimiento, String localidad, Genero generoBuscado) {
		super(dni, nombre, generoPersona, fechaNacimiento, localidad);
		this.generoBuscado = generoBuscado;
		this.citas = new ArrayList<>();
		
		// luego ver si el arrayliscita es necesario
	}
	
	public Genero getGeneroBuscado() {
		return generoBuscado;
	}

	public void setGeneroBuscado(Genero generoBuscado) {
		this.generoBuscado = generoBuscado;
	}

	public ArrayList<Cita> getCitas() {
		return citas;
	}

	public void setCitas(ArrayList<Cita> citas) {
		this.citas = citas;
	}
	
	public void aniadirCita(Cita citaRomantica) {
		this.citas.add(citaRomantica);
	}
	
}
