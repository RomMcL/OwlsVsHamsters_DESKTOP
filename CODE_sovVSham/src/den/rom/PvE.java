package den.rom;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PvE {
		
	List<Point> pointList = new ArrayList<Point>();	
	int index = 10;
	static int n = 3;
	Point buttonPoint;
	String a;                 
	String b;
	
	static Robot robot = null;
	
	
	public void iiBegin() {		
		if(Game.livePlayer != Game.firstPlayerName) n = 1;
		else n = 2;
	}		
	
	
	public void hodII() {
		
										
		if(Window.b1.getText() == "") pointList.add(Window.b1.getLocationOnScreen());
		if(Window.b2.getText() == "") pointList.add(Window.b2.getLocationOnScreen());
		if(Window.b3.getText() == "") pointList.add(Window.b3.getLocationOnScreen());
		if(Window.b4.getText() == "") pointList.add(Window.b4.getLocationOnScreen());
		if(Window.b5.getText() == "") pointList.add(Window.b5.getLocationOnScreen());
		if(Window.b6.getText() == "") pointList.add(Window.b6.getLocationOnScreen());
		if(Window.b7.getText() == "") pointList.add(Window.b7.getLocationOnScreen());
		if(Window.b8.getText() == "") pointList.add(Window.b8.getLocationOnScreen());
		if(Window.b9.getText() == "") pointList.add(Window.b9.getLocationOnScreen());

		opredZnakKompa();
		iiBegin();
		
		if(pointList.size() >= 1) {
					
			switch(Game.mode) {                               // определяем тактику
			case 0: //System.out.println("играем ПвП");
			; break;		
			case 1: hodIIeasy();		
			break;				 				 	
			case 2: hodIInorm();
			break;
			case 3: hodIIhard();
			break;
			default: System.out.println("произошла неведомая хрень с режимом игры");	 
			 }
				
//-------------------------------------------------------------------------------------------------			
//		System.out.println("лист = " + pointList.size());
//-------------------------------------------------------------------------------------------------				
				
		int x = buttonPoint.x + Window.b5.getWidth()/2;
		int y = buttonPoint.y + Window.b5.getHeight()/2;
		
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		//--------------------------------------		
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int xBack = (int) b.getX();
		int yBack = (int) b.getY();
		//--------------------------------------		
		
		klick(x, y);
	
		robot.mouseMove(xBack, yBack);
						
		}										
	}
		
	public static void klick(int x, int y) {		
		robot.mouseMove(x, y);
		robot.delay(50);
		robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
		robot.delay(50);
		robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
	}
	
	
	public void hodIIeasy() {		
		Random random = new Random();
		this.index = random.nextInt(pointList.size());	
		buttonPoint = pointList.get(index);
//System.out.println("mode = " + Game.mode+ " Работает тактика 1");
	}
	

					
		public void opredZnakKompa() {
					
		if(Game.livePlayer == Game.HAMSTER) {
			a = "O";
			b = "X";
		} else {
			a = "X";
			b = "O";			
		}						
//System.out.println("a = " +a);
//System.out.println("b = " +b);		
	}
	
	
	public boolean predWinLos() {
		if(((Window.b2.getText()==a && Window.b3.getText()==a) ||
				(Window.b4.getText()==a && Window.b7.getText()==a) ||
			    (Window.b5.getText()==a && Window.b9.getText()==a)) && Window.b1.getText() =="")
				{
				buttonPoint = Window.b1.getLocationOnScreen();
				return true;
				}
			else if(((Window.b8.getText()==a && Window.b5.getText()==a) ||
				     (Window.b1.getText()==a && Window.b3.getText()==a)) && Window.b2.getText() =="") 
				{
				buttonPoint = Window.b2.getLocationOnScreen();
				return true;
				}
			else if(((Window.b1.getText()==a && Window.b2.getText()==a) ||
					 (Window.b6.getText()==a && Window.b9.getText()==a) ||
				     (Window.b5.getText()==a && Window.b7.getText()==a)) && Window.b3.getText() =="") 
				{
				buttonPoint = Window.b3.getLocationOnScreen();
				return true;
				}
			else if(((Window.b1.getText()==a && Window.b7.getText()==a) ||
				     (Window.b5.getText()==a && Window.b6.getText()==a)) && Window.b4.getText() =="")
				{
				buttonPoint = Window.b4.getLocationOnScreen();
				return true;
				}	
			else if(((Window.b1.getText()==a && Window.b9.getText()==a) ||
					 (Window.b3.getText()==a && Window.b7.getText()==a) ||
					 (Window.b2.getText()==a && Window.b8.getText()==a) ||
				     (Window.b4.getText()==a && Window.b6.getText()==a)) && Window.b5.getText() =="")	
				{
				buttonPoint = Window.b5.getLocationOnScreen();
				return true;

				}
			else if(((Window.b4.getText()==a && Window.b5.getText()==a) ||
				     (Window.b3.getText()==a && Window.b9.getText()==a)) && Window.b6.getText() =="")		
				{
				buttonPoint = Window.b6.getLocationOnScreen();
				return true;
				}
			else if(((Window.b1.getText()==a && Window.b4.getText()==a) ||
					 (Window.b8.getText()==a && Window.b9.getText()==a) ||
				     (Window.b5.getText()==a && Window.b3.getText()==a)) && Window.b7.getText() =="")
				{
				buttonPoint = Window.b7.getLocationOnScreen();
				return true;
				}
			else if(((Window.b2.getText()==a && Window.b5.getText()==a) ||
				     (Window.b7.getText()==a && Window.b9.getText()==a)) && Window.b8.getText() =="")			
				{
				buttonPoint = Window.b8.getLocationOnScreen();
				return true;
				}
			else if(((Window.b7.getText()==a && Window.b8.getText()==a) ||
					 (Window.b3.getText()==a && Window.b6.getText()==a) ||
				     (Window.b1.getText()==a && Window.b5.getText()==a)) && Window.b9.getText() =="")
				{
				buttonPoint = Window.b9.getLocationOnScreen();
				return true;
				}
						
			else if(((Window.b2.getText()==b && Window.b3.getText()==b) ||
					(Window.b4.getText()==b && Window.b7.getText()==b) ||
				    (Window.b5.getText()==b && Window.b9.getText()==b)) && Window.b1.getText() =="")
					{
					buttonPoint = Window.b1.getLocationOnScreen();
					return true;
					}
				else if(((Window.b8.getText()==b && Window.b5.getText()==b) ||
					     (Window.b1.getText()==b && Window.b3.getText()==b)) && Window.b2.getText() =="") 
					{
					buttonPoint = Window.b2.getLocationOnScreen();
					return true;
					}
				else if(((Window.b1.getText()==b && Window.b2.getText()==b) ||
						 (Window.b6.getText()==b && Window.b9.getText()==b) ||
					     (Window.b5.getText()==b && Window.b7.getText()==b)) && Window.b3.getText() =="") 
					{
					buttonPoint = Window.b3.getLocationOnScreen();
					return true;
					}
				else if(((Window.b1.getText()==b && Window.b7.getText()==b) ||
					     (Window.b5.getText()==b && Window.b6.getText()==b)) && Window.b4.getText() =="")
					{
					buttonPoint = Window.b4.getLocationOnScreen();
					return true;
					}	
				else if(((Window.b1.getText()==b && Window.b9.getText()==b) ||
						 (Window.b3.getText()==b && Window.b7.getText()==b) ||
						 (Window.b2.getText()==b && Window.b8.getText()==b) ||
					     (Window.b4.getText()==b && Window.b6.getText()==b)) && Window.b5.getText() =="")	
					{
					buttonPoint = Window.b5.getLocationOnScreen();
					return true;
					}
				else if(((Window.b4.getText()==b && Window.b5.getText()==b) ||
					     (Window.b3.getText()==b && Window.b9.getText()==b)) && Window.b6.getText() =="")		
					{
					buttonPoint = Window.b6.getLocationOnScreen();
					return true;
					}
				else if(((Window.b1.getText()==b && Window.b4.getText()==b) ||
						 (Window.b8.getText()==b && Window.b9.getText()==b) ||
					     (Window.b5.getText()==b && Window.b3.getText()==b)) && Window.b7.getText() =="")
					{
					buttonPoint = Window.b7.getLocationOnScreen();
					return true;
					}
				else if(((Window.b2.getText()==b && Window.b5.getText()==b) ||
					     (Window.b7.getText()==b && Window.b9.getText()==b)) && Window.b8.getText() =="")			
					{
					buttonPoint = Window.b8.getLocationOnScreen();
					return true;
					}
				else if(((Window.b7.getText()==b && Window.b8.getText()==b) ||
						 (Window.b3.getText()==b && Window.b6.getText()==b) ||
					     (Window.b1.getText()==b && Window.b5.getText()==b)) && Window.b9.getText() =="")
					{
					buttonPoint = Window.b9.getLocationOnScreen();
					return true;
					}		
			else {//System.out.println("предВинЛос НЕ нашёлся");
					return false;
				
				}
	}
	
	
	
	public void hodIInorm() {
				
		if(predWinLos()) {
//System.out.println("предВинЛос нашёлся");
			}
			else {
				Random random = new Random();
				this.index = random.nextInt(pointList.size());
				buttonPoint = pointList.get(index);
//System.out.println("предВинЛос НЕ нашёлся");
			}		
	}
	
		
	public void hodIIhard() {	
					
//System.out.println("n = " +n);
//System.out.println("живой = " +Game.livePlayer);
//System.out.println("первый ходит = " +Game.firstPlayerName);  
//System.out.println("mode = " + Game.mode+ " Работает тактика 3");	
 	 
 	switch(n) {   
						
		case 1:   // если комп ходит первым


		// 1 и 2 ход		
		if(pointList.size() >= 7) {
		
			if(Window.b1.getText() == "" && Window.b3.getText() == "" && Window.b7.getText() == "" && Window.b9.getText() == "") {			
			List<Point> Hod1 = new ArrayList<Point>();		
			Hod1.add(Window.b1.getLocationOnScreen());
			Hod1.add(Window.b3.getLocationOnScreen());
			Hod1.add(Window.b7.getLocationOnScreen());
			Hod1.add(Window.b9.getLocationOnScreen());
//System.out.println("лист 1 = " + Hod1.size());
			Random random = new Random();
			this.index = random.nextInt(Hod1.size());
			buttonPoint = Hod1.get(index);
//System.out.println("рандом углов сработал");			
			}
			// 2 ход 						
			else if(
					(((Window.b1.getText() == a||Window.b9.getText() == a) && 
					(Window.b2.getText() == b||Window.b3.getText() == b||Window.b6.getText() == b))) && Window.b7.getText() == "" 
					) {
			buttonPoint = Window.b7.getLocationOnScreen();
//System.out.println("2 ход условие 1 сработало");
			}
			else if(
					(((Window.b1.getText() == a||Window.b9.getText() == a) &&
					(Window.b4.getText() == b||Window.b7.getText() == b||Window.b8.getText() == b))) && Window.b3.getText() == ""
					){
			buttonPoint = Window.b3.getLocationOnScreen();
//System.out.println("2 ход условие 2 сработало");
			}
			else if(
					(((Window.b3.getText() == a||Window.b7.getText() == a) && 
					(Window.b1.getText() == b||Window.b2.getText() == b||Window.b4.getText() == b))) && Window.b9.getText() == "" 
					){
			buttonPoint = Window.b9.getLocationOnScreen();
//System.out.println("2 ход условие 3 сработало");
			}
			else if(
					(((Window.b3.getText() == a||Window.b7.getText() == a) && 
					(Window.b6.getText() == b||Window.b8.getText() == b||Window.b9.getText() == b))) && Window.b1.getText() == "" 
					) {
			buttonPoint = Window.b1.getLocationOnScreen();
//System.out.println("2 ход условие 4 сработало");
			}
			else if(Window.b1.getText() != "" && Window.b9.getText() != "") {				
				List<Point> Hod2 = new ArrayList<Point>();		
				Hod2.add(Window.b3.getLocationOnScreen());
				Hod2.add(Window.b7.getLocationOnScreen());	
				if (Window.b3.getText() == ""&&Window.b7.getText() == "")
				{
				Random random = new Random();
				this.index = random.nextInt(Hod2.size());
				buttonPoint = Hod2.get(index);
//System.out.println("2 ход условие 5 (рандом) сработало");
				}
			}
			else if(Window.b3.getText() != "" && Window.b7.getText() != "") {				
				List<Point> Hod22 = new ArrayList<Point>();		
				Hod22.add(Window.b1.getLocationOnScreen());
				Hod22.add(Window.b9.getLocationOnScreen());
				if (Window.b1.getText() == ""&&Window.b9.getText() == "")
				{
				Random random = new Random();
				this.index = random.nextInt(Hod22.size());
				buttonPoint = Hod22.get(index);
//System.out.println("2 ход условие 6 (рандом) сработало");
				}
			}	
			else if((Window.b1.getText() != "" && Window.b5.getText() != "") && Window.b9.getText() == "") {				
			buttonPoint = Window.b9.getLocationOnScreen();
//System.out.println("2 ход условие 7 сработало");
			}
			else if((Window.b3.getText() != "" && Window.b5.getText() != "") && Window.b7.getText() == "") {				
			buttonPoint = Window.b7.getLocationOnScreen();
//System.out.println("2 ход условие 8 сработало");
			}
			else if((Window.b7.getText() != "" && Window.b5.getText() != "") && Window.b3.getText() == "") {				
			buttonPoint = Window.b3.getLocationOnScreen();
//System.out.println("2 ход условие 9 сработало");
			}
			else if((Window.b9.getText() != "" && Window.b5.getText() != "") && Window.b1.getText() == "") {				
			buttonPoint = Window.b1.getLocationOnScreen();
//System.out.println("2 ход условие 10 сработало");
			}
		}
				
		// 3 ход и дальше
		
		if(pointList.size() < 7) {
			
			//---------------победные-------------------------
			if(Window.b4.getText() == "" && (Window.b1.getText() == a  && Window.b7.getText() == a)) {
//System.out.println("3 ход условие 1 победный");				
			buttonPoint = Window.b4.getLocationOnScreen();  break;			
			}
			else if(Window.b8.getText() == "" && (Window.b7.getText() == a  && Window.b9.getText() == a)) {
//System.out.println("3 ход условие 2 победный");				
				buttonPoint = Window.b8.getLocationOnScreen(); break;
				}
			else if(Window.b6.getText() == "" && (Window.b3.getText() == a  && Window.b9.getText() == a)) {
//System.out.println("3 ход условие 3 победный");				
				buttonPoint = Window.b6.getLocationOnScreen(); break;				
				}
			else if(Window.b2.getText() == "" && (Window.b1.getText() == a  && Window.b3.getText() == a)) {
//System.out.println("3 ход условие 4 победный");				
				buttonPoint = Window.b2.getLocationOnScreen(); break;
				}
			else if(Window.b5.getText() == "" && 
				((Window.b1.getText() == a  && Window.b9.getText() == a) || (Window.b3.getText() == a  && Window.b7.getText() == a))) {
//System.out.println("3 ход условие 5 победный");				
				buttonPoint = Window.b5.getLocationOnScreen(); break;
				}
									
			//---------------защитные-------------------------
			else if(((Window.b4.getText() == Window.b6.getText() && Window.b4.getText()==b)||
					 (Window.b2.getText() == Window.b8.getText() && Window.b2.getText()==b))&& Window.b5.getText() == "") {
//System.out.println("3 ход условие 1 защитный");				
				buttonPoint = Window.b5.getLocationOnScreen(); break;
				}
							
			//---------------вилка-------------------------
			
			else if(Window.b1.getText() == a && Window.b3.getText() == a 
				&& Window.b7.getText() == "" && Window.b9.getText() == ""
				&& Window.b5.getText() == "") {
//System.out.println("3 ход условие 1.0 вилка");				
				buttonPoint = Window.b5.getLocationOnScreen(); break;
				}
			else if(Window.b3.getText() == a && Window.b9.getText() == a 
				&& Window.b1.getText() == "" && Window.b7.getText() == ""
				&& Window.b5.getText() == "") {
//System.out.println("3 ход условие 2.0 вилка");				
				buttonPoint = Window.b5.getLocationOnScreen(); break;
				}
			else if(Window.b9.getText() == a && Window.b7.getText() == a 
				&& Window.b1.getText() == "" && Window.b3.getText() == ""
				&& Window.b5.getText() == "") {
//System.out.println("3 ход условие 3.0 вилка");				
				buttonPoint = Window.b5.getLocationOnScreen(); break;
				}
			else if(Window.b7.getText() == a && Window.b1.getText() == a 
				&& Window.b3.getText() == "" && Window.b9.getText() == ""
				&& Window.b5.getText() == "") {
//System.out.println("3 ход условие 4.0 вилка");				
				buttonPoint = Window.b5.getLocationOnScreen(); break;
				}
								
			else if((Window.b1.getText() == a && Window.b7.getText() == a ||
					 Window.b1.getText() == a && Window.b3.getText() == a) && Window.b9.getText() == "") {
//System.out.println("3 ход условие 1.1 вилка");				
				buttonPoint = Window.b9.getLocationOnScreen(); break;
					}
									
			else if((Window.b7.getText() == a && Window.b9.getText() == a ||
					 Window.b3.getText() == a && Window.b9.getText() == a) && Window.b1.getText() == "") {
//System.out.println("3 ход условие 2.1 вилка");				
				buttonPoint = Window.b1.getLocationOnScreen(); break;
					}
						
			else if((Window.b3.getText() == a && Window.b9.getText() == a ||
					 Window.b1.getText() == a && Window.b3.getText() == a) && Window.b7.getText() == "") {
//System.out.println("3 ход условие 3.1 вилка");				
				buttonPoint = Window.b7.getLocationOnScreen(); break;
					}
						
			else if((Window.b7.getText() == a && Window.b9.getText() == a ||
					 Window.b1.getText() == a && Window.b7.getText() == a) && Window.b3.getText() == "") {
//System.out.println("3 ход условие 4.1 вилка");				
				buttonPoint = Window.b3.getLocationOnScreen(); break;
					}
			
			// если напротив
			
			else if(Window.b1.getText() == a && Window.b3.getText() == a && Window.b9.getText() == b
					&& Window.b7.getText() == "") {
//System.out.println("3 ход условие 5.1 вилка");				
				buttonPoint = Window.b7.getLocationOnScreen(); break;
					}
			else if(Window.b3.getText() == a && Window.b9.getText() == a && Window.b7.getText() == b
					&& Window.b1.getText() == "") {
//System.out.println("3 ход условие 5.2 вилка");				
				buttonPoint = Window.b1.getLocationOnScreen(); break;
					}
			else if(Window.b7.getText() == a && Window.b9.getText() == a && Window.b1.getText() == b
					&& Window.b3.getText() == "") {
//System.out.println("3 ход условие 5.3 вилка");				
				buttonPoint = Window.b3.getLocationOnScreen(); break;
					}
			else if(Window.b7.getText() == a && Window.b1.getText() == a && Window.b3.getText() == b
					&& Window.b9.getText() == "") {
//System.out.println("3 ход условие 5.4 вилка");					
				buttonPoint = Window.b9.getLocationOnScreen(); break;
					}
			
			// если в центр само рабает
								
			//---------------дыры-------------------------
					
			else if(predWinLos()) {
//System.out.println("предВинЛос в харде нашёлся");
				}
				else {
					Random random = new Random();
					this.index = random.nextInt(pointList.size());
					buttonPoint = pointList.get(index);
//System.out.println("предВинЛос НЕ нашёлся сработал рандом");
				}
 	}
		; break;
		
		
		case 2: // если комп ходит вторым
					
//System.out.println("лист 1 = " + pointList.size());
			
			// 1 ход
			if(pointList.size() >= 8) {
				
				if(Window.b5.getText() != "") 				
				{
					List<Point> Hod1 = new ArrayList<Point>();		
					Hod1.add(Window.b1.getLocationOnScreen());
					Hod1.add(Window.b3.getLocationOnScreen());
					Hod1.add(Window.b7.getLocationOnScreen());
					Hod1.add(Window.b9.getLocationOnScreen());
//System.out.println("лист 1 = " + Hod1.size());
					Random random = new Random();
					this.index = random.nextInt(Hod1.size());
					buttonPoint = Hod1.get(index);
				}
				else {
					buttonPoint = Window.b5.getLocationOnScreen();	
				}									
			}
			
			// 2 ход				
			if(pointList.size() >= 6 && pointList.size() < 8) {
				
				if(predWinLos()) {System.out.println("хер возьмешь одной гранатой");}
				else if(Window.b2.getText() == "" && Window.b8.getText() == "" && Window.b4.getText() == "" &&
						Window.b6.getText() == "" && Window.b5.getText() == a) 
				{
					List<Point> Hod2 = new ArrayList<Point>();		
					Hod2.add(Window.b2.getLocationOnScreen());
					Hod2.add(Window.b8.getLocationOnScreen());
					Hod2.add(Window.b4.getLocationOnScreen());
					Hod2.add(Window.b6.getLocationOnScreen());
//System.out.println("лист 1 = " + Hod1.size());
					Random random = new Random();
					this.index = random.nextInt(Hod2.size());
					buttonPoint = Hod2.get(index);
				}
				else {					
					List<Point> Hod22 = new ArrayList<Point>();		
					if(Window.b1.getText() == "")Hod22.add(Window.b1.getLocationOnScreen());
					if(Window.b3.getText() == "")Hod22.add(Window.b3.getLocationOnScreen());
					if(Window.b7.getText() == "")Hod22.add(Window.b7.getLocationOnScreen());
					if(Window.b9.getText() == "")Hod22.add(Window.b9.getLocationOnScreen());
					Random random = new Random();
					this.index = random.nextInt(Hod22.size());
					buttonPoint = Hod22.get(index);	
				}						
			}
				
			if(pointList.size() < 5) 
			{ 
				if(predWinLos()) {
//System.out.println("финальный предВинЛос");
								}
								else {
									Random random = new Random();
									this.index = random.nextInt(pointList.size());
									buttonPoint = pointList.get(index);
//System.out.println("финальный предВинЛос НЕ нашёлся сработал рандом");
								}
			}			
		; break;
		default: System.out.println("произошла неведомая хрень");	 
		 }
				
	}
	
		
}
