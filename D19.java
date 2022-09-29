package intro;

public class D19 {

	public static void main(String[] args) {
		System.out.println(topla(2,5));
		System.out.println(çıkar(3,5));
		System.out.println(çıkar(5,3));
		System.out.println(çarp(12,28));
		System.out.println(kalan(3,6));
	}
	public static int topla(int sayı1,int sayı2) {
		return sayı1+sayı2;
	}
	public static int çıkar(int sayı1,int sayı2) {
		if(sayı1>=sayı2)
			return sayı1-sayı2;
		else
			return sayı2-sayı1;
	}
	public static int çarp(int sayı1,int sayı2) {
		return sayı1*sayı2;
	}
	public static double kalan(int sayı1,int sayı2) {
		if(sayı1>=sayı2)
			return sayı1%sayı2;
		else
			return sayı2%sayı1;
	}
}
