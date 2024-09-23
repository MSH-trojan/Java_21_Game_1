package game_1;





import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class Game_1 extends JFrame implements ActionListener  {
      private JPanel centre, bottom;
      private JButton alphaButtons[];
      private JButton ok, clear;
      private JTextField text;
      public final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

      public static void main( String args[] )  {         
    	  Game_1 app = new Game_1();  
          app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );  
        }
      public Game_1() {
            Container content = getContentPane();
            content.setLayout(new BorderLayout()); 
            text = new JTextField();
            content.add(text, BorderLayout.NORTH);
            centre = new JPanel(new GridLayout(6,5)); 
            alphaButtons = new JButton[ALPHABET.length()]; 
            for (int i = 0; i < ALPHABET.length(); i++ ){
	alphaButtons[i] = new JButton(ALPHABET.charAt(i) + ""); 
	alphaButtons[i].addActionListener(this);
                        centre.add(alphaButtons[i]);
            }

            content.add(centre, BorderLayout.CENTER);
            ok = new JButton("OK");
            clear = new JButton("CLEAR");
            ok.addActionListener(this);
            clear.addActionListener(this);
            bottom = new JPanel(new GridLayout(1,2));
            bottom.add(ok);
            bottom.add(clear);
            content.add(bottom, BorderLayout.SOUTH); 
            setSize(500,400);
            setVisible(true);
      } 

public void actionPerformed(ActionEvent e) {
            if (e.getSource() == clear)
                  text.setText(""); 
            else if (e.getSource() == ok){
                  if (text.getText().equals("OOP")){
                        text.setText("You Got It!");
                  }else{
                        text.setText("Try Again");    
                  }
            }
            else { 
             for (int i = 0; i < ALPHABET.length() ; i++ ){
               if (e.getSource() == alphaButtons[i]) {
                  text.setText(text.getText() + e.getActionCommand());
               }  // end if
             } // end for
            } // end else
      } // end actionPerformed()

}  // end class Game


      


      

