package controllers;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import viewsGameMenus.JButtonOption;
import viewsGameMenus.JPanelMenu; 

public class ControllerJButtonOptions implements MouseListener{
	
	private ArrayList<JButtonOption> jButtonOptionList;
	private JButtonOption jButtonOption;
	private static ControllerJButtonOptions myControllerJButtonOptions = null;

	public ControllerJButtonOptions() {
		super(); 
		jButtonOptionList = new ArrayList<JButtonOption>();
	}
	
	public void addButtonToArray(JButtonOption jButtonOption) {
		this.jButtonOption = jButtonOption;
		this.jButtonOptionList.add(jButtonOption);	 
		
	}
	
	public  static ControllerJButtonOptions getControllerJButtonOptions () {
		 if (myControllerJButtonOptions ==null) {		 
			 myControllerJButtonOptions = new  ControllerJButtonOptions();
		 }
		 return myControllerJButtonOptions;
		 }

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getButton());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		efectHover(1f, 0.2f, 0.6f, 10, false);
			
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
			efectHover(0.5f, 1f, 0.03f, 10, true);
		
		
	}
	

	@Override
	public void mouseExited(MouseEvent e) {
			efectHover(1f, 0.5f, 0.03f, 10, false);
		
		
	}
	
	private void efectHover(float index, float range, float cont, int sleep, boolean event) {
		new Thread(() -> {
			for (float i = index; (event) ? i <= range : i >= range; i = (event) ? i + cont : i - cont) {
				jButtonOption.setOpacity(i);
				try {
					Thread.sleep(sleep);
				} catch (InterruptedException e) {
				}

			}
		}).start();
	}
	
	private void exitFuction() {
		
	}

}
