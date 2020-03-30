import java.awt.Color;
import java.awt.Font;


import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;


@SuppressWarnings("serial")
public class ArrayBuilder extends JFrame  {
	public int seq = 0;
	private JLabel elLbl,arrLbl;
	public JPanel contentPaneA;
	public JTextField txtInput;
	private JTextArea txtOutput;
	Color ylw = new Color(230, 221, 91);
	Border blackline = BorderFactory.createLineBorder(ylw);
	Font f2 = new Font(Font.MONOSPACED, Font.BOLD, 12);
	Font f1 = new Font(Font.DIALOG_INPUT, Font.PLAIN, 11);
	public ArrayBuilder() {
		
		// WINDOW CONFIGURATIONS
		setTitle("ArrayBuilder");
		setSize(200,75);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setResizable(false);
		setLayout(null);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		contentPaneA = new JPanel();
		setContentPane(contentPaneA);
		contentPaneA.setLayout(null);
		contentPaneA.setBackground(new Color(50,50,50));
		
		// LABELS
		elLbl = new JLabel("Element ->");
		elLbl.setForeground(ylw);
		elLbl.setFont(f1);
		elLbl.setBounds(20,52,100,20);
		add(elLbl);
		
		arrLbl = new JLabel("Welcome to Array Builder");
		arrLbl.setForeground(ylw);
		arrLbl.setFont(f2);
		arrLbl.setBounds(10,5,200,12);
		add(arrLbl);
		
		// TEXTFIELD INPUT
		txtInput = new JTextField("");
		txtInput.setBorder(blackline);
		txtInput.setForeground(ylw);
		txtInput.setBackground(new Color(50, 50, 50));
		txtInput.setBounds(100, 52, 20, 20);
		txtInput.setFont(f1);
		add(txtInput);
		
		// TEXTFIELD OUTPUT
		txtOutput = new JTextArea("");
		txtOutput.setForeground(new Color(230, 221, 91));
		txtOutput.setBackground(new Color(50, 50, 50));
		txtOutput.setBounds(10,27,180,18);
		txtOutput.setEditable(false);
		txtOutput.setFont(f1);
		add(txtOutput);
		
		
		// ACTIONLISTNERS
		txtInput.addActionListener((e) -> input());
		
	}
	
	private void input() {
		String input = txtInput.getText();
		txtInput.setText("");
		String output = "";
		
		//TODO: FIX THIS SHIT, DON'T BE SO STUPID
		//TODO: om input = 10 8 2 3 9 8 1 1 0 -1
		//TODO: STRING -> INT ARRAY[]
		//TODO: a[10] = 10 8 2 3 9 8 1 1 0 -1
		if(input.equalsIgnoreCase("-1")) 	build(-1);
		if(input.equalsIgnoreCase("0")) 	build(0);	
		if(input.equalsIgnoreCase("1")) 	build(1);	
		if(input.equalsIgnoreCase("2"))		build(2);	
		if(input.equalsIgnoreCase("3")) 	build(3);	
		if(input.equalsIgnoreCase("4")) 	build(4);	
		if(input.equalsIgnoreCase("5")) 	build(5);	
		if(input.equalsIgnoreCase("6")) 	build(6);	
		if(input.equalsIgnoreCase("7")) 	build(7);	
		if(input.equalsIgnoreCase("8")) 	build(8);	
		if(input.equalsIgnoreCase("9")) 	build(9);	
		if(input.equalsIgnoreCase("10"))	build(10);	
		if(input.equalsIgnoreCase("e"))		{
			
			output = txtOutput.getText();
			Window.outputTxt.append(output + "\n");
			for(int i = 0; i<10;i++) {
				System.out.print(Window.a[i]);
			}
			System.out.print("\n");
			dispose();
		}
		

	
	}
	
	private void build(int value) {
		if(seq>=10)return;
		Window.a[seq]=value;
		txtOutput.append(value + " ");
		seq++;
		
		
	}

}
