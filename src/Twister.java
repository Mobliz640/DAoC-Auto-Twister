import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Twister implements Runnable {
	
	boolean stop = false;
	boolean[] altMod = new boolean[10];
	boolean[] ctrlMod = new boolean[10];
	int[] keyNumber = new int[10];
	Gui gui;
	Thread t;
	
	public Twister(String[]chosenKeys, Gui copy)
	{
		gui = copy;
		
		for(int x=0; x<10; x++)
		{
			if(chosenKeys[x].compareTo("") == 0)
			{
				//empty entry
				altMod[x] = false;
				ctrlMod[x] = false;
				keyNumber[x] = -1;
			}
			else if(chosenKeys[x].substring(0,1).compareTo("A") == 0)
			{
				altMod[x] = true;
				ctrlMod[x] = false;
				keyNumber[x] = Integer.parseInt(chosenKeys[x].substring(4));
			}
			else if(chosenKeys[x].substring(0,1).compareTo("C") == 0)
			{
				ctrlMod[x] = true;
				altMod[x] = false;
				keyNumber[x] = Integer.parseInt(chosenKeys[x].substring(5));
			}
			else
			{
				keyNumber[x] = Integer.parseInt(chosenKeys[x]);
				altMod[x] = false;
				ctrlMod[x] = false;
			}			
		}
	}

	public void run() {
		try {
			Robot robot1 = new Robot();
			while(!stop)
			{
				if(gui.key1But.getText() != "")
				{
					t = new Thread(new ButtonFade(gui.key1But));
		    		t.start();
		    		t = null;
				}
				if(gui.key2But.getText() != "")
				{
					t = new Thread(new ButtonFade(gui.key2But));
		    		t.start();
		    		t = null;
				}
				if(gui.key3But.getText() != "")
				{
					t = new Thread(new ButtonFade(gui.key3But));
		    		t.start();
		    		t = null;
				}
				if(gui.key4But.getText() != "")
				{
					t = new Thread(new ButtonFade(gui.key4But));
		    		t.start();
		    		t = null;
				}
				if(gui.key5But.getText() != "")
				{
					t = new Thread(new ButtonFade(gui.key5But));
		    		t.start();
		    		t = null;
				}
				if(gui.key6But.getText() != "")
				{
					t = new Thread(new ButtonFade(gui.key6But));
		    		t.start();
				}
				if(gui.key7But.getText() != "")
				{
					t = new Thread(new ButtonFade(gui.key7But));
		    		t.start();
		    		t = null;
				}
				if(gui.key8But.getText() != "")
				{
					t = new Thread(new ButtonFade(gui.key8But));
		    		t.start();
		    		t = null;
				}
				if(gui.key9But.getText() != "")
				{
					t = new Thread(new ButtonFade(gui.key9But));
		    		t.start();
		    		t = null;
				}
				if(gui.key10But.getText() != "")
				{
					t = new Thread(new ButtonFade(gui.key10But));
		    		t.start();
		    		t = null;
				}
				for(int x=0; x<10; x++)
				{
					if(keyNumber[x] == -1)
					{
						//skip that key
					}
					else
					{
						if(ctrlMod[x])
						{
							robot1.keyPress(KeyEvent.VK_CONTROL);
							robot1.delay(10);
						}
						else if(altMod[x])
						{
							
							robot1.keyPress(KeyEvent.VK_ALT);
							robot1.delay(10);
							
						}
						if(keyNumber[x] == 1)
						{
			        		
							robot1.keyPress(KeyEvent.VK_1);
											
							robot1.keyRelease(KeyEvent.VK_1);
							robot1.delay(10);
							
						}
						else if(keyNumber[x] == 2)
						{
						

							robot1.keyPress(KeyEvent.VK_2);
							
							robot1.keyRelease(KeyEvent.VK_2);
							robot1.delay(10);
						}
						else if(keyNumber[x] == 3)
						{
							
			        		
							robot1.keyPress(KeyEvent.VK_3);
							
							robot1.keyRelease(KeyEvent.VK_3);
							robot1.delay(10);
						}
						else if(keyNumber[x] == 4)
						{
							
							
							robot1.keyPress(KeyEvent.VK_4);
							
							robot1.keyRelease(KeyEvent.VK_4);
							robot1.delay(10);
						}
						else if(keyNumber[x] == 5)
						{
						
							
							robot1.keyPress(KeyEvent.VK_5);
							
							robot1.keyRelease(KeyEvent.VK_5);
							robot1.delay(10);
						}
						else if(keyNumber[x] == 6)
						{
							
							
							robot1.keyPress(KeyEvent.VK_6);
							
							robot1.keyRelease(KeyEvent.VK_6);
							robot1.delay(10);
						}
						else if(keyNumber[x] == 7)
						{
							
							
							robot1.keyPress(KeyEvent.VK_7);
							
							robot1.keyRelease(KeyEvent.VK_7);
							robot1.delay(10);
						}
						else if(keyNumber[x] == 8)
						{
							
							
							robot1.keyPress(KeyEvent.VK_8);
							
							robot1.keyRelease(KeyEvent.VK_8);
							robot1.delay(10);
						}
						
						else if(keyNumber[x] == 9)
						{
							
			        		
							robot1.keyPress(KeyEvent.VK_9);
							if(ctrlMod[x])
							
							robot1.keyRelease(KeyEvent.VK_9);
							robot1.delay(10);
						}
						else
						{
							
			        		
							robot1.keyPress(KeyEvent.VK_0);
							
							robot1.keyRelease(KeyEvent.VK_0);
							
							robot1.delay(10);
						}
						if(ctrlMod[x])
						{
							robot1.keyRelease(KeyEvent.VK_CONTROL);
						}
						else if(altMod[x])
						{
							
							robot1.keyRelease(KeyEvent.VK_ALT);			
						}		
					}		
				}
				
			
				robot1.delay(8500);
				
				
			}
			return;
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void stop()
	{
		stop = true;
	}
}
