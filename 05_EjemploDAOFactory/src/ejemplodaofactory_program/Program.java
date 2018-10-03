package ejemplodaofactory_program;

import ejemplodaofactory.*;

public class Program {
	public static void main(String[] args) {
		ClaseDAOFactory fabrica = new ClaseDAOFactory();
		InterfazDAO dao = fabrica.createInstance(1);
		dao.write();
	}
}
