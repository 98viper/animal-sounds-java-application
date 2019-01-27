package fenetres;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;







							/*-------------- BENCHAMA Hajar / 4IIR2-G1(EMSI) --------------*/
public class startInterface extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	
	JPanel westPanel,southPanel,felinPanel,caninPanel,f1,f2,f3,c1,c2,buttonfPanel,buttoncPanel; //fi et ci cards pour felin et canin
	JButton BT_home,BT_felin,BT_canin,BT_soundcat,BT_soundlion,BT_soundwolf,BT_sounddog,BT_soundtiger;
	JButton BT_felinnext,BT_felinprev,BT_caninprev,BT_caninnext;
	JLabel background,img_tiger,img_lion,img_cat,img_wolf,img_dog;
	CardLayout felinLayout,caninLayout;
	
	/*-------------- Fonction pour lire les sons --------------*/
	public void playSound(String soundName)
	 {
	   try 
	   {
	    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
	    Clip clip = AudioSystem.getClip( );
	    clip.open(audioInputStream);
	    clip.start( );
	   }
	   catch(Exception ex)
	   {
	     System.out.println("Error with playing sound.");
	     ex.printStackTrace( );
	   }
	 }
	/*-------------- Fonction pour redimensionner les images --------------*/
	 public Image initPics(String urlPic) {
		 ImageIcon icon = new ImageIcon(urlPic); 
		 Image image = icon.getImage();
		 Image newimg = image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);  
		 return newimg;
	 }
	
	 /*-------------- Fonctions initialiser les labels/bouttons/panels --------------*/
       public void initLabels() {
		
		background =new JLabel(new ImageIcon("img\\bg.png"));
	
		
		img_cat=new JLabel(new ImageIcon(initPics("img\\cat.png")));
		img_cat.setBorder(new EmptyBorder(50,0,0,200));
		
		img_tiger=new JLabel(new ImageIcon(initPics("img\\tiger.png")));
		img_tiger.setBorder(new EmptyBorder(50,0,0,200));
		
		img_lion=new JLabel(new ImageIcon(initPics("img\\lion.png")));
		img_lion.setBorder(new EmptyBorder(50,0,0,200));
		
		img_dog=new JLabel(new ImageIcon(initPics("img\\dog.png")));
		img_dog.setBorder(new EmptyBorder(50,0,0,200));
		
		img_wolf=new JLabel(new ImageIcon(initPics("img\\wolf.png")));
		img_wolf.setBorder(new EmptyBorder(50,0,0,200));
		
		
	}
     public void initButtons() {
		 
      /*-------------- Bouttons pour retour à la premiere fenetre --------------*/
    	 BT_home = new JButton("<- Back");
    	 BT_home.setFont(new Font("Agency FB",Font.BOLD,29));
    	 BT_home.setOpaque(false);
    	 BT_home.setContentAreaFilled(false);
    	 BT_home.setBorderPainted(false);
    	 BT_home.setForeground(Color.white);
    	 BT_home.addActionListener(this);
	  /*-------------- Bouttons pour choisir les categories --------------*/
		BT_felin = new JButton("Feline");
		BT_felin.setFont(new Font("Agency FB",Font.BOLD,29));
		BT_felin.setOpaque(false);
		BT_felin.setContentAreaFilled(false);
		BT_felin.setBorderPainted(false);
		BT_felin.setForeground(Color.white);
		BT_felin.addActionListener(this);
		
		BT_canin = new JButton("Canine");
		BT_canin.setFont(new Font("Agency FB",Font.BOLD,29));
		BT_canin.setOpaque(false);
		BT_canin.setContentAreaFilled(false);
		BT_canin.setBorderPainted(false);
		BT_canin.setForeground(Color.white);
		BT_canin.addActionListener(this);
		
		
	  /*-------------- Bouttons previous/next --------------*/
		BT_felinnext = new JButton("Next ->");
		BT_felinnext.setFont(new Font("Agency FB",Font.BOLD,29));
		BT_felinnext.setOpaque(false);
		BT_felinnext.setContentAreaFilled(false);
		BT_felinnext.setBorderPainted(false);
		BT_felinnext.setForeground(Color.white);
		BT_felinnext.addActionListener(this);
		
		BT_felinprev = new JButton("<- Previous");
		BT_felinprev.setFont(new Font("Agency FB",Font.BOLD,29));
		BT_felinprev.setOpaque(false);
		BT_felinprev.setContentAreaFilled(false);
		BT_felinprev.setBorderPainted(false);
		BT_felinprev.setForeground(Color.white);
		BT_felinprev.addActionListener(this);
		
		BT_caninnext = new JButton("Next ->");
		BT_caninnext.setFont(new Font("Agency FB",Font.BOLD,29));
		BT_caninnext.setOpaque(false);
		BT_caninnext.setContentAreaFilled(false);
		BT_caninnext.setBorderPainted(false);
		BT_caninnext.setForeground(Color.white);
		BT_caninnext.addActionListener(this);
		
		BT_caninprev = new JButton("<- Previous");
		BT_caninprev.setFont(new Font("Agency FB",Font.BOLD,29));
		BT_caninprev.setOpaque(false);
		BT_caninprev.setContentAreaFilled(false);
		BT_caninprev.setBorderPainted(false);
		BT_caninprev.setForeground(Color.white);
		BT_caninprev.addActionListener(this);

	  /*-------------- Bouttons des sons --------------*/
		BT_soundcat = new JButton("I Mew!");
		BT_soundcat.setFont(new Font("Agency FB",Font.BOLD,29));
		BT_soundcat.setOpaque(false);
		BT_soundcat.setContentAreaFilled(false);
		BT_soundcat.setBorderPainted(false);
		BT_soundcat.setForeground(Color.white);
		BT_soundcat.setBorder(new EmptyBorder(10,0,0,210));
		BT_soundcat.addActionListener(this);
		

		BT_soundlion = new JButton("I Roar!");
		BT_soundlion.setFont(new Font("Agency FB",Font.BOLD,29));
		BT_soundlion.setOpaque(false);
		BT_soundlion.setContentAreaFilled(false);
		BT_soundlion.setBorderPainted(false);
		BT_soundlion.setForeground(Color.white);
		BT_soundlion.setBorder(new EmptyBorder(10,0,0,210));
		BT_soundlion.addActionListener(this);
		
		BT_soundtiger = new JButton("I Roar!");
		BT_soundtiger.setFont(new Font("Agency FB",Font.BOLD,29));
		BT_soundtiger.setOpaque(false);
		BT_soundtiger.setContentAreaFilled(false);
		BT_soundtiger.setBorderPainted(false);
		BT_soundtiger.setForeground(Color.white);
		BT_soundtiger.setBorder(new EmptyBorder(10,0,0,210));
		BT_soundtiger.addActionListener(this);
		
		
		BT_soundwolf = new JButton("I Howl!");
		BT_soundwolf.setFont(new Font("Agency FB",Font.BOLD,29));
		BT_soundwolf.setOpaque(false);
		BT_soundwolf.setContentAreaFilled(false);
		BT_soundwolf.setBorderPainted(false);
		BT_soundwolf.setForeground(Color.white);
		BT_soundwolf.setBorder(new EmptyBorder(10,0,0,210));
		BT_soundwolf.addActionListener(this);
		
		BT_sounddog = new JButton("I Bark!");
		BT_sounddog.setFont(new Font("Agency FB",Font.BOLD,29));
		BT_sounddog.setOpaque(false);
		BT_sounddog.setContentAreaFilled(false);
		BT_sounddog.setBorderPainted(false);
		BT_sounddog.setForeground(Color.white);
		BT_sounddog.setBorder(new EmptyBorder(10,0,0,210));
		BT_sounddog.addActionListener(this);
		
	}
	 public void initPanels() {
		westPanel=new JPanel();
		westPanel.setLayout(new GridLayout(3,1,1,1));
		westPanel.setBorder(new EmptyBorder(35,10,200,100));
		westPanel.setOpaque(false);
		westPanel.add(BT_home);
		westPanel.add(BT_felin);
		westPanel.add(BT_canin);
	
		/*------------------ cardslayout des felins -----------------------*/
		felinPanel = new JPanel();

		f1=new JPanel();
		f1.setLayout(new GridLayout(2,1,2,2));
		f1.setBorder(new EmptyBorder(10,0,0,0));
		f1.setOpaque(false);
		f1.add(img_cat);
	    f1.add(BT_soundcat);
		
		f2=new JPanel();
		f2.setLayout(new GridLayout(2,1,5,5));
		f2.add(img_lion);
		f2.setOpaque(false);
		f2.add(BT_soundlion);
		
		f3=new JPanel();
		f3.setOpaque(false);
		f3.setLayout(new GridLayout(2,1,5,5));
		f3.add(img_tiger);
		f3.add(BT_soundtiger);
		
		buttonfPanel=new JPanel();
		buttonfPanel.setOpaque(false);
		buttonfPanel.add(BT_felinprev);
		buttonfPanel.add(BT_felinnext);
		
		
		felinLayout= new CardLayout();
		felinPanel.setLayout(felinLayout);
		felinPanel.setOpaque(false);
		felinPanel.add(f1);
		felinPanel.add(f2);
		felinPanel.add(f3);

		
		/*--------------------------- card layout des canins -----------------------*/
		caninPanel = new JPanel();

		c1=new JPanel();
		c1.setLayout(new GridLayout(2,1,2,2));
		c1.setBorder(new EmptyBorder(10,0,0,0));
		c1.setOpaque(false);
		c1.add(img_dog);
	    c1.add(BT_sounddog);
		
		c2=new JPanel();
		c2.setLayout(new GridLayout(2,1,5,5));
		c2.add(img_wolf);
		c2.setOpaque(false);
		c2.add(BT_soundwolf);
		
		buttoncPanel=new JPanel();
		buttoncPanel.setOpaque(false);
		buttoncPanel.add(BT_caninprev);
		buttoncPanel.add(BT_caninnext);

		caninLayout= new CardLayout();
		caninPanel.setLayout(caninLayout);
		caninPanel.setOpaque(false);
		caninPanel.add(c1);
		caninPanel.add(c2);
		
	}

	
	public startInterface(int testFrame) {
		if(testFrame==1) {
			this.setSize(640,480);
			this.setTitle("Feline Animals");
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
			this.setLocationRelativeTo(null);
			this.setAlwaysOnTop(true); 
			this.setResizable(false);
			initLabels();
			initButtons();
			initPanels();
			this.getContentPane().setLayout(new BorderLayout());
			this.getContentPane().add(westPanel,BorderLayout.WEST);
			this.getContentPane().add(buttonfPanel,BorderLayout.PAGE_END);
			this.getContentPane().add(felinPanel,BorderLayout.CENTER);
			this.setVisible(true);
			setLayout(new BorderLayout());
			this.add(background);
			background.setLayout(new FlowLayout());	
			
		}
			
		else if(testFrame==2) {
			this.setSize(640,480);
			this.setTitle("Canine Animals");
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
			this.setLocationRelativeTo(null);
			this.setAlwaysOnTop(true); 
			this.setResizable(false);
			initLabels();
			initButtons();
			initPanels();
			this.getContentPane().setLayout(new BorderLayout());
			this.getContentPane().add(westPanel,BorderLayout.WEST);
			this.getContentPane().add(buttoncPanel,BorderLayout.PAGE_END);
			this.getContentPane().add(caninPanel,BorderLayout.CENTER);
			this.setVisible(true);
			setLayout(new BorderLayout());
			this.add(background);
			background.setLayout(new FlowLayout());
		}
			


		
		
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	  /*----------------------------Bouttons Previous/Next des cardLayouts----------------------------*/
			if(e.getSource() == BT_caninnext) {
				caninLayout.next(caninPanel);
			}
			if(e.getSource() == BT_caninprev) {
				caninLayout.previous(caninPanel);
			}
			
			if(e.getSource() == BT_felinnext) {
				felinLayout.next(felinPanel);
			}
			if(e.getSource() == BT_felinprev) {
				felinLayout.previous(felinPanel);
			}
		
	  /*----------------------------Sons des animaux----------------------------*/
			if(e.getSource()== BT_soundcat) {
				this.playSound("sounds\\cat.wav");
			}
		
			if(e.getSource()== BT_soundlion) {
				this.playSound("sounds\\lion.wav");
			}
			if(e.getSource()== BT_soundwolf) {
				this.playSound("sounds\\wolf.wav");
			}
			if(e.getSource()== BT_sounddog) {
				this.playSound("sounds\\dog.wav");
			}
			if(e.getSource()== BT_soundtiger) { 
				this.playSound("sounds\\tiger.wav");
			}
		
		/*----------------------------Changement des frames----------------------------*/
		
			if(e.getSource() == BT_canin) { 
				startInterface caninframe = new startInterface(2);
				caninframe.setVisible(true);
				dispose();
			}
		
			if(e.getSource()== BT_felin) { 
				startInterface felinframe = new startInterface(1);
				felinframe.setVisible(true);
				dispose();
			}
			
		/*---------------------------------Retour------------------------------------*/
			if(e.getSource()== BT_home) { 
				dispose();
			}
	}

}
