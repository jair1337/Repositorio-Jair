package main;
import java.time.LocalDate;

/* protected String dni;     luego veo la diferencia
	protected String nombre;
	protected Genero generoPersona;
	protected LocalDate fechaNacimiento;
	protected String localidad; */ 

public class Persona {
	private String dni;
	private String nombre;
	private Genero generoPersona;
	private LocalDate fechaNacimiento;
	private String localidad;
	
	public Persona(String dni, String nombre, Genero generoPersona, LocalDate fechaNacimiento, String localidad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.generoPersona = generoPersona;
		this.fechaNacimiento = fechaNacimiento;
		this.localidad = localidad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Genero getGeneroPersona() {
		return generoPersona;
	}

	public void setGeneroPersona(Genero generoPersona) {
		this.generoPersona = generoPersona;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
	
	
}
