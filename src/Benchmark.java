


public class Benchmark {

	// Primzahlen
	static long maxAnzahlPrimzahlen = 100;
	
	// Fibonacci-Zahlen
	static int fibonacciZahl = 5;
	
	// Ackermann-Funktion
	static int base = 2;
	static int exp = 1;
	
	Program p;
	
	public Benchmark(Program p) {
		this.p = p;
	}

	public void startBenchmark() {

		//zeit starten
		long zeitStart = System.currentTimeMillis();


		//benchmark starten
		PrimzahlenBenchmark prim = new PrimzahlenBenchmark(maxAnzahlPrimzahlen, p);
		prim.primzahlenAusrechnen();
		FibonacciZahlen fib = new FibonacciZahlen(fibonacciZahl, p);
		fib.fibRechnung();
		Ackermann ack = new Ackermann(base, exp, p);
		ack.ackermannRechnung();

		
		//zeit stoppen
		long zeitEnde = System.currentTimeMillis();
		long zeitGesamt = zeitEnde - zeitStart;
		double sekundenZeit = ((double)zeitGesamt)/1000;

		p.printErgebnis(sekundenZeit + " sec");

		Benchmark ben = new Benchmark(this);
		ben.startBenchmark();

		public void printErgebnis(String s) {
			ergebnis.append(s + "\n");
		}
		

	}
}