import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Program{
	public static void main(String[] args) {
		Properties prop = new Properties();
		try{
			InputStream is = new FileInputStream("servidor.properties");
			prop.load(is);
			
			System.out.println(prop.get("ip"));
			System.out.println(prop.get("ip2"));
			System.out.println(prop.get("ip3"));
			
		}catch(FileNotFoundException e){
			System.out.println("ERROR ARCHIVO NO ENCONTRADO");
			System.out.println(e.getMessage());
		}catch(IOException e){
			System.out.println("ERROR");
			System.out.println(e.getMessage());
		}	
	}
}
