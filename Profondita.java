package ricorsione;

/**
 * Scrivere il codice di una funzione ricorsiva f(n) che restituisce 0 nel caso n sia dispari, 
 * 1+f(n/2) altrimenti.
 * restituisce i gradi di profondità della ricorsione
 * @author marcoschiavo
 *
 */

public class Profondita {
	
	public static void main(String[] args) {
		System.out.println(divisione(116));
		
	}
	
	
	public static Integer divisione(Integer a) {
		if(a%2 == 1) {
			return 0;
		}else {
			return divisione(a/2)+1;
		}
	}

}
