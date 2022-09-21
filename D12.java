package intro;

public class D12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] şehirler = new String[3][3];
		şehirler[0][0] = "Kütahya";
		şehirler[0][1] = "Antalya";
		şehirler[0][2] = "Afyon";
		şehirler[1][0] = "Ankara";
		şehirler[1][1] = "İzmir";
		şehirler[1][2] = "İstanbul";
		şehirler[2][0] = "Balıkesir";
		şehirler[2][1] = "Adana";
		şehirler[2][2] = "Diyarbakır";
		
		for (int i = 0; i < şehirler.length; i++) {
			for (int j = 0; j < şehirler.length; j++) {
				System.out.println(şehirler[i][j]);
			}
		}
	}

}
