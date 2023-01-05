import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ExampleFrame extends JFrame {

	/**
	 * Create the frame.
	 */
	public ExampleFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Counter");
		getContentPane().add(new ExamplePanel());		
	}
}
