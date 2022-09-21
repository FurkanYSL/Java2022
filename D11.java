package intro;

public class D11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] Liste = {1.2,2.3,3.6,4.8,5.1,1.0,20.7};
		
		double total = 0;
		double max = 0;
		double min = Liste[0];
		
		for (int i = 0; i < Liste.length; i++) {
			if (max<Liste[i]) {
				max = Liste[i];
			}
			if (min>Liste[i]) {
				min = Liste[i];
			}
			total += Liste[i];
		}
		
		System.out.println("Max Sayı : "+max);
		System.out.println("Min Sayı : "+min);
		System.out.println("Toplam : "+total);
	}

}
