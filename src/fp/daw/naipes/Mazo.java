package fp.daw.naipes;

import java.util.ArrayList;
import java.util.Random;

public class Mazo extends ArrayList<Naipe>{
	
	private static final long serialVersionUID = 1L;
	private static Random r = new Random();
	
	public Mazo() {
	}
	
	public Mazo(int barajas) {
		for (int i=0; i<barajas; i++)
			agregarBaraja();
	}
	
	private void agregarBaraja() {
		for (Naipe n: Naipe.values())
			add(n);
	}
	
	public void descartar(Mazo mazo) {
		mazo.addAll(this);
		clear();
	}
	
	public Naipe get() {
		return get(r.nextInt(size()));
	}
	
	public Naipe remove() {
		return remove(r.nextInt(size()));
	}
	
}

