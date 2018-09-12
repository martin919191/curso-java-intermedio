package ejemplo.entidades;

public class AlumnoVago extends Alumno{
	public AlumnoVago(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad, false);
	}
	
	public void estudiar() {
		System.out.println("No estudio nada, me aburro, no me gusta.");
	}
}
