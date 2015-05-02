
public class PrimzahlenBenchmark {

	long limit;
	BenchmarkStart p;

	public PrimzahlenBenchmark(long maxAnzahlPrimzahlen, BenchmarkStart p) {
		limit = maxAnzahlPrimzahlen;
		this.p = p;
	}

	public void primzahlenAusrechnen() {
		
		for (long x=2; x<=limit; x++) {
			if (istPrimzahl(x)) { 
				p.printErgebnis(x + " ist eine Primzahl.");
			}
		}
	}

	public boolean istPrimzahl(long x) {

		for (int j=2; j<=x/2; j++) {
			if(x % j == 0) {
				return false;
			}
		}
		return true;

	}
}

