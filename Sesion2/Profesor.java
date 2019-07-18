package modelo;

import java.util.ArrayList;

public class Profesor {
	String nombres;
	String apellidos;
	int horas;
	
	

	public Profesor(String nombres, String apellidos, int horas) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.horas = horas;
	}


	public Profesor(String nombres, String apellidos) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.horas = 40;
	}
	/*public Profesor(String nombres, String apellidos) {
		this(nombres, apellidos,40);
	}*/


	@Override
	public String toString() {
		return "Profesor [nombres=" + nombres + ", apellidos=" + apellidos + ", horas=" + horas + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor p1 = new Profesor("Gladys","Carrillo");
	
		Profesor p2 = new Profesor("Kleber","Barcia",20);
		
		Profesor[] arreglo = new Profesor[3];
		
		arreglo[0] = p1;
		arreglo[1] = p2;
		arreglo[2] = new Profesor("Pedro","Luna");
		int i;
		System.out.println("Arreglo 1");
		for(i=0;i<arreglo.length;i++) {
			System.out.println(arreglo[i]);
		
		}
		Profesor[] arreglo2 = {p1,p2,new Profesor("Pedro","Luna")};
		System.out.println("Arreglo 2");
		for(i=0;i<arreglo2.length;i++) {
			System.out.println(arreglo2[i]);
		
		}
		
		System.out.println(arreglo);
		ArrayList<Profesor> lista = new ArrayList<Profesor>();
		lista.add(p1);
		lista.add(p2);
		System.out.println(lista);
		lista.add(1,new Profesor("Marcos","Calderon"));
		System.out.println(lista);
		lista.set(0,p2);
		System.out.println(lista.get(0));
		lista.remove(0);
		System.out.println(lista);
		lista.clear();
		
		System.out.println(lista);
		
		
	}

}
