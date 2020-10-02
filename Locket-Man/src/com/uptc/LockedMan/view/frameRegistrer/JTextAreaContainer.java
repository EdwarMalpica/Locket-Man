package com.uptc.LockedMan.view.frameRegistrer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JTextArea;

import com.uptc.LockedMan.constants.Constants;
import com.uptc.LockedMan.fonts.FontAdd;

public class JTextAreaContainer extends JTextArea{
	
	private Dimension size;
	private Point locale;
	private String pathText;
	
	private FontAdd font;
	
	private BufferedReader br;
	
	/**
	 * contenedor de texto grande
	 * @param size tamaño que va a tener el textArea
	 * @param locale localizacion del mismo
	 * @param pathText direccion donde se encuentra el texto a mostrar
	 */
	public JTextAreaContainer(Dimension size, Point locale, String pathText) {
		super();
		this.setEditable(false);
		this.setBackground(Color.black);
		this.setOpaque(true);
		this.size = size;
		this.locale = locale;
		this.pathText = pathText;
		init();
	}
	
	public void init() {
		font = new FontAdd();
		this.setFont(font.fuente(Constants.PATH_FONT_MARIO, 3, 16));
		this.setForeground(Color.blue);
		this.setSize(size);
		this.setLocation(locale);
		chargeText(pathText);
	}
	
	/**
	 * metodo encargado de leer el texto de un archivo y graficarlo en un text area
	 * metodo obsoleto
	 */
	public void chargeText(String pathText) {
		try {
			File file = new File(pathText.getClass().getResource(pathText).getPath());
			br = new BufferedReader(new FileReader(file));
			String text = "";
			String auxText;
			while ((auxText = br.readLine()) != null) {
				text += (auxText + "\n");
			}

			this.setText(text);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 * añade el texto a este componente
	 * @param text texto a añadir
	 */
	public void setTextAllText(String text) {
		this.setText(text);
	}	
}
