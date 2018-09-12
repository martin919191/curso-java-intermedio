package ejemplo.entidades;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private int edad;
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
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "{\"nombre\":\""+ nombre +
				"\",\"apellido\":\""+ apellido +"\",\"edad\":\""+edad+"\"}";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
	}
	
	
	
	/******** EQUAL ARTESANAL *******/
	/*@Override
	public boolean equals(Object obj) {
		boolean esIgual = false;
		
		if(obj instanceof Persona) {
			Persona objP = (Persona)obj;
			if(this.nombre==objP.nombre
					&& this.apellido==objP.apellido 
					&& this.edad==objP.edad) {
				esIgual = true;
			}
		}
		
		return esIgual;
	}*/
	
	
	
	
	
	
	
}
