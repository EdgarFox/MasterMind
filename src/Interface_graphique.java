import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class Interface_graphique extends Frame implements WindowListener {
	
	public Interface_graphique() {
		super();
		this.setVisible(true);
		this.setSize(500, 800);
		this.addWindowListener(this);
		Canvas CMM = new Canvas() {
			public void paint(Graphics g) {
				g.drawString("pouet", 50, 50);
			}
		};
		//CMM : Canvas MasterMind
		CMM.setSize(500, 500);
		this.add(CMM);
		
		Panel PMM = new Panel();
		PMM.setBackground(Color.white);
		PMM.setSize(500, 600);
		
		PMM.setLayout(new GridLayout(1,Modele.COULEURS.length));
		
		
		this.setLayout(new BorderLayout());
		this.add(PMM, BorderLayout.SOUTH);
		
		for (int i=0; i<Modele.COULEURS.length;i++) {
			Button BMM = new Button();
			PMM.add(BMM);
			BMM.setBackground(Modele.COULEURS[i]); 
			
		}
			
		
		
		
		
	}
	
	public static void main (String[] args) {
		new Interface_graphique();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
