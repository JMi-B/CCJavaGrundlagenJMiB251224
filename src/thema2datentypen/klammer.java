package thema2datentypen;

public class klammer {
	public static void main (String [] arg) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		int x = 4;
		int y = 5;
		int z = 6;
		
		int n = 7;
		int p = 8;
		
// Aufgabe 2.2 a 		
		System.out.println((a+b)-(3*c));
		System.out.println(a+b-(3*c));
		System.out.println((a+b)-3*c);
		System.out.println(a+b-3*c);

// Aufgabe 2.2 b
		System.out.println((4+x)/(y*z));
		System.out.println(4+x/(y*z));
		System.out.println((4+x)/y*z);
		System.out.println(4+x/y*z);	
		
// Aufgabe 2.2 c
		System.out.println((x+3)*(n%p));
		System.out.println(x+3*(n%p));
		System.out.println((x+3)*n%p);
		System.out.println(x+3*n%p);

// Aufgabe 2.2 d		
		System.out.println(-a/(-(b+c)));
		System.out.println(-a/-(b+c));
		System.out.println(-a/-b+c);
		System.out.println((-a)/-(b+c));
		System.out.println((-a)/-b+c);

// Aufgabe 2.2 e
		System.out.println((x/y)%(-z));
		System.out.println(x/y%(-z));
		System.out.println((x/y)%-z);
		
		
// aufgabe 2.2 f
		System.out.println(x/(y%(-z)));
		System.out.println(x/y%(-z));
		System.out.println(x/(y%-z));
		System.out.println(x/y%-z);
		
	}

}
