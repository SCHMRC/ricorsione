package ricorsione;

import java.util.ArrayList;

/**
 * Scrivere il codice di una funzione ricorsiva int f(int n) che restituisce
 * quante coppie di cifre uguali in posizioni adiacenti ci sono nel numero n,
 * nel caso n sia negativo restituisce 0. Ad es: f(551122) restituisce 3,
 * f(5122) restituisce 1, f(9) restituisce 0.
 * 
 * @author marcoschiavo
 *
 */

public class Ricorsione5 {

	public static void main(String[] args) {
		System.out.println(ricorsione(3218544));

	}

	public static Integer ricorsione(Integer a) {
		String temp = a.toString();
		String[] split = temp.split("");
		boolean flag = false;
		ArrayList<String> result = new ArrayList<>();

		if (split.length > 1) {
			for (int i = 1; i < split.length; i++) {
				if (flag == false) {
					if (split[i - 1].equalsIgnoreCase(split[i])) {
						result.add(split[i]);
						flag = true;
						i++;
					} else {
						result.add(split[i - 1]);

					}
				} else {
					result.add(split[i - 1]);
					if (i == split.length - 1) {
						if (split[i - 1].equalsIgnoreCase(split[i])) {
							result.add(split[i]);
						}
					}

				}

			}
		}

		if (flag == true) {
			String b = "";
			for (String string : result) {
				b = b + string;
			}
			Integer c = Integer.parseInt(b);

			return ricorsione(c) + 1;
		} else {
			return 0;

		}

	}

}
