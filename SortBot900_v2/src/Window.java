import java.awt.Color;
import java.awt.Font;


import javax.swing.*;
import javax.swing.border.Border;


@SuppressWarnings("serial")
public class Window extends JFrame{
	Color ylw = new Color(230,221,91);
	Border blackline = BorderFactory.createLineBorder(ylw);
	private JPanel contentPane;
	private JLabel title;
	public JTextField inputTxt;
	public static JTextArea outputTxt;
	Font f2 = new Font(Font.MONOSPACED, Font.BOLD, 25);
	Font f1 = new Font(Font.DIALOG_INPUT, Font.PLAIN, 11);
	public Window() {
		
		//WINDOW CONFIGURATIONS
		setTitle("SortBot");
		setSize(250,280);
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(50,50,50));
		
		//TITLE
		title = new JLabel("SORTBOT900");
		title.setForeground(ylw);
		title.setFont(f2);
		title.setBounds(15,0,300,30);
		add(title);
		
		//TEXTAREA INPUT
		inputTxt = new JTextField("");
		inputTxt.setBorder(blackline);
		inputTxt.setForeground(ylw);
		inputTxt.setBackground(new Color(50,50,50));
		inputTxt.setBounds(15,235,200,20);
		inputTxt.setFont(f1);
		add(inputTxt);
		
		//TEXTAREA OUTPUT
		outputTxt = new JTextArea("");
		outputTxt.setBorder(blackline);
		outputTxt.setForeground(new Color(230,221,91));
		outputTxt.setBackground(new Color(50,50,50));
		outputTxt.setBounds(15,40,200,190);
		outputTxt.setEditable(false);
		outputTxt.setFont(f1);
		add(outputTxt);
		
		//ACTIONLISTNERS
		inputTxt.addActionListener((e) -> getTxt());
		
		
	}
	
	
	private void getTxt() {
		String input = inputTxt.getText();
		inputTxt.setText("");
		if(input.equalsIgnoreCase("exit")) System.exit(0);	//EXIT
		if(input.equalsIgnoreCase("random")) randomSort();
	}
	
	
	@SuppressWarnings("unused")
	private void stupidSortThatDowntWork() {
		
		String input = inputTxt.getText();			
		int[] a = null;									
		str2int(input,a);
	}
			
	private void str2int(String str, int[] convert) {
		String[] items = str.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
		
		convert = new int [items.length];
		
		for(int i = 0; i< items.length;i++) {
			convert[i] = Integer.parseInt(items[i]);
		}
		Sort.insertion(convert, 0, convert.length-1);

		
	}
	
	private void randomSort() {
		outputTxt.append("random array:" + "\n");
		ArrayGenerator.generate();
		
		
	}


}
