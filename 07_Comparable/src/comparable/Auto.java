package comparable;

public class Auto implements Comparable<Auto>{

	private String marca, modelo;
	private float cilindrada;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public Auto(String marca, String modelo, float cilindrada) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
	}
	
	public int compareTo(Auto a){
		String marcaModeloThis = this.marca.concat(this.modelo);
		String marcaModeloA = a.marca.concat(a.modelo);
		
		return marcaModeloThis.compareTo(marcaModeloA);
	}
}
