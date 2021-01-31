package fp.daw.naipes;

public class Naipe {
	
	/*
	 * Palos
	 */
	private static char [] palos = {'\u2660', '\u2665','\u2663','\u2666'};
	public static int PICAS = 0;
	public static int CORAZONES = 1;
	public static int TREBOLES = 2;
	public static int DIAMANTES = 3;
	
	/*
	 * Rangos
	 */
	private static String [] rangos = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	public static int A = 0;
	public static int DOS = 1;
	public static int TRES = 2;
	public static int CUATRO = 3;
	public static int CINCO = 4;
	public static int SEIS = 5;
	public static int SIETE = 6;
	public static int OCHO = 7;
	public static int NUEVE = 8;
	public static int DIEZ = 9;
	public static int J = 10;
	public static int Q = 11;
	public static int K = 12;
	
	
	private int palo;
	private int rango;
	private int valor;
	
	public Naipe(int palo, int rango, int valor) {
		if (palo < 0 || palo >= palos.length)
				throw new RuntimeException("El palo es incorrecto");
		this.palo = palo;
		if (rango < 0 || rango >= rangos.length)
			throw new RuntimeException("El palo es incorrecto");
		this.rango = rango;
		this.valor = valor;
	}
	

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getPalo() {
		return palo;
	}

	public int getRango() {
		return rango;
	}
	
	public char getPaloChar() {
		return palos[palo];
	}

	public String getRangoString() {
		return rangos[rango];
	}
		
	@Override
	public String toString() {
		return rangos[rango] + palos[palo];
	}
}
