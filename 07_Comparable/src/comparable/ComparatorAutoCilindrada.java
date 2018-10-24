package comparable;

import java.util.Comparator;

public class ComparatorAutoCilindrada implements Comparator<Auto>{

	public int compare(Auto a1, Auto a2){
		return (int)((a1.getCilindrada()*10)-(a2.getCilindrada()*10));
	}
}
