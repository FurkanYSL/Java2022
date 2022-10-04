
public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();

		krediUI.KrediHesapla(new İhtiyaçKrediManager());
		krediUI.KrediHesapla(new EmekliKrediManager());
	}

}
