package main;

public class Vehiculos {
	
	private int idVehiculo;
	private String marca;
	private String modelo;
	private double precioPorHora;
	
	private static int incrementador = 0;

	
	public Vehiculos(String marca, String modelo, double precioPorHora) {
		super();
		this.idVehiculo = incrementador++;
		this.marca = marca;
		this.modelo = modelo;
		this.precioPorHora = precioPorHora;
	}
	
	public double calcularPrecioAlquiler(int horas) {
		return precioPorHora*horas;
	}
	
	public String descripcion() {
		return "Informacion del vehiculo | ID: " + idVehiculo + "Marca: " + marca + "Modelo: " + modelo + "Precio/hora" + precioPorHora;
	}
}
