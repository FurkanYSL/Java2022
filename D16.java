package intro;

public class D16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayı1 = 220;
		int sayı2 = 284;
		int toplam = 0;
		int toplam2 = 0;
		for (int i = 1; i < sayı1; i++) {
			if (sayı1 % i == 0) {
				toplam += i;
			}
		}
		for (int j = 1; j < sayı2; j++) {
			if (sayı2 % j == 0) {
				toplam2 += j;
			}
		}
		if (toplam + toplam2 == sayı1 + sayı2) {
			System.out.println(sayı1 + " ve " + sayı2 + " Sayıları Arkadaş Sayıdır");
		} else {
			System.out.println(sayı1 + " ve " + sayı2 + " Sayıları Arkadaş Sayı Değildir");
		}
	}
}
