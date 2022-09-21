package intro;

public class D10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String öğrenci1 = "Ali";
		String öğrenci2 = "Ahmet";
		String öğrenci3 = "Ayşe";
		String öğrenci4 = "Furkan";
		
		String[] öğrenciler = new String[4];
		
		öğrenciler[0] = "Ali";
		öğrenciler[1]="Ahmet";
		öğrenciler[2]="Ayşe";
		öğrenciler[3]="Furkan";
		
		
		for (int i = 0; i < öğrenciler.length; i++) {
			System.out.println(öğrenciler[i]);
		}
		
		System.out.println("******s");
		
		for(String öğrenci : öğrenciler) {
			System.out.println(öğrenci);
		}
	}

}
