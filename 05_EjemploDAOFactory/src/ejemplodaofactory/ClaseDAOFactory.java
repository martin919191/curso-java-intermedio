package ejemplodaofactory;

public class ClaseDAOFactory {
	public InterfazDAO createInstance(int tipo){
		InterfazDAO instance = null;
		switch(tipo){
		case 0:
			instance = new ClaseDAODB();
			break;
		case 1:
			instance = new ClaseDAOMemo();
			break;
		}
		return instance;
	}
}
