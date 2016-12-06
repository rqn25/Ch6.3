x
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Layout extends JFrame {

	public Layout() {
		GridLayout gridLayout = new GridLayout(2,2);
		JPanel panel = new JPanel(gridLayout);
		
		JLabel label = new JLabel("Enter numbers");
		JLabel label2 = new JLabel("Select a button");
		
		JButton button1 = new JButton("button1: Add");
		JButton button2 = new JButton("button2: Subtract");
		JButton button3 = new JButton("button3: Multiply");
		JButton button4 = new JButton("button4: Divide");
		
		JTextField textField = new JTextField(10);
		JTextField textField2 = new JTextField(10);
		JTextField textField3 = new JTextField(10);
		JTextField textField4 = new JTextField(10);
		button1.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		double num1 = Double.parseDouble(textField.getText());
		double num2 = Double.parseDouble(textField2.getText());
		double num3 = Double.parseDouble(textField3.getText());
		double num4 = Double.parseDouble(textField4.getText());
		int sum = (int) (num1+num2+num3+num4);
		
		JOptionPane.showMessageDialog(null, "The total of two numbers is " + sum);
		}
	});
		
		button2.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
				
		double num1 = Double.parseDouble(textField.getText());
		double num2 = Double.parseDouble(textField2.getText());
		double num3 = Double.parseDouble(textField3.getText());
		double num4 = Double.parseDouble(textField4.getText());
		int sum2 = (int) (num1-num2-num3-num4);
				
		JOptionPane.showMessageDialog(null, "The total of two numbers is " + sum2);
		}
	});
		
		button3.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
				
		double num1 = Double.parseDouble(textField.getText());
		double num2 = Double.parseDouble(textField2.getText());
		double num3 = Double.parseDouble(textField3.getText());
		double num4 = Double.parseDouble(textField4.getText());
		int sum3 = (int) (num1*num2*num3*num4);
				
		JOptionPane.showMessageDialog(null, "The total of two numbers is " + sum3);
		}
	});
		
		button4.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
				
		double num1 = Double.parseDouble(textField.getText());
		double num2 = Double.parseDouble(textField2.getText());
		double num3 = Double.parseDouble(textField3.getText());
		double num4 = Double.parseDouble(textField4.getText());
		int sum4 = (int) (num1/num2/num3/num4);
				
		JOptionPane.showMessageDialog(null, "The total of two numbers is " + sum4);
		}
	});

		panel.add(label);
		panel.add(textField);
		panel.add(textField2);
		panel.add(textField3);
		panel.add(textField4);
		panel.add(label2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		add(panel);
		setSize(750,275);
		setVisible(true);

		}

	public static void main(String[] args) {
		new Layout();

	}

}
