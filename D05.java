package intro;

public class D05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayı1,sayı2,sayı3,max;
		sayı1 = 10;
		sayı2 = 25;
		sayı3 = 20;
		
		max = sayı3;
		
		if (max<sayı1) {
			max = sayı1;
		}
		if (max<sayı2) {
			max = sayı2;
		}
		System.out.println("En Büyük Sayı : "+max);
	}

}
