package abstraccion;

public class polimorfismo {

	public static void main(String[] args) {
		funciones personaje   = new aldeano() ;
		personaje.atacar();
		personaje = new heroe();
		personaje.atacar();
			
	}

}
