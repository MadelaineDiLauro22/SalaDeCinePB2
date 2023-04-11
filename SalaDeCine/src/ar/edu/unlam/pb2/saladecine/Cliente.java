package ar.edu.unlam.pb2.saladecine;

public class Cliente {

	private String nombre = "";
	private String apellido = "";
	private int edad = 0;
	
	public Cliente(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String toString() {
		return "- Nombre: " + nombre + "\n- Apellido: " + apellido + "\n- Edad: " + edad;
	}
}
