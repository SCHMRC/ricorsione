package ricorsione;

/**
 * Creare una funzione ricorsiva per calcolare una funzione definita così:
 * per m>0 allora f(n,m) = 1+f(n,m-1)
 * per m=0 allora f(n,m) = n
 * Una volta implementata, provarla e dire cosa calcola la funzione.
 * @author marcoschiavo
 *
 */

public class Somma {

	public static void main(String[] args) {
		System.out.println(ricorsione(50,200));
		
		

	}
	
	
	public static Integer ricorsione(Integer a, Integer b) {
		
		if(b==0){
			return a;
		}
		else {
			return ricorsione(a,b-1)+1;
			}
		}

}
