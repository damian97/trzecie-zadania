import java.util.Scanner;

public class Zadanie5 {

	public static void main(String[] args) {
	
		Scanner odczyt = new Scanner(System.in);
		
		int liczbadziesietna = odczyt.nextInt();
		int liczbawejsciowa = liczbadziesietna;
		int tablica[] = new int[32];
		int tablicazu1[] = new int[32];
		int tablicazu2[] = new int[32];
		Boolean logiczny = false;
		Boolean logiczny1 = false;
		Boolean logiczny2 = false;
		int bitznakowy;
		
		System.out.println("Wejœcie: ");
		System.out.println(liczbawejsciowa);
		
		if (liczbadziesietna >=0) {
			
			bitznakowy = 0;
			
		}else {
			
			bitznakowy = 1;
			liczbadziesietna = liczbadziesietna*-1;
			
		}
		
				
				for(int i=tablica.length-1; i>=0; i--) {
	
					if (liczbadziesietna%2==0) {
						
						tablica[i] = liczbadziesietna%2;
						
					}else {
						
						tablica[i] = liczbadziesietna%2;
					}
					
					liczbadziesietna = liczbadziesietna/2; //liczbadziesietna = 37 > 18 > 9 > 4 > 2 > 1 > 0
					
					if (liczbadziesietna==0) {

						break;
						
					}

						
				}	
				
				System.out.println("Wynik:");
				if (liczbawejsciowa != 0) {
				System.out.print("Liczba " + liczbawejsciowa + " binarnie: "+ bitznakowy+".");	

				
				
				
	
				
				for(int i=0; i<tablica.length; i++) {
					
					if (tablica[i]>=1) {
						logiczny = true;		
					}
					
						if(logiczny==true) {
						System.out.print(tablica[i]);
						}
						
				}
				
				System.out.println("(ZM)");
				
				if (bitznakowy==1) {
					
					for(int i=0; i<tablica.length; i++) {
					
						if (tablica[i]==0) {
						tablicazu1[i] = 1;
						}else if(tablica[i]==1) {	
						tablicazu1[i] = 0;		
						}
						
		
					}
					
					
					System.out.print("Liczba " + liczbawejsciowa + " binarnie: "+ 0 +".");	
		
					for(int i=0; i<tablica.length; i++) {
						
						if (tablicazu1[i]==0) {
							logiczny1 = true;		
						}
						
							if(logiczny1==true) {
							System.out.print(tablicazu1[i]);
							}
							
					}
					
					System.out.println("(ZU1)");
							
					System.out.print("Liczba " + liczbawejsciowa + " binarnie: "+ 1 +".");	
		
					for(int i=0; i<tablica.length-1; i++) {
						
						if (tablicazu1[i]==0) {
							logiczny2 = true;		
						}
						
							if(logiczny2==true) {
							System.out.print(tablicazu1[i]);
							}
							
					}
					
					System.out.println(1 + "(ZU2)");
					
					
					
					
					
				
				
				}
				
				
				
				
				
				}else {
					System.out.println("Liczba " + liczbawejsciowa + " binarnie: "+0+"."+0);		
					System.out.println("Liczba " + 0.0 + " w ZU1: "+0+"."+0);		
					System.out.println("Liczba " + 0.0 + " w ZU2: "+0+"."+0);		
				}
	
	}
}
