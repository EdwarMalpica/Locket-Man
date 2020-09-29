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

public class WindowMenu extends WindowGame{
	
	private int numberDivisions;
	private String[] buttonsTextList;
	private String[] buttonsNameList;

	public WindowMenu(String[] buttonsTextList,String[] buttonsNameList) {
		super();
		numberDivisions = buttonsTextList.length;
		this.buttonsTextList = buttonsTextList;
		this.buttonsNameList = buttonsNameList;
		init();
		
	}
	
	
	@Override
	protected void init() {
		super.init();
		jPanel.setLayout(new GridLayout(numberDivisions,0));
		addPanels();
	}
	
	

	/**
	 * Verifica el tamaño del array sea el mismo que el numero de botones que se vayan a agregar
	 */
	
	private void verifyCorrectSizeArray() {
		if (buttonsTextList.length != buttonsNameList.length) {
			System.out.println("Argumentos innecesarios");
		}else {
			this.setPropertiesWindow();
			init();
		}
	}
	
	/**
	 * Añade los paneles donde van a estar los botones para cada opcion, recorre la lista donde estan los textos de cada boton
	 */
	private void addPanels() {		
		for (int i = 0; i < numberDivisions; i++) {
			JPanelMenu jPanelPauseOption = new JPanelMenu(this);	
			jPanelPauseOption.setButton(buttonsTextList[i],buttonsNameList[i]);
			if (i == 0) {
				jPanel.add(new JPanelHeaderMenu(buttonsTextList[i],this));
			}else {
				jPanel.add(jPanelPauseOption);
			}			
		}
	}

	
	 

	 /**
	  * Verificamos el numero de botones que queremos poner para dar el tamaño indicado a la ventana de largo
	  */

	@Override
	public void verifyCorrectSize() {
		if (numberDivisions > 7) {
			int newHeight = this.getHeight()+((dimension.height/numberDivisions)*numberDivisions);
			this.setSize(new Dimension(dimension.width/3,newHeight));
		}else {
			this.setSize(dimension.width/3,dimension.height/2);
		}
		
	}
	
	 
}
