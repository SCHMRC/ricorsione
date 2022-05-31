package ricorsione;

/***
 * Scrivere il codice di una funzione ricorsiva f(n) che restituisce:
 * – n nel caso n sia minore di 10,
 * – il risultato di f applicata alla somma delle cifre di n se n è pari,
 * – f(n-1) altrimenti.
 * @author marcoschiavo
 *
 */

public class Ricorsione4 {

	public static void main(String[] args) {
		System.out.println(ricorsione(50));

	}
	
	public static Integer ricorsione(Integer a) {
		if(a<10) {
			return a;
		}else if(a%2 == 0) {
			String temp = a.toString();
			String[] split = temp.split(temp);
			Integer result = 0;
			for (String string : split) {
				result+=Integer.parseInt(string);
			}
			return ricorsione(result);
		}else {
			return ricorsione(a-1);
		}
	}

}
