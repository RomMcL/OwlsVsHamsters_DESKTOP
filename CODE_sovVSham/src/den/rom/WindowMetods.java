package den.rom;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;




public class WindowMetods extends Window{
	
	Game g = new Game();
	SetImages si = new SetImages();
	
	public void coreChange (JPanel newPanel, String ind) {		
		cardLayout.show(newPanel, ind);		
    }
	
	public void infoChange (String change) {
		info.setText(change);
    }
		
	public void rezBrosCubChange (int rezHam, int rezSov, String winner) {		

		String strRezHam = Integer.toString(rezHam);
		String strRezSov = Integer.toString(rezSov);		

		lotRezHam.setText(strRezHam);
		lotRezSov.setText(strRezSov);
									
		if(winner == "Ничья!") {
			lotRez.setText(winner + " Ещё раз брось кубики.");
		 } else lotRez.setText( winner + " получает право первого удара!");
    }
	
	public void barNiz() {
		
		String mod = "";
		String muz = "";
		
		switch(Game.mode) {
		case 0: mod = "PvP (офлайн)."; break;		
		case 1: mod = "PvE (легко)."; break;				 				 	
		case 2: mod = "PvE (норма)."; break;
		case 3: mod = "PvE (сложно)."; break;		
		default: System.out.println("произошла неведомая хрень");	 
		 }
		
		g.muzChoice();                                             
		switch(Game.muzon) {
		case 0: muz = "Нет."; break;				
		case 1: muz = "Кавер Lite.";	break;
		case 2: muz = "Оригинал."; break;		
//		case 3: muz = "Ещё добавить?"; break;		
		default: System.out.println("произошла неведомая хрень");	 
		 }						
		gameMode.setText("Выбран режим игры: " +mod+ " 	Музыкальное сопровождение: " +muz);
   }
	
	
	public void buttonChoice (JButton b) {		
		b.setFont(b.getFont().deriveFont(40f));				
		}
	
	public void buttonReChoice (JButton b) {		
		b.setFont(b.getFont().deriveFont(46f));					
		}
	
	
	
	public void setupNewWindow () {
		
		PotokHP hp = new PotokHP();
		PotokHP.PotokHPstartHum hpStartHum = hp.new PotokHPstartHum();
		PotokHP.PotokHPstartSov hpStartSov = hp.new PotokHPstartSov();
		hpStartHum.start();
		hpStartSov.start();
		hpHam.setString("Хомячиное здоровье");
		hpSov.setString("Совиное здоровье");
				
		title.setText("");
		info.setText("Испытай свою силу!");
		gameMode.setText("Выбери режим игры и музыкальное сопровождение.");
		CheckLuck.lotWinner = null;
		Game.winnerName = null;
		PotokHP.stopFatality = true;
		PotokWriters.stopWrite = false;
		
		textSov.setText(null);
		textHam.setText(null);
		
		si.imageComponent();
		hamPic.setIcon(new ImageIcon(si.hamStart));
		sovPic.setIcon(new ImageIcon(si.sovStart));
		lotHam1.setIcon(new ImageIcon(si.hamLot1Fon));		
		lotHam2.setIcon(new ImageIcon(si.hamLot2Fon));
		lotSov1.setIcon(new ImageIcon(si.sovLot1Fon));		
		lotSov2.setIcon(new ImageIcon(si.sovLot2Fon));
		si.gameButtonFon();
		
		logHam1.setText("");
		logHam2.setText("");
		logHam3.setText("");
		logHam4.setText("");
		logHam5.setText("");
		logHamCombo.setText("");
		logSov1.setText("");
		logSov2.setText("");
		logSov3.setText("");
		logSov4.setText("");
		logSov5.setText("");
		logSovCombo.setText("");				
		lotHam1.setText("");
		lotHam2.setText("");
		lotSov1.setText("");
		lotSov2.setText("");
		lotRezHam.setText("");
		lotRezSov.setText("");
		lotRez.setText("");
						
		lotButton.setText("Бросить кости");
		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
			
		ListenersGameButtons returnlistenGameButton = new ListenersGameButtons();
		b1.addMouseListener(returnlistenGameButton.new ListenerGameButton1());
		b2.addMouseListener(returnlistenGameButton.new ListenerGameButton2());
		b3.addMouseListener(returnlistenGameButton.new ListenerGameButton3());
		b4.addMouseListener(returnlistenGameButton.new ListenerGameButton4());
		b5.addMouseListener(returnlistenGameButton.new ListenerGameButton5());
		b6.addMouseListener(returnlistenGameButton.new ListenerGameButton6());
		b7.addMouseListener(returnlistenGameButton.new ListenerGameButton7());
		b8.addMouseListener(returnlistenGameButton.new ListenerGameButton8());
		b9.addMouseListener(returnlistenGameButton.new ListenerGameButton9());					
		
    }
	
}
