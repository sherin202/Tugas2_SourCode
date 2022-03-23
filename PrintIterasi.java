/* 13020200092 */
/* SHERIN */
/* SELASA,22 FEB 2022 */
/* 09.00 */

import java.util.Scanner;
public class PrintIterasi {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N;
		int i;
		Scanner masukan=new Scanner(System.in);
		
		System.out.print ("Nilai N >0 = ");
		N = masukan.nextInt();
		i = 1; /* First Elmt */
		System.out.print ("Print i dengan ITERATE : \n");
		for (;;){
			System.out.println(i); /* Proses */
			if (i == N)
				/* Kondisi Berhenti */ break;
			else {
				i++; /* Next Elmt */
			}
		} /* (i == N) */
	}
}