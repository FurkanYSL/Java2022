package intro;

public class D14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 3;
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
