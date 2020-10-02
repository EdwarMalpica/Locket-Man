package com.uptc.LockedMan.view.frameRegistrer;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.uptc.LockedMan.sound.Sounds;

public class EventChangeState implements ChangeListener{
	
	private Sounds sound;
	private JSlider slider;

	/**
	 * evento creado para controlar la intensidad del sonido
	 * @param sound sonido a controlar
	 * @param slider slider que maneja la cantidad de sonido
	 */
	public EventChangeState(Sounds sound, JSlider slider) {
		super();
		this.sound = sound;
		this.slider = slider;
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		int controlVolume = 10 - (slider.getValue());
		sound.setVolumeSoundLoop((float) -(controlVolume + 5));
	}

}
