package ricorsione;
/**
 * Creare una funzione ricorsiva che ricevuto un numero restituisce la somma delle cifre del numero se questa è minore di 10 o il risultato della ri-applicazione della funzione sulla somma delle cifre del numero altrimenti.
 * Esempi: f(15)=1+5=6, f(392)=f(14)=f(5)=5 dove 3+9+2=14 e 1+4=5.
 * @author marcoschiavo
 *
 */

public class Ricorsione {

	public static void main(String[] args) {
		System.out.println(ricorsione(392));

	}
	
	public static Integer ricorsione(Integer a) {
		if(a<10) {
			return a;
			
		}else {
			String temp = a.toString();
			String[] split = temp.split("");
			Integer resultTemp = 0;
			for (String string : split) {
				resultTemp += Integer.parseInt(string);	
			}
			return ricorsione(resultTemp);
			
		}
	}

}
