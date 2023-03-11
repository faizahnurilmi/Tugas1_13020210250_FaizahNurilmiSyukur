//13020210250
//Faizah Nurilmi Syukur
//Selasa/7 Maret 2023

import java.util.Scanner;

public class PboTI
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukkan total detik : ");
		int detik = sc .nextInt();
		int detik1= detik % 60;
		int menit= detik / 60;
		int menit1= menit % 60;
		int jam= menit / 60;
		int jam1=  jam  % 24;
		
		System.out.println("detikSekarang = " + detik1);
		System.out.println("totalMenit = " + menit);
		System.out.println("menitSekarang = " + menit1);
		System.out.println("totalJam = " + jam);
		System.out.println("jamSekarang = " + jam1);
		System.out.println("Waktu ("+ jam1 + ":" + menit1 + ":" + detik1 + ")");
	}
}	