package fp.daw.naipes;

import java.util.ArrayList;
import java.util.Random;

public class Mazo {
	
	private static Random r = new Random();
	
	ArrayList<Naipe> naipes = new ArrayList<>();
	
	public Mazo() {
		agregarBaraja();
	}
	
	public Mazo(int barajas) {
		for (int i=0; i<barajas; i++)
			agregarBaraja();
	}
	
	private void agregarBaraja() {
		for (Palo p: Palo.values())
			for (Rango r: Rango.values())
				naipes.add(Naipe.getNaipe(p, r));
	}
	
	public void add(Naipe naipe) {
		naipes.add(naipe);
	}
	
	public void addAll(Mazo mazo) {
		naipes.addAll(mazo.naipes);
		mazo.naipes.clear();
	}
	
	public Naipe get() {
		if (naipes.size() == 0)
			return null;
		return naipes.size() == 1 ? naipes.get(1) : naipes.get(r.nextInt(naipes.size()));
	}
	
	public Naipe remove() {
		if (naipes.size() == 0)
			return null;
		return naipes.size() == 1 ? naipes.remove(1) : naipes.remove(r.nextInt(naipes.size()));
	}
	
}
