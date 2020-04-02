import java.awt.Component;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JLabel;

@SuppressWarnings({ "unused", "serial" })

public class DrawingComponent extends Component {
	
	//JLABELS
	
	// COLOR
	Color ylw = new Color(230, 221, 91);
	Color blk = new Color(50, 50, 50);
	// DIMENSIONS
	int y = 100, WIDTH = 6;
	
	public DrawingComponent() {}
	public void paint(Graphics g) {
		// DRAWING ARRAY
		
		for (int i = 0; i < Window.a.length; i++) {
			Graphics2D g2 = (Graphics2D) g;
			g.setColor(ylw);
			g.fillRect(75 + i * 10, ((10-Window.a[i])*10)+99, WIDTH,11-(10-Window.a[i]*10));
			
		}
		

		
	}
	
	public void debugg() {
		System.out.print("SORTING\n");
	}
	
	

}
