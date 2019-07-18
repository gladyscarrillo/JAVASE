package modelo;

public class Persona {
	private String id;
	private String nombre;
	private boolean casado;
	private Direccion direccion;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public void saludar() {
		System.out.println("Hola, este es mi id:"+id);
	}
	
	public void saludar(String saludo) {
		System.out.println(saludo);
	}
	
	public Persona() {
		this.direccion = new Direccion("Luque",217,"Chimborazo");
	}
	
	public Persona(String id, String nombre){
		this.id = id;
		this.nombre = nombre;
		this.casado = false;
		this.direccion = new Direccion("Luque",217,"Chimborazo");
		
	}
	public Persona(String id, String nombre, Direccion direccion){
		this.id = id;
		this.nombre = nombre;
		this.direccion =direccion;
	}
	public String toString() {
		return "Persona id:" + id +",nombre:" + nombre + " " + direccion;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		p1.id="123456";
		p1.nombre="Gladys";
		Persona p2 = new Persona("2332543","Juan");
		p1.saludar();
		
		System.out.println("Persona 1:"+p1.nombre);
		System.out.println("Persona 2:"+p2.nombre);
		System.out.println(p1);
		System.out.println(p2);
		Direccion dir = new Direccion("Malecon",423,"9 de Octubre");
		Persona p3 = new Persona("433243243","Pedro",dir);
		System.out.println(p3);
		p3.saludar();
		p3.saludar("Hola, soy p3");
	}

}
