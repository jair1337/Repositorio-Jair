package clases;

public class Trabajador extends Persona {

    private String usuario;
    private String contrasenia;
    private Cargo elcargo;

    public Trabajador(String dni, String nombre, String usuario, String contrasenia) {
        super(dni, nombre);
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        
    }

    public void visualizar() {
        System.out.println("----Trabajador----");
        System.out.println("DNI: " + dni + "| Nombre: " + nombre + "| Usuario: " + usuario + "| Contrasenia: " + contrasenia + "| Cargo: " + elcargo);
        
    }
}
