package fp.daw.naipes.juego;

import java.util.Scanner;

import fp.daw.naipes.Mazo;
import fp.daw.naipes.Naipe;
import fp.daw.naipes.Rango;

public class CartaMasAlta {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Mazo mazo = new Mazo();
		while (quieroJugar(in))
			jugar(mazo);
		System.out.println("Adios");
	}

	static boolean quieroJugar(Scanner in) {
		boolean quieroJugar;
		boolean correcta;
		do {
			System.out.print("¿Jugar? (s/n): ");
			String respuesta = in.nextLine().toLowerCase();
			correcta = (quieroJugar = respuesta.equals("s")) || respuesta.equals("n");
			if (!correcta)
				System.out.println("Respuesta incorrecta");
		} while (!correcta);
		return quieroJugar;
	}
	
	static void jugar(Mazo mazo) {
		Naipe naipeJugador = mazo.get();
		int valorJugador = valor(naipeJugador);
		Naipe naipeOrdenador = mazo.get();
		int valorOrdenador = valor(naipeOrdenador);
		System.out.println("Jugador: " + naipeJugador);
		System.out.println("Ordenador:" + naipeOrdenador);
		if (valorJugador > valorOrdenador)
			System.out.println("Gana el jugador");
		else if (valorJugador< valorOrdenador)
			System.out.println("Gana el ordenador");
		else
			System.out.println("Empate");
	}
	
	static int valor(Naipe naipe) {
		return naipe.getRango() == Rango.A ? Integer.MAX_VALUE : naipe.getRango().ordinal();
	}
	
}
