package abstraccion;

public  class aldeano implements funciones {
	@Override
	public void name() {
		System.out.println("nombre");
	}
	@Override
	public void bite() {
		System.out.println("vida");}
	
	@Override
	public void modificarbite() {
		System.out.println("modificar vida xd");
}
	@Override
	public void atacar() {
		System.out.println("aldenaos no pueden atacar ");
		
	}
}