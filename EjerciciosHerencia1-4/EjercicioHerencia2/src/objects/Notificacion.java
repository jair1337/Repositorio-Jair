package objects;

	public class Notificacion {
		
		private String mensaje;


	public Notificacion(String mensaje) {
		this.mensaje = mensaje;

	}


	public String getMensaje() {
		return mensaje;

	}


	// Método que las clases hijas deben especializar

	public void enviar() {
		System.out.println("Enviando notificación genérica: " + mensaje);

	}

}