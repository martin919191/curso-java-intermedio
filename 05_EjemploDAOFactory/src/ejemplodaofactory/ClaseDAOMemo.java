package ejemplodaofactory;

public class ClaseDAOMemo implements InterfazDAO {
	ClaseDAOMemo() {

	}

	public void read() {
		System.out.println("Leyendo de la memoria");
	}

	public void write() {
		System.out.println("Escribiendo en la memoria");
	}
}
