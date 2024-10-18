package den.rom;


import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


 
 
public class ShowFatality extends JDialog{
	
	private static final long serialVersionUID = 1L;
	Window w = new Window();
	SetImages si = new SetImages();

	static JLabel label = new JLabel();
	
	
	

	
	public ShowFatality(JFrame owner,boolean modal) {
		
		super(owner, modal);
		add(label);
		label.setOpaque(false);
		setLocationRelativeTo(owner);

		label.setIcon(new ImageIcon(SetImages.fatality));
		
//		setBounds(w.lotButton.getLocationOnScreen().x, w.lotButton.getLocationOnScreen().y, 600, 323);  //  b1	
		setBounds(Window.b1.getLocationOnScreen().x, Window.b1.getLocationOnScreen().y + Window.b1.getHeight()/2, 
														SetImages.fatality.getWidth(), SetImages.fatality.getHeight());
		
		
// ---------------------------------------------------------------		
		Timer timer = new Timer(2000, new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            setVisible(false);
	            dispose();
	        }
	    });
	    timer.setRepeats(false);
	    timer.start();
//-------------------------------------------------------------------		
		
		
		setUndecorated(true);
		setBackground (new Color (0, 0, 0, 0));
		setVisible(true);	
	
//		System.out.println("проверка");		
		
	}

	static Runnable fatalShow = new Runnable() {
        public void run() {
        	new ShowFatality(Window.frame, true);
        }
    };
	
	
/*	
	public void paint (Graphics g) {
		g.drawImage(fatality1, 0, 0, 600, 323, null);
	}
*/	
	
	

}


