package intro;

import java.util.Iterator;

public class D17 {

	public static void main(String[] args) {
		int[] sayılar = new int[]{0,1,2,5,10,89,46,128,20,50,46,87,79};
		boolean varMı = false;
		int arananSayı = 100;
		
		for(int sayı : sayılar) {
			if(sayı == arananSayı) {
				varMı=true;
				break;
			}
		}
		if(varMı==true) {
			System.out.println("Aranan Sayı Bulundu");
		}
		else {
			System.out.println("Aranan Sayı Bulunamadı");
		}
	}

}
