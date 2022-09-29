package intro;

public class D18 {

	public static void main(String[] args) {
		asalSayı(8);
		asalSayı(7);
		asalSayı(27);
		asalSayı(71);
	}
	public static void asalSayı(int number) {
		boolean asalMı=true;
		if (number<2) {
			System.out.println("Sayı Asal Değildir");
			return;
		}
		if(number==2) {
			System.out.println("Sayı Asaldır");
			return;
		}
		for (int i = 2; i < number; i++) {
			if(number%i==0) {
				asalMı = false;
			}
		}
		if (asalMı == true) {
			System.out.println("Sayı Asaldır");
		} 
		else {
			System.out.println("Sayı Asal Değildir");
		}
	}
}
