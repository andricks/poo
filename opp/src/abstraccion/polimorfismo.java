package abstraccion;

public class polimorfismo {

	public static void main(String[] args) {
		funciones Elfo = new aldeano() ; 
		Elfo.atacar();
		Elfo = new heroe() ; 
		Elfo.atacar();

	}

}
