package ejemplosingleton;

public class EjemploSingleton {
	
	static EjemploSingleton instance = null;
	
	public String texto = "";
	
	public static EjemploSingleton getInstance(){
		if(instance == null){
			instance = new EjemploSingleton();
		}
		return instance;
	}
	
	private EjemploSingleton(){
	}
}
