import java.awt.event.*;
import javax.swing.*;
import java.awt.*; //needed for pane
public class Converter extends JFrame implements ActionListener{
    private Container pane;
    private JButton CtoF, FtoC;
    private JLabel degrees;
    private JTextField text;
    private Container c;

    public Converter() {
	this.setTitle("Temperature Converter");
	this.setSize(600,100);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
	pane = this.getContentPane();
	pane.setLayout(new GridLayout(2,1));
	
	degrees = new JLabel("Degrees:",null,JLabel.CENTER);
	text = new JTextField(4);
	CtoF = new JButton("Celsius to Ferenheit");
	CtoF.setActionCommand("Celcius to Ferenheit");
	CtoF.setSelected(true);

	JButton FtoC = new JButton("Ferenheit to Celcius");
	FtoC.setMnemonic(KeyEvent.VK_B);
	FtoC.setActionCommand("Ferenheit to Celcius");

	ButtonGroup group = new ButtonGroup();
	group.add(CtoF);
	group.add(FtoC);
	CtoF.addActionListener(this);
	FtoC.addActionListener(this);
	
	// make the buttons call the actionListener
	//convert.setActionCommand("addPeriod");
	//convert.addActionListener(this);
	//clear.setActionCommand("delete");
	//clear.addActionListener(this);
	
	c = new Container();
	c.setLayout(new FlowLayout());
	//buttons.add(clear);
	c.add(degrees);
	c.add(text);
	c.add(CtoF);
	c.add(FtoC);
 	


	//add the 2 containers
	pane.add(c);
	
    }
    //look at which command is being executed, and choose an action
    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	//System.out.println(action);
	if(action.equals("Celcius to Ferenheit")){
	    String s = text.getText();
	    double c = Double.parseDouble(s);
	    double f = c * 9.0 / 5.0 + 32.0;
	    text.setText(Double.toString(f));
	}
	if(action.equals("Ferenheit to Celcius")){
	    String s = text.getText();
	    double f = Double.parseDouble(s);
	    double c =(f - 32.0) / 5.0 * 9.0;
	    text.setText(Double.toString(c));
	}
    }
    
    
    public static void main(String[] args) {
	Converter g = new Converter();
	g.setVisible(true);
    }
    
}

