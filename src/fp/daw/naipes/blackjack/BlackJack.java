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
		jugador.descartar(descarte);
		crupier.descartar(descarte);
		jugador.add(mazo.get());
		crupier.add(mazo.get());
		jugador.add(mazo.get());
		crupier.add(mazo.get());
		if (jugador.blackjack() || crupier.blackjack())
			fin = true;
	}
	
	public void pedir() {
		if (fin)
			throw new RuntimeException("no se puede pedir");
		jugador.add(mazo.get());
		if (jugador.valor() >= 21) 
			plantarse();
	}
	
	public void plantarse() {
		if (fin)
			throw new RuntimeException("no se puede plantar");
		fin = true;
		while (crupier.valor() < 17)
			crupier.add(mazo.get());
	}

	public boolean finalizado() {
		return fin;
	}
	
	@Override
	public String toString() {
		String resultado;
		if (fin)
			resultado = "Crupier: " + crupier.toString() + " = " + crupier.valor() + "\n";
		else
			resultado = "Crupier: " + crupier.get(0).toString() + "\n";
		resultado += "Jugador: " + jugador.toString()  + " = " + jugador.valor() + "\n";
		int vc = crupier.valor(); 
		int vj = jugador.valor();
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
