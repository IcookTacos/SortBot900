import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class Viewer extends JFrame {

	// SWING COMPONENTS
	public JPanel contentPaneB;
	private JLabel titleLbl, xaxis, yaxis, placeholder, xaxislbl, underscore, underscore2;
	private JLabel v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10;

	// COLOR
	Color ylw = new Color(230, 221, 91);
	Color blk = new Color(50, 50, 50);

	// BORDER
	Border blackline = BorderFactory.createLineBorder(ylw);

	// FONT
	Font f2 = new Font(Font.MONOSPACED, Font.BOLD, 14);
	Font f3 = new Font(Font.MONOSPACED, Font.BOLD, 8);
	Font f4 = new Font(Font.MONOSPACED, Font.BOLD, 11);

	public Viewer() {

		// WINDOW CONFIGURATIONS
		setTitle("Sort Viewer");
		setSize(300, 300);
		// setLayout(null);
		setLocation(500, 380);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setFocusable(true);

		// STUPID CONTENTPANES FORGETT THIS
		// contentPaneB = new JPanel();
		// setContentPane(contentPaneB);
		// contentPaneB.setLayout(null);
		// contentPaneB.setBackground(new Color(50,50,50));

		// TITLE LABEL
		titleLbl = new JLabel("Welcome to Sort Viewer");
		titleLbl.setForeground(ylw);
		titleLbl.setFont(f2);
		titleLbl.setBounds(50, 25, 200, 14);
		add(titleLbl);

		// UNDERSCORE
		underscore = new JLabel("======================");
		underscore.setForeground(ylw);
		underscore.setFont(f2);
		underscore.setBounds(50, 35, 200, 14);
		add(underscore);

		// UNDERSCORE

		underscore2 = new JLabel("======================");
		underscore2.setForeground(ylw);
		underscore2.setFont(f2);
		underscore2.setBounds(50, 15, 200, 14);
		add(underscore2);

		// X AXIS
		xaxis = new JLabel("0 1 2 3 4 5 6 7 8 9");
		xaxis.setForeground(ylw);
		xaxis.setFont(f3);
		xaxis.setBounds(75, 197, 200, 20);
		add(xaxis);

		// X AXIS LABEL
		xaxislbl = new JLabel("ARRAY ELEMNTS");
		xaxislbl.setForeground(ylw);
		xaxislbl.setFont(f4);
		xaxislbl.setBounds(85, 208, 200, 20);
		add(xaxislbl);

		// Y AXIS
		yaxis = new JLabel("VALUE");
		yaxis.setBounds(170, 80, 100, 20);
		yaxis.setForeground(ylw);
		yaxis.setFont(f4);
		add(yaxis);

		// VALUE LABELS

		v0 = new JLabel("0");
		v0.setForeground(ylw);
		v0.setFont(f3);
		v0.setBounds(180, 190, 20, 20);
		add(v0);
		
		v1 = new JLabel("1");
		v1.setForeground(ylw);
		v1.setFont(f3);
		v1.setBounds(180, 180, 20, 20);
		add(v1);

		v2 = new JLabel("2");
		v2.setForeground(ylw);
		v2.setFont(f3);
		v2.setBounds(180, 170, 20, 20);
		add(v2);

		v3 = new JLabel("3");
		v3.setForeground(ylw);
		v3.setFont(f3);
		v3.setBounds(180, 160, 20, 20);
		add(v3);

		v4 = new JLabel("4");
		v4.setForeground(ylw);
		v4.setFont(f3);
		v4.setBounds(180, 150, 20, 20);
		add(v4);

		v5 = new JLabel("5");
		v5.setForeground(ylw);
		v5.setFont(f3);
		v5.setBounds(180, 140, 20, 20);
		add(v5);

		v6 = new JLabel("6");
		v6.setForeground(ylw);
		v6.setFont(f3);
		v6.setBounds(180, 130, 20, 20);
		add(v6);

		v7 = new JLabel("7");
		v7.setForeground(ylw);
		v7.setFont(f3);
		v7.setBounds(180, 120, 20, 20);
		add(v7);

		v8 = new JLabel("8");
		v8.setForeground(ylw);
		v8.setFont(f3);
		v8.setBounds(180, 110, 20, 20);
		add(v8);

		v9 = new JLabel("9");
		v9.setForeground(ylw);
		v9.setFont(f3);
		v9.setBounds(180, 100, 20, 20);
		add(v9);

		v10 = new JLabel("10");
		v10.setForeground(ylw);
		v10.setFont(f3);
		v10.setBounds(180, 90, 20, 20);
		add(v10);

		// PLACEHOLDER
		placeholder = new JLabel("");
		placeholder.setBounds(0, 0, 0, 0);
		add(placeholder);

		// TESTING
		testArray();

		// DECORATIONS & CONTENTPANE
		getContentPane().setBackground(blk);
		getContentPane().add(new DrawingComponent());

	}

	@SuppressWarnings("unused")
	private void testArray() {
		// USED TO TEST ARRAYS
		for (int i = 1; i < 10; i++) {
			Window.a[i] = 4;
		}
	}

}
