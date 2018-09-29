import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class LANFrame extends JFrame {
	
	JFrame dritarja;

	private JPanel contentPane;
	private JPanel paneli1;
	
	//variblatt per lojee
    static JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    static int turn_count = 1;
    static boolean turn = true; // standds for O;
    //radha me kliku ...
    static boolean radha_me_kliku=true;

    public int fituesi=0;
    
    
    
 
    
    //I will ask if server is created than for sending and recievin message are used serverklient, if its client are used others variblas
    //initialize is depend whether is a server or client
    //ServerKlienti variables
    Socket soketiServeri=null;
	DataInputStream Serverreader;
	DataOutputStream Serverwriter;
	
    
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public void go() {
		
		dritarja=new JFrame("LAN game");
		dritarja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dritarja.setBounds(100, 100, 445, 399);
		
		//paneli contentPane
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		
		
		//paneli paneli1
		
		paneli1=new JPanel();
		paneli1.setLayout(new FlowLayout());
		
		JButton btnCreateServer=new JButton("Create Server");
		btnCreateServer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread()
				{
					public void run()
					{
						try
						{
							ServerSocket serverSock= new ServerSocket(9900);
							btnCreateServer.setText("Sever is on");
							while(true)
							{
								soketiServeri=serverSock.accept();
								Serverreader=new DataInputStream(soketiServeri.getInputStream());
								Serverwriter=new DataOutputStream(soketiServeri.getOutputStream());
							}
						}
						catch(Exception ex)
						{
							ex.printStackTrace();
						}
					}
					
				}.start();
				
			}
			
		});		
		paneli1.add(btnCreateServer);
		
		
		JButton btnConnect=new JButton("Connect");
		btnConnect.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						try
						{
						soketiServeri= new Socket("localhost",9900);
						Serverreader= new DataInputStream(soketiServeri.getInputStream());
						Serverwriter=new DataOutputStream(soketiServeri.getOutputStream());	
						btnConnect.setText("Connected");
						}
						catch(Exception ex)
						{
							btnConnect.setText("Can't connect");
							ex.printStackTrace();
						}	
					
						//Thread t=new Thread(new IncomingReader());
						//t.start();
				}
			});
		paneli1.add(btnConnect);
		
		btn1 = new JButton("");
		btn1.setFont(btn1.getFont().deriveFont(60f));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 if (radha_me_kliku == true) {
                     JButton b = (JButton)e.getSource();
                     button_click1(e);
                     String vlera = "null";
                     if (turn == true) {
                         vlera = "1,o"; 
                     } else if (turn == false) {
                         vlera = "1,x";
                     }
                     try {
                    	 Serverwriter.writeUTF(vlera);
					} catch (IOException e1) {
						e1.printStackTrace();
					}    
                     radha_me_kliku=false;
                  
                 }
                 else{
                 }
			}
		});
		contentPane.add(btn1);
		
		btn2 = new JButton("");
		btn2.setFont(btn2.getFont().deriveFont(60f));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 if (radha_me_kliku == true) {
                     JButton b = (JButton)e.getSource();
                     button_click1(e);
                     String vlera = "null";
                     if (turn == true) {
                         vlera = "2,o"; 
                     } else if (turn == false) {
                         vlera = "2,x";
                     }
                     try {
                    	 Serverwriter.writeUTF(vlera);
					} catch (IOException e1) {
						e1.printStackTrace();
					}    
                     radha_me_kliku=false;
                   
                 }
                 else{
                 }
			}
		});
		contentPane.add(btn2);
		
		btn3 = new JButton("");
		btn3.setFont(btn3.getFont().deriveFont(60f));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 if (radha_me_kliku == true) {
                     JButton b = (JButton)e.getSource();
                     button_click1(e);
                     String vlera = "null";
                     if (turn == true) {
                         vlera = "3,o"; 
                     } else if (turn == false) {
                         vlera = "3,x";
                     }
                     try {
                    	 Serverwriter.writeUTF(vlera);
					} catch (IOException e1) {
						e1.printStackTrace();
					}    
                     radha_me_kliku=false;
                  
                 }
                 else{
                 }
			}
		});
		contentPane.add(btn3);
		
		btn4 = new JButton("");
		btn4.setFont(btn4.getFont().deriveFont(60f));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (radha_me_kliku == true) {
                     JButton b = (JButton)e.getSource();
                     button_click1(e);
                     String vlera = "null";
                     if (turn == true) {
                         vlera = "4,o"; 
                     } else if (turn == false) {
                         vlera = "4,x";
                     }
                     try {
                    	 Serverwriter.writeUTF(vlera);
					} catch (IOException e1) {
						e1.printStackTrace();
					}    
                     radha_me_kliku=false;
                     
                  
                 }
                 else{
                 }
			}
		});
		contentPane.add(btn4);
		
		btn5 = new JButton("");
		btn5.setFont(btn5.getFont().deriveFont(60f));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (radha_me_kliku == true) {
                     JButton b = (JButton)e.getSource();
                     button_click1(e);
                     String vlera = "null";
                     if (turn == true) {
                         vlera = "5,o"; 
                     } else if (turn == false) {
                         vlera = "5,x";
                     }
                     try {
                    	 Serverwriter.writeUTF(vlera);
					} catch (IOException e1) {
						e1.printStackTrace();
					}    
                     radha_me_kliku=false;
                    
                 }
                 else{
                 }
			}
		});
		contentPane.add(btn5);
		
		btn6 = new JButton("");
		btn6.setFont(btn6.getFont().deriveFont(60f));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (radha_me_kliku == true) {
                     JButton b = (JButton)e.getSource();
                     button_click1(e);
                     String vlera = "null";
                     if (turn == true) {
                         vlera = "6,o"; 
                     } else if (turn == false) {
                         vlera = "6,x";
                     }
                     try {
                    	 Serverwriter.writeUTF(vlera);
					} catch (IOException e1) {
						e1.printStackTrace();
					}    
                     radha_me_kliku=false;
                   
                 }
                 else{
                 }
				
			}
		});
		contentPane.add(btn6);
		
		btn7 = new JButton("");
		btn7.setFont(btn7.getFont().deriveFont(60f));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 if (radha_me_kliku == true) {
                     JButton b = (JButton)e.getSource();
                     button_click1(e);
                     String vlera = "null";
                     if (turn == true) {
                         vlera = "7,o"; 
                     } else if (turn == false) {
                         vlera = "7,x";
                     }
                     try {
                    	 Serverwriter.writeUTF(vlera);
					} catch (IOException e1) {
						e1.printStackTrace();
					}    
                     radha_me_kliku=false;
               
                 }
                 else{
                 }
			}
			
		});
		contentPane.add(btn7);
		
		btn8 = new JButton("");
		btn8.setFont(btn8.getFont().deriveFont(60f));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 if (radha_me_kliku == true) {
                     JButton b = (JButton)e.getSource();
                     button_click1(e);
                     String vlera = "null";
                     if (turn == true) {
                         vlera = "8,o"; 
                     } else if (turn == false) {
                         vlera = "8,x";
                     }
                     try {
                    	 Serverwriter.writeUTF(vlera);
					} catch (IOException e1) {
						e1.printStackTrace();
					}    
                     radha_me_kliku=false;
                 }
                 else{
                 }
			}
			
		});
		contentPane.add(btn8);
		
		btn9 = new JButton("");
		btn9.setFont(btn9.getFont().deriveFont(60f));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {					
				 if (radha_me_kliku == true) {
                     JButton b = (JButton)e.getSource();
                     button_click1(e);
                     String vlera = "null";
                     if (turn == true) {
                         vlera = "9,o"; 
                     } else if (turn == false) {
                         vlera = "9,x";
                     }
                     try {
                    	 Serverwriter.writeUTF(vlera);
					} catch (IOException e1) {
						e1.printStackTrace();
					}    
                     radha_me_kliku=false;
                     
                     //Thread t=new Thread(new IncomingReader());
						//t.start();
                 }
                 else{
                 }
			}
		});
		contentPane.add(btn9);
		
		Thread threadReader=new Thread(new IncomingReader());
		threadReader.start();
		
		dritarja.getContentPane().add(contentPane,BorderLayout.CENTER);
		dritarja.getContentPane().add(paneli1,BorderLayout.NORTH);
		dritarja.setVisible(true);
	}
	
	
	
	 public void button_click1(ActionEvent v) {
		  JButton b = (JButton)v.getSource();
	        if (turn == true) {
	            b.setText("O");
	        } else {
	            b.setText("X");
	        }
	        b.setEnabled(false);

	        turn_count++;
	        check_for_winner();	 
	        
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
	            if (turn == true) {
	                fituesi=1;// per O

	            } else if (turn == false) {
	                fituesi=2;
	            }

	        } else if (turn_count > 9) {

	            fituesi=3;
	        }
	        if(_thewinner==true || turn_count >9) {
	           alert_dialog();

	        }
	 }
	        
	 public void alert_dialog() {
		 
		 String mesazhi="";
         if(fituesi==1) {
       	 mesazhi="You won, do you want to play again";
         }
         else if(fituesi==2)
         {
       	  mesazhi="You lose,do you want to play again";

         }
         else if(fituesi==3)
         {
       	  mesazhi="It's a draw,do you want to play again";
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
                  turn_count=1;
                  fituesi=0;
                  radha_me_kliku=true;
                  }
              
               else if (value == JOptionPane.NO_OPTION) {
            	  enable_button();
                  turn=true;
                  turn_count=1;
                  fituesi=0;
                  radha_me_kliku=true;
                  
                 // twoPlayerFrame obj_twoplayer=new twoPlayerFrame();
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
	 
	 
	 public void recieveMessage()
	 {
		String message="";
		try {
				
			if((message=Serverreader.readUTF()) != null)
				{
						String text1= message;
			            String new_text[]=text1.split(",");
			            String text=new_text[0];
			            String turni=new_text[1];

			            switch (text) {
			                case "1":
			                    if(turni.equals("o")) {
			                        btn1.setText("O");
			                        turn=false;


			                    }
			                    else if(turni.equals("x"))
			                    {
			                        btn1.setText("X");
			                        turn=true;

			                    }
			                    btn1.setEnabled(false);
			                    break;

			                case "2":

			                    if(turni.equals("o")) {
			                        btn2.setText("O");
			                        turn=false;
			                    }
			                    else if(turni.equals("x"))
			                    {
			                        btn2.setText("X");
			                        turn=true;

			                    }
			                    btn2.setEnabled(false);
			                    break;
			                case "3":

			                    if(turni.equals("o")) {
			                        btn3.setText("O");
			                        turn=false;


			                    }
			                    else if(turni.equals("x"))
			                    {
			                        btn3.setText("X");
			                        turn=true;

			                    }
			                    btn3.setEnabled(false);
			                    break;

			                case "4":

			                    if(turni.equals("o")) {
			                        btn4.setText("O");
			                        turn=false;


			                    }
			                    else if(turni.equals("x"))
			                    {
			                        btn4.setText("X");
			                        turn=true;

			                    }
			                    btn4.setEnabled(false);
			                    break;
			                case "5":

			                    if(turni.equals("o")) {
			                        btn5.setText("O");
			                        turn=false;


			                    }
			                    else if(turni.equals("x"))
			                    {
			                        btn5.setText("X");
			                        turn=true;

			                    }
			                    btn5.setEnabled(false);
			                    break;

			                case "6":
			                    if(turni.equals("o")) {
			                        btn6.setText("O");
			                        turn=false;


			                    }
			                    else if(turni.equals("x"))
			                    {
			                        btn6.setText("X");
			                        turn=true;

			                    }
			                    btn6.setEnabled(false);
			                    break;
			                case "7":

			                    if(turni.equals("o")) {
			                        btn7.setText("O");
			                        turn=false;


			                    }
			                    else if(turni.equals("x"))
			                    {
			                        btn7.setText("X");
			                        turn=true;

			                    }
			                    btn7.setEnabled(false);
			                    break;
			                case "8":
			                    if(turni.equals("o")) {
			                        btn8.setText("O");
			                        turn=false;


			                    }
			                    else if(turni.equals("x"))
			                    {
			                        btn8.setText("X");
			                        turn=true;

			                    }
			                    btn8.setEnabled(false);
			                    break;
			                case "9":

			                    if(turni.equals("o")) {
			                        btn9.setText("O");
			                        turn=false;


			                    }
			                    else if(turni.equals("x"))
			                    {
			                        btn9.setText("X");
			                        turn=true;

			                    }
			                    btn9.setEnabled(false);
			                    break;

			            }
			            turn_count++;
			            check_for_winner();
			            radha_me_kliku=true;

			        }
				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
		}
	 
	 
	 public class IncomingReader implements Runnable
		{
			@Override
			public void run() {
				// TODO Auto-generated method stub
				String message="";
				
				while(true)
				{
					try
					{
						if((message=Serverreader.readUTF()) != null)
						{
									String text1= message;
						            String new_text[]=text1.split(",");
						            String text=new_text[0];
						            String turni=new_text[1];
						           
						            switch (text) {
						                case "1":
						                    if(turni.equals("o")) {
						                        btn1.setText("O");
						                        turn=false;
						                    }
						                    else if(turni.equals("x"))
						                    {
						                        btn1.setText("X");
						                        turn=true;
		
						                    }
						                    btn1.setEnabled(false);
						                    break;
		
						                case "2":
		
						                    if(turni.equals("o")) {
						                        btn2.setText("O");
						                        turn=false;
						                    }
						                    else if(turni.equals("x"))
						                    {
						                        btn2.setText("X");
						                        turn=true;
		
						                    }
						                    btn2.setEnabled(false);
						                    break;
						                case "3":
		
						                    if(turni.equals("o")) {
						                        btn3.setText("O");
						                        turn=false;
		
		
						                    }
						                    else if(turni.equals("x"))
						                    {
						                        btn3.setText("X");
						                        turn=true;
		
						                    }
						                    btn3.setEnabled(false);
						                    break;
		
						                case "4":
		
						                    if(turni.equals("o")) {
						                        btn4.setText("O");
						                        turn=false;
		
		
						                    }
						                    else if(turni.equals("x"))
						                    {
						                        btn4.setText("X");
						                        turn=true;
		
						                    }
						                    btn4.setEnabled(false);
						                    break;
						                case "5":
		
						                    if(turni.equals("o")) {
						                        btn5.setText("O");
						                        turn=false;
		
		
						                    }
						                    else if(turni.equals("x"))
						                    {
						                        btn5.setText("X");
						                        turn=true;
		
						                    }
						                    btn5.setEnabled(false);
						                    break;
		
						                case "6":
						                    if(turni.equals("o")) {
						                        btn6.setText("O");
						                        turn=false;
		
		
						                    }
						                    else if(turni.equals("x"))
						                    {
						                        btn6.setText("X");
						                        turn=true;
		
						                    }
						                    btn6.setEnabled(false);
						                    break;
						                case "7":
		
						                    if(turni.equals("o")) {
						                        btn7.setText("O");
						                        turn=false;
		
		
						                    }
						                    else if(turni.equals("x"))
						                    {
						                        btn7.setText("X");
						                        turn=true;
		
						                    }
						                    btn7.setEnabled(false);
						                    break;
						                case "8":
						                    if(turni.equals("o")) {
						                        btn8.setText("O");
						                        turn=false;
		
		
						                    }
						                    else if(turni.equals("x"))
						                    {
						                        btn8.setText("X");
						                        turn=true;
		
						                    }
						                    btn8.setEnabled(false);
						                    break;
						                case "9":
		
						                    if(turni.equals("o")) {
						                        btn9.setText("O");
						                        turn=false;
		
		
						                    }
						                    else if(turni.equals("x"))
						                    {
						                        btn9.setText("X");
						                        turn=true;
		
						                    }
						                    btn9.setEnabled(false);
						                    break;
		
						            }
						            turn_count++;
						            check_for_winner();
						            radha_me_kliku=true;
						        }
						}
						catch(Exception ex)
						{
							//System.out.println(ex.getMessage());
						}
					}
			}

		}
	 
}
