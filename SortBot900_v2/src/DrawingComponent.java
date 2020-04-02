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
	// DIMENSIONS
	int y = 200, WIDTH = 15;
	
	public DrawingComponent() {}
	public void paint(Graphics g) {

		int increment = 0;

		// DRAWING ARRAY
		for (int i = 0; i < Window.a.length; i++) {
			Graphics2D g2 = (Graphics2D) g;
			g.setColor(ylw);
			g.fillRect(80 + i * 10, y, WIDTH, 1 - (Window.a[i] * 10));
		}

	}
	
	

}
