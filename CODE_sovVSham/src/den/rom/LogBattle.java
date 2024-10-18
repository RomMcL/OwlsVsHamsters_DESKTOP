package den.rom;


import java.util.ArrayList;
import java.util.List;

public class LogBattle {
				
	int n=0;
	String udar;
	
	static List<String> udarList = new ArrayList<String>();
	static List<Integer> buttonList = new ArrayList<Integer>();
	static List<Integer> logList = new ArrayList<Integer>();
	
	public void listUdarov() {
						
	udarList.add("Царский подзатыльник!");
	udarList.add("Удар в жбан!");
	udarList.add("В ухо с ноги!");
	udarList.add("Подлый хук!");
	udarList.add("Ошеломляющий рык!");
	udarList.add("Коварный пук!");
	udarList.add("Укус в пятку!");
	udarList.add("Божественный Пендель!");
	udarList.add("Подножка возмездия!");				
	}
	
	public void listButtons() {
		
		buttonList.add(Window.b1.getLocation().x+Window.b1.getLocation().y + 1);
		buttonList.add(Window.b2.getLocation().x+Window.b2.getLocation().y + 2);
		buttonList.add(Window.b3.getLocation().x+Window.b3.getLocation().y + 3);
		buttonList.add(Window.b4.getLocation().x+Window.b4.getLocation().y + 4);
		buttonList.add(Window.b5.getLocation().x+Window.b5.getLocation().y + 5);
		buttonList.add(Window.b6.getLocation().x+Window.b6.getLocation().y + 6);
		buttonList.add(Window.b7.getLocation().x+Window.b7.getLocation().y + 7);
		buttonList.add(Window.b8.getLocation().x+Window.b8.getLocation().y + 8);
		buttonList.add(Window.b9.getLocation().x+Window.b9.getLocation().y + 9);		
		}
				
	public void logStep() {
				
		for(int i=0; i<9; i++) {
			if(logList.get(0).equals(buttonList.get(i))) n=i+1;			
		}
		
		logList.clear();	
		udar = udarList.get(n-1);
	
//		System.out.println("удар  кнопкой " + n);
//		System.out.println("удар  " + udar);
//		System.out.println(Arrays.toString(buttonList.toArray()));
		
		if(Game.playerName == Game.HAMSTER) n=2;
		else n=1;
		
		switch(n) {
			case 1: if(Window.logHam1.getText() == "") Window.logHam1.setText(udar);
					else if(Window.logHam2.getText() == "") Window.logHam2.setText(udar);
					else if(Window.logHam3.getText() == "") Window.logHam3.setText(udar);
					else if(Window.logHam4.getText() == "") Window.logHam4.setText(udar);
					else if(Window.logHam5.getText() == "") Window.logHam5.setText(udar);
			; break;				 				 	
			case 2: if(Window.logSov1.getText() == "") Window.logSov1.setText(udar);
					else if(Window.logSov2.getText() == "") Window.logSov2.setText(udar);
					else if(Window.logSov3.getText() == "") Window.logSov3.setText(udar);
					else if(Window.logSov4.getText() == "") Window.logSov4.setText(udar);
					else if(Window.logSov5.getText() == "") Window.logSov5.setText(udar);
			; break;		 	
			default: System.out.println("произошла неведомая хрень");	 
			 }
		
		PotokHP hp = new PotokHP();
		PotokHP.PotokHPbattleHam hpBattleHam = hp.new PotokHPbattleHam();
		PotokHP.PotokHPbattleSov hpBattleSov = hp.new PotokHPbattleSov();	
		if(Game.playerName == Game.SOVA) {hpBattleHam.start();}
		else {hpBattleSov.start();}
					
	}
			
}
