package App;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelGraph extends JPanel {
	static int log=1;
public PanelGraph() {
	this.setBounds(0,0,900,900);
}
ImageIcon img;
public void paint(Graphics g) {
	img=new ImageIcon("Untitled.png");
	int h=img.getIconHeight();
	int w=img.getIconWidth();
	int num_x=340/w;
	int num_y=340/h;
	for(int i=0;i<num_y;i++) {
		int y=280+i*h;
		for(int j=0;j<num_x;j++) {
			
			int x=280+j*w;
			img.paintIcon(this, g,x , y);
		}
	}
	ImageIcon img2=new ImageIcon("Untitled1.png");
	img2.paintIcon(this, g, 380-img2.getIconWidth(),600);
	img2.paintIcon(this, g, 500,600);
}
}
