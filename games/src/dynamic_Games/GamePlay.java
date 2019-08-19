package dynamic_Games;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlay extends JPanel {

	private ImageIcon title;
	private int[] xPos=new int[850];
	private	int[] yPos=new int[850];
	private boolean left=false;
	private boolean right=false;private boolean down=false;private boolean up=false;
	private ImageIcon head;	
	private Timer time ;
	private int delay=100;
	private ImageIcon body;
	private int lengthOfRage=3;
	private int moves=0;
	
	public GamePlay() {
		//addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	//	time=new Timer(delay,this);
		//time.start();
		//head=new ImageIcon("Untitled.png");
       
		
		
	}
	public void paint(Graphics g) {
		if(moves==0) {
			xPos[0]=148;
			xPos[1]=96;
			xPos[2]=50;
			yPos[2]=100;
			yPos[1]=100;
			yPos[0]=100;

		}
		g.setColor(Color.BLUE);
		g.drawRect(0,0, 850, 54);
		//title.paintIcon(this, g, 0, 0);
		g.setColor(Color.WHITE);
		g.drawRect(0, 60, 850, 790);
		title=new ImageIcon("Untitled.png");
		title.paintIcon(this, g, 0, 0);	title.paintIcon(this, g, 45, 0);	title.paintIcon(this, g, 90, 0);
		title.paintIcon(this, g, 135, 0);	title.paintIcon(this, g, 180, 0);	title.paintIcon(this, g, 225, 0);
		title.paintIcon(this, g, 265, 0);	title.paintIcon(this, g, 310, 0);	title.paintIcon(this, g, 355, 0);
		title.paintIcon(this, g, 400, 0);	title.paintIcon(this, g, 445, 0);	title.paintIcon(this, g,490, 0);
		title.paintIcon(this, g, 535, 0);	title.paintIcon(this, g, 580, 0);	title.paintIcon(this, g, 625, 0);
		title.paintIcon(this, g, 670, 0);	title.paintIcon(this, g, 715, 0);	title.paintIcon(this, g, 760, 0);
		title.paintIcon(this, g, 805, 0);	title.paintIcon(this, g, 850, 0);
		
		head=new ImageIcon("Untitled.png");
		head.paintIcon(this, g, xPos[0], yPos[0]);
		body=new ImageIcon("Untitled1.png");
		
		//title=new ImageIcon("snaketitle.jpg");
		
		//head.paintIcon(this, g, xPos[0], yPos[0]);
		for(int a=0;a<lengthOfRage;a++) {
			if(a==0) {

				head=new ImageIcon("Untitled.png");
				head.paintIcon(this, g, xPos[a], yPos[a]);
		
				
			}
			else {
				
				body.paintIcon(this, g, xPos[a], yPos[a]);

			}
		}

	}
/*	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		time.start();
		if(right) {
		for(int i=lengthOfRage-1;i>=0;i--) {
			if(i==0) {
				xPos[i]+=44;
				
			}
			else {
				xPos[i]+=52;
			}
		}
		repaint();
		}
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		int key=arg0.getKeyCode();
 if(key==KeyEvent.VK_LEFT) {
	 moves++;
	left=true;
	 if(!right) {
		 left=true;
	 }
	 else {
		 
		left=false;
		right=true;
	 }
	 down=false;
	 up=false;
 }
 else  if(key==KeyEvent.VK_RIGHT) {
	 moves++;
	 right=true;
	 if(!left) {
		 right=true;
	 }
	 else {
		 right=false;
		 left=true;
		 
	 }
	 down=false;
	 up=false;
 }
 else  if(key==KeyEvent.VK_UP) {
	 moves++;
	 up=true;
	 if(!down) {
		 up=true;
	 }
	 else {
		 up=false;
		 
	 }
	 right=false;
	 left=false;
 }  
 else  if(key==KeyEvent.VK_DOWN) {
	 moves++;
	 down=true;
	 if(!up) {
		 down=true;
	 }
	 else {
		 down=false;
		 
	 }
	 right=false;
	 left=false;
 }
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}*/
}
