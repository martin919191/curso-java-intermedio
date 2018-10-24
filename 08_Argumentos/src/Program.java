
public class Program {
	public static void main(String[] args) {
		if(args!=null){
			if(args.length>0){
				for(String s : args){
					System.out.println(s);
				}
			}
		}
		System.out.println("Fin del programa");
	}
}
