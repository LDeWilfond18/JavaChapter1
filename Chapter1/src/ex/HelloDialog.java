package ex;
import javax.swing.JOptionPane;
public class HelloDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,  "Hello World");
		
		System.out.println("X                             X");
		System.out.println("X                             X");
		System.out.println("X                             X");
		System.out.println("X                             X");
		System.out.println("X                             X");
		System.out.println("X       XXXXXXXXXXXXXXX       X");
		System.out.println("XXXXX   X             X   XXXXX");
		System.out.println("X   X   X             X   X   X");
		System.out.println("X   X   X             X   X   X");
		
		displayTruck();
	}
	
	public static void displayTruck() {
		
		System.out.println("       _________________________");
		System.out.println("      /__      Taco Truck       |");
		System.out.println("     / o |     |        |       |");
		System.out.println("   _/__|_|     |________|       |");
		System.out.println("  |                             |");
		System.out.println("  |___(O)________________(O)____|");
	}

}
