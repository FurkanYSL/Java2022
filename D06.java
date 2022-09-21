package intro;

public class D06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		grade = 'G';
		
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel Geçtiniz");
			break;			
		case 'B':
			System.out.println("İyi Geçtiniz");
			break;
		case 'C':
			System.out.println("Eh Geçtiniz");
			break;
		case 'D':
			System.out.println("Bu Seferlik Geçtiniz");
			break;
		case 'E':
			System.out.println("Kalmaya Yakın ama Geçtiniz");
			break;
		case 'F':
			System.out.println("KALDINIZ");
			break;
		default:
			System.out.println("Geçersiz Not Girişi !");
		}
	}

}
