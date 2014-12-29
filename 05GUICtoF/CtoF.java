import java.awt.event.*;
import javax.swing.*;
import java.awt.*; //needed for pane
public class CtoF extends JFrame implements ActionListener{
    private Container pane;
    private JButton convert;
    private JLabel degrees;
    private JTextField text;
    private Container c;
    private JRadioButton box, box2;

    public CtoF() {
	this.setTitle("Celcius to Ferenheit");
	this.setSize(600,100);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
	pane = this.getContentPane();
	pane.setLayout(new GridLayout(2,1));
	
	degrees = new JLabel("Degrees:",null,JLabel.CENTER);
	convert = new JButton("Convert");
	text = new JTextField(4);
	box = new JRadioButton("Celcius to Ferenheit");
	box2 = new JRadioButton("Ferenheit to Celcius"); 
	JRadioButton CtoF = new JRadioButton("Celcius to Ferenheit");
	CtoF.setMnemonic(KeyEvent.VK_A);
	CtoF.setActionCommand("Celcius to Ferenheit");
	CtoF.setSelected(true);

	JRadioButton FtoC = new JRadioButton("Ferenheit to Celcius");
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
	c.add(convert);
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
	    int c = Integer.parseInt(s);
	    int f = c * 5 / 9 + 32;
	    text.setText(String.valueOf(f));
	}
	if(action.equals("Ferenheit to Celcius")){
	    String s = text.getText();
	    int f = Integer.parseInt(s);
	    int c =(f - 32) / 9 * 5;
	    text.setText(String.valueOf(c));
	}
    }
    
    
    public static void main(String[] args) {
	CtoF g = new CtoF();
	g.setVisible(true);
    }
    
}

