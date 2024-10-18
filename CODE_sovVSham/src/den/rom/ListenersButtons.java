package den.rom;


import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;



public class ListenersButtons implements MouseListener{
	
	Window w = new Window();
	WindowMetods wm = new WindowMetods();
	CheckLuck cubiki = new CheckLuck();
	Game g = new Game();
	LogBattle udar = new LogBattle();
	PvE pve = new PvE();
	SetImages si = new SetImages();
	PotokMusic pm = new PotokMusic();
	
	
	
//------------------------------------------------------------------------------------	
	public void mouseClicked(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
//-------------------------------------------------------------------------------------	
	public class ListenerButtonGoLot extends ListenersButtons implements MouseListener{
		
		public void mousePressed(MouseEvent e) {
			
			g.checkMode();			
			
			if(Game.mode==0) {wm.coreChange(Window.panelCont, "2");}
			else {wm.coreChange(Window.panelCont, "dialog");}									
			
			wm.barNiz();
						
			if(PotokMusic.playing == true) {System.out.println("Что-то уже звучит");}
			else {pm.setMusic();}
			
			PotokWriters wr = new PotokWriters();
			PotokWriters.WriterSov wrs = wr.new WriterSov();
			PotokWriters.WriterHam wrh = wr.new WriterHam();									
			wrs.start();
			wrh.start();
			
			
//			System.out.println(Window.sovPic.getBackground());
			
			}		
		public void mouseEntered(MouseEvent e) {
			wm.infoChange("Чей удар будет первым?");
			wm.buttonChoice (Window.goLot);
		}
		public void mouseExited(MouseEvent e) {
			wm.buttonReChoice (Window.goLot);
		}				
	}
	
	public class ListenerButtonStartLot extends ListenersButtons implements MouseListener{
		
		public void mousePressed(MouseEvent e) {

//----------------    lotHam1	------	lotRezHam
			if(Window.lotRezHam.getText() == "" || CheckLuck.proverDrawCub == true) {			
				cubiki.brosokPvP();
				wm.rezBrosCubChange(cubiki.rezHam, cubiki.rezSov, CheckLuck.lotWinner);

				si.brosokCubFon(cubiki.cubS1, cubiki.cubS2, cubiki.cubH1, cubiki.cubH2);
				
			} else {Window.info.setText("Хватит тыкать, жребий уже брошен!");}													
		}
		public void mouseEntered(MouseEvent e) {
			wm.infoChange("Вознеси мольбы великому Рандому!"); 						
			wm.buttonChoice (Window.lotButton);
		}
		public void mouseExited(MouseEvent e) {
			wm.buttonReChoice (Window.lotButton);
		}				
	}
		
	public class ListenerButtonStartGame extends ListenersButtons implements MouseListener{
		
		public void mouseReleased(MouseEvent e) {			
			
			if(Window.lotRezHam.getText() == "" || CheckLuck.proverDrawCub == true) {
				Window.info.setText("Жребий ещё не брошен!");		
			} 	
			 else { wm.coreChange(Window.panelCont, "3");
			 		g.lotWin(CheckLuck.lotWinner);
			 }		
		}
		public void mouseEntered(MouseEvent e) {
			wm.infoChange("Испытай своё величие!");  							
			wm.buttonChoice (Window.startGame);
		}
		public void mouseExited(MouseEvent e) {
			wm.buttonReChoice (Window.startGame);
		}				
	}	
			
	public class ListenerButtonRestart extends ListenersButtons implements MouseListener{
		
		public void mouseClicked(MouseEvent e) {
			if((g.findThreeInARow() && PotokHP.stopFatality == false) || g.findDrawnGame())  {
				wm.setupNewWindow();								
				wm.coreChange(Window.panelCont, "1");
			} else if(CheckLuck.lotWinner == null) {//Window.restart.enableInputMethods(false);
			} else {Window.info.setText("Закончи бой, тряпка!");}
												
		}
		public void mouseEntered(MouseEvent e) {
			
			if(g.findThreeInARow() || g.findDrawnGame()) {
				wm.infoChange("Зализать раны и начать всё с начала!");
			} else if(CheckLuck.lotWinner == null) {Window.info.setText("Рано! Боец полностью готов к испытанию.");
			} else {Window.info.setText("Закончи бой, тряпка!");}
			
			Window.restart.setFont(Window.restart.getFont().deriveFont(30f));
		}
		public void mouseExited(MouseEvent e) {
			Window.restart.setFont(Window.restart.getFont().deriveFont(36f));
		}
	}
	
	public class ListenerButtonExit extends ListenersButtons implements MouseListener{
		
		public void mouseReleased(MouseEvent exit) {			
			System.exit(0);			
		}
		public void mouseEntered(MouseEvent exit) {
			wm.infoChange("Бежать, поджав хвост!");	  				
			Window.exitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		}
		public void mouseExited(MouseEvent e) {
			Window.exitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		}
	}	
	
	public class ListenerButtonZvukOff extends ListenersButtons implements MouseListener{
		
		public void mouseReleased(MouseEvent exit) {			
		
		if(PotokMusic.playing == true) {
			pm.stopMusic();
			Window.muzCheckBoxNo.setSelected(true);			
		}		
				
	}
		public void mouseEntered(MouseEvent exit) {
			wm.infoChange("Выключить музыку!");	
			Window.zvukOff.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		}
		public void mouseExited(MouseEvent e) {
			Window.zvukOff.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		}
	}

	public class ListenerButtonIamHam extends ListenersButtons implements MouseListener{
		
		public void mouseReleased(MouseEvent e) {			
			Game.livePlayer = "Хомяк";
			Window.lotButton.setText("Брось кости, " + Game.livePlayer);
			wm.coreChange(Window.panelCont, "2");									
			PotokWriters.stopWrite = true;						
		}		
		public void mouseEntered(MouseEvent exit) {
			wm.infoChange("Биться за Хомяка!");				
			wm.buttonChoice (Window.buttonHam);
		}
		public void mouseExited(MouseEvent e) {
			wm.buttonReChoice (Window.buttonHam);
		}
	}
	
	public class ListenerButtonIamSov extends ListenersButtons implements MouseListener{
		
		public void mouseReleased(MouseEvent e) {			
			Game.livePlayer = "Сова";
			Window.lotButton.setText("Брось кости, " + Game.livePlayer);
			wm.coreChange(Window.panelCont, "2");
			PotokWriters.stopWrite = true;			
		}		
		public void mouseEntered(MouseEvent exit) {
			wm.infoChange("Биться за Сову!");	  				
			wm.buttonChoice (Window.buttonSov);
		}
		public void mouseExited(MouseEvent e) {
			wm.buttonReChoice (Window.buttonSov);
		}
	}

	
}
	
	
	
	
	


