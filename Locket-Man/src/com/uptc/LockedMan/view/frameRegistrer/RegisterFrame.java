package com.uptc.LockedMan.view.frameRegistrer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import com.uptc.LockedMan.constants.Constants;
import com.uptc.LockedMan.sound.Sounds;
import com.uptc.LockedMan.view.splash.PanelImage;

public class RegisterFrame extends JFrame{
	
	private Sounds sound;
	
	private PanelImage panelImage;
	private PanelContainer panelContainer;

	public RegisterFrame() {
		this.setUndecorated(true);
		this.setSize((int) Constants.DIMENSION_WINDOW_DEFAULT.getWidth()/3, (int) Constants.DIMENSION_WINDOW_DEFAULT.getHeight()/3);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		init();
		this.setVisible(true);
		initPrincipalSound();
		setMasterVolumen();
	}

	private void init() {
		//container de botones generales
		this.panelContainer = new PanelContainer(this.getSize(), Constants.POINT_CERO);
		this.setContentPane(panelContainer);
	}
	
	public void setMasterVolumen() {
		panelContainer.getPanelOptions().getVolume().addChangeListener(new EventChangeState(sound, panelContainer.getPanelOptions().getVolume()));
	}
	
	public void initPrincipalSound() {
		sound = new Sounds();
		try {
			sound.loopSound(Constants.SOUND_REGIST, 300);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
