import java.util.Scanner;

public class Zadanie4 {

	public static void main(String[] args) {
	
		Scanner odczyt = new Scanner(System.in);
		
		int liczbadziesietna = odczyt.nextInt();
		int liczbawejsciowa = liczbadziesietna;
		int tablica[] = new int[32];
		Boolean logiczny = false;
		int bitznakowy;
		
		System.out.println("Wej�cie: ");
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

				
				for(int i=0; i<=tablica.length-1; i++) {
					
					if (tablica[i]>=1) {
						logiczny = true;		
					}
					
						if(logiczny==true) {
						System.out.print(tablica[i]);
						}
					
				}
				

				}else {
					System.out.print("Liczba " + liczbawejsciowa + " binarnie: "+0+"."+0);		
				}
	
		
		
	}
}
