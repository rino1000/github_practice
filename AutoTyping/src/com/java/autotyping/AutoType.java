package com.java.autotyping;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AutoType {
	public static void main(String[] args) {

		try {
			Runtime.getRuntime().exec("notepad.exe");
			Thread.sleep(2000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_T);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_H);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_I);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_I);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_F);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_U);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_N);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// extra comments added

	}
}
