import java.awt.Color;

public class Rangee {
	
	public Color[] jetons;
	public int indiceJeton = 0;
	
	public Modele modele;
	
	public Rangee(Modele m) {
		this.modele = m;
		jetons = new Color[this.modele.DIFFICULTE];
	}

	public void setRandomColor() {
		for(int i = 0; i < this.jetons.length; i++) {
			
		}
	}

	public void evaluer(Rangee rangee) {
		int compteur_noir = 0;
		int compteur_blanc = 0;
		for(int i = 0; i < this.modele.DIFFICULTE; i++) {
			
		}
	}
}
