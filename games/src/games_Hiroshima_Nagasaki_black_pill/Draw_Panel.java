package games_Hiroshima_Nagasaki_black_pill;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Draw_Panel extends JPanel implements ActionListener,KeyListener {
private ImageIcon im;
private ImageIcon head;
private ImageIcon body ;
private boolean start=true;
private boolean left=false;private boolean right=false;private boolean up=false;private boolean down=false;
private int[] xPos=new int[4];
private int[] yPos=new int[4];/* center head 500,500*/
private Timer timer;
public Draw_Panel() {
	 timer=new Timer(100,null);
	timer.addActionListener(this);

}
public void paint(Graphics g) {
	g.setColor(Color.WHITE);
	g.drawRect(10, 55, 960, 890);
	head=new ImageIcon("Untitled.png");
	body=new ImageIcon("Untitled1.png");
	im=new ImageIcon("Untitled.png");
	im.paintIcon(this, g, 0, 0);	im.paintIcon(this, g, 45, 0);	im.paintIcon(this, g, 90, 0);
	im.paintIcon(this, g, 135, 0);	im.paintIcon(this, g, 180, 0);	im.paintIcon(this, g, 225, 0);
	im.paintIcon(this, g, 265, 0);	im.paintIcon(this, g, 310, 0);	im.paintIcon(this, g, 355, 0);
	im.paintIcon(this, g, 400, 0);	im.paintIcon(this, g, 445, 0);	im.paintIcon(this, g,490, 0);
	im.paintIcon(this, g, 535, 0);	im.paintIcon(this, g, 580, 0);	im.paintIcon(this, g, 625, 0);
	im.paintIcon(this, g, 670, 0);	im.paintIcon(this, g, 715, 0);	im.paintIcon(this, g, 760, 0);
	im.paintIcon(this, g, 805, 0);	im.paintIcon(this, g, 850, 0);	im.paintIcon(this, g, 895, 0);
	
	
	


}
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
