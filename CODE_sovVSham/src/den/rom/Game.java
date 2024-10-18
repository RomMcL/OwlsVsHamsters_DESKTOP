package den.rom;

import java.awt.Color;

import javax.swing.UIManager;

public class Game {
	
	PvE pve = new PvE();
	SetImages si = new SetImages();
	PotokHP hp = new PotokHP();
	PotokHP.PotokHPfatality hpFatality = hp.new PotokHPfatality();
	Window w = new Window();
		
	static int mode = 5;
	static int muzon = 5;
	
	static String playerName;
	static String firstPlayerName;
	static String HAMSTER = "Хомяк";
	static String SOVA = "Сова";
	static String winnerName;
	static String livePlayer;
	
	public static void main(String[] args) {		
		
		UIManager.put("ProgressBar.selectionBackground",Color.GRAY);        
        UIManager.put("ProgressBar.selectionForeground",Color.DARK_GRAY);
       
		Window gameWindow = new Window();
		gameWindow.createWindow();
	
	}
		
	
	public void checkMode() {		
		if(Window.pvpRadioButtun.isSelected()) mode = 0;
		else if (Window.pveRadioButtun1.isSelected()) mode = 1;
		else if (Window.pveRadioButtun2.isSelected()) mode = 2;
		else mode = 3;						
	}
	
	public void muzChoice() {		
		if(Window.muzCheckBoxNo.isSelected()) muzon = 0;
		else if (Window.muzCheckBoxCaverL.isSelected()) muzon = 1;
//		else if (Window.muzCheckBoxCaverH.isSelected()) muzon = 3;
		else if (Window.muzCheckBoxOrig.isSelected()) muzon = 2;
		else muzon = 4;
	}
	
	
	public void lotWin(String lotWin) {
		firstPlayerName = lotWin;
		Window.title.setText(lotWin + "  Начинает  бой");
		if(firstPlayerName == "Сова") playerName = SOVA;
		else playerName = HAMSTER;		
		//----------------------------------------------
		nextHodII(); 
		//----------------------------------------------
	}

	
	public void setAgressor(String playerName) {
		Game.playerName = playerName;
		Window.title.setText("Атакует    " + playerName);
		//---------------------------------------------
		nextHodII();		
		//----------------------------------------------
	}
	
	public void nextHodII() {
							
		switch(mode) {
		case 0: livePlayer = null;
			  //System.out.println("играем ПвП");
		
		default: if((playerName == SOVA && livePlayer == "Хомяк") ||           // за кого играем в пве?
				(playerName == HAMSTER && livePlayer == "Сова")) {	         		
				pve.hodII();				
				}	 
		 }
	}
	
		
	public void checkForWinner() {
				
		if (findThreeInARow()) {
			String winnerName = (playerName == SOVA)?SOVA:HAMSTER;
			
			Game.winnerName = winnerName;			
			logCombo();
			hpFatality.start();
			stopGame();
			si.changeAvatar();
			Thread show = new Thread(ShowFatality.fatalShow);
			show.start();
			
			
			
		} else if (findDrawnGame()) {
			stopGame();
			si.changeAvatar();
		}
	}
	
		public boolean findDrawnGame() {
		if ((Window.b1.getText() != "" && Window.b2.getText() != "" && Window.b3.getText() != "" && Window.b4.getText() != "" &&
				Window.b5.getText() != "" && Window.b6.getText() != "" && Window.b7.getText() != "" && Window.b8.getText() != "" && 
				Window.b9.getText() != "")) {
			return true;
		}
		else {
			return false;
		}				
	}
		
		public boolean findThreeInARow() {
			if ((Window.b1.getText() == Window.b2.getText() && Window.b2.getText() == Window.b3.getText() && Window.b1.getText() != "") ||
				(Window.b4.getText() == Window.b5.getText() && Window.b5.getText() == Window.b6.getText() && Window.b4.getText() != "") ||
				(Window.b7.getText() == Window.b8.getText() && Window.b8.getText() == Window.b9.getText() && Window.b7.getText() != "") ||
				(Window.b1.getText() == Window.b4.getText() && Window.b4.getText() == Window.b7.getText() && Window.b1.getText() != "") ||
				(Window.b2.getText() == Window.b5.getText() && Window.b5.getText() == Window.b8.getText() && Window.b2.getText() != "") ||
				(Window.b3.getText() == Window.b6.getText() && Window.b6.getText() == Window.b9.getText() && Window.b3.getText() != "") ||
				(Window.b1.getText() == Window.b5.getText() && Window.b5.getText() == Window.b9.getText() && Window.b1.getText() != "") ||
				(Window.b3.getText() == Window.b5.getText() && Window.b5.getText() == Window.b7.getText() && Window.b3.getText() != "")
					 ) {
				return true;
			}
			else {
				return false;
			}				
		}
		
		public void logCombo() {
			
			int n;
			if(winnerName == HAMSTER ) n=2;
			else n=1;
			
			switch(n) {
			case 1: if(findThreeInARow() && Window.logHam4.getText() == "") {
					Window.logHam4.setText("КОМБО!!!");
					}
					else if(findThreeInARow() && Window.logHam5.getText() == "") {
					Window.logHam5.setText("КОМБО!!!");
					} 
					else if(findThreeInARow()) {
					Window.logHamCombo.setText("КОМБО!!!");
					}; break; 
							 				 	
			case 2: if(findThreeInARow() && Window.logSov4.getText() == "") {
					Window.logSov4.setText("КОМБО!!!");
					} 
					else if(findThreeInARow() && Window.logSov5.getText() == "") {
					Window.logSov5.setText("КОМБО!!!");
					} 
					else if(findThreeInARow()) {
					Window.logSovCombo.setText("КОМБО!!!");					
					}; break;					 	
			default: System.out.println("произошла неведомая хрень");	 
			 }		
		}
		
		public void stopGame() {
			
			Score s = new Score();
			s.changeScore();
						
			if(Window.b1.getText() == "") Window.b1.removeMouseListener(Window.b1.getMouseListeners()[1]);
			if(Window.b2.getText() == "") Window.b2.removeMouseListener(Window.b2.getMouseListeners()[1]);
			if(Window.b3.getText() == "") Window.b3.removeMouseListener(Window.b3.getMouseListeners()[1]);
			if(Window.b4.getText() == "") Window.b4.removeMouseListener(Window.b4.getMouseListeners()[1]);
			if(Window.b5.getText() == "") Window.b5.removeMouseListener(Window.b5.getMouseListeners()[1]);
			if(Window.b6.getText() == "") Window.b6.removeMouseListener(Window.b6.getMouseListeners()[1]);
			if(Window.b7.getText() == "") Window.b7.removeMouseListener(Window.b7.getMouseListeners()[1]);
			if(Window.b8.getText() == "") Window.b8.removeMouseListener(Window.b8.getMouseListeners()[1]);
			if(Window.b9.getText() == "") Window.b9.removeMouseListener(Window.b9.getMouseListeners()[1]);
			
			if(winnerName == null) {
				Window.title.setText("Ничья");
				Window.info.setText("Миру - мир, войне - пиписька!");
			}
			else {
				Window.title.setText("Фаталити");
				Window.info.setText("Великая победа, " +winnerName+ " ликует!");
			}			
		}
		
}
