import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class getch {
    public static void getCh() {  
        final JFrame frame = new JFrame();  
        synchronized(frame) {  
	    frame.setUndecorated(true);  
	    frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);  
	    frame.addKeyListener(new KeyListener() {  
		    public void keyPressed(KeyEvent e){  
			synchronized(frame){  
			    frame.setVisible(false);  
			    frame.dispose();  
			    frame.notify();  
			}  
		    }  

		    public void keyReleased(KeyEvent e){
		    }  

		    public void keyTyped(KeyEvent e){
		    }  
		});
	    frame.setVisible(true);  
	    try {  
		frame.wait();  
	    }
	    catch(InterruptedException e1){  
	    }  
	}  
    }
}
