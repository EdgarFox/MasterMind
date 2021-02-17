import java.awt.Color;

public class Modele {
	
	public static Color[] COULEURS = {Color.YELLOW,
						Color.GREEN,
						Color.BLUE,
						Color.MAGENTA,
						Color.RED,
						Color.ORANGE,
						Color.WHITE,
						Color.BLACK};
	public int N_TENTATIVES = 10;
	public int DIFFICULTE = 4;
	public enum ETAT {EN_COURS, GAGNE, PERDU};
	
	
	public Rangee combinaison;
	public Rangee[] propositions;
	
	public int tentative = 0;
	
	public Modele() {
		this.propositions = new Rangee[this.N_TENTATIVES];
	}
	

	
	public void evaluerProposition() {
		
	}
}
