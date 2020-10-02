package models;

public class Timer {
	private int minutes,seconds,milseconds; 
	
	public Timer() {
		try {
			setTimerFuction();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void setTimerFuction() throws InterruptedException {	
		String minutesText = "";
		String secondsText = "";
		String time = "";
		while (minutes != 60) {
				++milseconds;
			if (milseconds == 60) {
				milseconds = 0;
				++seconds;
			}
			if (seconds == 60) {
				seconds = 0;
				++minutes;
			}
			Thread.sleep(10);
			
			if (minutes < 10) {
				minutesText = "0"+ minutes;
			}else {
				minutesText =""+minutes;
			}
			if (seconds < 10) {
				secondsText = "0"+seconds;
			} else {
				secondsText =""+ seconds;
			}
			time = minutesText+":"+secondsText;
		}
		
	}
	
	public static void main(String[] args) {
		new Timer();
	}

}
