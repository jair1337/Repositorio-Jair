package clases;

public class Instalacion extends Recurso {

	private String descripcion;
	private boolean estado;
	
	public Instalacion(String codigoIdentificacion, String deporte, int aforoMaximo, String descripcion,
			boolean estado) {
		super(codigoIdentificacion, deporte, aforoMaximo);
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}
