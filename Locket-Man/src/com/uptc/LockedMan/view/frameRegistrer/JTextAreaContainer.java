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
		chargeText();
	}
	
	/**
	 * metodo encargado de leer el texto de un archivo y graficarlo en un text area
	 */
	public void chargeText() {
		try {
			File file = new File(pathText);
			br = new BufferedReader(new FileReader(file));
			String text = "";
			String auxText;
			while ((auxText = br.readLine()) != null) {
				text += (auxText + "\n");
			}

			this.setText(text);
			
		} catch (Exception e) {
			System.out.println("El archivo no se encuentra");
		}
	}

}
