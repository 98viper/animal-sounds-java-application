package fenetres;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;



							/*-------------- BENCHAMA Hajar / 4IIR2-G1(EMSI) --------------*/

public class bienvenue extends JFrame implements ActionListener{
 
	private static final long serialVersionUID = 1L;
	JButton BT_start,BT_quit;
	JPanel centerPanel; 
	JLabel LBL_mainTitle,background;
	
	 /*-------------- Fonctions initialiser les labels/bouttons/panels --------------*/
			public void initLabels() {
		LBL_mainTitle=new JLabel("Hear the sound ..");
		LBL_mainTitle.setFont(new Font("Agency FB",Font.BOLD,60));
		LBL_mainTitle.setForeground(Color.WHITE);
		LBL_mainTitle.setHorizontalAlignment(JLabel.CENTER);	
		
		background =new JLabel(new ImageIcon("img\\bg.png"));

	}
			public void initButtons() {
		BT_start = new JButton("Discover!");
		BT_start.setFont(new Font("Agency FB",Font.BOLD,29));
		BT_start.setOpaque(false);
		BT_start.setContentAreaFilled(false);
		BT_start.setBorderPainted(false);
		BT_start.setForeground(Color.white);
		BT_start.addActionListener(this);
		
		
		BT_quit = new JButton("Exit");
		BT_quit.setFont(new Font("Agency FB",Font.BOLD,30));
		BT_quit.setForeground(Color.white);
		BT_quit.setOpaque(false);
		BT_quit.setContentAreaFilled(false);
		BT_quit.setBorderPainted(false);
		BT_quit.addActionListener(this);
		
	}
			public void initPanels() {
		centerPanel=new JPanel();
		centerPanel.setLayout(new GridLayout(2,1,1,1));
		centerPanel.setBorder(new EmptyBorder(150,180,150,180));
		centerPanel.setOpaque(false);
		centerPanel.add(BT_start);
		centerPanel.add(BT_quit);
		
	}
	
	
	
	
			public bienvenue(String T) {
				this.setSize(640,480);
				this.setTitle(T);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing = parametre de fermeture
				this.setLocationRelativeTo(null);
				this.setAlwaysOnTop(true);
				this.setResizable(false);
				initLabels();
				initButtons();
				initPanels();
				this.getContentPane().setLayout(new BorderLayout());
				this.getContentPane().add(LBL_mainTitle,BorderLayout.NORTH);
				this.getContentPane().add(centerPanel,BorderLayout.CENTER);
				this.setVisible(true);
				setLayout(new BorderLayout());
				this.add(background);
				background.setLayout(new FlowLayout());
		
			}
	
	
	
	public static void main(String[] args) {
		new bienvenue("Hear the sound..");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== BT_start) {
			new startInterface(2);
		}
		
		if(e.getSource()== BT_quit) {
			System.exit(0);
		}
	}

}
