package com.uptc.LockedMan.view.splash;

import java.awt.*;
import javax.swing.JPanel;

import com.uptc.LockedMan.constants.Constants;

public class PanelCharge extends JPanel{
	
	private LabelPercent labelPercent;
	private LabelAvatar labelAvatar;
	private LabelPercent labelTextNamePlay;
	private LabelPercent letterA;
	private LabelPercent namePlay;
	private LabelPercent labelVersion;

	public PanelCharge() {
		this.setLayout(null);
		this.setSize((int) (Constants.DIMENSION_WINDOW_DEFAULT.getWidth()/3), (int) (Constants.DIMENSION_WINDOW_DEFAULT.getHeight()/3));
		
		labelAvatar = new LabelAvatar(Constants.PATH_ARRAY_ANIM + 0 + Constants.FORMAT_PNG, Constants.POINT_LABEL_AVATAR);
		labelAvatar.setSize(Constants.DIMENSION_LABEL_AVATAR);
		labelAvatar.setLocation(this.getWidth(), Constants.POINT_LABEL_AVATAR.y);
		
		labelTextNamePlay = new LabelPercent(Constants.MESSAGE_WELCOME, Constants.SIZE_WELLCOME_MESSAGE);
		labelTextNamePlay.setSize(this.getWidth(), 50);
		
		letterA = new LabelPercent(Constants.LETTER_A_MESSAGE, Constants.SIZE_WELLCOME_MESSAGE);
		letterA.setSize(Constants.DIMENSION_LABEL_LETTER_A);
		letterA.setLocation(Constants.POINT_LETTER_A);
		letterA.setVisible(false);
		
		namePlay = new LabelPercent(Constants.NAME_PLAY, Constants.SIZE_WELLCOME_MESSAGE);
		namePlay.setSize(this.getWidth(), 50);
		namePlay.setLocation(Constants.POINT_NAME_PLAY);
		
		labelVersion = new LabelPercent(Constants.VERSION_PLAY, Constants.SIZE_FONT_VERSION);
		labelVersion.setSize(Constants.DIMENSION_LABEL_VERSION);
		labelVersion.setLocation(Constants.POINT_LABEL_VERSION);
		
		labelPercent = new LabelPercent();
		labelPercent.setLocation(Constants.POINT_LABEL_FONT_MARIO.x, Constants.POINT_LABEL_FONT_MARIO.y);
		labelPercent.setSize(Constants.DIMENSION_LABEL_FONT_MARIO_PERCENT.width, Constants.DIMENSION_LABEL_FONT_MARIO_PERCENT.height);
		
		init();
	}
	
	public void init() {
		this.setPreferredSize(new Dimension((int) (Constants.DIMENSION_WINDOW_DEFAULT.getWidth()/3), (int) (Constants.DIMENSION_WINDOW_DEFAULT.getHeight()/3)));
		this.setOpaque(false);
		this.add(namePlay);
		this.add(letterA);
		this.add(labelTextNamePlay);
		this.add(labelPercent);
		this.add(labelAvatar);
		this.add(labelVersion);
	}
	
	public LabelPercent getLabelTextNamePlay() {
		return labelTextNamePlay;
	}
	
	public LabelPercent getLabelLetterA() {
		return letterA;
	}
	
	public LabelPercent getLabelNamePlay() {
		return namePlay;
	}
	
	public LabelAvatar getLabelAvatar() {
		return labelAvatar;
	}

	public void upDatePercent(String text) {
		labelPercent.upDateText(text);
	}
}
