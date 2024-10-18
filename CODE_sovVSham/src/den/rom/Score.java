package den.rom;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Score extends Game {
	
	static int bitvPvPoff = 0, bitvPvEeasy = 0, bitvPvEnorm = 0, bitvPvEhard = 0;
	static int sovPvPoff = 0, sovPvEeasy = 0, sovPvEnorm = 0, sovPvEhard = 0;
	static int hamPvPoff = 0, hamPvEeasy = 0, hamPvEnorm = 0, hamPvEhard = 0;
	static int drawnPvPoff = 0, drawnPvEeasy = 0, drawnPvEnorm = 0, drawnPvEhard = 0;
			

	public void changeScore() {
				
		switch(mode) {
		case 0:  if(findDrawnGame() || findThreeInARow()) {bitvPvPoff++;}
				 if(winnerName == "Сова") {sovPvPoff++;}
				 if(winnerName == "Хомяк") {hamPvPoff++;}				 
				 if(findDrawnGame()) {drawnPvPoff++;}
				 Window.scoreGam.setText("Всего битв:   " + bitvPvPoff);
				 Window.scoreSovN.setText("" + sovPvPoff);
				 Window.scoreHamN.setText("" + hamPvPoff);
				 Window.scoreDra.setText("Битв в ничью:   " + drawnPvPoff);								
				break; 				
		case 1: if(findDrawnGame() || findThreeInARow()) {bitvPvEeasy++;}
				if(winnerName == "Сова") {sovPvEeasy++;}
				if(winnerName == "Хомяк") {hamPvEeasy++;}				 
				if(findDrawnGame()) {drawnPvEeasy++;}
				Window.scoreGam.setText("Всего битв:   " + bitvPvEeasy);
				Window.scoreSovN.setText("" + sovPvEeasy);
				Window.scoreHamN.setText("" + hamPvEeasy);
				Window.scoreDra.setText("Битв в ничью:   " + drawnPvEeasy);											
				break;				
		case 2: if(findDrawnGame() || findThreeInARow()) {bitvPvEnorm++;}
				if(winnerName == "Сова") {sovPvEnorm++;}
				if(winnerName == "Хомяк") {hamPvEnorm++;}				 
				if(findDrawnGame()) {drawnPvEnorm++;}
				Window.scoreGam.setText("Всего битв:   " + bitvPvEnorm);
				Window.scoreSovN.setText("" + sovPvEnorm);
				Window.scoreHamN.setText("" + hamPvEnorm);
				Window.scoreDra.setText("Битв в ничью:   " + drawnPvEnorm);											
				break;				
		case 3: if(findDrawnGame() || findThreeInARow()) {bitvPvEhard++;}
				if(winnerName == "Сова") {sovPvEhard++;}
				if(winnerName == "Хомяк") {hamPvEhard++;}				 
				if(findDrawnGame()) {drawnPvEhard++;}
				Window.scoreGam.setText("Всего битв:   " + bitvPvEhard);
				Window.scoreSovN.setText("" + sovPvEhard);
				Window.scoreHamN.setText("" + hamPvEhard);
				Window.scoreDra.setText("Битв в ничью:   " + drawnPvEhard);											
				break;
		default: System.out.println("режим не определен");	 
		 }						
	}
	
	
	public void radioButtunChangeScore() {
		
		Window.pvpRadioButtun.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Window.scoreGam.setText("Всего битв:   " + bitvPvPoff);
				Window.scoreSovN.setText("" + sovPvPoff);
				Window.scoreHamN.setText("" + hamPvPoff);
				Window.scoreDra.setText("Битв в ничью:   " + drawnPvPoff);				
			}			
		});
		
		Window.pveRadioButtun1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Window.scoreGam.setText("Всего битв:   " + bitvPvEeasy);
				Window.scoreSovN.setText("" + sovPvEeasy);
				Window.scoreHamN.setText("" + hamPvEeasy);
				Window.scoreDra.setText("Битв в ничью:   " + drawnPvEeasy);				
			}			
		});
		
		Window.pveRadioButtun2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Window.scoreGam.setText("Всего битв:   " + bitvPvEnorm);
				Window.scoreSovN.setText("" + sovPvEnorm);
				Window.scoreHamN.setText("" + hamPvEnorm);
				Window.scoreDra.setText("Битв в ничью:   " + drawnPvEnorm);				
			}			
		});
		
		Window.pveRadioButtun3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Window.scoreGam.setText("Всего битв:   " + bitvPvEhard);
				Window.scoreSovN.setText("" + sovPvEhard);
				Window.scoreHamN.setText("" + hamPvEhard);
				Window.scoreDra.setText("Битв в ничью:   " + drawnPvEhard);				
			}			
		});
		
	}
		

}
