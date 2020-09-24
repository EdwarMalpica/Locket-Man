package com.uptc.LockedMan.view;

import javax.swing.*;

import com.uptc.LockedMan.constants.Constants;
import com.uptc.LockedMan.fonts.FontAdd;

import java.awt.*;

public class LabelPercent extends JLabel{
	
	private FontAdd font;

	public LabelPercent() {
		init();
	}
	
	public LabelPercent(String text, int size) {
		font = new FontAdd();
		this.setFont(font.fuente(Constants.PATH_FONT_MARIO, 3, size));
		this.setText(text);
	}
	
	public void init() {
		font = new FontAdd();
		this.setBorder(null);
		this.setFont(font.fuente(Constants.PATH_FONT_MARIO, 3, Constants.SIZE_FONT_MARIO_PERCENT));
	}
	
	public void upDateText(String text) {
		this.setText(text);
	}
}
