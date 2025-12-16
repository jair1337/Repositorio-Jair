package main;

public class Tarjeta {

	private String codigoRFID;
	private String nombreEmpleado;
	private String departamento;
	private int nivelAcceso;

	public Tarjeta(String codigoRFID, String nombreEmpleado, String departamento, int nivelAcceso) {

		super();
		this.codigoRFID = codigoRFID;
		this.nombreEmpleado = nombreEmpleado;
		this.departamento = departamento;
		this.nivelAcceso = nivelAcceso;

	}
	public String getCodigoRFID() {
		return codigoRFID;
	}
	public void setCodigoRFID(String codigoRFID) {
		this.codigoRFID = codigoRFID;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getNivelAcceso() {
		return nivelAcceso;
	}
	public void setNivelAcceso(int nivelAcceso) {
		this.nivelAcceso = nivelAcceso;
	}

	@Override

	public String toString() {
		return "Tarjeta [codigoRFID=" + codigoRFID + ", nombreEmpleado=" + nombreEmpleado + ", departamento="
				+ departamento + ", nivelAcceso=" + nivelAcceso + "]";
	}

}