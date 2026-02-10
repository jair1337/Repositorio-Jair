package clases;

public abstract class Recurso {

	protected String codigoIdentificacion, deporte;
	protected int aforoMaximo;
	
	public Recurso(String codigoIdentificacion, String deporte, int aforoMaximo) {
		super();
		this.codigoIdentificacion = codigoIdentificacion;
		this.deporte = deporte;
		this.aforoMaximo = aforoMaximo;
	}

	public String getCodigoIdentificacion() {
		return codigoIdentificacion;
	}

	public void setCodigoIdentificacion(String codigoIdentificacion) {
		this.codigoIdentificacion = codigoIdentificacion;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public int getAforoMaximo() {
		return aforoMaximo;
	}

	public void setAforoMaximo(int aforoMaximo) {
		this.aforoMaximo = aforoMaximo;
	}
	
	
}
