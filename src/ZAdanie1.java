import java.util.Scanner;
import java.util.Random;

public class ZAdanie1 {

	public static void main(String[] args) {
		
		Random losuj = new Random();
		
		int tablica[] = new int[10];
	
		System.out.println("Wylosowane liczby:");
		
		int max = tablica[0];
		int min = tablica[0];
		float avg = 0;
		int highavg=0, lowavg = 0;
		
		for (int i=0; i < tablica.length; i++) {
			
			tablica[i] = losuj.nextInt(21) - 10;
			
			System.out.print(tablica[i] +", ");
			
			if (tablica[i] > max) {
				max = tablica[i];
			}else if (tablica[i] < min) {	
				min = tablica[i];	
			}
				
			avg = avg + tablica[i];	

		}
		
		float AVG = avg/tablica.length;	
		
		for (int i=0; i < tablica.length; i++) {
			
			if(tablica[i] > AVG) {
				
				highavg++;
				
			}else {
				
				lowavg++;
				
			}
			
		}
		
		
		System.out.println("");
		System.out.print("Min: "+min);
		System.out.println(", Max: "+max);
		System.out.println("Œrednia: " + AVG);
		System.out.println("Mniejszych od œredniej: "+lowavg);
		System.out.println("Wiêkszych od œredniej: "+highavg);		
		System.out.println("Liczby w odwrotnej kolejnoœci:");
		
		for (int i=9; i >= 0; i--) {
			
			System.out.print(tablica[i] +", ");
			
	 	}

		
 	}
	
}
