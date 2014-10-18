import java.awt.Color;

import javax.swing.JButton;


public class ButtonFade implements Runnable{

	JButton copy;
	public ButtonFade(JButton keyBut) {
		copy = keyBut;
	}

	@Override
	public void run() {
		copy.setBackground(new Color(128, 255, 128));
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		copy.setBackground(new Color(140, 255, 140));
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		copy.setBackground(new Color(152, 255, 152));
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		copy.setBackground(new Color(164, 255, 164));
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		copy.setBackground(new Color(176, 255, 176));
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		copy.setBackground(new Color(188, 255, 188));
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		copy.setBackground(new Color(200, 255, 200));
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		copy.setBackground(new Color(212, 255, 212));
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		copy.setBackground(new Color(224, 255, 224));
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		copy.setBackground(new Color(236, 255, 236));
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		copy.setBackground(new Color(255, 255, 255));
		copy = null;
		return;
		
	}

}
