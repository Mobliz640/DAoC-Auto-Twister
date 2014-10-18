import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Gui implements KeyListener{
	
	JButton key1But, key2But, key3But, key4But, key5But,
	key6But, key7But, key8But, key9But, key10But, startBut;
	JFrame guiFrame;
	Thread t;
	Twister robot1;
	
	public Gui(int width, int height)
	{
		final Gui self = this;
		guiFrame = new JFrame();
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    guiFrame.setTitle("DAoC Autotwister");
	    guiFrame.setSize(width, height);
	    guiFrame.setResizable(false);
	    guiFrame.setLocationRelativeTo(null);
	    
	    JPanel mainPanel = new JPanel();
	    mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10) );
	    mainPanel.setBackground(Color.WHITE);
	    JLabel comboLbl = new JLabel("<html>-------------------------------------------------------------------------------------------------<br/>Assign Chants #1-10 to match your visible hotbar in-game.<br/>(Use 'Alt+number' for hotbar #2 and 'Ctrl+number' for hotbar #3)<br/> Twist up to 10 chants at once, but don't get banned!!<br/>-------------------------------------------------------------------------------------------------</html>", JLabel.CENTER);
	    
	    GridLayout grid = new GridLayout(0,4,5,10);
	    grid.setHgap(10);
	    
	    mainPanel.setLayout(grid);
	    
	    JLabel key1Lbl = new JLabel("Chant #1:", JLabel.CENTER);
	    JLabel key2Lbl = new JLabel("Chant #2:", JLabel.CENTER);
	    JLabel key3Lbl = new JLabel("Chant #3:", JLabel.CENTER);
	    JLabel key4Lbl = new JLabel("Chant #4:", JLabel.CENTER);
	    JLabel key5Lbl = new JLabel("Chant #5:", JLabel.CENTER);
	    JLabel key6Lbl = new JLabel("Chant #6:", JLabel.CENTER);
	    JLabel key7Lbl = new JLabel("Chant #7:", JLabel.CENTER);
	    JLabel key8Lbl = new JLabel("Chant #8:", JLabel.CENTER);
	    JLabel key9Lbl = new JLabel("Chant #9:", JLabel.CENTER);
	    JLabel key10Lbl = new JLabel("Chant #10:", JLabel.CENTER);
	    
	    key1But = new JButton("Alt-1");
	    key1But.addKeyListener(this);
	    key2But = new JButton("Alt-2");
	    key2But.addKeyListener(this);
	    key3But = new JButton("Alt-3");
	    key3But.addKeyListener(this);
	    key4But = new JButton("");
	    key4But.addKeyListener(this);
	    key5But = new JButton("");
	    key5But.addKeyListener(this);
	    key6But = new JButton("");
	    key6But.addKeyListener(this);
	    key7But = new JButton("");
	    key7But.addKeyListener(this);
	    key8But = new JButton("");
	    key8But.addKeyListener(this);
	    key9But = new JButton("");
	    key9But.addKeyListener(this);
	    key10But = new JButton("");
	    key10But.addKeyListener(this);
	    
	    key1But.setBackground(Color.WHITE);
	    key2But.setBackground(Color.WHITE);
	    key3But.setBackground(Color.WHITE);
	    key4But.setBackground(Color.WHITE);
	    key5But.setBackground(Color.WHITE);
	    key6But.setBackground(Color.WHITE);
	    key7But.setBackground(Color.WHITE);
	    key8But.setBackground(Color.WHITE);
	    key9But.setBackground(Color.WHITE);
	    key10But.setBackground(Color.WHITE);
	    
	    mainPanel.add(key1Lbl);
	    mainPanel.add(key1But);
	    mainPanel.add(key2Lbl);
	    mainPanel.add(key2But);
	    mainPanel.add(key3Lbl);
	    mainPanel.add(key3But);
	    mainPanel.add(key4Lbl);
	    mainPanel.add(key4But);
	    mainPanel.add(key5Lbl);
	    mainPanel.add(key5But);
	    mainPanel.add(key6Lbl);
	    mainPanel.add(key6But);
	    mainPanel.add(key7Lbl);
	    mainPanel.add(key7But);
	    mainPanel.add(key8Lbl);
	    mainPanel.add(key8But);
	    mainPanel.add(key9Lbl);
	    mainPanel.add(key9But);
	    mainPanel.add(key10Lbl);
	    mainPanel.add(key10But);
	    
	    startBut = new JButton( "Start twisting!");
	    startBut.setBackground(Color.GREEN);
	    
	    guiFrame.add(comboLbl, BorderLayout.NORTH);
	    guiFrame.add(mainPanel);
	    guiFrame.add(startBut, BorderLayout.SOUTH);
	    guiFrame.setVisible(true);
	    guiFrame.requestFocusInWindow();
	    
	    key1But.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent event)
	        {
	        	keySelected(event);
	        }
	    });
	    key2But.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent event)
	        {
	        	keySelected(event);
	        }
	    });
	    key3But.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent event)
	        {
	        	keySelected(event);
	        }
	    });
	    key4But.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent event)
	        {
	        	keySelected(event);
	        }
	    });
	    key5But.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent event)
	        {
	        	keySelected(event);
	        }
	    });
	    key6But.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent event)
	        {
	        	keySelected(event);
	        }
	    });
	    key7But.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent event)
	        {
	        	keySelected(event);
	        }
	    });
	    key8But.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent event)
	        {
	        	keySelected(event);
	        }
	    });
	    key9But.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent event)
	        {
	        	keySelected(event);
	        }
	    });
	    key10But.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent event)
	        {
	        	keySelected(event);
	        }
	    });
	   
	    //action when user clicks start/stop button
	    startBut.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent event)
	        {
	        	if(startBut.getBackground() == Color.GREEN)
	        	{
	        		startBut.setText("STOP TWISTING!");
	        		key1But.setEnabled(false);
	        		key2But.setEnabled(false);
	        		key3But.setEnabled(false);
	        		key4But.setEnabled(false);
	        		key5But.setEnabled(false);
	        		key6But.setEnabled(false);
	        		key7But.setEnabled(false);
	        		key8But.setEnabled(false);
	        		key9But.setEnabled(false);
	        		key10But.setEnabled(false);
	        		startBut.setBackground(Color.RED);
	        		String chosenKeys[] = new String[10];
	        		chosenKeys[0] = key1But.getText();
	        		chosenKeys[1] = key2But.getText();
	        		chosenKeys[2] = key3But.getText();
	        		chosenKeys[3] = key4But.getText();
	        		chosenKeys[4] = key5But.getText();
	        		chosenKeys[5] = key6But.getText();
	        		chosenKeys[6] = key7But.getText();
	        		chosenKeys[7] = key8But.getText();
	        		chosenKeys[8] = key9But.getText();
	        		chosenKeys[9] = key10But.getText();
	        		
	        		robot1 = new Twister(chosenKeys, self);
	        		t = new Thread(robot1);
	        		t.start();
	        	}
	        	else
	        	{
	        		robot1.stop();
	        		key1But.setEnabled(true);
	        		key2But.setEnabled(true);
	        		key3But.setEnabled(true);
	        		key4But.setEnabled(true);
	        		key5But.setEnabled(true);
	        		key6But.setEnabled(true);
	        		key7But.setEnabled(true);
	        		key8But.setEnabled(true);
	        		key9But.setEnabled(true);
	        		key10But.setEnabled(true);
	        		startBut.setText("Start twisting!");
	        		startBut.setBackground(Color.GREEN);
	        	}
	           guiFrame.requestFocusInWindow();
	        }
	    });
	}
	
	//action when user clicks on a key box
	public void keySelected(ActionEvent event)
	{
		if(guiFrame.getFocusOwner().getBackground() == Color.WHITE)
    	{
    		guiFrame.getFocusOwner().setBackground(Color.LIGHT_GRAY);
    		key1But.setEnabled(false);
    		key2But.setEnabled(false);
    		key3But.setEnabled(false);
    		key4But.setEnabled(false);
    		key5But.setEnabled(false);
    		key6But.setEnabled(false);
    		key7But.setEnabled(false);
    		key8But.setEnabled(false);
    		key9But.setEnabled(false);
    		key10But.setEnabled(false);
    		startBut.setEnabled(false);
    		guiFrame.getFocusOwner().setEnabled(true);
    	}
    	else
    	{
    		guiFrame.getFocusOwner().setBackground(Color.WHITE);
    		key1But.setEnabled(true);
    		key2But.setEnabled(true);
    		key3But.setEnabled(true);
    		key4But.setEnabled(true);
    		key5But.setEnabled(true);
    		key6But.setEnabled(true);
    		key7But.setEnabled(true);
    		key8But.setEnabled(true);
    		key9But.setEnabled(true);
    		key10But.setEnabled(true);
    		startBut.setEnabled(true);
    		guiFrame.requestFocusInWindow();
    	}
	}

	//action when user types with a key selected
	public void keyPressed(KeyEvent arg0) {
		
		if(arg0.getExtendedKeyCode() >= KeyEvent.VK_0 && arg0.getExtendedKeyCode() <= KeyEvent.VK_9 || 
				arg0.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || 
				arg0.getExtendedKeyCode() >= KeyEvent.VK_NUMPAD0 && arg0.getExtendedKeyCode() <= KeyEvent.VK_NUMPAD9)
		{
			setKey(arg0);
		}
		else if(arg0.getExtendedKeyCode() == KeyEvent.VK_ESCAPE || arg0.getExtendedKeyCode() == KeyEvent.VK_ENTER)
		{
			guiFrame.getFocusOwner().setBackground(Color.WHITE);
			key1But.setEnabled(true);
    		key2But.setEnabled(true);
    		key3But.setEnabled(true);
    		key4But.setEnabled(true);
    		key5But.setEnabled(true);
    		key6But.setEnabled(true);
    		key7But.setEnabled(true);
    		key8But.setEnabled(true);
    		key9But.setEnabled(true);
    		key10But.setEnabled(true);
    		startBut.setEnabled(true);
    		guiFrame.requestFocusInWindow();
		}
		else if(arg0.getExtendedKeyCode() != KeyEvent.VK_CONTROL && arg0.getExtendedKeyCode() != KeyEvent.VK_ALT
				&& arg0.getExtendedKeyCode() != KeyEvent.VK_SPACE)
		{
			new CloseOptionPane();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}
	
	 private void setKey(KeyEvent e)
	 {
		 boolean ctrl = false;
		 boolean alt = false;
		 if(e.isControlDown())
		 {
			 ctrl = true;
		 }
		 else if(e.isAltDown())
		 {
			 alt = true;
		 }
		
		 int a = e.getKeyCode();
		 String key = KeyEvent.getKeyText(a);
		 if(key.substring(0,1).equals("N"))
		 {
			 key = key.substring(7,key.length());
		 }
		 String text = "";
		 if(ctrl)
		 {
			text = "Ctrl-";
		 }
		 else if (alt)
		 {
			text = "Alt-";
		 }
		 if(key.equals("0"))
		 {
			 text += "10";
		 }
		 else
		 {
			text += key;
		 }
		 if(e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE)
		 {
			 text = "";
		 }
			((AbstractButton) guiFrame.getFocusOwner()).setText(text);
			guiFrame.getFocusOwner().setBackground(Color.WHITE);
			key1But.setEnabled(true);
    		key2But.setEnabled(true);
    		key3But.setEnabled(true);
    		key4But.setEnabled(true);
    		key5But.setEnabled(true);
    		key6But.setEnabled(true);
    		key7But.setEnabled(true);
    		key8But.setEnabled(true);
    		key9But.setEnabled(true);
    		key10But.setEnabled(true);
    		startBut.setEnabled(true);
	
		guiFrame.requestFocusInWindow();
	 }
	 
	 public void colorLabel(int number)
	 {
		 
	 }
}
