package comparable;

import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		Auto a1 = new Auto("Audi","A5", 2.0F);
		Auto a2 = new Auto("Audi","TT", 2.0F);
		Auto a3 = new Auto("Audi","Q3", 2.0F);
		Auto a4 = new Auto("Bugatti","Veyron", 7.9F);
		Auto a5 = new Auto("Volkswagen", "UP", 1.0F);
		Auto a6 = new Auto("Ford", "Ka", 1.5F);
		
		ComparatorAutoCilindrada comparador = new ComparatorAutoCilindrada();
		
		Set<Auto> s = new TreeSet<Auto>(comparador);
		s.add(a1);
		s.add(a2);
		s.add(a3);
		s.add(a4);
		s.add(a5);
		s.add(a6);
		
		for(Auto a : s){
			System.out.println(a.getMarca().concat(" ").concat(a.getModelo()));
		}
	}

}
