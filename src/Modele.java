import java.awt.Color;

public class Modele {
	
	public Color[] COULEURS = {Color.YELLOW,
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
	
	public Modele() {
		
	}
}
