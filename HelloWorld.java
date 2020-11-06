import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
	
public class HelloWorld implements ActionListener {
	
	private static JLabel label;
	private static JLabel hello;
	private static JButton button;

	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		label = new JLabel("My First Java Program.");
		label.setBounds(20, 10, 180, 25);
		panel.add(label);
		
		button = new JButton("Click Here");
		button.setBounds(20, 40, 100, 25);
		button.addActionListener(new HelloWorld());
		panel.add(button);
		
		hello = new JLabel("");
		hello.setBounds(20, 70, 180, 25);
		panel.add(hello);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		hello.setText("Hello World!");
		
	}
}