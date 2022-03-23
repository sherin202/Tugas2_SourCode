/* 13020200092 */
/* SHERIN */
/* SELASA,22 FEB 2022 */
/* 09.00 */

import java.util.Scanner;
public class PrintXWhile {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int Sum;
		int x;
		Scanner masukan=new Scanner(System.in);

		Sum = 0;
		System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt();
		while (x != 999)  {
			Sum = Sum + x; 
			System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt();
		}
		System.out.println("Hasil penjumlahan = "+ Sum);
	}
}