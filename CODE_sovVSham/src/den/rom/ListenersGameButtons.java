package den.rom;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;


public class ListenersGameButtons implements MouseListener{

	LogBattle list = new LogBattle();
	WindowMetods wm = new WindowMetods();
	Window w = new Window();
	CheckLuck cubiki = new CheckLuck();
	Game g = new Game();
	SetImages si = new SetImages();
	
	
//----------------------------------------------------------------------------------------	
	public void mouseClicked(MouseEvent e) {			
//		System.out.println("Клик кнопки завершен.");
	}
	public void mousePressed(MouseEvent e) {			
//		System.out.println("Ты нажал на кнопку.");
	}
	public void mouseReleased(MouseEvent e) {
//		System.out.println("Ты отпустил кнопку.");		
	}
	public void mouseEntered(MouseEvent e) {									
//		System.out.println("Ты зашёл на границы кнопки."); 				
	}
	public void mouseExited(MouseEvent e) {
//		System.out.println("Ты вышел с границы кнопки.");		
	}
//----------------------------------------------------------------------------------------	

	public class ListenerGameButton1 extends ListenersGameButtons implements MouseListener{
		
		public void mousePressed(MouseEvent e) {			
			LogBattle.logList.add(Window.b1.getLocation().x+Window.b1.getLocation().y+1);
			list.logStep();
		}
		
