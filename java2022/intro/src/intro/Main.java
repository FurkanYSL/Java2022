package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin+" "+altMetin);
		
		int vade =  12;
		
		double dolarDun = 18.20;
		double DolarBugün = 18.20;
		
		boolean dolarDustuMu;
		
		String OkYonu;
		
		if (DolarBugün<dolarDun) {
			OkYonu = "down.svg";
			System.out.println(OkYonu);
		} else if(dolarDun<DolarBugün){
			OkYonu = "up.svg";
			System.out.println(OkYonu);
		} else {
			OkYonu = "equal.svg";
			System.out.println(OkYonu);
		}
		
		String[] krediler = {"Hızlı Kredi","Maaşını HalkBanktan Alanlar","Mutlu Emekli"};
				
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

	
}


