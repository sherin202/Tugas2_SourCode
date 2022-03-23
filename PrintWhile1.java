/* 13020200092 */
/* SHERIN */
/* SELASA,22 FEB 2022 */
/* 09.00 */

import java.util.Scanner;
public class PrintWhile1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int N;
		int i = 1;
		Scanner masukan=new Scanner(System.in);

		System.out.print ("Nilai N >0 = ");
		N = masukan.nextInt();
		System.out.print ("Print i dengan WHILE (ringkas): \n");
		while (i <= N){
			System.out.println (i++);
		} /* (i > N)*/
	}
}