package com.uptc.LockedMan.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import com.uptc.LockedMan.constants.Constants;

public class TestAvatar extends JFrame{

		/**
		 * 
		 */
		private static final long serialVersionUID = 8258063661712919317L;
		
		labelMove label;
		
		/*
		 * Constructor que permite inicializar un frame con caracteristicas base
		 */
		public TestAvatar() {
			super();
			init();
		}
		
		

		/**
		 * 
		 */
		private void init() {
			this.setSize(Constants.SCREEN_FRAME);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setResizable(false);
			label = new labelMove();
			label.initMove(this.getGraphics());
		}
	}
