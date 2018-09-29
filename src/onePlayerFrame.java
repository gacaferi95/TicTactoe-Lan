import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class onePlayerFrame extends JFrame {

	private JPanel contentPane;
	
	
	//deklarimi
    static JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    JLabel rezultati,rezultati1;
    static int turn_count = 1;
    static boolean turn = true; // standds for O;
    String[] varguFIELLESTAR = {"1", "2", "3", "4", "5", "6", "7", "8", "9"}; //ky veq sa per fillim ma nuk perdoreet
    List<String> listaVargut_Gjeneralja = new ArrayList<String>();
    //variabel globale per numer teke cp per qift njeriu;
    static int lojtariRadha;
    public int fituesi=0;

    Compute objCompute;
    public static String _xORo;
    public static String _vlera2;

	/**
	 * Create the frame.
	 */
	public onePlayerFrame(int vlera) {
		setTitle("One Player");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		
		 
		
		btn1 = new JButton("");
		btn1.setFont(btn1.getFont().deriveFont(60f));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 button_click1(e);

                 if (listaVargut_Gjeneralja.isEmpty()) {

                 } else {
                  objCompute.oneMoveCompute(_xORo,_vlera2);
                 }
			}
		});
		contentPane.add(btn1);
		
		btn2 = new JButton("");
		btn2.setFont(btn2.getFont().deriveFont(60f));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 button_click1(e);

                 if (listaVargut_Gjeneralja.isEmpty()) {

                 } else {
                  objCompute.oneMoveCompute(_xORo,_vlera2);
                 }
			}
		});
		contentPane.add(btn2);
		
		btn3 = new JButton("");
		btn3.setFont(btn3.getFont().deriveFont(60f));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 button_click1(e);

                 if (listaVargut_Gjeneralja.isEmpty()) {

                 } else {
                  objCompute.oneMoveCompute(_xORo,_vlera2);
                 }
			}
		});
		contentPane.add(btn3);
		
		btn4 = new JButton("");
		btn4.setFont(btn4.getFont().deriveFont(60f));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 button_click1(e);

                 if (listaVargut_Gjeneralja.isEmpty()) {

                 } else {
                  objCompute.oneMoveCompute(_xORo,_vlera2);
                 }
			}
		});
		contentPane.add(btn4);
		
		btn5 = new JButton("");
		btn5.setFont(btn5.getFont().deriveFont(60f));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 button_click1(e);

                 if (listaVargut_Gjeneralja.isEmpty()) {

                 } else {
                  objCompute.oneMoveCompute(_xORo,_vlera2);
                 }
			}
		});
		contentPane.add(btn5);
		
		btn6 = new JButton("");
		btn6.setFont(btn6.getFont().deriveFont(60f));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 button_click1(e);

                 if (listaVargut_Gjeneralja.isEmpty()) {

                 } else {
                  objCompute.oneMoveCompute(_xORo,_vlera2);
                 }
			}
		});
		contentPane.add(btn6);
		
		btn7 = new JButton("");
		btn7.setFont(btn7.getFont().deriveFont(60f));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 button_click1(e);

                 if (listaVargut_Gjeneralja.isEmpty()) {

                 } else {
                  objCompute.oneMoveCompute(_xORo,_vlera2);
                 }
			}
		});
		contentPane.add(btn7);
		
		btn8 = new JButton("");
		btn8.setFont(btn8.getFont().deriveFont(60f));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 button_click1(e);

                 if (listaVargut_Gjeneralja.isEmpty()) {

                 } else {
                  objCompute.oneMoveCompute(_xORo,_vlera2);
                 }
			}
		});
		contentPane.add(btn8);
		
		btn9 = new JButton("");
		btn9.setFont(btn9.getFont().deriveFont(60f));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 button_click1(e);

                 if (listaVargut_Gjeneralja.isEmpty()) {

                 } else {
                  objCompute.oneMoveCompute(_xORo,_vlera2);
                 }
			}
		});
		
		
		contentPane.add(btn9);
		
		
		JButton[] buttonat={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9};
	     objCompute=new Compute(buttonat);
	     
	        lojtariRadha=vlera;
	        Collections.addAll(listaVargut_Gjeneralja, varguFIELLESTAR);


	        if(lojtariRadha==2)
	        {
	            setOX();
	            _xORo="O";
	            _vlera2="X";
	        }
	        else
	        {
	           _xORo="X";
	            _vlera2="O";
	        }
	        
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
            listaVargut_Gjeneralja.clear();
            if (turn == false) {
                //turni duhet te jeta false
                fituesi=1;
            } else if (turn == true) {
                fituesi=2;
            }
        } else if (turn_count > 9) {
            fituesi=3;
        }
        if(_thewinner==true || turn_count >9) {
            alert_dialog();
        }
    }
	
	
	public void button_click1(ActionEvent v) {
     
		JButton b=(JButton)v.getSource();
        if (turn == true) {
            b.setText("O");
            turn = false;
        } else {
            b.setText("X");
            turn = true;
        }
        b.setEnabled(false);

        //merre ID qe e ka, shtine ne switch case 1 9 remove from gjeneralja qat nr
        Fonia(v);
        turn_count++;
        check_for_winner();


    }
	
	
	 public void setOX() {

	        // me e kontrollu a u shtyp ky button.


	        Random r = new Random();
	        //me i fshi vlerat me buttonat e klikuar

	        String c1 = listaVargut_Gjeneralja.get(r.nextInt(listaVargut_Gjeneralja.size()));
	        listaVargut_Gjeneralja.remove(c1);

	        switch (c1) {
	            case "1":
	                if (turn == true) {
	                    btn1.setText("O");
	                    turn = false;
	                } else {
	                    btn1.setText("X");
	                    turn = true;
	                }
	                btn1.setEnabled(false);
	                turn_count++;
	                break;
	            case "2":
	                if (turn == true) {
	                    btn2.setText("O");
	                    turn = false;
	                } else {
	                    btn2.setText("X");
	                    turn = true;
	                }
	                btn2.setEnabled(false);
	                turn_count++;
	                break;
	            case "3":
	                if (turn == true) {
	                    btn3.setText("O");
	                    turn = false;
	                } else {
	                    btn3.setText("X");
	                    turn = true;
	                }
	                btn3.setEnabled(false);
	                turn_count++;
	                break;
	            case "4":
	                if (turn == true) {
	                    btn4.setText("O");
	                    turn = false;
	                } else {
	                    btn4.setText("X");
	                    turn = true;
	                }
	                btn4.setEnabled(false);
	                turn_count++;
	                break;
	            case "5":
	                if (turn == true) {
	                    btn5.setText("O");
	                    turn = false;
	                } else {
	                    btn5.setText("X");
	                    turn = true;
	                }
	                btn5.setEnabled(false);
	                turn_count++;
	                break;

	            case "6":
	                if (turn == true) {
	                    btn6.setText("O");
	                    turn = false;
	                } else {
	                    btn6.setText("X");
	                    turn = true;
	                }
	                btn6.setEnabled(false);
	                turn_count++;
	                break;

	            case "7":
	                if (turn == true) {
	                    btn7.setText("O");
	                    turn = false;
	                } else {
	                    btn7.setText("X");
	                    turn = true;
	                }
	                btn7.setEnabled(false);
	                turn_count++;
	                break;
	            case "8":
	                if (turn == true) {
	                    btn8.setText("O");
	                    turn = false;
	                } else {
	                    btn8.setText("X");
	                    turn = true;
	                }
	                btn8.setEnabled(false);
	                turn_count++;
	                break;
	            case "9":
	                if (turn == true) {
	                    btn9.setText("O");
	                    turn = false;
	                } else {
	                    btn9.setText("X");
	                    turn = true;
	                }
	                btn9.setEnabled(false);
	                turn_count++;
	                break;

	            default:

	                break;
	        }
	        //check_for_winner();
	    }
	 
	 
	 public void Fonia(ActionEvent v) {
		 String b=(String)v.getSource().toString();
	        switch (b) {
	            case "btn1":
	                listaVargut_Gjeneralja.remove("1");
	                break;
	            case "btn2":
	                listaVargut_Gjeneralja.remove("2");
	                break;
	            case "btn3":
	                listaVargut_Gjeneralja.remove("3");
	                break;
	            case "btn4":
	                listaVargut_Gjeneralja.remove("4");
	                break;
	            case "btn5":
	                listaVargut_Gjeneralja.remove("5");
	                break;
	            case "btn6":
	                listaVargut_Gjeneralja.remove("6");
	                break;
	            case "btn7":
	                listaVargut_Gjeneralja.remove("7");
	                break;
	            case "btn8":
	                listaVargut_Gjeneralja.remove("8");
	                break;
	            case "btn9":
	                listaVargut_Gjeneralja.remove("9");
	                break;
	            default:

	                break;
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
                  Collections.addAll(listaVargut_Gjeneralja, varguFIELLESTAR);
                  turn=true;
                  turn_count=1;
                  fituesi=0;
                  if(lojtariRadha==2)
                  {
                      lojtariRadha=1;
                      _xORo="X";
                      _vlera2="O";
                  }
                  else
                  {
                      lojtariRadha=2;
                      _xORo="O";
                      _vlera2="X";
                      setOX();

                  }
              } else if (value == JOptionPane.NO_OPTION) {
           	   enable_button();
           	   enable_button();
           	   turn=true;
           	   turn_count=1;
           	   fituesi=0;
                  
                 // twoPlayerFrame obj_twoplayer=new twoPlayerFrame();
              }
	 }
	 
	 
	 
	 
	 class Compute
	    {
	        String mbajtesi;
	        boolean uGjeneura=false;
	        JButton[] buttonat;
	        public Compute(JButton[] _buttonat)
	        {
	            buttonat=_buttonat;
	        }

	        public void oneMoveCompute(String xORo,String vlera2) {
	            for(int i=0;i<=1;i++) {
	                if ((buttonat[0].getText().equals(xORo)) && (buttonat[1].getText().equals(xORo)) && (buttonat[2].getText().equals(""))) {
	                   if(i!=1) {
	                       buttonat[2].setText(xORo);
	                   }
	                    else
	                   {
	                       buttonat[2].setText(vlera2);
	                   }
	                    buttonat[2].setEnabled(false);
	                    uGjeneura=true;
	                    listaVargut_Gjeneralja.remove("3");
	                } else if ((buttonat[3].getText().equals(xORo)) && (buttonat[4].getText().equals(xORo)) && (buttonat[5].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[5].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[5].setText(vlera2);
	                    }
	                    buttonat[5].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("6");
	                    uGjeneura=true;
	                } else if ((buttonat[6].getText().equals(xORo)) && (buttonat[7].getText().equals(xORo)) && (buttonat[8].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[8].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[8].setText(vlera2);
	                    }
	                    buttonat[8].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("9");
	                    uGjeneura=true;
	                } else if ((buttonat[1].getText().equals(xORo)) && (buttonat[2].getText().equals(xORo)) && (buttonat[0].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[0].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[0].setText(vlera2);
	                    }
	                    buttonat[0].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("1");
	                    uGjeneura=true;
	                } else if ((buttonat[4].getText().equals(xORo)) && (buttonat[5].getText().equals(xORo)) && (buttonat[3].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[3].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[3].setText(vlera2);
	                    }
	                    buttonat[3].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("4");
	                    uGjeneura=true;
	                } else if ((buttonat[7].getText().equals(xORo)) && (buttonat[8].getText().equals(xORo)) && (buttonat[6].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[6].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[6].setText(vlera2);
	                    }
	                    buttonat[6].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("7");
	                    uGjeneura=true;
	                } else if ((buttonat[0].getText().equals(xORo)) && (buttonat[2].getText().equals(xORo)) && (buttonat[1].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[1].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[1].setText(vlera2);
	                    }
	                    buttonat[1].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("2");
	                    uGjeneura=true;
	                } else if ((buttonat[3].getText().equals(xORo)) && (buttonat[5].getText().equals(xORo)) && (buttonat[4].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[4].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[4].setText(vlera2);
	                    }
	                    buttonat[4].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("5");
	                    uGjeneura=true;
	                } else if ((buttonat[6].getText().equals(xORo)) && (buttonat[8].getText().equals(xORo)) && (buttonat[7].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[7].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[7].setText(vlera2);
	                    }
	                    buttonat[7].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("8");
	                    uGjeneura=true;
	                } else if ((buttonat[0].getText().equals(xORo)) && (buttonat[3].getText().equals(xORo)) && (buttonat[6].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[6].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[6].setText(vlera2);
	                    }
	                    buttonat[6].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("7");
	                    uGjeneura=true;
	                } else if ((buttonat[1].getText().equals(xORo)) && (buttonat[4].getText().equals(xORo)) && (buttonat[7].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[7].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[7].setText(vlera2);
	                    }
	                    buttonat[7].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("8");
	                    uGjeneura=true;
	                } else if ((buttonat[2].getText().equals(xORo)) && (buttonat[5].getText().equals(xORo)) && (buttonat[8].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[8].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[8].setText(vlera2);
	                    }
	                    buttonat[8].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("9");
	                    uGjeneura=true;
	                } else if ((buttonat[3].getText().equals(xORo)) && (buttonat[6].getText().equals(xORo)) && (buttonat[0].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[0].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[0].setText(vlera2);
	                    }
	                    buttonat[0].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("1");
	                    uGjeneura=true;
	                } else if ((buttonat[4].getText().equals(xORo)) && (buttonat[7].getText().equals(xORo)) && (buttonat[1].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[1].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[1].setText(vlera2);
	                    }
	                    buttonat[1].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("2");
	                    uGjeneura=true;
	                } else if ((buttonat[5].getText().equals(xORo)) && (buttonat[8].getText().equals(xORo)) && (buttonat[2].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[2].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[2].setText(vlera2);
	                    }
	                    buttonat[2].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("3");
	                    uGjeneura=true;
	                } else if ((buttonat[0].getText().equals(xORo)) && (buttonat[6].getText().equals(xORo)) && (buttonat[3].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[3].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[3].setText(vlera2);
	                    }
	                    buttonat[3].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("4");
	                    uGjeneura=true;
	                } else if ((buttonat[1].getText().equals(xORo)) && (buttonat[7].getText().equals(xORo)) && (buttonat[4].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[4].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[4].setText(vlera2);
	                    }
	                    buttonat[4].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("5");
	                    uGjeneura=true;
	                } else if ((buttonat[2].getText().equals(xORo)) && (buttonat[8].getText().equals(xORo)) && (buttonat[5].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[5].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[5].setText(vlera2);
	                    }
	                    buttonat[5].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("6");
	                    uGjeneura=true;
	                } else if ((buttonat[0].getText().equals(xORo)) && (buttonat[4].getText().equals(xORo)) && (buttonat[8].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[8].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[8].setText(vlera2);
	                    }
	                    buttonat[8].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("9");
	                    uGjeneura=true;
	                } else if ((buttonat[4].getText().equals(xORo)) && (buttonat[8].getText().equals(xORo)) && (buttonat[0].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[0].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[0].setText(vlera2);
	                    }
	                    buttonat[0].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("1");
	                    uGjeneura=true;
	                } else if ((buttonat[0].getText().equals(xORo)) && (buttonat[8].getText().equals(xORo)) && (buttonat[4].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[4].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[4].setText(vlera2);
	                    }
	                    buttonat[4].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("5");
	                    uGjeneura=true;
	                } else if ((buttonat[2].getText().equals(xORo)) && (buttonat[4].getText().equals(xORo)) && (buttonat[6].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[6].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[6].setText(vlera2);
	                    }
	                    buttonat[6].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("7");
	                    uGjeneura=true;
	                } else if ((buttonat[6].getText().equals(xORo)) && (buttonat[4].getText().equals(xORo)) && (buttonat[2].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[2].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[2].setText(vlera2);
	                    }
	                    buttonat[2].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("3");
	                    uGjeneura=true;
	                } else if ((buttonat[6].getText().equals(xORo)) && (buttonat[2].getText().equals(xORo)) && (buttonat[4].getText().equals(""))) {
	                    if(i!=1) {
	                        buttonat[4].setText(xORo);
	                    }
	                    else
	                    {
	                        buttonat[4].setText(vlera2);
	                    }
	                    buttonat[4].setEnabled(false);
	                    listaVargut_Gjeneralja.remove("5");
	                    uGjeneura=true;
	                }


	                if(uGjeneura==true)
	                {
	                    if (turn == true) {
	                        turn = false;
	                    } else {
	                        turn = true;
	                    }

	                    break;
	                }
	                else {
	                    mbajtesi = xORo;
	                    xORo = vlera2;
	                    vlera2 = mbajtesi;
	                }

	            }
	            if(uGjeneura==false) {
	                setOX();
	            }
	            else {
	                uGjeneura=false;
	                turn_count++;
	            }


	            check_for_winner();

	        }
	    }

}
