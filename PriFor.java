/* 13020200092 */
/* SHERIN */
/* SELASA,22 FEB 2022 */
/* 09.00*/

import java.util.Scanner;
public class PriFor {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,N;
		Scanner masukan=new Scanner(System.in);
	
		System.out.print ("Baca N, print 1 s/d N ");
		System.out.print ("N = ");
		
		N=masukan.nextInt();

		for (i = 1; i <= N; i++){
		System.out.println (i); };
		System.out.println ("Akhir program \n");
	}
}