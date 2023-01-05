import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ExamplePanel extends JPanel {

	private JButton push;
	private JLabel label;
	private int count;
	
	/**
	 * Create the panel.
	 */
	public ExamplePanel() {
		
		count = 0;
		push = new JButton("Push Once!");
		push.addActionListener(new CountButtonListener());
		this.add(push);
		
		label = new JLabel ("Count : " + count);
		this.add(label);
		
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(300,100));
		
	}
	// Declare as an inner class so we can access the private class variables
	private class CountButtonListener  implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			count += 2;
			label.setText("Count: " + count);
		}
	}

}
