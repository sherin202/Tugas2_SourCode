/* 13020200092 */
/* SHERIN*/
/* SELASA,22 FEB 2022 */
/* 07.00 */

import java.util.Scanner;
public class If1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner masukan=new Scanner(System.in);
		int a;
		
		System.out.print ("Contoh IF satu kasus \n");
		System.out.print ("Ketikkan suatu nilai integer : ");
		a = masukan.nextInt();
		if (a >= 0)
		System.out.print ("\nNilai a positif "+ a);
	}

}