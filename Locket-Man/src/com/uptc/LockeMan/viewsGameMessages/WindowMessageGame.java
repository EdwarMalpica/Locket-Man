package com.uptc.LockeMan.viewsGameMessages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Window;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.uptc.LockeMan.backgroundGame.ConstanBackground;
import com.uptc.LockeMan.utilities.PropertiesManager;
import com.uptc.LockeMan.viewsGameMenus.JButtonOption;
import com.uptc.LockeMan.viewsGameMenus.JLabelTextGame;
import com.uptc.LockeMan.viewsGameMenus.WindowGame;

public class WindowMessageGame extends WindowGame{


	public WindowMessageGame(String headerText,String bodyText) {
		super();		
		init();
		setPropertiesLabels(headerText);
		setPropertiesTextArea(bodyText);
		setButton();
		
	}
	
	@Override
	protected void init() {
		super.init();
		jPanelBody.setLayout(new FlowLayout(FlowLayout.CENTER));
		verifyCorrectSize();		
		
	}
	private void setPropertiesLabels(String headerText) {
		JLabelTextGame jLabelTextGame1 = new JLabelTextGame();
		jLabelTextGame1.setText(headerText);
		jPanelBody.add(jLabelTextGame1);		
		
	}

	private void setPropertiesTextArea(String bodyText) {
		JTextArea jTextArea = new JTextArea();
		jTextArea.setOpaque(false);
		jTextArea.setText(bodyText);
		jTextArea.setFont(ConstanBackground.SUMMER_FONT_SMALLSIZE);
		jTextArea.setForeground(Color.white);
		jTextArea.setBorder(BorderFactory.createEmptyBorder(20,20,50,20));
		jPanelBody.add(jTextArea);
	}
	
	private void setButton() {
		JButtonOption jButtonOption = new JButtonOption(jPanelBody,PropertiesManager.getPropertiesManager().getBtnReturnMessage(),"btnReturn");
		jPanelBody.add(jButtonOption);
	}
	@Override
	public void verifyCorrectSize() {
		this.setSize(dimension.width/3,dimension.height/2);
	}
	
}
