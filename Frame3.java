
import java.awt.*; 
import java.io.*; 
import java.util.*; 
import java.awt.event.*;
import javax.swing.*;
public class Frame3 extends JFrame implements ActionListener
{
  JLabel answer = new JLabel("");
  JPanel pane = new JPanel(); // create pane object
  JButton quitButton = new JButton("Quit");
  JButton startButton = new JButton("Start");
  Frame3()   // the constructor
  {
    super("Event Handler Demo"); setBounds(100,100,300,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container con = this.getContentPane(); // inherit main frame
    con.add(pane); quitButton.setMnemonic('Q'); // associate hotkey
    quitButton.addActionListener(this);   // register button listener
    startButton.addActionListener(this);   // register button listener
    pane.add(answer); pane.add(quitButton); quitButton.requestFocus();
    pane.add(startButton); startButton.requestFocus();
    setVisible(true); // make frame visible
  }

  private String getInitial(String fullName)
  {
       StringBuilder res = new StringBuilder();
       StringTokenizer st = new StringTokenizer(fullName);

       while(st.hasMoreTokens())
       {
	   String s = st.nextToken(" ");
	  res.append( s.charAt(0) );
       }
       return res.toString();

  }

  // here is the basic event handler
  public void actionPerformed(ActionEvent event)
  {
    Object source = event.getSource();
    if (source == quitButton)
    {
      answer.setText("Quit pressed!");
      JOptionPane.showMessageDialog(null,"Bye...","Message Dialog",
      JOptionPane.PLAIN_MESSAGE); setVisible(true);  // show something
      
      System.exit(0);
    }

    if (source == startButton)
    {
	 answer.setText("Start reading fullNames file");
	 BufferedReader br;

	 BufferedWriter bufferedWriter = null;
         try {
            File outputFile = new File("initials");
            // check if file exist, otherwise create the file before writing
            if (!outputFile.exists()) {
                outputFile.createNewFile();
            }
            Writer writer = new FileWriter(outputFile);
            bufferedWriter = new BufferedWriter(writer);
	 }
	 catch (Exception e){
	    JOptionPane.showMessageDialog(null,"Error creating output initials file","Message Dialog",
            JOptionPane.PLAIN_MESSAGE); setVisible(true);  // show something
            System.exit(0);
	 }

         try {
            br = new BufferedReader(new FileReader("fullNames"));
            String line = br.readLine();

            while (line != null) {
               String initial = getInitial(line);
	       System.out.println("line = " + line + " initial = " + initial);
	       
	       bufferedWriter.write(initial);
	       bufferedWriter.write(" \n");
               line = br.readLine();
	       Thread.sleep(500);
            }
	    br.close();
         } 
	 catch (Exception e){
              answer.setText("Cannot read fullNames file!!!");
	      JOptionPane.showMessageDialog(null,"Bye...","Message Dialog",
              JOptionPane.PLAIN_MESSAGE); setVisible(true);  // show something
              System.exit(0);
	 }

	 try{
              if(bufferedWriter != null) bufferedWriter.close();
         } catch(Exception ex){               
	      JOptionPane.showMessageDialog(null,"Cannot close output file initials!","Message Dialog",
              JOptionPane.PLAIN_MESSAGE); setVisible(true);  // show something
              System.exit(0);
         }
	     
    }
  }
  public static void main(String args[]) {new Frame3();}
}
