package tests;
import java.awt.Color;

import backgroundGame.ConstanBackground;
import backgroundGame.JFrameBackGround;

public class TestJFrameBackground {

	public TestJFrameBackground() {
		
	}
	public static void main(String[] args) throws InterruptedException {
		JFrameBackGround jFrameBackGroundLevel1 = new JFrameBackGround(ConstanBackground.PATH_BACKGROUND_LEVEL2_IMAGE);
		jFrameBackGroundLevel1.getjPanelBackground().getjLabelTimer().setForeground(Color.white);
		
	}

}
