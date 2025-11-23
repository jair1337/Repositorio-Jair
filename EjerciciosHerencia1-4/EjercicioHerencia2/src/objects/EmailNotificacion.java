package objects;

public class EmailNotificacion extends Notificacion { 
	private String direccionEmail; 
	
	public EmailNotificacion(String direccionEmail, String mensaje) { 
		
		// Llamar al constructor de la clase padre 
		super(mensaje); 
		
		this.direccionEmail = direccionEmail; 
		
	} 
		// Sobrescribir el método enviar() 
		@Override 
		public void enviar() { 
			// COMPLETAR: Debe mostrar un mensaje que incluya 
			// el email destino y el contenido del mensaje. 
			
			System.out.println("Enviando email a: "+ direccionEmail + "mensaje" + getMensaje()); 
			
			System.out.println("Enviando email a: "+ direccionEmail);
			super.enviar(); 
		} 
		
}