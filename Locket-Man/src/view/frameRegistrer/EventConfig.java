package view.frameRegistrer;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import constants.Constants;
import sound.Sounds;
import view.splash.AnimatedLabels;

public class EventConfig implements ActionListener{
	
	private Component panel;
	private PanelContainer frame;
	private String move;
	private String direction;
	private boolean open;
	
	private Sounds sound;
	
	private int init;
	private int end;
	
	public EventConfig(Component panel, String move, String direcction, int init, int end, boolean open) {
		this.frame = frame;
		this.panel = panel;
		this.move = move;
		this.direction = direcction;
		this.init = init;
		this.end = end;
		this.open = open;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		playSoundEffect();
		AnimatedLabels anim = new AnimatedLabels(panel, move, direction, init, end, 3);
		anim.startAnimation();
	}
	
	/**
	 * reproduce un efecto de click al presionar el boton
	 */
	public void playSoundEffect() {
		sound = new Sounds();
		sound.playSound(Constants.CLICK_SOUND, 1);
	}

}
