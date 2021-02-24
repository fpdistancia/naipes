package fp.daw.naipes.blackjack;

import fp.daw.naipes.Mazo;
import fp.daw.naipes.Naipe;
import fp.daw.naipes.Rango;

public class ManoBJ extends Mazo {

	private static final long serialVersionUID = 1L;

	public int valor() {
		int valor = 0;
		int ases = 0;
		
		for (Naipe n: this) {
			if (n.getRango() == Rango.A) {
				valor += 11;
				ases++;
			}
			else if (n.getRango().esFigura())
				valor += 10;
			else
				valor += n.getRango().ordinal() + 1;
		}
		
		while (valor > 21 && ases > 0) {
			ases--;
			valor -= 10;
		}
		
		return valor;
	}
	
	public boolean blackjack() {
		return valor() == 21 && size() == 2;
	}
	
}
