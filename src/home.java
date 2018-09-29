import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.event.ActionEvent;

public class home {

	private JFrame frmTictactoe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home window = new home();
					window.frmTictactoe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTictactoe = new JFrame();
		frmTictactoe.setTitle("TicTacToe");
		frmTictactoe.setBounds(100, 100, 616, 457);
		frmTictactoe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTictactoe.getContentPane().setLayout(null);
		
		JButton btnOnePlayer = new JButton("One Player");
		btnOnePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				alert_dialog(frmTictactoe);
			}
		});
		btnOnePlayer.setBounds(240, 86, 97, 35);
		frmTictactoe.getContentPane().add(btnOnePlayer);
		
		JButton btnTwoPlayer = new JButton("Two Player");
		btnTwoPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				twoPlayerFrame obj_onePlayer=new twoPlayerFrame();
				obj_onePlayer.setVisible(true);
			}
		});
		btnTwoPlayer.setBounds(240, 134, 97, 35);
		frmTictactoe.getContentPane().add(btnTwoPlayer);
		
		JButton btnLan = new JButton("LAN");
		btnLan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				LANFrame frame = new LANFrame();
				frame.go();
			}
		});
		btnLan.setBounds(240, 182, 97, 35);
		frmTictactoe.getContentPane().add(btnLan);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setBounds(240, 230, 97, 35);
		frmTictactoe.getContentPane().add(btnAbout);
	}
	
	
	 public void alert_dialog(JFrame frame)
	    {
		 Object[] options = {"Computer vs Player",
         "Player vs Computer "};
		 
	    	  String mesazhi="Choose who to start first.";
	    
				int n = JOptionPane.showOptionDialog(frame,
				mesazhi,
				"A Silly Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,     //do not use a custom Icon
				options,  //the titles of buttons
				options[0]); //default button title
	 
	               //quesiton if yes or no
	              
	               if (n == JOptionPane.YES_OPTION) 
	               {
	            	   int vlera=2;
	            	   
	            	  onePlayerFrame obj_onePlayer=new onePlayerFrame(vlera);
	            	  obj_onePlayer.setVisible(true);
	            	   
	               } else if (n == JOptionPane.NO_OPTION) 
	               {
	         	       int vlera=1; 
	         	      onePlayerFrame obj_onePlayer=new onePlayerFrame(vlera);
	            	  obj_onePlayer.setVisible(true);
	               }
	    }
		 
}
