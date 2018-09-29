import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.SwingConstants;
import java.awt.Font;

public class twoPlayerFrame extends JFrame implements ActionListener {
	
	
	private JPanel contentPane;
	 //varibala qe percjllet fituesiin
    public int fituesi=0;


    //deklarimi
    static JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    

    int turn_count=0;
    boolean turn = true; // standds for O;
    
    JLabel rezultati;

	/**
	 * Create the frame.
	 */
	public twoPlayerFrame() {
		setTitle("Two Player");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		
		
		btn1 = new JButton("");
		btn1.setFont(btn1.getFont().deriveFont(60f));
		btn1.addActionListener(this);
		getContentPane().add(btn1);
		
		btn2 = new JButton("");
		btn2.setFont(btn2.getFont().deriveFont(60f));
		btn2.addActionListener(this);
		getContentPane().add(btn2);
		
		btn3 = new JButton("");
		btn3.setFont(btn3.getFont().deriveFont(60f));
		btn3.addActionListener(this);
		getContentPane().add(btn3);
		
		btn4 = new JButton("");
		btn4.setFont(btn4.getFont().deriveFont(60f));
		btn4.addActionListener(this);
		getContentPane().add(btn4);
		
		btn5 = new JButton("");
		btn5.setFont(btn5.getFont().deriveFont(60f));
		btn5.addActionListener(this);
		getContentPane().add(btn5);
		
		btn6 = new JButton("");
		btn6.setFont(btn6.getFont().deriveFont(60f));
		btn6.addActionListener(this);
		getContentPane().add(btn6);
		
		btn7 = new JButton("");
		btn7.setFont(btn7.getFont().deriveFont(60f));
		btn7.addActionListener(this);
		getContentPane().add(btn7);
		
		btn8 = new JButton("");
		btn8.setFont(btn8.getFont().deriveFont(60f));
		btn8.addActionListener(this);
		getContentPane().add(btn8);
		
		btn9 = new JButton("");
		btn9.setFont(btn9.getFont().deriveFont(60f));
		btn9.addActionListener(this);
		getContentPane().add(btn9);
		
	
	}

	
	
    public void check_for_winner() {
        boolean _thewinner = false;

        //kontrollimi horizontal
        if (btn1.getText() == btn2.getText() && btn2.getText() == btn3.getText() && !btn1.isEnabled()) {
            _thewinner = true;
        } else if (btn4.getText() == btn5.getText() && btn5.getText() == btn6.getText() && !btn4.isEnabled()) {
            _thewinner = true;
        } else if (btn7.getText() == btn8.getText() && btn8.getText() == btn9.getText() && !btn7.isEnabled()) {
            _thewinner = true;
        }
        //kontrollimi vertikal

        else if (btn1.getText() == btn4.getText() && btn4.getText() == btn7.getText() && !btn1.isEnabled()) {
            _thewinner = true;
        } else if (btn2.getText() == btn5.getText() && btn5.getText() == btn8.getText() && !btn2.isEnabled()) {
            _thewinner = true;
        } else if (btn3.getText() == btn6.getText() && btn6.getText() == btn9.getText() && !btn3.isEnabled()) {
            _thewinner = true;
        }


        //kontrollimi diagonal

        else if (btn1.getText() == btn5.getText() && btn5.getText() == btn9.getText() && !btn1.isEnabled()) {
            _thewinner = true;
        } else if (btn3.getText() == btn5.getText() && btn5.getText() == btn7.getText() && !btn3.isEnabled()) {
            _thewinner = true;
        }

        if (_thewinner == true)
        {
           // display_button();
            if (turn == false) {
                fituesi=1;// per O

            } else if (turn == true) {
                fituesi=2;
            }



        } else if (turn_count == 9) {

            fituesi=3;
        }
        if(_thewinner==true || turn_count==9)
        {
         disable_button();
         alert_dialog();
        }

    }

    public void enable_button() {
       
    	JButton v1[]={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9};
        for (int i = 0; i < v1.length; i++) {
            {
                v1[i].setEnabled(true);
                v1[i].setText("");
            }
        }
    }
    
    public void disable_button() {
        
    	JButton v1[]={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9};
        for (int i = 0; i < v1.length; i++) {
            {
                v1[i].setEnabled(false);
            }
        }
    }
    
    
    public void alert_dialog()
    {
    	String mesazhi="";
          if(fituesi==1) {
        	 mesazhi="Player with O win do you want to play again!";
          }
          else if(fituesi==2)
          {
        	  mesazhi="Player with X win do you want to play again!";

          }
          else if(fituesi==3)
          {
        	  mesazhi="It's a draw to you want to play again";
          }
    	
          final JOptionPane optionPane = new JOptionPane(
                 mesazhi,
                  JOptionPane.QUESTION_MESSAGE,
                  JOptionPane.YES_NO_OPTION);

          final JDialog dialog = new JDialog(this, 
                               "Game Over",
                               true);
               dialog.setContentPane(optionPane);
               dialog.setLocationRelativeTo(this);
              
               optionPane.addPropertyChangeListener(
            		    new PropertyChangeListener() {
            		        public void propertyChange(PropertyChangeEvent e) {
            		            String prop = e.getPropertyName();

            		            if (dialog.isVisible() 
            		             && (e.getSource() == optionPane)
            		             && (prop.equals(JOptionPane.VALUE_PROPERTY))) {
            		                //If you were going to check something
            		                //before closing the window, you'd do
            		                //it here.
            		                dialog.setVisible(false);
            		            }
            		        }
            		    });
               
               dialog.pack();
               dialog.setVisible(true);
               
               //quesiton if yes or no
               int value = ((Integer)optionPane.getValue()).intValue();
               if (value == JOptionPane.YES_OPTION) {
            	   enable_button();
                   turn=true;
                   turn_count=0;
                   fituesi=0;
               } else if (value == JOptionPane.NO_OPTION) {
            	   enable_button();
                   turn=true;
                   turn_count=0;
                   fituesi=0;
                   
                  // twoPlayerFrame obj_twoplayer=new twoPlayerFrame();
                   
       
               }
    }
	 
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton)e.getSource();

        if (turn == true) {
            b.setText("O");
            turn = false;
        } else {
            b.setText("X");
            turn = true;
        }
        b.setEnabled(false);


         turn_count++;

        check_for_winner();
		
	}
	
	
}
