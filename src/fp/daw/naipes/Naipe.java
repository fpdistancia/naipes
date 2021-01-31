package fp.daw.naipes;

public class Naipe {
	
	private Palo palo;
	private Rango rango;
	
	public Naipe(Palo palo, Rango rango) {
		this.palo = palo;
		this.rango = rango;
	}
	
	public Palo getPalo() {
		return palo;
	}

	public Rango getRango() {
		return rango;
	}
		
	@Override
	public String toString() {
		return  "" + rango + palo;
	}
}
