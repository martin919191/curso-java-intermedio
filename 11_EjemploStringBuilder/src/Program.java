
public class Program {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hola");
		sb.append(" ");
		sb.append("Mundo");
		
		System.out.println(sb);
		
		String s = "El que no salta es un boton, y encima de rasin";
		s = s.replace("rasin","mufa").replace("boton", "agente de seguridad");
		System.out.println(s);
		
		String historiaGTA = "La saga cronológicamente empieza con GTA: London 1961, aunque no aparecen ninguno de los personajes que aparecen en las demás. Ocurre lo mismo con el siguiente, GTA: London 1969.Según dictan los acontecimientos, el siguiente juego situado es Grand Theft Auto, en el año 1997. Este juego se ambienta en las ciudades de San Andreas (basado en Los Ángeles, San Francisco y Las Vegas), Vice City (basado en Miami) y Liberty City (basado en Nueva York), a medida que el jugador progresa en el juego irá cambiando de ciudades.GTA 2 es el penúltimo juego cronológicamente hablando (último juego en 2D), situado en 1999, aunque no tiene historia dentro del juego, su vídeo inicial muestra a Claude Speed cometiendo varios delitos para diferentes bandas y robando mercancía de los Zaibatsu en la ciudad de Anywhere City.";
		historiaGTA = historiaGTA.toUpperCase();
		String[] palabras = historiaGTA.split("\\s");
		for(String palabra : palabras){
			System.out.println(palabra);
		}
		//Completar el codigo para generar un array sin palabras repetidas.
	}

}
