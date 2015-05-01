


public class Ackermann {
	
	int a;
	int b;
	
	public Ackermann(int base, int exp) {
		a = base;
		b = exp;
	}
	
	public int ackRech(int n, int m) {
		
		if( n == 0 ) {
			return m + 1 ;
		}
		else if( n > 0 && m == 0 ) {
			n = n - 1 ;
			m = 1 ;
			return ackRech( n , m ) ;
		}
		else {
			return ackRech( n - 1 , ackRech( n , m - 1 ) ) ;
		}
	}
	
	public void ackermannRechnung() {
		System.out.println(ackRech(a, b));
	}
}