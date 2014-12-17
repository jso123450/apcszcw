import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui2 extends JFrame implements ActionListener {

    /*----------------------------- Instance -----------------------------*/

    private JButton b1,b2,labeler;
    private Container pane;
    private JLabel label;
    private JTextArea text;
    private JPanel canvas;

    private class Key implements KeyListener {
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
    }

    /*----------------------------- Action -----------------------------*/
    public void actionPerformed(ActionEvent e){
	if (e.getSource() == b1){
	    System.out.println("You clicked Click me");
	    System.out.println("And the textarea has: " + text.getText());
	}
	else if (e.getSource() == b2){
	    System.out.println("Shutting down");
	    System.exit(0);
	}
	else if (e.getSource() == labeler){
	    label.setText(text.getText());
	    text.setText("");
	}
    }

    /*----------------------------- Constructors -----------------------------*/

    public Gui2(){
	setTitle("My First Gui");
	setSize(600,600);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = getContentPane();
	pane.setLayout(new FlowLayout());

	b1 = new JButton("Click me");
	b1.addActionListener(this);
	pane.add(b1);

	//b2 = new JButton("Exit");
	//b2.addActionListener(this);
	//pane.add(b2);
	
	labeler = new JButton("Labeler");
	labeler.addActionListener(this);
	pane.add(labeler);

	label = new JLabel("The Label");
	pane.add(label);
	text = new JTextArea();
	text.setColumns(40);
	text.setRows(5);
	text.setBorder(BorderFactory.createLineBorder(Color.red,2));
	text.addKeyListener(new Key());
	pane.add(text);

	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(300,300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	pane.add(canvas);
    }


    /*----------------------------- Main -----------------------------*/

    public static void main(String[] args) {
	Gui1 f = new Gui1();
	f.setVisible(true);
    }
}
