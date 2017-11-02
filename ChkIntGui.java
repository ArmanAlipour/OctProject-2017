
import java.awt.*; 
import java.io.*; 
import java.util.*; 
import java.awt.event.*;
import javax.swing.*;
public class ChkIntGui extends JFrame implements ActionListener
{
  JLabel reqLabel = new JLabel("Enter an Integer:");
  JLabel answerLabel = new JLabel("");
  JTextField field = new JTextField(8);

  JPanel pane = new JPanel(); // create pane object
  JButton quitButton = new JButton("Quit");
  JButton checkButton = new JButton("Check");
  ChkIntGui()   // the constructor
  {
    super("Event Handler Demo"); setBounds(100,100,300,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container con = this.getContentPane(); // inherit main frame
    con.add(pane); quitButton.setMnemonic('Q'); // associate hotkey
    quitButton.addActionListener(this);   // register button listener
    checkButton.addActionListener(this);   // register button listener
    
    reqLabel.setLocation(0, 0);
    reqLabel.setSize(100, 30);
    reqLabel.setHorizontalAlignment(0);
    answerLabel.setLocation(0, 10);
    answerLabel.setSize(100, 30);
    answerLabel.setHorizontalAlignment(0);

    pane.add(reqLabel);
    pane.add(field);
    pane.add(quitButton); quitButton.requestFocus();
    pane.add(checkButton); checkButton.requestFocus();
    pane.add(answerLabel);
    setVisible(true); // make frame visible
  }

  // here is the basic event handler
  public void actionPerformed(ActionEvent event)
  {
    Object source = event.getSource();
    if (source == quitButton)
    {
      answerLabel.setText("Quit pressed!");
      JOptionPane.showMessageDialog(null,"Bye...","Message Dialog",
      JOptionPane.PLAIN_MESSAGE); setVisible(true);  // show something
      
      System.exit(0);
    }

    if (source == checkButton)
    {
	 String text = field.getText();
	 answerLabel.setText(text);

         try {
            Integer.parseInt(text);
            answerLabel.setText("Right Integer format: " + text);
	 }
	 catch (Exception e){
            answerLabel.setText("Wrong Integer! " + text);
	 }

	     
    }
  }
  public static void main(String args[]) {new ChkIntGui();}
}
