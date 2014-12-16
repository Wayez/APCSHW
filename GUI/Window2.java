import javax.swing.*;
import java.awt.*;
public class Window2 extends JFrame {
    private Container pane;

    private JButton b;
    private JLabel l;
    private JTextField t;
    private JCheckBox c;
    public Window2() {
	this.setTitle("Celsius to Ferenheit Converter");
	this.setSize(300,200);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());
	
	b = new JButton("Convert",null,JButton.CENTER);
	l = new JLabel("Celcius",null,JLabel.CENTER);
	t = new JTextField(12);
	c = new JCheckBox("Overclock!!!");
	pane.add(l+"\n");
	pane.add(b);
	pane.add(t);
	pane.add(c);
    }
    
    public static void main(String[] args) {
        Window2 g = new Window2();
        g.setVisible(true);
    }
}

