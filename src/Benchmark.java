


public class Benchmark {

	// Primzahlen
	static long maxAnzahlPrimzahlen = 10000;
	
	// Fibonacci-Zahlen
	static int fibonacciZahl = 20;
	
	// Ackermann-Funktion
	static int base = 4;
	static int exp = 1;
	
	BenchmarkStart p;
	
	public Benchmark(BenchmarkStart p) {
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
		
		

	}
}