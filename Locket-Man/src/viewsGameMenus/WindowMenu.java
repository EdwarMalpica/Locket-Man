package viewsGameMenus;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import backgroundGame.ConstanBackground;

public class WindowMenu extends Window{
	
	private int numberDivisions;
	private JPanel jPanel;
	private ImageIcon img;
	private String[] buttonsTextList;

	public WindowMenu(int numberOptions,String[] buttonsTextList) {
		super(null);
		numberDivisions = numberOptions;
		this.buttonsTextList = buttonsTextList;
		verifyNumberTextButton();
		
	}
	
	private void init() {
		this.add(jPanel);
		jPanel.setBackground(Color.blue);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		jPanel.setLayout(new GridLayout(numberDivisions,0));
		verifyCorrectSize(dimension);
		this.setLocationRelativeTo(null);	
		addPanels();
		
	}
	/**
	 * Verifica el tamaño del array sea el mismo que el numero de botones que se vayan a agregar
	 */
	
	private void verifyNumberTextButton() {
		if (buttonsTextList.length != numberDivisions) {
			System.out.println("Argumentos innecesarios");
			//Tratar una excepcion
		}else {
			jPanel = new JPanel();
			img = new ImageIcon(ConstanBackground.PATH_IMAGE_BACKGROUND_MENU);
			init();
			this.setVisible(true);
		}
	}
	
	/**
	 * Añade los paneles donde van a estar los botones para cada opcion
	 */
	private void addPanels() {		
		for (int i = 0; i < numberDivisions; i++) {
			JPanelMenu jPanelPauseOption = new JPanelMenu(this,buttonsTextList[i]);	
			if (i == 0) {
				jPanel.add(new JPanelHeaderMenu(buttonsTextList[i],this));
			}else {
				jPanel.add(jPanelPauseOption);
			}			
		}
	}

	/**
	 * Pintamos la imagen que pasamos por parametro en el fondo del menu
	 */
	 @Override
	public void paint(Graphics graphics){
		 Image imageBackGround = img.getImage();        
	     graphics.drawImage(imageBackGround,0,0,this.getWidth(),this.getHeight(), this);
	     jPanel.setOpaque(false);
	     super.paint(graphics);
	 }	
	 
	 /**
	  * Verificamos el numero de botones que queremos poner para dar el tamaño indicado a la ventana de largo
	  */
	 private void verifyCorrectSize(Dimension dimension) {
		 if (numberDivisions > 7) {
			int newHeight = this.getHeight()+((dimension.height/numberDivisions)*numberDivisions);
			this.setSize(new Dimension(dimension.width/3,newHeight));
		}else {
			this.setSize(dimension.width/3,dimension.height/2);
		}
	 }
	
	 
}
