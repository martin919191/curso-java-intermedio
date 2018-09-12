package ejemplo.entidades;

public class AlumnoEstudioso extends Alumno{
	public AlumnoEstudioso(String nombre, String apellido, int edad, boolean aprobado) {
		super(nombre, apellido, edad, aprobado);
	}
	
	public void estudiar() {
		System.out.println("Me gusta estudiar, estoy estudiando");
	}
}
