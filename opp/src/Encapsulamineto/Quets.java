package Encapsulamineto;

public class Quets {
	private static final int ganar = 0 ; 
	private static final int perder = 1; 
	
	
	private String nombre ;
	private int vida ; 
	
	
	public Quets(String title , int reward , int status ) {
		
		this.nombre= nombre ;
		this.vida = vida ; 
		
		
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public int getvida() {
		return vida;
	}

	public void setvida(int vida) {
		this.vida = vida;
	}
	

}