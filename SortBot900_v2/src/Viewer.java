import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Viewer extends JPanel {
	
	// SWING COMPONENTS
	public JPanel contentPaneB;
	private JLabel titleLbl;
	
	// DECORATIONS
	Color ylw = new Color(230, 221, 91);
	Border blackline = BorderFactory.createLineBorder(ylw);
	Font f2 = new Font(Font.MONOSPACED, Font.BOLD, 12);
	
	public Viewer() {
		
		// WINDOW CONFIGURATIONS
		//setTitle("SortViewer");
		setSize(300,300);
		setLocation(500,380);
		//setUndecorated(true);
		//setResizable(true);
		setLayout(null);
		setFocusable(true);
		
		// STUPID CONTENTPANES
		contentPaneB = new JPanel();
		//setContentPane(contentPaneB);
		contentPaneB.setLayout(null);
		contentPaneB.setBackground(new Color(50,50,50));
		
		// NAME?!?
		titleLbl = new JLabel("Welcome to Sort Viewer");
		titleLbl.setForeground(ylw);
		titleLbl.setFont(f2);
		titleLbl.setBounds(10,5,200,12);
		add(titleLbl);
		
		
	}
	
	protected void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      // draw the rectangle here
	      g.drawRect(0,10, 5, 10);
	   }
	
}
