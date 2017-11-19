import java.util.Random;

public class Zadanie3{
	
	public static void main(String[] args) {
		
		int m[][] = new int[5][5];      
		int min=0, max=0;
		int max1=-5, min1=5;
		Random losuj = new Random();	
		
		System.out.println("Wylosowana macierz:");
		
		for(int i=0; i<m.length; i++) {				//Przypisanie losowych warotœci
			for(int j=0; j<m[i].length; j++) {
				m[i][j] = losuj.nextInt(11) - 5;
				System.out.print(m[i][j] + " ");
			
			}
			System.out.println();
		}
			
		System.out.println();
		System.out.println("Minimalne wartoœci w wierszach:");
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				
				if(m[i][j] > max) {
					
					max = m[i][j];
											//Odszukanie najmniejszych wartoœci na wierszach
				}else if(m[i][j] <= min){
					
					min = m[i][j];
					
				}
			
				
			}
			System.out.println(i +": "+ min);
			min = 0;

		}

		System.out.println("Maksymalne wartoœci w kolumnach:");
		
					
		for(int j=0; j<m.length; j++) {
			for(int i=0; i<m[j].length; i++) {	
				
				if(m[i][j] >= max1) {
									//Odszukanie najwiêkszych wartoœci na kolumnach
					max1 = m[i][j];
					
				}
			
			}
			System.out.println(j +": "+ max1);
			max1 = -5;

		}

		
		System.out.print("Maksimum na 1. przek¹tnej: ");	
		
		int a=0;
		
		while(a<4) {
		
			if(m[a][a] >= max1) {
									//Odszukanie najwiêkszej wartoœci na 1 przek¹tnej
				max1 = m[a][a];
				
			}
		
			a++;
			
		}
		
		System.out.println(max1);	
		
		System.out.print("Minimum na 2. przek¹tnej: ");	
		
		int b=4;
		int c=0;
		
		while(b>=0) {
		
			if(m[c][b] <= min1) {
								//Odszukanie najmniejszej wartoœci na 2 przek¹tnej
				min1 = m[c][b];
				
			}
		
			b--;
			c++;
		}
		
		System.out.println(min1);	
			
		
	}
	
}