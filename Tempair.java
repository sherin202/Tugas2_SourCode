/* 13020200092*/
/* SHERIN */
/* SELASA,22 FEB 2022 */
/* 09.00 */

import java.util.Scanner;
public class Tempair {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int T;
		Scanner masukan=new Scanner(System.in);
		

		System.out.print ("Contoh IF tiga kasus \n");
		System.out.print ("Temperatur (der. C) = ");
		T=masukan.nextInt();
		if (T < 0) {
			System.out.print ("Wujud air beku \n"+ T);
		}else if ((0 <= T) && (T <= 100)){
			System.out.print ("Wujud air cair \n"+ T);
		}else if (T > 100){
			System.out.print ("Wujud air uap/gas \n"+ T);
		};
	}
}