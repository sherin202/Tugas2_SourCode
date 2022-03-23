/* 13020200092 */
/* SHERIN */
/* SELASA,22 FEB 2022 */
/* 09.00 */

import java.util.Scanner;

public class Konstant {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			final float PHI = 3.1415f;
			float r;
			Scanner masukan=new Scanner(System.in);
		
			System.out.print ("Jari-jari lingkaran =");
			r = masukan.nextFloat();
		
			System.out.print ("Luas lingkaran = "+ (PHI * r * r )+"\n");
			System.out.print ("Akhir program \n");
	}
}