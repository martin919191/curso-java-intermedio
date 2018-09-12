package ejemplo.program;

import ejemplo.entidades.Alumno;
import ejemplo.entidades.AlumnoEstudioso;
import ejemplo.entidades.AlumnoVago;
import ejemplo.entidades.Persona;

public class Program {

	public static void main(String[] args) {
		Alumno a1 = new AlumnoEstudioso("Martín","Isusi",27,true);
		Alumno a2 = new AlumnoVago("Sol","Perez",27);

		a1.escuchar();
		a2.escuchar();
		
	}
}