		public void mouseReleased(MouseEvent e) {			
			JButton currentButton = (JButton)e.getComponent();			
			if (currentButton.getText() == "") {
				if (Game.playerName == Game.HAMSTER) {
					currentButton.setText("X");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.HAMSTER);
					else g.setAgressor(Game.SOVA);
				}
				else if (Game.playerName == Game.SOVA) {
					currentButton.setText("O");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.SOVA);
					else g.setAgressor(Game.HAMSTER);
				}
			}
			g.checkForWinner();
			si.gameButtonFon1();
			Window.b1.removeMouseListener(Window.b1.getMouseListeners()[1]);						
		}
				
		public void mouseEntered(MouseEvent e) {									
			wm.infoChange(LogBattle.udarList.get(0)); 				
		}
	}
	
	public class ListenerGameButton2 extends ListenersGameButtons implements MouseListener{
		
		public void mousePressed(MouseEvent e) {			
			LogBattle.logList.add(Window.b2.getLocation().x+Window.b2.getLocation().y+2);			
			list.logStep();
		}
		
		public void mouseReleased(MouseEvent e) {
			JButton currentButton = (JButton)e.getComponent();			
			if (currentButton.getText() == "") {
				if (Game.playerName == Game.HAMSTER) {
					currentButton.setText("X");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.HAMSTER);
					else g.setAgressor(Game.SOVA);
				}
				else if (Game.playerName == Game.SOVA) {
					currentButton.setText("O");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.SOVA);
					else g.setAgressor(Game.HAMSTER);
				}
			}
			g.checkForWinner();
			si.gameButtonFon2();
			Window.b2.removeMouseListener(Window.b2.getMouseListeners()[1]);		
		}
				
		public void mouseEntered(MouseEvent e) {									
			wm.infoChange(LogBattle.udarList.get(1)); 				
		}
	}
	
	public class ListenerGameButton3 extends ListenersGameButtons implements MouseListener{
				
		public void mousePressed(MouseEvent e) {			
			LogBattle.logList.add(Window.b3.getLocation().x+Window.b3.getLocation().y+3);
			list.logStep();
		}
		
		public void mouseReleased(MouseEvent e) {
			JButton currentButton = (JButton)e.getComponent();			
			if (currentButton.getText() == "") {
				if (Game.playerName == Game.HAMSTER) {
					currentButton.setText("X");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.HAMSTER);
					else g.setAgressor(Game.SOVA);
				}
				else if (Game.playerName == Game.SOVA) {
					currentButton.setText("O");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.SOVA);
					else g.setAgressor(Game.HAMSTER);
				}
			}
			g.checkForWinner();	
			si.gameButtonFon3();
			Window.b3.removeMouseListener(Window.b3.getMouseListeners()[1]);					
		}
				
		public void mouseEntered(MouseEvent e) {									
			wm.infoChange(LogBattle.udarList.get(2)); 				
		}
	}
	
	public class ListenerGameButton4 extends ListenersGameButtons implements MouseListener{
		
		public void mousePressed(MouseEvent e) {			
			LogBattle.logList.add(Window.b4.getLocation().x+Window.b4.getLocation().y+4);
			list.logStep();
		}
		
		public void mouseReleased(MouseEvent e) {
			JButton currentButton = (JButton)e.getComponent();			
			if (currentButton.getText() == "") {
				if (Game.playerName == Game.HAMSTER) {
					currentButton.setText("X");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.HAMSTER);
					else g.setAgressor(Game.SOVA);
				}
				else if (Game.playerName == Game.SOVA) {
					currentButton.setText("O");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.SOVA);
					else g.setAgressor(Game.HAMSTER);
				}
			}
			g.checkForWinner();	
			si.gameButtonFon4();
			Window.b4.removeMouseListener(Window.b4.getMouseListeners()[1]);		
		}
				
		public void mouseEntered(MouseEvent e) {									
			wm.infoChange(LogBattle.udarList.get(3)); 				
		}
	}
	
	public class ListenerGameButton5 extends ListenersGameButtons implements MouseListener{
		
		public void mousePressed(MouseEvent e) {			
			LogBattle.logList.add(Window.b5.getLocation().x+Window.b5.getLocation().y+5);
			list.logStep();
		}
		
		public void mouseReleased(MouseEvent e) {
			JButton currentButton = (JButton)e.getComponent();			
			if (currentButton.getText() == "") {
				if (Game.playerName == Game.HAMSTER) {
					currentButton.setText("X");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.HAMSTER);
					else g.setAgressor(Game.SOVA);
				}
				else if (Game.playerName == Game.SOVA) {
					currentButton.setText("O");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.SOVA);
					else g.setAgressor(Game.HAMSTER);
				}
			}
			g.checkForWinner();	
			si.gameButtonFon5();
			Window.b5.removeMouseListener(Window.b5.getMouseListeners()[1]);					
		}
				
		public void mouseEntered(MouseEvent e) {									
			wm.infoChange(LogBattle.udarList.get(4)); 				
		}
	}
	
	public class ListenerGameButton6 extends ListenersGameButtons implements MouseListener{
		
		public void mousePressed(MouseEvent e) {			
			LogBattle.logList.add(Window.b6.getLocation().x+Window.b6.getLocation().y+6);
			list.logStep();
		}
		
		public void mouseReleased(MouseEvent e) {
			JButton currentButton = (JButton)e.getComponent();			
			if (currentButton.getText() == "") {
				if (Game.playerName == Game.HAMSTER) {
					currentButton.setText("X");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.HAMSTER);
					else g.setAgressor(Game.SOVA);
				}
				else if (Game.playerName == Game.SOVA) {
					currentButton.setText("O");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.SOVA);
					else g.setAgressor(Game.HAMSTER);
				}
			}
			g.checkForWinner();	
			si.gameButtonFon6();
			Window.b6.removeMouseListener(Window.b6.getMouseListeners()[1]);					
		}
				
		public void mouseEntered(MouseEvent e) {									
			wm.infoChange(LogBattle.udarList.get(5)); 				
		}
	}
	
	public class ListenerGameButton7 extends ListenersGameButtons implements MouseListener{
		
		public void mousePressed(MouseEvent e) {			
			LogBattle.logList.add(Window.b7.getLocation().x+Window.b7.getLocation().y+7);
			list.logStep();
		}
		
		public void mouseReleased(MouseEvent e) {
			JButton currentButton = (JButton)e.getComponent();			
			if (currentButton.getText() == "") {
				if (Game.playerName == Game.HAMSTER) {
					currentButton.setText("X");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.HAMSTER);
					else g.setAgressor(Game.SOVA);
				}
				else if (Game.playerName == Game.SOVA) {
					currentButton.setText("O");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.SOVA);
					else g.setAgressor(Game.HAMSTER);
				}
			}
			g.checkForWinner();
			si.gameButtonFon7();
			Window.b7.removeMouseListener(Window.b7.getMouseListeners()[1]);		
		}
				
		public void mouseEntered(MouseEvent e) {									
			wm.infoChange(LogBattle.udarList.get(6)); 				
		}
	}
	
	public class ListenerGameButton8 extends ListenersGameButtons implements MouseListener{
		
		public void mousePressed(MouseEvent e) {			
			LogBattle.logList.add(Window.b8.getLocation().x+Window.b8.getLocation().y+8);
			list.logStep();
		}
		
		public void mouseReleased(MouseEvent e) {
			JButton currentButton = (JButton)e.getComponent();			
			if (currentButton.getText() == "") {
				if (Game.playerName == Game.HAMSTER) {
					currentButton.setText("X");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.HAMSTER);
					else g.setAgressor(Game.SOVA);
				}
				else if (Game.playerName == Game.SOVA) {
					currentButton.setText("O");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.SOVA);
					else g.setAgressor(Game.HAMSTER);
				}
			}
			g.checkForWinner();
			si.gameButtonFon8();
			Window.b8.removeMouseListener(Window.b8.getMouseListeners()[1]);					
		}
				
		public void mouseEntered(MouseEvent e) {									
			wm.infoChange(LogBattle.udarList.get(7)); 				
		}
	}
	
	public class ListenerGameButton9 extends ListenersGameButtons implements MouseListener{
		
		public void mousePressed(MouseEvent e) {			
			LogBattle.logList.add(Window.b9.getLocation().x+Window.b9.getLocation().y+9);
			list.logStep();
		}
		
		public void mouseReleased(MouseEvent e) {
			JButton currentButton = (JButton)e.getComponent();			
			if (currentButton.getText() == "") {
				if (Game.playerName == Game.HAMSTER) {
					currentButton.setText("X");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.HAMSTER);
					else g.setAgressor(Game.SOVA);
				}
				else if (Game.playerName == Game.SOVA) {
					currentButton.setText("O");
					if(g.findThreeInARow() || g.findDrawnGame()) g.setAgressor(Game.SOVA);
					else g.setAgressor(Game.HAMSTER);
				}
			}
			g.checkForWinner();
			si.gameButtonFon9();
			Window.b9.removeMouseListener(Window.b9.getMouseListeners()[1]);					
		}
				
		public void mouseEntered(MouseEvent e) {									
			wm.infoChange(LogBattle.udarList.get(8)); 				
		}
	}			
}


