import javax.swing.JFrame;

class dick {
	public static void main(String args[]) {
		Reader r = new Reader("Моё приложение");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(300, 200);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
	}	
}
 
