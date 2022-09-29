package intro;

public class D20 {

	public static void main(String[] args) {
		System.out.println("Sonuç : "+topla(1,2,3,4,5,6,7,8,9));
		System.out.println("Sonuç : "+çarpım(1,2,3,9));
	}
	
	public static int topla(int... sayılar) {
		int toplam = 0;
		for(int sayı : sayılar) {
			toplam += sayı;
		}
		return toplam;
	}
	
	public static int çarpım(int... sayılar) {
		int çarpım = 1;
		for(int sayı : sayılar) {
			çarpım *= sayı;
		}
		return çarpım;
	}
}
