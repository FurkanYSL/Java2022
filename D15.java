package intro;

public class D15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char harf = 'a';
		switch (harf) {
		case 'A':
		case 'a':
		case 'I':
		case 'ı':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("Kalın Sesli Harf");
			break;

		default:
			System.out.println("İnce Sesli Harf");
			break;
		}
	}

}
