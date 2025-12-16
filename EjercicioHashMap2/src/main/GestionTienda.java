package main;

import java.util.HashMap;
import java.util.Scanner;

public class GestionTienda {

	private static Scanner teclado = new Scanner(System.in);

	private static HashMap<String, Producto> productos = new HashMap<>();

	private static String menu = "\n----- Gestión de tarjetas -----\n"

									+ "1. Registrar productos\n"

									+ "2. Consultar un producto por su código\n"

									+ "3. Eliminar un producto\n"

									+ "4. Mostrar el inventario completo\n"

									+ "5. Salir\n";

	public static void main(String[] args) {
		int opcion;
		do {
		System.out.println(menu);
		opcion = teclado.nextInt();
		teclado.nextLine();

		switch (opcion) 
		{
		case 1: registrarProductos(); break;
		case 2: consultarProductoPorCodigo(); break;
		case 3: eliminarProducto(); break;
		case 4: mostrarInventario(); break;
		case 5: System.out.println("Saliendo del programa....."); break;
		default: System.out.println("Opcion no valida"); break;
		}

		} while(opcion != 5);

	}

	public static void registrarProductos() {
	System.out.println("Ingrese el codigo del producto: ");
	String codigo = teclado.nextLine();

	// Verificar si existe (luego añadir el +1 al noseq)
	if (productos.containsKey(codigo)) {
		System.out.println("Ese producto ya existe. Actualizando el producto");

	} 
	else 
	{
	System.out.println("Producto registrado correctamente");
	}

	System.out.println("Ingrese el nombre del producto: ");
	String nombre = teclado.nextLine();

	System.out.println("Ingrese el precio del producto:  ");
	int precio = teclado.nextInt();

	System.out.println("Ingrese la cantidad del producto: ");
	int stock = teclado.nextInt();

	Producto nuevoProducto = new Producto(codigo, nombre, precio, stock);
	productos.put(codigo, nuevoProducto);

	System.out.println("Producto resgistrado correctamente.");
	
	}

	public static void consultarProductoPorCodigo() {
		System.out.println("Ingrese el codigo del producto: ");
		String codigo = teclado.nextLine();

		Producto productotest = productos.get(codigo);

		// Nota: El enunciado al decir "en tiempo real" se refiere a la forma GET del HASHMAP

		if (productos.get(codigo) == null) {
		System.out.println("Error: Producto no encontrado.");
		} 
		else 
		{
		System.out.println("Producto encontrado, mostrando informacion: ");
		System.out.println(productotest);

		}

	}

	public static void eliminarProducto() {
		System.out.println("Ingrese el codigo del producto a eliminar:");
		String codigo = teclado.nextLine();

		if (productos.containsKey(codigo)) {
		productos.remove(codigo);

		System.out.println("Producto eliminado correctamente.");
		} 
		else 
		{
		System.out.println("No se encontro el producto con el codigo especificado.");
		}

	}

	public static void mostrarInventario() {
	// Otra forma de hacerlo
	if (productos.isEmpty()) 
		{
		System.out.println("No hay productos.");
		} 
		else 
		{
			for (Producto nuevoProducto : productos.values()) {
				System.out.println(nuevoProducto);
			}
		}

	}

}