package main;

public class Main {

	public static void main(String[] args) {
		
	Persona persona = new Persona();
	
	persona.setEdad(15);
	persona.setNombre("Benito");
	persona.setNumero(1234567890);
	
	
	System.out.println(persona.getEdad());
	System.out.println(persona.getNombre());
	System.out.println(persona.getNumero());
	}

}

class Persona{
	private int edad;
	private String nombre;
	private long numero;
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	
}
