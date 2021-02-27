package fp.daw.naipes.blackjack;

import java.util.Scanner;

public class BlackJackConsola {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String linea;
		BlackJack juego = new BlackJack();
		System.out.print("Blackjack> ");
		linea = in.nextLine();
		while (!linea.equals("fin")) {
			try {
				switch (linea) {
				case "repartir":
					juego.repartir();
					break;
				case "pedir":
					juego.pedir();
					break;
				case "plantarse":
					juego.plantarse();
					break;
				default:
					System.out.println("no lo entiendo: " + linea);
				}
				System.out.println(juego);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
			System.out.print("Blackjack> ");
			linea = in.nextLine();
		}
		in.close();
	}

}
