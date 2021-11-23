package org.generation.italy.geometria;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci base del rettangolo");
		int base = scanner.nextInt();
		System.out.println("Inserisci altezza del rettangolo");
		int altezza = scanner.nextInt();
		
		Rettangolo rettangolo = new Rettangolo(base, altezza);
		
		String stampaRisultato = rettangolo.risultato();
		System.out.println(stampaRisultato);
		
		scanner.close();
	}

}
