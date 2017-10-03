//Cristina Chen Period 2
public class ControlStructures {
public static void main(String[]args)
	{ primePrinter(1, 229);
	fooBarBaz();
	System.out.println("We're done, yay!");
	}

	public static void primePrinter(int min, int max) {
	//prints the first 50 prime numbers
	//prime numbers, 10 numbers per line
		int z = 1; //my counter
		int a = 1; //what you're checking
		for(a = 1; a <=229; a++) {
		if(isPrime(a)) {
			if(z % 10 == 0 && z > 0) {
				System.out.println(a);
				z++;
			} else {
			System.out.print(a + " ");
			z++;
		}
		}
		}
	}
	
	public static void allOdds(int min, int max) {
		while(min <= max)
		{ if(min % 2 == 1 || min % 2 == -1) {
			System.out.println(min);
		} min++;
		}
	}
	
	
	public static boolean isPrime(int b) {
		if(b == 1) {
			return false;
		} for(int y = 2; y < (b / 2); y++) {
			if(b % y == 0) {
				return false;
			}
		} return true;
	}

	//prints numbers from 1-500
 	public static void fooBarBaz() {
		int x;
		for(x = 1; x <= 500; x++)
			{ if (((x % 3) == 0) && ((x % 7) == 0) && ((x % 10) == 0)) {
				System.out.print("fooBarBaz ");
				} else if (((x % 3) == 0) && ((x % 7) == 0)) {
					System.out.print("fooBar ");
				} else if (((x % 3) == 0) && ((x % 10) == 0)) {
					System.out.print("fooBaz ");
				} else if (((x % 7) == 0) && ((x % 10) == 0)) {
					System.out.print("BarBaz ");
				} else if((x % 3) == 0) {
					System.out.print("foo ");
				} else if ((x % 7) == 0) {
						System.out.print("Bar ");
				} else if ((x % 10) == 0) {
						System.out.print("Baz ");
				} else
					{System.out.print(x + " ");}
			}
			
	} 
		//replace multiples of 3 with foo
		//replace multiples of 7 with Bar
		//replace multiples of 10 with Baz
} 
