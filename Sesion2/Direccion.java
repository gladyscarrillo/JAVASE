package modelo;

public class Direccion {
	String calle1;
	int numero;
	String calle2;
	
	public Direccion(String calle1, int numero, String calle2) {
		this.calle1 = calle1;
		this.numero = numero;
		this.calle2 = calle2;
	}

	@Override
	public String toString() {
		return "Direccion: " + calle1 + " " + numero + " " + calle2;
	}
	
	

}
