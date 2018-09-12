package ejemplo.entidades;

public abstract class Alumno extends Persona {
	private boolean aprobado;

	public static final String escuela = "José Hernández";
	
	
	public Alumno(String nombre, String apellido, int edad, boolean aprobado) {
		super(nombre, apellido, edad);
		this.aprobado = aprobado;
	}

	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}

	public boolean getAprobado() {
		return this.aprobado;
	}
	
	public abstract void estudiar();
	
	public final void escuchar() {
		System.out.println(super.getNombre() + " Escucha la clase");
	}
	
	public static void aQueEscuelaAsistenLosAlumnos() {
		System.out.println("Al josé");
	}
}
