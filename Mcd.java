package ricorsione;

public class Mcd {

	public static void main(String[] args) {
		System.out.println(mcd(30,58));

	}
	
	
	public static Integer mcd(Integer a, Integer b) {
		if(a == b){
			return a;
		}else {
			return (a>b)? mcd(a-b,b) : mcd(a, b-a);
		}
	}

}
