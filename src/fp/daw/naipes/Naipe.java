package fp.daw.naipes;

public class Naipe {
	
private static Naipe [][] naipes = new Naipe[Palo.values().length][Rango.values().length];
	
	static {
		for (Palo p: Palo.values())
			for (Rango r: Rango.values())
				naipes[p.ordinal()][r.ordinal()] = new Naipe(p, r);
	}
	
	private Palo palo;
	private Rango rango;
	
	private Naipe(Palo palo, Rango rango) {
		this.palo = palo;
		this.rango = rango;
	}
	
	public static Naipe getNaipe(Palo palo, Rango rango) {
		return naipes[palo.ordinal()][rango.ordinal()];
	}
	
	public Palo getPalo() {
		return palo;
	}

	public Rango getRango() {
		return rango;
	}
		
	@Override
	public String toString() {
		return "" + rango + palo;
	}
}
