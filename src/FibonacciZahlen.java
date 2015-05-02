
public class FibonacciZahlen {

	int count = 0;
	int k;
	
	BenchmarkStart p;

	public FibonacciZahlen(int fibonacciZahl, BenchmarkStart p){
		k = fibonacciZahl;
		this.p = p;
	}

	public void fibRechnung(){
		p.printErgebnis("fib(" + k + ") = " + fibonacciRech(k));
		p.printErgebnis("wurde " + count + "-Mal aufgerufen");
	}

	public int fibonacciRech(int n) {
		int resultat = n;

		if (n > 1) {
			resultat = fibonacciRech(n-1) + fibonacciRech(n-2);
		}
		else if (n == 1) {
			resultat = 1;
		}
		else {
			resultat = 0;
		}
		count = count + 1;
		return resultat;
	}
}

