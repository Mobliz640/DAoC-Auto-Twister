import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class CloseOptionPane {
	
	public CloseOptionPane()
	{
		createAndShowGui();
	}

   @SuppressWarnings("serial")
   private static void createAndShowGui() {
	   final JPanel panel = new JPanel();
      final JLabel label = new JLabel();
      panel.add(label);
      int timerDelay = 1000;
      new Timer(timerDelay , new ActionListener() {
         int timeLeft = 3;

         @Override
         public void actionPerformed(ActionEvent e) {
            if (timeLeft > 0) {
               label.setText("<html>Please enter one of the following: <br/>1-10, <br/>(Ctrl)1-10, <br/>(Alt)1-10</html>");
               timeLeft--;
            } else {
               ((Timer)e.getSource()).stop();
               Window win = SwingUtilities.getWindowAncestor(label);
               if(win != null)
               {
            	   win.setVisible(false);
               }
            }
         }
      }){{setInitialDelay(0);}}.start();

      JOptionPane.showMessageDialog(null, panel, "Invalid Entry", JOptionPane.WARNING_MESSAGE);
      

   }
}