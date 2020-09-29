package com.uptc.LockedMan.view.frameRegistrer;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.uptc.LockedMan.constants.Constants;
import com.uptc.LockedMan.view.splash.AnimatedLabels;

public class EventConfig implements ActionListener{
	
	private Component panel;
	private JFrame frame;
	private String move;
	private String direction;
	
	private int init;
	private int end;
	
	public EventConfig(JFrame frame, Component panel, String move, String direcction, int init, int end) {
		this.frame = frame;
		this.panel = panel;
		this.move = move;
		this.direction = direcction;
		this.init = init;
		this.end = end;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		AnimatedLabels anim = new AnimatedLabels(panel, move, direction, init, end, 3);
		anim.startAnimation();
	}

}
