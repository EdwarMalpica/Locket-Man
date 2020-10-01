package com.uptc.LockedMan.test;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.uptc.LockedMan.constants.Constants;
import com.uptc.LockedMan.view.splash.PanelImage;

public class frame extends JFrame{

		public frame() {
			this.setUndecorated(true);
			this.setSize(new Dimension(1080, 700));
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			PanelImage panel = new PanelImage(Constants.PATH_BACKGROUND_SPLASH, this.getSize());
			this.setContentPane(panel);
			panel.setBackground(Color.red);
			
			JPanel panel2 = new JPanel();
			panel2.setSize(this.getSize());
			JButton button = new JButton("bdgreagdf");
			button.setSize(100, 50);
			button.setLocation(10, 20);
			panel2.add(button);
			this.add(panel2);
		}
		
		public static void main(String[] args) {
			new frame();
		}
}

class panel extends JPanel{
	
	public panel(Dimension size) {
		this.setSize(size);
		this.setLocation(0, 0);
	}
}
