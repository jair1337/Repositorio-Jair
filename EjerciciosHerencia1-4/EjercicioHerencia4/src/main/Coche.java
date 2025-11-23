package main;

public class Coche extends Vehiculos {

	private int numPuertas;
	private boolean esElectrico;

	public Coche(String marca, String modelo, double precioPorHora, int numPuertas, boolean esElectrico) {
		super(marca, modelo, precioPorHora);
		this.numPuertas = numPuertas;
		this.esElectrico = esElectrico;
	}

	
	public double calcularPrecioAlquiler(int horas) 
	{
		double precio = super.calcularPrecioAlquiler(horas);
		if (esElectrico) {
			return precio*0.9; 
			}
		
		return precio;
	}

	
	public String descripcion()
	{
		return super.descripcion() + ", Número de puertas: " + numPuertas + ", Eléctrico: " + (esElectrico ? "Sí" : "No");
	}
	
}