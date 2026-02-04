/**
 * @author C. Frese
 * DHBW Stuttgart - Vorlesung Programmieren 1
 * Aufgabengerüst zur Aufgabe 2.7.6 
 */
public class CalcSum {
	
	static int input; //globale Variable
	
		
	public static void main(String[] args) {
		input = inputInt();
		System.out.println("Ergebnis mit for-Schleife: "
				+ forSum(input));
		System.out.println("Ergebnis kleiner Gauss: "
				+ useGauss(input));
		System.out.println("Ergebnis rekursiv: "
				+ rekursiveSum(input));
	}

}