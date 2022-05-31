package ricorsione;

public class Fattoriale {

	public static void main(String[] args) {
		System.out.println(fattoriale(8));
		

	}
	
	public static Integer fattoriale(Integer param) {
		if(param <=1) {
			return 1;
		}else {
			return fattoriale(param-1) * param;	
			}
		};
}
