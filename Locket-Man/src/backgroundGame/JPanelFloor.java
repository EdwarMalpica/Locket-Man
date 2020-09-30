package backgroundGame;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelFloor extends JPanel{

	private JFrame jFrame;
	public JPanelFloor() {
		super();
		jFrame = new JFrame();
		jFrame.setSize(1300, 740);
		jFrame.add(this);
		init();
		jFrame.setVisible(true);
	}
	private void init() {
		this.setLayout(null);
	}
	
	private Rectangle drawRectanglePos1() {
		Rectangle rectangle = new Rectangle(0,500,349,237);
		return rectangle;
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0,500,349,237);
	}
	public static void main(String[] args) {
		JPanelFloor floor = new JPanelFloor();
		
	}
}
