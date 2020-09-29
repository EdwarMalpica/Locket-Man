package com.uptc.LockedMan.view.frameRegistrer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JPanel;
import javax.swing.JTextField;

import com.uptc.LockedMan.constants.Constants;

public class PanelAbout extends JPanel{
	
	private JTextAreaContainer textArea;
	private JButtonPlay buttonClose;
	
	public PanelAbout(Dimension size) {
		this.setSize(size);
		this.setOpaque(true);
		this.setBackground(Color.GRAY);
		init();
	}
	
	public void init() {
		buttonClose = new JButtonPlay(new Dimension(30, 30), Constants.PATH_BUTTON_CLOSE, new Point(this.getWidth() - 30, 0));
		textArea = new JTextAreaContainer(new Dimension(this.getWidth(), this.getHeight()), new Point(0, 30), Constants.PATH_FILE_ABOUT_US);
		this.add(buttonClose);
		this.add(textArea);
	}

	public JButtonPlay getButtonClose() {
		return buttonClose;
	}
}
