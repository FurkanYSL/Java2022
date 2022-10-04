
public class Main {

	public static void main(String[] args) {
		BaseKrediManager basekredimanager = new BaseKrediManager();
		basekredimanager.KrediHesapla(new İhtiyaçKrediManager());
		basekredimanager.KrediHesapla(new EmekliKrediManager());
	}

}
