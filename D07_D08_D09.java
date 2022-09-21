package intro;

import java.util.Iterator;

public class D07_D08_D09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//D11
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
		System.out.println("Döngü Bitti");
		//D12
		int sayı = 18;
		while (sayı>0) {
			System.out.println("Sayı Pozitiftir!");
			sayı--;
		}
		System.out.println("Döngü Bitti");
		//D13
		int hak = 20;
		do {
			System.out.println("Hak : "+hak);
			hak--;
		} while (hak>0);
			System.out.println("Hakkınız Bitmedi!");
	}
	
}
