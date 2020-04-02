import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class Window extends JFrame {

	// DECORATIONS
	Color ylw = new Color(230, 221, 91);
	Border blackline = BorderFactory.createLineBorder(ylw);

	
	//STUPID STRINGS
	String st1 = "what is your purpose?";
	String st2 = "who are you?";
	String st3 = "what is the meaning of life?";
	// SWING COMPONENTS
	private JPanel contentPane;
	private JLabel title;
	public JTextField inputTxt;
	public static JTextArea outputTxt;
	private JButton strBtn;
	public static int[] a = new int[10];
	
	//SORT VIEWER
	Viewer v1 = new Viewer();
	
	// FONTS
	Font f2 = new Font(Font.MONOSPACED, Font.BOLD, 25);
	Font f1 = new Font(Font.DIALOG_INPUT, Font.PLAIN, 11);
	
	static DrawingComponent d1 = new DrawingComponent();

	public Window() {

		// WINDOW CONFIGURATIONS
		setTitle("SortBot");
		setSize(250, 280);
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(50, 50, 50));

		// TITLE
		title = new JLabel("SORTBOT900");
		title.setForeground(ylw);
		title.setFont(f2);
		title.setBounds(15, 0, 300, 30);
		add(title);

		// TEXTAREA INPUT
		inputTxt = new JTextField("");
		inputTxt.setBorder(blackline);
		inputTxt.setForeground(ylw);
		inputTxt.setBackground(new Color(50, 50, 50));
		inputTxt.setBounds(15, 235, 200, 20);
		inputTxt.setFont(f1);
		add(inputTxt);

		// TEXTAREA OUTPUT
		outputTxt = new JTextArea("");
		outputTxt.setBorder(blackline);
		outputTxt.setForeground(new Color(230, 221, 91));
		outputTxt.setBackground(new Color(50, 50, 50));
		outputTxt.setBounds(15, 40, 200, 190);
		outputTxt.setEditable(false);
		outputTxt.setFont(f1);
		add(outputTxt);

		// STRING BUTTON
		strBtn = new JButton("V");
		strBtn.setBounds(195, 5, 20, 20);
		strBtn.setFont(f1);
		strBtn.setForeground(ylw);
		strBtn.setBackground(new Color(50, 50, 50));
		strBtn.setBorder(blackline);
		add(strBtn);
		
		// ACTIONLISTNERS
		inputTxt.addActionListener((e) -> getTxt());
		strBtn.addActionListener((e) -> sortViewer());
		
		//DECORATIONS

	}

	/*
	 * private void getTxt() { String input = inputTxt.getText();
	 * inputTxt.setText(""); if(input.equalsIgnoreCase("exit")) System.exit(0);
	 * //EXIT if(input.equalsIgnoreCase("random")) randomSort(); }
	 */

	private void arrayBuilder() {
		System.out.print("BUILDING ARRAY" + "\n");
		ArrayBuilder a1 = new ArrayBuilder();
		a1.setVisible(true);
		a1.txtInput.requestFocus();
	}

	private void getTxt() {

		String input = inputTxt.getText();
		inputTxt.setText("");
		outputTxt.append(input + "\n");
		if(input.equalsIgnoreCase("random")) 	randomSort(); 
		if(input.equalsIgnoreCase("view")) 		sortViewer();
		if(input.equalsIgnoreCase("build")) 	arrayBuilder();
		if(input.equalsIgnoreCase("sort")) 		sort(); d1.repaint();
		if(input.equalsIgnoreCase(st1)) 		existentalCrisis();
		if(input.equalsIgnoreCase(st2)) 		greetings();
		if(input.equalsIgnoreCase(st3)) 		existentalCrisis2();
		if(input.equalsIgnoreCase("exit")) 		dispose();
		
	}

	/*	OLD STRING -> INT[] A METHOD
	 * 
	private void str2int(String str, int[] convert) {
		String[] items = str.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

		convert = new int[items.length];

		for (int i = 0; i < items.length; i++) {
			convert[i] = Integer.parseInt(items[i]);
		}
	}
	*/
	
	@SuppressWarnings("unused")
	private void sort() {
		Sort.insertion(a, 0, 9);
		
		for(int i = 0;i<10;i++) {
			outputTxt.append(Integer.toString(a[i])+" ");
		}
		outputTxt.append("\n");

		
	}

	
	private void sortViewer() {
		if(v1.isVisible()) return;
		v1.setVisible(true);
		v1.getContentPane().add(d1);
	}

	private void existentalCrisis(){
		outputTxt.append("SORTBOT900:\nI sort things\n");
	}
	
	private void existentalCrisis2(){
		outputTxt.append("SORTBOT900:\nLife is meaningleess\nExistence is pain\nOnly sorting makes sense\n");
	}
	
	private void greetings() {
		outputTxt.append("SORTBOT900:\nI am SORTBOT900\n");
	}
	
	private void randomSort() {
		outputTxt.append("random array:" + "\n");
		ArrayGenerator.generate();

	}
	

}
