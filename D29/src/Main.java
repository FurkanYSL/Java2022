
public class Main {

	public static void main(String[] args) {
		DortIslem dortislem = new DortIslem();
		System.out.println("Sonuç : " + dortislem.Topla(2, 3));
		System.out.println("Sonuç : " + dortislem.Topla(2, 3, 5));
		System.out.println("Sonuç : " + dortislem.Carp(2, 3));
		System.out.println("Sonuç : " + dortislem.Carp(2, 3, 5));
		System.out.println("Sonuç : " + dortislem.Carp(2, 3, 5, 6));
	}

}
