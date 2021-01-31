package fp.daw.naipes;

public enum Naipe {
	
	PA(Palo.PICAS, Rango.A), P2(Palo.PICAS, Rango.DOS), P3(Palo.PICAS, Rango.TRES),
	P4(Palo.PICAS, Rango.CUATRO), P5(Palo.PICAS, Rango.CINCO), P6(Palo.PICAS, Rango.SEIS),
	P7(Palo.PICAS, Rango.SIETE), P8(Palo.PICAS, Rango.OCHO),P9(Palo.PICAS, Rango.NUEVE),
	P10(Palo.PICAS, Rango.DIEZ), PJ(Palo.PICAS, Rango.J), PQ(Palo.PICAS, Rango.Q),
	PK(Palo.PICAS, Rango.K),
	CA(Palo.CORAZONES, Rango.A), C2(Palo.CORAZONES, Rango.DOS), C3(Palo.CORAZONES, Rango.TRES),
	C4(Palo.CORAZONES, Rango.CUATRO), C5(Palo.CORAZONES, Rango.CINCO), C6(Palo.CORAZONES, Rango.SEIS),
	C7(Palo.CORAZONES, Rango.SIETE), C8(Palo.CORAZONES, Rango.OCHO), C9(Palo.CORAZONES, Rango.NUEVE),
	C10(Palo.CORAZONES, Rango.DIEZ), CJ(Palo.CORAZONES, Rango.J), CQ(Palo.CORAZONES, Rango.Q),
	CK(Palo.CORAZONES, Rango.K),
	TA(Palo.TREBOLES, Rango.A), T2(Palo.TREBOLES, Rango.DOS), T3(Palo.TREBOLES, Rango.TRES),
	T4(Palo.TREBOLES, Rango.CUATRO), T5(Palo.TREBOLES, Rango.CINCO), T6(Palo.TREBOLES, Rango.SEIS),
	T7(Palo.TREBOLES, Rango.SIETE), T8(Palo.TREBOLES, Rango.OCHO), T9(Palo.TREBOLES, Rango.NUEVE),
	T10(Palo.TREBOLES, Rango.DIEZ), TJ(Palo.TREBOLES, Rango.J), TQ(Palo.TREBOLES, Rango.Q),
	TK(Palo.TREBOLES, Rango.K),
	DA(Palo.DIAMANTES, Rango.A), D2(Palo.DIAMANTES, Rango.DOS), D3(Palo.DIAMANTES, Rango.TRES),
	D4(Palo.DIAMANTES, Rango.CUATRO), D5(Palo.DIAMANTES, Rango.CINCO), D6(Palo.DIAMANTES, Rango.SEIS),
	D7(Palo.DIAMANTES, Rango.SIETE), D8(Palo.DIAMANTES, Rango.OCHO), D9(Palo.DIAMANTES, Rango.NUEVE),
	D10(Palo.DIAMANTES, Rango.DIEZ), DJ(Palo.DIAMANTES, Rango.J), DQ(Palo.DIAMANTES, Rango.Q),
	DK(Palo.DIAMANTES, Rango.K);
	
	private Palo palo;
	private Rango rango;
	
	private Naipe(Palo palo, Rango rango) {
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
		return "" + rango + palo;
	}
}
