package intro;

public class D13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "Merhaba Size Nasıl Yardımcı Olabilirim ?";
		System.out.println(mesaj);
		
		System.out.println("Eleman Sayısı : "+mesaj.length());
		System.out.println("28. Eleman : "+mesaj.charAt(25));
		
		System.out.println(mesaj.concat(" Olamazsınız"));
		System.out.println(mesaj.startsWith("M"));
		System.out.println(mesaj.endsWith("z"));
		
		char[] elemanlar = new char[10];
		mesaj.getChars(0, 10, elemanlar, 0);
		System.out.println(elemanlar);
		
		System.out.println(mesaj.indexOf("?"));
		System.out.println(mesaj.lastIndexOf("N"));
		
		String mesaj2 = mesaj.replace(" ", ",");
		System.out.println(mesaj2);
		
		System.out.println("******************");
		System.out.println(mesaj.substring(0, 7));
		System.out.println("******************");
		
		for(String kelime : mesaj2.split(",")) {
			System.out.println(kelime);
		}
	}

}
