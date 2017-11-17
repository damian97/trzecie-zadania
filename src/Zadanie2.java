import java.util.Random;

public class Zadanie2 {

	public static void main(String[] args) {
		
		Random losuj = new Random();
		
		int tablica[] = new int[20];
		int tablica1[] = {1,2,3,4,5,6,7,8,9,10};
		int a=0;
		int liczba=0;
		
		System.out.print("Wylosowane liczby: ");
		
		for (int i=0; i < tablica.length; i++) {
			
			tablica[i] = losuj.nextInt(10)+1;
			int pierwszy = tablica[i]+1;
			System.out.print(tablica[i] +" ");
			
		
			
		}

		int zerowy = tablica[0];
		System.out.println();
		System.out.println("Wystapienia: ");
		
		
		for (int i=0; i < tablica.length; i++) {
	
			while(a<10) {
			
			if (tablica1[i] == tablica[i]) {
				
				for (int j=0; j<tablica.length; j++) {
				
				if (tablica[j] == tablica1[a]) {
					
					liczba++;
					
				}
				
				}
				
			}
			System.out.println(a+1 +" - "+ liczba);	
			a++;	
			}
			
				
			
		}
	
		
		
	}
	
}
