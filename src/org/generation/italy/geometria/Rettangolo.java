package org.generation.italy.geometria;

public class Rettangolo {
	
	int base;
	int altezza;
	
	Rettangolo(int base, int altezza) {
		this.base = base; // fanno riferimento ai valori tra parentesi
		this.altezza = altezza;
	}
	public String risultato() {
		String risultato = "Il perimetro è: " + Perimetro(base, altezza) + " l'area è: " + Area(base, altezza);
		return risultato;
	}
	int Perimetro(int base, int altezza){
		int calcolaPerimetro = (2*base) + (2*altezza);
		return calcolaPerimetro;
		
	}
	int Area(int base, int altezza){
		int calcolaArea = base * altezza;
		return calcolaArea;
	}

}
