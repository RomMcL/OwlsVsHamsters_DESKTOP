package den.rom;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.BorderFactory;
import javax.swing.JFrame;


public class WindowMove  {
 
	Window w = new Window();
	WindowMetods wm = new WindowMetods();
	
	private Point position;
 	
    public WindowMove(final JFrame parent) {
 
    	Window.moveButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                position = e.getPoint();
                Window.moveButton.getComponentAt(position);
            }
            public void mouseEntered(MouseEvent exit) {
    			wm.infoChange("Перенеси битву в другое место!");	  				
    			Window.moveButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
    		}
    		public void mouseExited(MouseEvent e) {
    			Window.moveButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
    		}   	
        });
 
    	Window.moveButton.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
 
                int thisX = parent.getLocation().x;
                int thisY = parent.getLocation().y;
 
                int xMoved = (thisX + e.getX()) - (thisX + position.x);
                int yMoved = (thisY + e.getY()) - (thisY + position.y);
 
                int X = thisX + xMoved;
                int Y = thisY + yMoved;
                parent.setLocation(X, Y);
            }
        });
    }
   
}
