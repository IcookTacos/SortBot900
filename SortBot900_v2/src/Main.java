import javax.swing.JFrame;

@SuppressWarnings("unused")
public class Main {
	public static void main(String[] args) {
		Window w1 = new Window();
		w1.setVisible(true);
		w1.inputTxt.requestFocus();
	}
}
