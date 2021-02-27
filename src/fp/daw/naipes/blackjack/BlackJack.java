package fp.daw.naipes.blackjack;

import fp.daw.naipes.Mazo;

public class BlackJack {

	private ManoBJ crupier = new ManoBJ();
	private ManoBJ jugador = new ManoBJ();
	private Mazo mazo = new Mazo(6);
	private Mazo descarte = new Mazo();
	private boolean fin = true;
	
	public void repartir() {
		if (!fin)
			throw new RuntimeException("no se puede repartir");
		fin = false;
		if (mazo.size() <= 70)
			descarte.descartar(mazo);
		jugador.descartar(descarte);
		crupier.descartar(descarte);
		jugador.add(mazo.remove());
		crupier.add(mazo.remove());
		jugador.add(mazo.remove());
		crupier.add(mazo.remove());
		if (jugador.getValor() == 21)
			plantarse();
	}
	
	public void pedir() {
		if (fin)
			throw new RuntimeException("no se puede pedir");
		jugador.add(mazo.remove());
		if (jugador.getValor() >= 21) 
			plantarse();
	}
	
	public void plantarse() {
		if (fin)
			throw new RuntimeException("no se puede plantar");
		fin = true;
		if (jugador.getValor() <= 21)
			while (crupier.getValor() < 17)
				crupier.add(mazo.remove());
	}

	public boolean finalizado() {
		return fin;
	}
	
	public String toString() {
		String resultado = crupier.toString(!fin) + "\n";
		resultado += jugador.toString(false) + "\n";
		int vc = crupier.getValor(); 
		int vj = jugador.getValor();
		if (fin) {
			if (vj > 21)
				resultado += "La banca gana";
			else if (vc > 21)
				resultado += "El jugador gana";
			else if (vj > vc)
				resultado += "El jugador gana";
			else if (vj < vc)
				resultado += "La banca gana";
			else if (jugador.blackjack() && !crupier.blackjack())
				resultado += "El jugador gana";
			else if (!jugador.blackjack() && crupier.blackjack())
				resultado += "La banca gana";
			else
				resultado += "Empate";
		}
		return resultado;
	}
	
}
