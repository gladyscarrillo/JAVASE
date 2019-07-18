package modelo;

import java.util.Scanner;

public class Circulo {
	int radio;
	
	public Circulo(int radio) {
		this.radio = radio;
	}
	//devuelve el area del circulo
	public  calcularArea() {
		return 3.1416f * (radio*radio); 
	}
	public static void main(String args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el radio para el circulo:")
		int r = entrada.nextInt();
		Circulo circ = new Circulo();
		float area = circ.calcularArea();
		System.out.println("El area del circulo es:",area);
	}

}