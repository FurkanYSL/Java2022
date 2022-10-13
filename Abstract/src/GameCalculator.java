
public abstract class GameCalculator {
	public abstract void hesapla();

	public final void gameOver() {
		System.out.println("Oyun BİTTİ");
	}
	
	public final void gameStart() {
		System.out.println("Oyun BAŞLADI");
	}
}
